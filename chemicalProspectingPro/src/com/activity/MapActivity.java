package com.activity;

import java.util.List;

import org.osmdroid.ResourceProxy;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.ItemizedOverlayWithFocus;
import org.osmdroid.views.overlay.MinimapOverlay;
import org.osmdroid.views.overlay.MyLocationOverlay;
import org.osmdroid.views.overlay.OverlayItem;
import org.osmdroid.views.overlay.PathOverlay;
import org.osmdroid.views.overlay.ScaleBarOverlay;
import org.osmdroid.views.overlay.SimpleLocationOverlay;

import com.chemicalprospectingpro.R;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.location.Location;
import android.os.Bundle;
import android.view.MotionEvent;

@SuppressWarnings("deprecation")
public class MapActivity extends Activity {

	// private MapView mMapView;
	// private IMapController mController;
	// private DefaultResourceProxyImpl mResourceProxy;
	// private ItemizedOverlayWithFocus<OverlayItem> mLocationOverlay;

	private MapView mMapView;
	private MapController mMapController;
	int mIncr = 10000;

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
		mMapView = (MapView) findViewById(R.id.mapView);
		mMapView.setTileSource(TileSourceFactory.MAPNIK);
		mMapView.setBuiltInZoomControls(true);
		mMapView.setMultiTouchControls(true);
		mMapController = (MapController) mMapView.getController();
		mMapController.setZoom(13);
		// 定位当前位置
		CurrentLocationOverlay locationOverlay = new CurrentLocationOverlay(this, mMapView);
		locationOverlay.enableCompass();
		locationOverlay.enableFollowLocation();
		locationOverlay.enableMyLocation();
		// GeoPoint geopoint=new GeoPoint(39.92605, 116.42616);
		mMapController.setCenter(locationOverlay.getMyLocation());
		mMapView.getOverlays().add(locationOverlay);
		// 缩放图层
		ScaleBarOverlay scalebar = new ScaleBarOverlay(MapActivity.this);
		mMapView.getOverlays().add(scalebar);

		//
		SimpleLocationOverlay simpleLocation = new SimpleLocationOverlay(MapActivity.this);
		mMapView.getOverlays().add(simpleLocation);

		// 小地图
		MinimapOverlay minmap = new MinimapOverlay(MapActivity.this, mMapView.getHandler());
		mMapView.getOverlays().add(minmap);

		// 线路每段的坐标
		// GeoPoint gPt0 = new GeoPoint(51500000, -150000);
		// GeoPoint gPt1 = new GeoPoint(gPt0.getLatitudeE6() + mIncr,
		// gPt0.getLongitudeE6());
		// GeoPoint gPt2 = new GeoPoint(gPt0.getLatitudeE6() + mIncr,
		// gPt0.getLongitudeE6() + mIncr);
		// GeoPoint gPt3 = new GeoPoint(gPt0.getLatitudeE6(),
		// gPt0.getLongitudeE6() + mIncr);
		// mMapController.setCenter(gPt0);
		// 线路
		// PathOverlay myPath = new PathOverlay(Color.RED, this);
		// myPath.addPoint(gPt0);
		// myPath.addPoint(gPt1);
		// myPath.addPoint(gPt2);
		// myPath.addPoint(gPt3);
		// myPath.addPoint(gPt0);
		// mMapView.getOverlays().add(myPath);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.kymjs.kjframe.ui.FrameActivity#initData()
	 */
	// private void init() {
	// // TODO Auto-generated method stub
	//
	// mMapView = (MapView) findViewById(R.id.mapView);
	// mController = mMapView.getController();
	// // ResourceProxy init
	// mResourceProxy = new DefaultResourceProxyImpl(this);
	// mMapView.setTileSource(TileSourceFactory.MAPNIK);
	// mMapView.setBuiltInZoomControls(true);
	// mMapView.setMultiTouchControls(true);
	// // ��λ��ǰλ�ã��������������ָ���·
	// GeoPoint center = new GeoPoint(39.901873, 116.326655);
	// mController.setCenter(center);
	// mController.setZoom(14);
	//
	// // ���һ��ItemizedOerlayWithFoucs���͵�overlay
	// Drawable drawable =
	// this.getResources().getDrawable(R.drawable.marker_default);
	// ArrayList<OverlayItem> items = new ArrayList<OverlayItem>();
	// OverlayItem item = new OverlayItem("~title~", "I`m a marker,a subtitile",
	// center);
	// item.setMarker(drawable);
	// items.add(item);
	//
	// this.mLocationOverlay = new ItemizedOverlayWithFocus<OverlayItem>(items,
	// new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {
	// @Override
	// public boolean onItemSingleTapUp(final int index, final OverlayItem item)
	// {
	// return true;
	// }
	//
	// @Override
	// public boolean onItemLongPress(final int index, final OverlayItem item) {
	// return false;
	// }
	// }, mResourceProxy);
	// this.mLocationOverlay.setFocusItemsOnTap(true);
	// this.mLocationOverlay.setFocusedItem(0);
	// mMapView.getOverlays().add(mLocationOverlay);

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
	// MinimapOverlay overlay = new MinimapOverlay(this,
	// mMapView.getTileRequestCompleteHandler());
	// mMapView.getOverlays().add(overlay);
	//
	// // PathOverlay ·��Overlay
	// GeoPoint gp1 = new GeoPoint(40.067225, 116.369758);
	// GeoPoint gp2 = new GeoPoint(40.064808, 116.346362);
	// GeoPoint gp3 = new GeoPoint(40.058669, 116.336648);
	// GeoPoint gp4 = new GeoPoint(40.036685, 116.343619);
	// GeoPoint gp5 = new GeoPoint(40.036368, 116.327699);
	//
	// PathOverlay line = new PathOverlay(Color.BLUE, this);
	// line.addPoint(gp1);
	// line.addPoint(gp2);
	// line.addPoint(gp3);
	// line.addPoint(gp4);
	// line.addPoint(gp5);
	// mMapView.getOverlays().add(line);
	// mController.setCenter(gp1);
	// // Simpleͼ��
	// SimpleLocationOverlay simpleLocation = new SimpleLocationOverlay(this);
	// simpleLocation.setEnabled(true);
	// simpleLocation.setLocation(gp5);
	// mMapView.getOverlays().add(simpleLocation);
	// }

