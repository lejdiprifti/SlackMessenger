package com.transit.model;

public class MyJsonObject {
    private String emerKlienti;
    private String kontakti;
    private String nrSerial;
    private String dateRegjistrimi;
    private String dateKrijimi;
    private String dateFillimi;
    private String dateMbarimi;
    private String idShitjeKoka;
    private String idArka;
    private String nrDok;
    private String idAgjenti;
    private String statusAprovimi;
    private String tvsh;
    private String idNdermarrje;
    private String idPerdoruesi;
    private String adresaDergimit;
    private String adresaFaturimit;
    private String pershkrimi;
    private String marresi;
    private String idTransportues;
    private String perqindjeZbritje;
    private String niptK;
    private String qyetetiK;
    private String idKategoriSeriali;
    private String statusMarreveshje;
    private String kerkuarNga;
    private String dateKerkese;
    private String nrDokMagazine;

    public MyJsonObject(String emerKlienti, String kontakti, String nrSerial, String dateRegjistrimi, String dateKrijimi, String dateFillimi, String dateMbarimi, String idShitjeKoka, String idArka, String nrDok, String idAgjenti, String statusAprovimi, String tvsh, String idNdermarrje, String idPerdoruesi, String adresaDergimit, String adresaFaturimit, String pershkrimi, String marresi, String idTransportues, String perqindjeZbritje, String niptK, String qyetetiK, String idKategoriSeriali, String statusMarreveshje, String kerkuarNga, String dateKerkese, String nrDokMagazine) {
        this.emerKlienti = emerKlienti;
        this.kontakti = kontakti;
        this.nrSerial = nrSerial;
        this.dateRegjistrimi = dateRegjistrimi;
        this.dateKrijimi = dateKrijimi;
        this.dateFillimi = dateFillimi;
        this.dateMbarimi = dateMbarimi;
        this.idShitjeKoka = idShitjeKoka;
        this.idArka = idArka;
        this.nrDok = nrDok;
        this.idAgjenti = idAgjenti;
        this.statusAprovimi = statusAprovimi;
        this.tvsh = tvsh;
        this.idNdermarrje = idNdermarrje;
        this.idPerdoruesi = idPerdoruesi;
        this.adresaDergimit = adresaDergimit;
        this.adresaFaturimit = adresaFaturimit;
        this.pershkrimi = pershkrimi;
        this.marresi = marresi;
        this.idTransportues = idTransportues;
        this.perqindjeZbritje = perqindjeZbritje;
        this.niptK = niptK;
        this.qyetetiK = qyetetiK;
        this.idKategoriSeriali = idKategoriSeriali;
        this.statusMarreveshje = statusMarreveshje;
        this.kerkuarNga = kerkuarNga;
        this.dateKerkese = dateKerkese;
        this.nrDokMagazine = nrDokMagazine;
    }

    @Override
    public String toString() {
        return "MyJsonObject{" +
                "emerKlienti='" + emerKlienti + '\'' +
                ", kontakti='" + kontakti + '\'' +
                ", nrSerial='" + nrSerial + '\'' +
                ", dateRegjistrimi='" + dateRegjistrimi + '\'' +
                ", dateKrijimi='" + dateKrijimi + '\'' +
                ", dateFillimi='" + dateFillimi + '\'' +
                ", dateMbarimi='" + dateMbarimi + '\'' +
                ", idShitjeKoka='" + idShitjeKoka + '\'' +
                ", idArka='" + idArka + '\'' +
                ", nrDok='" + nrDok + '\'' +
                ", idAgjenti='" + idAgjenti + '\'' +
                ", statusAprovimi='" + statusAprovimi + '\'' +
                ", tvsh='" + tvsh + '\'' +
                ", idNdermarrje='" + idNdermarrje + '\'' +
                ", idPerdoruesi='" + idPerdoruesi + '\'' +
                ", adresaDergimit='" + adresaDergimit + '\'' +
                ", adresaFaturimit='" + adresaFaturimit + '\'' +
                ", pershkrimi='" + pershkrimi + '\'' +
                ", marresi='" + marresi + '\'' +
                ", idTransportues='" + idTransportues + '\'' +
                ", perqindjeZbritje='" + perqindjeZbritje + '\'' +
                ", niptK='" + niptK + '\'' +
                ", qyetetiK='" + qyetetiK + '\'' +
                ", idKategoriSeriali='" + idKategoriSeriali + '\'' +
                ", statusMarreveshje='" + statusMarreveshje + '\'' +
                ", kerkuarNga='" + kerkuarNga + '\'' +
                ", dateKerkese='" + dateKerkese + '\'' +
                ", nrDokMagazine='" + nrDokMagazine + '\'' +
                '}';
    }

	public String getEmerKlienti() {
		return emerKlienti;
	}

	public void setEmerKlienti(String emerKlienti) {
		this.emerKlienti = emerKlienti;
	}

