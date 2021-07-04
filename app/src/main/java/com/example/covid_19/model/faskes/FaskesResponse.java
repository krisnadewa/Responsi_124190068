package com.example.covid_19.model.faskes;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class FaskesResponse{

	@SerializedName("status_code")
	private Integer statusCode;

	@SerializedName("data")
	private ArrayList<FaskesDataItem> data;

	public void setStatusCode(Integer statusCode){
		this.statusCode = statusCode;
	}

	public Integer getStatusCode(){
		return statusCode;
	}

	public void setData(ArrayList<FaskesDataItem> data){
		this.data = data;
	}

	public ArrayList<FaskesDataItem> getData(){
		return data;
	}

	@Override
 	public String toString(){
		return 
			"FaskesResponse{" + 
			"status_code = '" + statusCode + '\'' + 
			",data = '" + data + '\'' + 
			"}";
		}
}