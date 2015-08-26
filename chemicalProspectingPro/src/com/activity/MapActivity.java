package com.activity;

import java.util.ArrayList;
import java.util.List;

import org.osmdroid.DefaultResourceProxyImpl;
import org.osmdroid.ResourceProxy;
import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.ItemizedIconOverlay;
import org.osmdroid.views.overlay.ItemizedOverlayWithFocus;
import org.osmdroid.views.overlay.MinimapOverlay;
import org.osmdroid.views.overlay.OverlayItem;
import org.osmdroid.views.overlay.PathOverlay;
import org.osmdroid.views.overlay.SimpleLocationOverlay;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import com.kanyuan.circleloader.R;

@SuppressWarnings("deprecation")
public class MapActivity extends Activity {

	private MapView mMapView;
	private IMapController mController;
	private DefaultResourceProxyImpl mResourceProxy;
	private ItemizedOverlayWithFocus<OverlayItem> mLocationOverlay;

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.map);
		init();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.kymjs.kjframe.ui.FrameActivity#initData()
	 */
	private void init() {
		// TODO Auto-generated method stub

		mMapView = (MapView) findViewById(R.id.mapView);
		mController = mMapView.getController();
		// ResourceProxy init
		mResourceProxy = new DefaultResourceProxyImpl(this);
		mMapView.setTileSource(TileSourceFactory.MAPNIK);
		mMapView.setBuiltInZoomControls(true);
		mMapView.setMultiTouchControls(true);
		// ��λ��ǰλ�ã��������������ָ���·
		GeoPoint center = new GeoPoint(39.901873, 116.326655);
		mController.setCenter(center);
		mController.setZoom(14);

		// ���һ��ItemizedOerlayWithFoucs���͵�overlay
		Drawable drawable = this.getResources().getDrawable(
				R.drawable.marker_default);
		ArrayList<OverlayItem> items = new ArrayList<OverlayItem>();
		OverlayItem item = new OverlayItem("~title~",
				"I`m a marker,a subtitile", center);
		item.setMarker(drawable);
		items.add(item);

		this.mLocationOverlay = new ItemizedOverlayWithFocus<OverlayItem>(
				items,
				new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {
					@Override
					public boolean onItemSingleTapUp(final int index,
							final OverlayItem item) {
						return true;
					}

					@Override
					public boolean onItemLongPress(final int index,
							final OverlayItem item) {
						return false;
					}
				}, mResourceProxy);
		this.mLocationOverlay.setFocusItemsOnTap(true);
		this.mLocationOverlay.setFocusedItem(0);
		mMapView.getOverlays().add(mLocationOverlay);

		// �Զ���Overlay

		// �Զ���markerͼ��
		// ArrayList<OverlayItem> markers = new ArrayList<OverlayItem>();
		// OverlayItem one = new OverlayItem("~one~", "custom marker", center);
		// one.setMarker(drawable);
		// markers.add(one);
		// CustomMarker marker = new CustomMarker(markers, gestureListener,
		// mResourceProxy);
		// mMapView.getOverlays().add(marker);
		// mController.setCenter(center);
		// mMapView.invalidate();

		// ���½�С��ͼOverlay
		MinimapOverlay overlay = new MinimapOverlay(this,
				mMapView.getTileRequestCompleteHandler());
		mMapView.getOverlays().add(overlay);

		// PathOverlay ·��Overlay
		GeoPoint gp1 = new GeoPoint(40.067225, 116.369758);
		GeoPoint gp2 = new GeoPoint(40.064808, 116.346362);
		GeoPoint gp3 = new GeoPoint(40.058669, 116.336648);
		GeoPoint gp4 = new GeoPoint(40.036685, 116.343619);
		GeoPoint gp5 = new GeoPoint(40.036368, 116.327699);

		PathOverlay line = new PathOverlay(Color.BLUE, this);
		line.addPoint(gp1);
		line.addPoint(gp2);
		line.addPoint(gp3);
		line.addPoint(gp4);
		line.addPoint(gp5);
		mMapView.getOverlays().add(line);
		mController.setCenter(gp1);
		// Simpleͼ��
		SimpleLocationOverlay simpleLocation = new SimpleLocationOverlay(this);
		simpleLocation.setEnabled(true);
		simpleLocation.setLocation(gp5);
		mMapView.getOverlays().add(simpleLocation);
	}

	public class CustomMarker extends ItemizedOverlayWithFocus<OverlayItem>
			implements
			org.osmdroid.views.overlay.ItemizedIconOverlay.OnItemGestureListener<OverlayItem> {
		public CustomMarker(
				List<OverlayItem> aList,
				org.osmdroid.views.overlay.ItemizedIconOverlay.OnItemGestureListener<OverlayItem> aOnItemTapListener,
				ResourceProxy pResourceProxy) {
			super(aList, aOnItemTapListener, pResourceProxy);
		}

		@Override
		public void addItem(int location, OverlayItem item) {
			super.addItem(location, item);
		}

		@Override
		protected boolean onTap(int index) {
			return super.onTap(index);
		}

		@Override
		public boolean onSingleTapUp(MotionEvent event, MapView mapView) {
			return super.onSingleTapUp(event, mapView);
		}

		@Override
		public int size() {
			return super.size();
		}

		@Override
		public boolean onItemLongPress(int arg0, OverlayItem arg1) {
			return true;
		}

		@Override
		public boolean onItemSingleTapUp(int arg0, OverlayItem arg1) {
			return true;
		}

	}
}