	public String getKontakti() {
		return kontakti;
	}

	public void setKontakti(String kontakti) {
		this.kontakti = kontakti;
	}

	public String getNrSerial() {
		return nrSerial;
	}

	public void setNrSerial(String nrSerial) {
		this.nrSerial = nrSerial;
	}

	public String getDateRegjistrimi() {
		return dateRegjistrimi;
	}

	public void setDateRegjistrimi(String dateRegjistrimi) {
		this.dateRegjistrimi = dateRegjistrimi;
	}

	public String getDateKrijimi() {
		return dateKrijimi;
	}

	public void setDateKrijimi(String dateKrijimi) {
		this.dateKrijimi = dateKrijimi;
	}

	public String getDateFillimi() {
		return dateFillimi;
	}

	public void setDateFillimi(String dateFillimi) {
		this.dateFillimi = dateFillimi;
	}

	public String getDateMbarimi() {
		return dateMbarimi;
	}

	public void setDateMbarimi(String dateMbarimi) {
		this.dateMbarimi = dateMbarimi;
	}

	public String getIdShitjeKoka() {
		return idShitjeKoka;
	}

	public void setIdShitjeKoka(String idShitjeKoka) {
		this.idShitjeKoka = idShitjeKoka;
	}

	public String getIdArka() {
		return idArka;
	}

	public void setIdArka(String idArka) {
		this.idArka = idArka;
	}

	public String getNrDok() {
		return nrDok;
	}

	public void setNrDok(String nrDok) {
		this.nrDok = nrDok;
	}

	public String getIdAgjenti() {
		return idAgjenti;
	}

	public void setIdAgjenti(String idAgjenti) {
		this.idAgjenti = idAgjenti;
	}

	public String getStatusAprovimi() {
		return statusAprovimi;
	}

	public void setStatusAprovimi(String statusAprovimi) {
		this.statusAprovimi = statusAprovimi;
	}

	public String getTvsh() {
		return tvsh;
	}

	public void setTvsh(String tvsh) {
		this.tvsh = tvsh;
	}

	public String getIdNdermarrje() {
		return idNdermarrje;
	}

	public void setIdNdermarrje(String idNdermarrje) {
		this.idNdermarrje = idNdermarrje;
	}

	public String getIdPerdoruesi() {
		return idPerdoruesi;
	}

	public void setIdPerdoruesi(String idPerdoruesi) {
		this.idPerdoruesi = idPerdoruesi;
	}

	public String getAdresaDergimit() {
		return adresaDergimit;
	}

	public void setAdresaDergimit(String adresaDergimit) {
		this.adresaDergimit = adresaDergimit;
	}

	public String getAdresaFaturimit() {
		return adresaFaturimit;
	}

	public void setAdresaFaturimit(String adresaFaturimit) {
		this.adresaFaturimit = adresaFaturimit;
	}

	public String getPershkrimi() {
		return pershkrimi;
	}

	public void setPershkrimi(String pershkrimi) {
		this.pershkrimi = pershkrimi;
	}

	public String getMarresi() {
		return marresi;
	}

	public void setMarresi(String marresi) {
		this.marresi = marresi;
	}

	public String getIdTransportues() {
		return idTransportues;
	}

	public void setIdTransportues(String idTransportues) {
		this.idTransportues = idTransportues;
	}

	public String getPerqindjeZbritje() {
		return perqindjeZbritje;
	}

	public void setPerqindjeZbritje(String perqindjeZbritje) {
		this.perqindjeZbritje = perqindjeZbritje;
	}

	public String getNiptK() {
		return niptK;
	}

	public void setNiptK(String niptK) {
		this.niptK = niptK;
	}

	public String getQyetetiK() {
		return qyetetiK;
	}

	public void setQyetetiK(String qyetetiK) {
		this.qyetetiK = qyetetiK;
	}

	public String getIdKategoriSeriali() {
		return idKategoriSeriali;
	}

	public void setIdKategoriSeriali(String idKategoriSeriali) {
		this.idKategoriSeriali = idKategoriSeriali;
	}

	public String getStatusMarreveshje() {
		return statusMarreveshje;
	}

	public void setStatusMarreveshje(String statusMarreveshje) {
		this.statusMarreveshje = statusMarreveshje;
	}

	public String getKerkuarNga() {
		return kerkuarNga;
	}

	public void setKerkuarNga(String kerkuarNga) {
		this.kerkuarNga = kerkuarNga;
	}

	public String getDateKerkese() {
		return dateKerkese;
	}

	public void setDateKerkese(String dateKerkese) {
		this.dateKerkese = dateKerkese;
	}

	public String getNrDokMagazine() {
		return nrDokMagazine;
	}

	public void setNrDokMagazine(String nrDokMagazine) {
		this.nrDokMagazine = nrDokMagazine;
	}
    
}