	public class CustomMarker extends ItemizedOverlayWithFocus<OverlayItem>
			implements org.osmdroid.views.overlay.ItemizedIconOverlay.OnItemGestureListener<OverlayItem> {
		public CustomMarker(List<OverlayItem> aList,
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

	public class CurrentLocationOverlay extends MyLocationOverlay {
		private final static int PADDING_ACTIVE_ZOOM = 50;
		private MapController mc;
		private Bitmap marker;
		private Point currentPoint = new Point();
		private boolean centerOnCurrentLocation = true;
		private int height;
		private int width;

		/**
		 * By default this CurrentLocationOverlay will center on the current
		 * location, if the currentLocation is near the edge, or off the screen.
		 * To dynamically enable/disable this, use
		 * {@link #setCenterOnCurrentLocation(boolean)}.
		 * 
		 * @param context
		 * @param mapView
		 */
		public CurrentLocationOverlay(Context context, MapView mapView) {
			super(context, mapView);
			this.mc = (MapController) mapView.getController();
			this.marker = BitmapFactory.decodeResource(context.getResources(), R.drawable.marker_default);
		}

		protected void drawMyLocation(Canvas canvas, MapView mapView, Location lastFix, GeoPoint myLocation,
				long when) {
			if (this.height == 0) {
				this.height = mapView.getHeight();
				this.width = mapView.getWidth();
			}
			mapView.getProjection().toPixels(myLocation, currentPoint);

			canvas.drawBitmap(marker, currentPoint.x, currentPoint.y - 40, null);
		}

		@Override
		public synchronized void onLocationChanged(Location location) {
			super.onLocationChanged(location);
			// only move to new position if enabled and we are in an border-area
			if (mc != null && centerOnCurrentLocation && inZoomActiveArea(currentPoint)) {
				mc.animateTo(getMyLocation());
				setCenterOnCurrentLocation(true);
			}
		}

		private boolean inZoomActiveArea(Point currentPoint) {
			if ((currentPoint.x > PADDING_ACTIVE_ZOOM && currentPoint.x < width - PADDING_ACTIVE_ZOOM)
					&& (currentPoint.y > PADDING_ACTIVE_ZOOM && currentPoint.y < height - PADDING_ACTIVE_ZOOM)) {
				return false;
			}
			return true;
		}

		public void setCenterOnCurrentLocation(boolean centerOnCurrentLocation) {
			this.centerOnCurrentLocation = centerOnCurrentLocation;
		}
	}
}
