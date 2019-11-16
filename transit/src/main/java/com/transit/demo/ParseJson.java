package com.transit.demo;

import org.json.JSONObject;
import org.springframework.stereotype.Component;

import com.transit.model.MyJsonObject;
@Component
public class ParseJson {

    public MyJsonObject parse(String json) {
        json = json.substring(json.indexOf("\"") + 1);
        json = json.substring(0, json.indexOf("[{\\\"OColDetajimet\\\""));
        json = json.replaceAll("\\\\\"", "\"");

        JSONObject jsonObject = new JSONObject(json);
        String emer = jsonObject.get("EmerKlienti").toString();
        String kontakti = jsonObject.get("Kontakti").toString();
        String nrSerial = jsonObject.get("NrSerial").toString();
        String dateRegjistrimi = jsonObject.get("DtRegjistrimi").toString();
        String dateKrijimi = jsonObject.get("DtKrijimi").toString();
        String dateFillimi = jsonObject.get("DtFillimi").toString();
        String dateMbarimi = jsonObject.get("DtMbarimi").toString();
        String idShitjeKoka = jsonObject.get("IdShitjeKoka").toString();
        String idArka = jsonObject.get("IdArka").toString();
        String nrDok = jsonObject.get("NrDok").toString();
        String idAgjenti = jsonObject.get("IdAgjent").toString();
        String statusAprovimi = jsonObject.get("StatusAprovimi").toString();
        String tvsh = jsonObject.get("Tvsh").toString();
        String idNdermarrje = jsonObject.get("IdNdermarrje").toString();
        String idPerdoruesi = jsonObject.get("IdPerdoruesi").toString();
        String adresaDergimit = jsonObject.get("AdresaDergimit").toString();
        String adresaFaturimit = jsonObject.get("AdresaFaturimit").toString();
        String pershkrimi = jsonObject.get("Pershkrimi").toString();
        String marresi = jsonObject.get("Marresi").toString();
        String idTransportues = jsonObject.get("Marresi").toString();
        String perqindjeZbritje = jsonObject.get("PerqindjeZbritje").toString();
        String niptK = jsonObject.get("PerqindjeZbritje").toString();
        String qytetiK = jsonObject.get("QytetiK").toString();
        String idKategoriSeriali = jsonObject.get("IdKategoriSeriali").toString();
        String statusMarreveshje = jsonObject.get("StatusMarreveshje").toString();
        String kerkuarNga = jsonObject.get("KerkuarNga").toString();
        String dateKerkese = jsonObject.get("DateKerkese").toString();
        String nrDokMagazine = jsonObject.get("NrDokMagazine").toString();
        MyJsonObject myJsonObject = new MyJsonObject(emer, kontakti, nrSerial, dateRegjistrimi, dateKrijimi, dateFillimi, dateMbarimi, idShitjeKoka, idArka, nrDok, idAgjenti, statusAprovimi, tvsh, idNdermarrje, idPerdoruesi, adresaDergimit, adresaFaturimit, pershkrimi, marresi, idTransportues, perqindjeZbritje, niptK, qytetiK, idKategoriSeriali, statusMarreveshje, kerkuarNga, dateKerkese, nrDokMagazine);
        return myJsonObject;
    }
}