package com.example.covid_19.model.harian;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Data{

	@SerializedName("metadata")
	private Metadata metadata;

	@SerializedName("content")
	private ArrayList<HarianContentItem> content;

	public void setMetadata(Metadata metadata){
		this.metadata = metadata;
	}

	public Metadata getMetadata(){
		return metadata;
	}

	public void setContent(ArrayList<HarianContentItem> content){
		this.content = content;
	}

	public ArrayList<HarianContentItem> getContent(){
		return content;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"metadata = '" + metadata + '\'' + 
			",content = '" + content + '\'' + 
			"}";
		}
}