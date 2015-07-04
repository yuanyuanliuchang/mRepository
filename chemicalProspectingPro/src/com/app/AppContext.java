package com.app;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import android.app.Application;
import android.content.SharedPreferences;
import android.content.res.AssetManager;

public class AppContext extends Application {

	private String city;
	private SharedPreferences preferences;

	private int screenWidth;
	private int screenHeight;

	public int getScreenWidth() {
		return screenWidth;
	}

	public void setScreenWidth(int screenWidth) {
		this.screenWidth = screenWidth;
	}

	public int getScreenHeight() {
		return screenHeight;
	}

	public void setScreenHeight(int screenHeight) {
		this.screenHeight = screenHeight;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();

	}

	public String getA() throws IOException {
		AssetManager assetManager = this.getAssets();
		InputStream is = assetManager.open("city_coordinate.txt");
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int length = -1;
		while ((length = is.read(buffer)) != -1) {
			stream.write(buffer, 0, length);
		}
		return stream.toString();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public SharedPreferences getPreferences() {
		return preferences;
	}

	public void setPreferences(SharedPreferences preferences) {
		this.preferences = preferences;
	}

}
