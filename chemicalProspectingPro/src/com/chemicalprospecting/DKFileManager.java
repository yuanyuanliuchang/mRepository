package com.chemicalprospecting;

import org.kymjs.kjframe.database.annotate.Id;

public class DKFileManager {
	@Id()
	private int Id;
	private String filePath;// ÎÄ¼þÂ·¾¶

	public int getId() {
		return Id;
	}

	public void setId(int item_id) {
		this.Id = item_id;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFilePath() {
		return filePath;
	}

}
