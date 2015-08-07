package com.activity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.kymjs.kjframe.KJActivity;
import org.kymjs.kjframe.ui.BindView;

import com.chemicalprospectingpro.R;
import com.common.method.MyMethod;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class AddPicture extends KJActivity {

	private Bitmap bitmap;
	@BindView(id = R.id.inPutID)
	private EditText mId;
	@BindView(id = R.id.inPutDate)
	private EditText mDate;
	@BindView(id = R.id.inPutPiexl)
	private EditText mPiexl;
	@BindView(id = R.id.inPutDescri)
	private EditText mDescri;
	@BindView(id = R.id.inPutDirL)
	private EditText mDirL;
	@BindView(id = R.id.inPutDirR)
	private EditText mDieR;
	@BindView(id = R.id.inPutObjName)
	private EditText mObjName;
	@BindView(id = R.id.inPutObjSize)
	private EditText mObjSize;
	@BindView(id = R.id.inPutObj)
	private EditText mObj;
	@BindView(id = R.id.submitPic, click = true)
	private Button addPic;
	private MyMethod mMyMethod;
	private String sID, sDate, sPiexl, sDescri, sDirL, sDirR, sObjName, sObjSize, sObj;
	@BindView(id = R.id.pictureToAdd, click = true)
	private ImageView mPicture;
	@BindView(id = R.id.submitCancel, click = true)
	private Button cancel;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.kymjs.kjframe.ui.FrameActivity#initData()
	 */
	@Override
	public void initData() {
		// TODO Auto-generated method stub
		super.initData();
		sID = mId.getText().toString();
		sDate = mDate.getText().toString();
		sPiexl = mPiexl.getText().toString();
		sDescri = mDescri.getText().toString();
		sDirL = mDirL.getText().toString();
		sDirR = mDieR.getText().toString();
		sObjName = mObjName.getText().toString();
		sObjSize = mObjSize.getText().toString();
		sObj = mObj.getText().toString();
		mMyMethod = new MyMethod();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.kymjs.kjframe.ui.FrameActivity#initWidget()
	 */
	@Override
	public void initWidget() {
		// TODO Auto-generated method stub
		super.initWidget();
	}
  
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.kymjs.kjframe.ui.FrameActivity#onClick(android.view.View)
	 */
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		super.onClick(v);
		switch (v.getId()) {
		case R.id.pictureToAdd:
			showCustomAlertDialog();
			break;
		case R.id.submitPic:
			// 提交数据指标数据库
			if (mMyMethod.isEmpty(sID) || mMyMethod.isEmpty(sDate) || mMyMethod.isEmpty(sPiexl)
					|| mMyMethod.isEmpty(sDescri) || mMyMethod.isEmpty(sDirL) || mMyMethod.isEmpty(sDirR)
					|| mMyMethod.isEmpty(sObjName) || mMyMethod.isEmpty(sObjSize) || mMyMethod.isEmpty(sObj)) {
				Toast.makeText(getApplicationContext(), "输入信息有误！", Toast.LENGTH_SHORT).show();
				return;
			} else {
				// 存信息进入数据库

			}

			break;
		case R.id.submitCancel:
			finish();
			overridePendingTransition(R.anim.animation_enterfromleft, R.anim.animation_fadefromright);
			break;
		default:
			break;
		}

	}

	private void showCustomAlertDialog() {
		final AlertDialog alertDialog = new AlertDialog.Builder(this).create();
		alertDialog.show();
		Window win = alertDialog.getWindow();

		WindowManager.LayoutParams lp = win.getAttributes();
		win.setGravity(Gravity.CENTER | Gravity.BOTTOM);
		lp.alpha = 0.7f;
		win.setAttributes(lp);
		win.setContentView(R.layout.add_picture_dialog);

		Button cancelBtn = (Button) win.findViewById(R.id.camera_cancel);
		cancelBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				alertDialog.cancel();
			}
		});
		Button camera_phone = (Button) win.findViewById(R.id.camera_phone);
		camera_phone.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				systemPhoto();
				alertDialog.dismiss();
			}

		});
		Button camera_camera = (Button) win.findViewById(R.id.camera_camera);
		camera_camera.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				cameraPhoto();
				alertDialog.dismiss();
			}

		});

	}

	private final int SYS_INTENT_REQUEST = 0XFF01;
	private final int CAMERA_INTENT_REQUEST = 0XFF02;

	/**
	 * 打开系统相册
	 */
	private void systemPhoto() {

		Intent intent = new Intent();
		intent.setType("image/*");
		intent.setAction(Intent.ACTION_GET_CONTENT);
		startActivityForResult(intent, SYS_INTENT_REQUEST);

	}

	/**
	 * 调用相机拍照
	 */
	private void cameraPhoto() {
		String sdStatus = Environment.getExternalStorageState();
		/* 检测sd是否可用 */
		if (!sdStatus.equals(Environment.MEDIA_MOUNTED)) {
			Toast.makeText(this, "SD卡不可用！", Toast.LENGTH_SHORT).show();
			return;
		}
		Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
		startActivityForResult(intent, CAMERA_INTENT_REQUEST);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == SYS_INTENT_REQUEST && resultCode == RESULT_OK && data != null) {
			try {
				Uri uri = data.getData();
				Cursor cursor = getContentResolver().query(uri, null, null, null, null);
				cursor.moveToFirst();

				String imageFilePath = cursor.getString(1);
				System.out.println("File path is----->" + imageFilePath);

				FileInputStream fis = new FileInputStream(imageFilePath);
				bitmap = BitmapFactory.decodeStream(fis);

				int width = bitmap.getWidth();
				int height = bitmap.getHeight();
				System.out.println("压缩前的宽高----> width: " + width + " height:" + height);

				/* 压缩获取的图像 */
				showImgs(bitmap, false);

				fis.close();
				cursor.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else if (requestCode == CAMERA_INTENT_REQUEST && resultCode == RESULT_OK && data != null) {
			cameraCamera(data);
		}
		super.onActivityResult(requestCode, resultCode, data);

	}

	/**
	 * @param data
	 *            拍照后获取照片
	 */
	private void cameraCamera(Intent data) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String name = formatter.format(System.currentTimeMillis()) + ".jpg";
		Log.i("zhiwei.zhao", "image name:" + name);
		Toast.makeText(this, name, Toast.LENGTH_LONG).show();
		Bundle bundle = data.getExtras();
		/* 获取相机返回的数据，并转换为Bitmap图片格式 */
		Bitmap bitmap = (Bitmap) bundle.get("data");
		FileOutputStream b = null;

		String path = Environment.getExternalStorageDirectory().getPath();
		File file = new File(path + "/myImage/");
		/** 检测文件夹是否存在，不存在则创建文件夹 **/
		if (!file.exists() && !file.isDirectory())
			file.mkdirs();
		String fileName = file.getPath() + "/" + name;
		Log.i("zhiwei.zhao", "camera file path:" + fileName);
		try {
			b = new FileOutputStream(fileName);
			/* 把数据写入文件 */
			bitmap.compress(Bitmap.CompressFormat.JPEG, 100, b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (b == null)
					return;
				b.flush();
				b.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		showImgs(bitmap, true);
	}

	/**
	 * 展示选择的图片
	 * 
	 * @param bitmap
	 * @param isSysUp
	 */
	private void showImgs(Bitmap bitmap, boolean isSysUp) {

		Bitmap _bitmap = compressionBigBitmap(bitmap, isSysUp);
		mPicture.setImageBitmap(_bitmap);

	}

	/**
	 * @param bitmap
	 * @return 压缩后的bitmap
	 */
	private Bitmap compressionBigBitmap(Bitmap bitmap, boolean isSysUp) {
		Bitmap destBitmap = null;
		/* 图片宽度调整为100，大于这个比例的，按一定比例缩放到宽度为100 */
		if (bitmap.getWidth() > 80) {
			float scaleValue = (float) (80f / bitmap.getWidth());
			System.out.println("缩放比例---->" + scaleValue);

			Matrix matrix = new Matrix();
			/* 针对系统拍照，旋转90° */
			if (isSysUp)
				matrix.setRotate(90);
			matrix.postScale(scaleValue, scaleValue);

			destBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
			int widthTemp = destBitmap.getWidth();
			int heightTemp = destBitmap.getHeight();
			Log.i("zhiwei.zhao", "压缩后的宽高----> width: " + heightTemp + " height:" + widthTemp);
		} else {
			return bitmap;
		}
		return destBitmap;

	}

	@Override
	public void setRootView() {
		// TODO Auto-generated method stub
		setContentView(R.layout.add_picture1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.kymjs.kjframe.KJActivity#onDestroy()
	 */
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		destroyBitmap();
	}

	private void destroyBitmap() {
		if (bitmap != null) {
			if (!bitmap.isRecycled()) {
				bitmap.recycle(); // 回收图片所占的内存
				System.gc(); // 提醒系统及时回收
			}
		}

	}
}
