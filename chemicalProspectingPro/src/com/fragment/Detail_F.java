package com.fragment;

import java.util.ArrayList;
import java.util.HashMap;

import com.chemicalprospectingpro.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

/**
 * ��ҳ
 * 
 * @author http://yecaoly.taobao.com
 */
public class Detail_F extends Fragment {
	ListView list;

	String data[] = new String[] { "China", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };

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
		View view = inflater.inflate(R.layout.river_sediment_detail, container, false);
		list = (ListView) view.findViewById(R.id.list);
		SimpleAdapter adapter = new SimpleAdapter(getActivity(), getData(), R.layout.list_item,
				new String[] { "title", "img" }, new int[] { R.id.title, R.id.img });

		list.setAdapter(adapter);
		return view;
	}

	private ArrayList<HashMap<String, Object>> getData() {
		ArrayList<HashMap<String, Object>> dlist = new ArrayList<HashMap<String, Object>>();

		for (int i = 0; i < data.length; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("title", data[i]);
			map.put("img", R.drawable.item_left2);
			dlist.add(map);
		}
		return dlist;
	}
}
