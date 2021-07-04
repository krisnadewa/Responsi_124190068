package com.example.covid_19.model.faskes;

import com.google.gson.annotations.SerializedName;

public class FaskesDataItem {

	@SerializedName("rujukan")
	private Object rujukan;

	@SerializedName("nama")
	private String nama;

	@SerializedName("tipe_faskes")
	private Integer tipeFaskes;

	@SerializedName("latitude")
	private Double latitude;

	@SerializedName("telepon")
	private String telepon;

	@SerializedName("kode_kemkes")
	private Object kodeKemkes;

	@SerializedName("url")
	private Object url;

	@SerializedName("alamat")
	private String alamat;

	@SerializedName("longitude")
	private Double longitude;

	@SerializedName("nomor_rujukan")
	private Integer nomorRujukan;

	public void setRujukan(Object rujukan){
		this.rujukan = rujukan;
	}

	public Object getRujukan(){
		return rujukan;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setTipeFaskes(Integer tipeFaskes){
		this.tipeFaskes = tipeFaskes;
	}

	public Integer getTipeFaskes(){
		return tipeFaskes;
	}

	public void setLatitude(Double latitude){
		this.latitude = latitude;
	}

	public Double getLatitude(){
		return latitude;
	}

	public void setTelepon(String telepon){
		this.telepon = telepon;
	}

	public String getTelepon(){
		return telepon;
	}

	public void setKodeKemkes(Object kodeKemkes){
		this.kodeKemkes = kodeKemkes;
	}

	public Object getKodeKemkes(){
		return kodeKemkes;
	}

	public void setUrl(Object url){
		this.url = url;
	}

	public Object getUrl(){
		return url;
	}

	public void setAlamat(String alamat){
		this.alamat = alamat;
	}

	public String getAlamat(){
		return alamat;
	}

	public void setLongitude(Double longitude){
		this.longitude = longitude;
	}

	public Double getLongitude(){
		return longitude;
	}

	public void setNomorRujukan(Integer nomorRujukan){
		this.nomorRujukan = nomorRujukan;
	}

	public Integer getNomorRujukan(){
		return nomorRujukan;
	}

	@Override
 	public String toString(){
		return 
			"FaskesDataItem{" +
			"rujukan = '" + rujukan + '\'' + 
			",nama = '" + nama + '\'' + 
			",tipe_faskes = '" + tipeFaskes + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",telepon = '" + telepon + '\'' + 
			",kode_kemkes = '" + kodeKemkes + '\'' + 
			",url = '" + url + '\'' + 
			",alamat = '" + alamat + '\'' + 
			",longitude = '" + longitude + '\'' + 
			",nomor_rujukan = '" + nomorRujukan + '\'' + 
			"}";
		}
}