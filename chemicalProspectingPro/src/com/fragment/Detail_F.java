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
		View view = inflater.inflate(R.layout.river_sediment_detail, container, false);
		list = (ListView) view.findViewById(R.id.list);
		SimpleAdapter adapter = new SimpleAdapter(getActivity(), getData(), R.layout.river_sediment_detail_list_item,
				new String[] { "serial_number_text", "Sample_number_text", "color_text", "Horizontal_coordinates_text",
						"Longitudinal_coordinate_text", "Repeat_sample_text", "Water_properties_text",
						"Sample_weight_text", "Micro_topography_text", "Size_or_number_text", "Remarks_text" },
				new int[] { R.id.serial_number_text, R.id.Sample_number_text, R.id.color_text,
						R.id.Horizontal_coordinates_text, R.id.Longitudinal_coordinate_text, R.id.Repeat_sample_text,
						R.id.Water_properties_text, R.id.Sample_weight_text, R.id.Micro_topography_text,
						R.id.Size_or_number_text, R.id.Remarks_text });

		list.setAdapter(adapter);
		return view;
	}

	private ArrayList<HashMap<String, Object>> getData() {
		ArrayList<HashMap<String, Object>> dlist = new ArrayList<HashMap<String, Object>>();

		for (int i = 0; i < data.length; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("serial_number_text", data[i]);
			map.put("Sample_number_text", data1[i]);
			map.put("color_text", data2[i]);
			map.put("Horizontal_coordinates_text", data3[i]);
			map.put("Longitudinal_coordinate_text", data4[i]);
			map.put("Repeat_sample_text", data5[i]);
			map.put("Water_properties_text", data6[i]);
			map.put("Sample_weight_text", data7[i]);
			map.put("Micro_topography_text", data8[i]);
			map.put("Size_or_number_text", data9[i]);
			map.put("Remarks_text", data10[i]);
			dlist.add(map);
		}
		return dlist;
	}
}
