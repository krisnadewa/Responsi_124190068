package com.example.covid_19.model.harian;

import com.google.gson.annotations.SerializedName;

public class HarianContentItem {

	@SerializedName("suspect_discarded")
	private Integer suspectDiscarded;

	@SerializedName("suspect_meninggal_harian")
	private Integer suspectMeninggalHarian;

	@SerializedName("closecontact_dikarantina")
	private Integer closecontactDikarantina;

	@SerializedName("CONFIRMATION")
	private Integer cONFIRMATION;

	@SerializedName("suspect_diisolasi")
	private Integer suspectDiisolasi;

	@SerializedName("confirmation_diisolasi")
	private Integer confirmationDiisolasi;

	@SerializedName("closecontact_meninggal_harian")
	private Integer closecontactMeninggalHarian;

	@SerializedName("confirmation_meninggal")
	private Integer confirmationMeninggal;

	@SerializedName("probable_meninggal")
	private Integer probableMeninggal;

	@SerializedName("confirmation_selesai")
	private Integer confirmationSelesai;

	@SerializedName("closecontact_discarded")
	private Integer closecontactDiscarded;

	@SerializedName("kode_prov")
	private String kodeProv;

	@SerializedName("nama_prov")
	private String namaProv;

	@SerializedName("CLOSECONTACT")
	private Integer cLOSECONTACT;

	@SerializedName("probable_discarded")
	private Integer probableDiscarded;

	@SerializedName("tanggal")
	private String tanggal;

	@SerializedName("probable_diisolasi")
	private Integer probableDiisolasi;

	@SerializedName("SUSPECT")
	private Integer sUSPECT;

	public void setSuspectDiscarded(Integer suspectDiscarded){
		this.suspectDiscarded = suspectDiscarded;
	}

	public Integer getSuspectDiscarded(){
		return suspectDiscarded;
	}

	public void setSuspectMeninggalHarian(Integer suspectMeninggalHarian){
		this.suspectMeninggalHarian = suspectMeninggalHarian;
	}

	public Integer getSuspectMeninggalHarian(){
		return suspectMeninggalHarian;
	}

	public void setClosecontactDikarantina(Integer closecontactDikarantina){
		this.closecontactDikarantina = closecontactDikarantina;
	}

	public Integer getClosecontactDikarantina(){
		return closecontactDikarantina;
	}

	public void setCONFIRMATION(Integer cONFIRMATION){
		this.cONFIRMATION = cONFIRMATION;
	}

	public Integer getCONFIRMATION(){
		return cONFIRMATION;
	}

	public void setSuspectDiisolasi(Integer suspectDiisolasi){
		this.suspectDiisolasi = suspectDiisolasi;
	}

	public Integer getSuspectDiisolasi(){
		return suspectDiisolasi;
	}

	public void setConfirmationDiisolasi(Integer confirmationDiisolasi){
		this.confirmationDiisolasi = confirmationDiisolasi;
	}

	public Integer getConfirmationDiisolasi(){
		return confirmationDiisolasi;
	}

	public void setClosecontactMeninggalHarian(Integer closecontactMeninggalHarian){
		this.closecontactMeninggalHarian = closecontactMeninggalHarian;
	}

	public Integer getClosecontactMeninggalHarian(){
		return closecontactMeninggalHarian;
	}

	public void setConfirmationMeninggal(Integer confirmationMeninggal){
		this.confirmationMeninggal = confirmationMeninggal;
	}

	public Integer getConfirmationMeninggal(){
		return confirmationMeninggal;
	}

	public void setProbableMeninggal(Integer probableMeninggal){
		this.probableMeninggal = probableMeninggal;
	}

	public Integer getProbableMeninggal(){
		return probableMeninggal;
	}

	public void setConfirmationSelesai(Integer confirmationSelesai){
		this.confirmationSelesai = confirmationSelesai;
	}

	public Integer getConfirmationSelesai(){
		return confirmationSelesai;
	}

	public void setClosecontactDiscarded(Integer closecontactDiscarded){
		this.closecontactDiscarded = closecontactDiscarded;
	}

	public Integer getClosecontactDiscarded(){
		return closecontactDiscarded;
	}

	public void setKodeProv(String kodeProv){
		this.kodeProv = kodeProv;
	}

	public String getKodeProv(){
		return kodeProv;
	}

	public void setNamaProv(String namaProv){
		this.namaProv = namaProv;
	}

	public String getNamaProv(){
		return namaProv;
	}

	public void setCLOSECONTACT(Integer cLOSECONTACT){
		this.cLOSECONTACT = cLOSECONTACT;
	}

	public Integer getCLOSECONTACT(){
		return cLOSECONTACT;
	}

	public void setProbableDiscarded(Integer probableDiscarded){
		this.probableDiscarded = probableDiscarded;
	}

	public Integer getProbableDiscarded(){
		return probableDiscarded;
	}

	public void setTanggal(String tanggal){
		this.tanggal = tanggal;
	}

	public String getTanggal(){
		return tanggal;
	}

	public void setProbableDiisolasi(Integer probableDiisolasi){
		this.probableDiisolasi = probableDiisolasi;
	}

	public Integer getProbableDiisolasi(){
		return probableDiisolasi;
	}

	public void setSUSPECT(Integer sUSPECT){
		this.sUSPECT = sUSPECT;
	}

	public Integer getSUSPECT(){
		return sUSPECT;
	}

	@Override
 	public String toString(){
		return 
			"HarianContentItem{" +
			"suspect_discarded = '" + suspectDiscarded + '\'' + 
			",suspect_meninggal_harian = '" + suspectMeninggalHarian + '\'' + 
			",closecontact_dikarantina = '" + closecontactDikarantina + '\'' + 
			",cONFIRMATION = '" + cONFIRMATION + '\'' + 
			",suspect_diisolasi = '" + suspectDiisolasi + '\'' + 
			",confirmation_diisolasi = '" + confirmationDiisolasi + '\'' + 
			",closecontact_meninggal_harian = '" + closecontactMeninggalHarian + '\'' + 
			",confirmation_meninggal = '" + confirmationMeninggal + '\'' + 
			",probable_meninggal = '" + probableMeninggal + '\'' + 
			",confirmation_selesai = '" + confirmationSelesai + '\'' + 
			",closecontact_discarded = '" + closecontactDiscarded + '\'' + 
			",kode_prov = '" + kodeProv + '\'' + 
			",nama_prov = '" + namaProv + '\'' + 
			",cLOSECONTACT = '" + cLOSECONTACT + '\'' + 
			",probable_discarded = '" + probableDiscarded + '\'' + 
			",tanggal = '" + tanggal + '\'' + 
			",probable_diisolasi = '" + probableDiisolasi + '\'' + 
			",sUSPECT = '" + sUSPECT + '\'' + 
			"}";
		}
}