package com.activityManager;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;

/**
 * @description 活动生命控制器
 * @author
 * @date 2014-12-20
 */
public class ActivityCollector {

	/** 活动列表容器 */
	public static List<Activity> activities = new ArrayList<Activity>();

	public static void addActivity(Activity activity) {
		if (!activities.contains(activity)) {
			activities.add(activity);
		}
	}

	public static void removeActivity(Activity activity) {
		activities.remove(activity);
	}

	public static void finishActivity(Class<?> activityClazz) {
		Activity finished = null;
		for (Activity activity : activities) {
			if (activityClazz.equals(activity.getClass())) {
				activity.finish();
				finished = activity;
			}
		}
		if (finished != null) {
			removeActivity(finished);
		}
	}

	public static void finishOthers(Class<?> activityClazz) {
		List<Activity> deleteList = new ArrayList<Activity>();
		for (Activity activity : activities) {
			if (!activityClazz.equals(activity.getClass())) {
				activity.finish();
				deleteList.add(activity);
			}
		}
		activities.removeAll(deleteList);
	}

	public static int size() {
		return activities.size();
	}

	public static void finishAll() {
		for (Activity activity : activities) {
			if (!activity.isFinishing())
				activity.finish();
		}

	}
}
