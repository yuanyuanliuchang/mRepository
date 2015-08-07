package com.fragment;

import java.util.ArrayList;
import java.util.HashMap;

import com.activity.AddPicture;
import com.chemicalprospectingpro.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Picture_F extends Fragment {

	private final String TAG = this.getClass().getName();

	private ImageView addPicture;
	private ListView pictureList;
	String data[] = new String[] { "1", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data1[] = new String[] { "SX_AS_001", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data2[] = new String[] { "浑浊偏黄", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data3[] = new String[] { "12124", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data4[] = new String[] { "21421", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data5[] = new String[] { "否", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data6[] = new String[] { "地表水", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data7[] = new String[] { "122", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data8[] = new String[] { "微地形", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data9[] = new String[] { "11", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data10[] = new String[] { "无", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data11[] = new String[] { "China", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater,
	 * android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.picture_detail, container, false);
		pictureList = (ListView) view.findViewById(R.id.picture_list);
		addPicture = (ImageView) view.findViewById(R.id.add_picture);
		addPicture.setOnClickListener(mListener);
		SimpleAdapter adapter = new SimpleAdapter(getActivity(), getData(), R.layout.picture_list_item,
				new String[] { "identifier", "date", "pixel_text", "description", "dir_left", "dir_right", "refer_name",
						"refer_size", "object" },
				new int[] { R.id.identifier, R.id.date, R.id.pixel_text, R.id.description, R.id.dir_left,
						R.id.dir_right, R.id.refer_name, R.id.refer_size, R.id.object });

		pictureList.setAdapter(adapter);
		return view;
	}

	private OnClickListener mListener = new OnClickListener() {
		public void onClick(View v) {
			startActivity(new Intent(getActivity(), AddPicture.class));
			getActivity().overridePendingTransition(R.anim.animation_enterfromright, R.anim.animation_fadefromleft);
		}
	};

	private ArrayList<HashMap<String, Object>> getData() {
		ArrayList<HashMap<String, Object>> dlist = new ArrayList<HashMap<String, Object>>();

		for (int i = 0; i < data.length; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("identifier", data[i]);
			map.put("date", data1[i]);
			map.put("pixel_text", data2[i]);
			map.put("description", data3[i]);
			map.put("dir_left", data4[i]);
			map.put("dir_right", data5[i]);
			map.put("refer_name", data6[i]);
			map.put("refer_size", data7[i]);
			map.put("object", data8[i]);
			dlist.add(map);
		}
		return dlist;
	}
}
