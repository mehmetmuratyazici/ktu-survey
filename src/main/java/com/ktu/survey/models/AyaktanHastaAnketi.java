package com.ktu.survey.models;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;
import org.springframework.boot.convert.DataSizeUnit;

import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table
@ToString
@NoArgsConstructor
public class AyaktanHastaAnketi {
    @Id
    @SequenceGenerator(
            name = "seqAyaktanHastaAnketi",
            sequenceName = "seqAyaktanHastaAnketi",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "seqAyaktanHastaAnketi"
    )
    private Long id;

    public AyaktanHastaAnketi(Integer txtYil, char rdbAnketKatilan, String txtBasvurulanklinik, char rdbCinsiyet,
            char rdbYasAralik, char rdbEgitim, char rdbHastaneUlasim, char rdbDanismaHizmet, char rdbKisiselMahremiyet,
            char rdbKayitBekleme, char rdbDoktorSure, char rdbDoktorBilgilendirdi, char rdbDoktorSecim,
            char rdbUlasmamGerekenBirim, char rdbPersonelDavranis, char rdbHastaneTemizlik, char rdbBeklemeAlanKosul,
            char rdbMuayeneBeklemeSuresi, char rdbHastaneHizmebeklenti, char rdbMuayeneOdasıKosul,
            char rdbTahlilTetkikSureleri, char rdbTahlilTetkik, char rdbKolayHizmetAlma, char rdbTavsiye,
            String txtHizmetSunanDoktor, String txtHizmetSunanHemsire, String txtHizmetSunanSekreter,
            String txtHızmetSunanPosta, String txtGorusOneri) {
        this.txtYil = txtYil;
        this.rdbAnketKatilan = rdbAnketKatilan;
        this.txtBasvurulanklinik = txtBasvurulanklinik;
        this.rdbCinsiyet = rdbCinsiyet;
        this.rdbYasAralik = rdbYasAralik;
        this.rdbEgitim = rdbEgitim;
        this.rdbHastaneUlasim = rdbHastaneUlasim;
        this.rdbDanismaHizmet = rdbDanismaHizmet;
        this.rdbKisiselMahremiyet = rdbKisiselMahremiyet;
        this.rdbKayitBekleme = rdbKayitBekleme;
        this.rdbDoktorSure = rdbDoktorSure;
        this.rdbDoktorBilgilendirdi = rdbDoktorBilgilendirdi;
        this.rdbDoktorSecim = rdbDoktorSecim;
        this.rdbUlasmamGerekenBirim = rdbUlasmamGerekenBirim;
        this.rdbPersonelDavranis = rdbPersonelDavranis;
        this.rdbHastaneTemizlik = rdbHastaneTemizlik;
        this.rdbBeklemeAlanKosul = rdbBeklemeAlanKosul;
        this.rdbMuayeneBeklemeSuresi = rdbMuayeneBeklemeSuresi;
        this.rdbHastaneHizmebeklenti = rdbHastaneHizmebeklenti;
        this.rdbMuayeneOdasıKosul = rdbMuayeneOdasıKosul;
        this.rdbTahlilTetkikSureleri = rdbTahlilTetkikSureleri;
        this.rdbTahlilTetkik = rdbTahlilTetkik;
        this.rdbKolayHizmetAlma = rdbKolayHizmetAlma;
        this.rdbTavsiye = rdbTavsiye;
        this.txtHizmetSunanDoktor = txtHizmetSunanDoktor;
        this.txtHizmetSunanHemsire = txtHizmetSunanHemsire;
        this.txtHizmetSunanSekreter = txtHizmetSunanSekreter;
        this.txtHızmetSunanPosta = txtHızmetSunanPosta;
        this.txtGorusOneri = txtGorusOneri;
    }

    @Column(name = "yil" , nullable = true)
    private Integer txtYil;

    private char rdbAnketKatilan ;

    @Column(name = "Basvurulanklinik" , length = 50)
    private String txtBasvurulanklinik ;

    private char rdbCinsiyet ;
    private char rdbYasAralik ;
    private char rdbEgitim;
    private char rdbHastaneUlasim;
    private char rdbDanismaHizmet;
    private char rdbKisiselMahremiyet;
    private char rdbKayitBekleme;
    private char rdbDoktorSure;
    private char rdbDoktorBilgilendirdi;
    private char rdbDoktorSecim;
    private char rdbUlasmamGerekenBirim;
    private char rdbPersonelDavranis;
    private char rdbHastaneTemizlik;
    private char rdbBeklemeAlanKosul;
    private char rdbMuayeneBeklemeSuresi;
    private char rdbHastaneHizmebeklenti;
    private char rdbMuayeneOdasıKosul;
    private char rdbTahlilTetkikSureleri;
    private char rdbTahlilTetkik;
    private char rdbKolayHizmetAlma;
    private char rdbTavsiye;
    private String txtHizmetSunanDoktor;
    private String txtHizmetSunanHemsire;
    private String txtHizmetSunanSekreter;
    private String txtHızmetSunanPosta;
    private String txtGorusOneri;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Long getId() {
        return id;
    }

    public Integer getTxtYil() {
        return txtYil;
    }

    public void setTxtYil(Integer txtYil) {
        if(txtYil == null){
            txtYil = LocalDate.now().getYear();
        }
        this.txtYil = txtYil;
    }

    public char getRdbAnketKatilan() {
        return rdbAnketKatilan;
    }

    public void setRdbAnketKatilan(char rdbAnketKatilan) {
        this.rdbAnketKatilan = rdbAnketKatilan;
    }

    public String getTxtBasvurulanklinik() {
        return txtBasvurulanklinik;
    }

    public void setTxtBasvurulanklinik(String txtBasvurulanklinik) {
        this.txtBasvurulanklinik = txtBasvurulanklinik;
    }

    public char getRdbCinsiyet() {
        return rdbCinsiyet;
    }

    public void setRdbCinsiyet(char rdbCinsiyet) {
        this.rdbCinsiyet = rdbCinsiyet;
    }

    public char getRdbYasAralik() {
        return rdbYasAralik;
    }

    public void setRdbYasAralik(char rdbYasAralik) {
        this.rdbYasAralik = rdbYasAralik;
    }

    public char getRdbEgitim() {
        return rdbEgitim;
    }

    public void setRdbEgitim(char rdbEgitim) {
        this.rdbEgitim = rdbEgitim;
    }

    public char getRdbHastaneUlasim() {
        return rdbHastaneUlasim;
    }

    public void setRdbHastaneUlasim(char rdbHastaneUlasim) {
        this.rdbHastaneUlasim = rdbHastaneUlasim;
    }

    public char getRdbDanismaHizmet() {
        return rdbDanismaHizmet;
    }

    public void setRdbDanismaHizmet(char rdbDanismaHizmet) {
        this.rdbDanismaHizmet = rdbDanismaHizmet;
    }

    public char getRdbKisiselMahremiyet() {
        return rdbKisiselMahremiyet;
    }

    public void setRdbKisiselMahremiyet(char rdbKisiselMahremiyet) {
        this.rdbKisiselMahremiyet = rdbKisiselMahremiyet;
    }

    public char getRdbKayitBekleme() {
        return rdbKayitBekleme;
    }

    public void setRdbKayitBekleme(char rdbKayitBekleme) {
        this.rdbKayitBekleme = rdbKayitBekleme;
    }

    public char getRdbDoktorSure() {
        return rdbDoktorSure;
    }

    public void setRdbDoktorSure(char rdbDoktorSure) {
        this.rdbDoktorSure = rdbDoktorSure;
    }

    public char getRdbDoktorBilgilendirdi() {
        return rdbDoktorBilgilendirdi;
    }

    public void setRdbDoktorBilgilendirdi(char rdbDoktorBilgilendirdi) {
        this.rdbDoktorBilgilendirdi = rdbDoktorBilgilendirdi;
    }

    public char getRdbDoktorSecim() {
        return rdbDoktorSecim;
    }

    public void setRdbDoktorSecim(char rdbDoktorSecim) {
        this.rdbDoktorSecim = rdbDoktorSecim;
    }

    public char getRdbUlasmamGerekenBirim() {
        return rdbUlasmamGerekenBirim;
    }

    public void setRdbUlasmamGerekenBirim(char rdbUlasmamGerekenBirim) {
        this.rdbUlasmamGerekenBirim = rdbUlasmamGerekenBirim;
    }

    public char getRdbPersonelDavranis() {
        return rdbPersonelDavranis;
    }

    public void setRdbPersonelDavranis(char rdbPersonelDavranis) {
        this.rdbPersonelDavranis = rdbPersonelDavranis;
    }

    public char getRdbHastaneTemizlik() {
        return rdbHastaneTemizlik;
    }

    public void setRdbHastaneTemizlik(char rdbHastaneTemizlik) {
        this.rdbHastaneTemizlik = rdbHastaneTemizlik;
    }

    public char getRdbBeklemeAlanKosul() {
        return rdbBeklemeAlanKosul;
    }

    public void setRdbBeklemeAlanKosul(char rdbBeklemeAlanKosul) {
        this.rdbBeklemeAlanKosul = rdbBeklemeAlanKosul;
    }

    public char getRdbMuayeneBeklemeSuresi() {
        return rdbMuayeneBeklemeSuresi;
    }

    public void setRdbMuayeneBeklemeSuresi(char rdbMuayeneBeklemeSuresi) {
        this.rdbMuayeneBeklemeSuresi = rdbMuayeneBeklemeSuresi;
    }

    public char getRdbHastaneHizmebeklenti() {
        return rdbHastaneHizmebeklenti;
    }

    public void setRdbHastaneHizmebeklenti(char rdbHastaneHizmebeklenti) {
        this.rdbHastaneHizmebeklenti = rdbHastaneHizmebeklenti;
    }

    public char getRdbMuayeneOdasıKosul() {
        return rdbMuayeneOdasıKosul;
    }

    public void setRdbMuayeneOdasıKosul(char rdbMuayeneOdasıKosul) {
        this.rdbMuayeneOdasıKosul = rdbMuayeneOdasıKosul;
    }

    public char getRdbTahlilTetkikSureleri() {
        return rdbTahlilTetkikSureleri;
    }

    public void setRdbTahlilTetkikSureleri(char rdbTahlilTetkikSureleri) {
        this.rdbTahlilTetkikSureleri = rdbTahlilTetkikSureleri;
    }

    public char getRdbTahlilTetkik() {
        return rdbTahlilTetkik;
    }

    public void setRdbTahlilTetkik(char rdbTahlilTetkik) {
        this.rdbTahlilTetkik = rdbTahlilTetkik;
    }

    public char getRdbKolayHizmetAlma() {
        return rdbKolayHizmetAlma;
    }

    public void setRdbKolayHizmetAlma(char rdbKolayHizmetAlma) {
        this.rdbKolayHizmetAlma = rdbKolayHizmetAlma;
    }

    public char getRdbTavsiye() {
        return rdbTavsiye;
    }

    public void setRdbTavsiye(char rdbTavsiye) {
        this.rdbTavsiye = rdbTavsiye;
    }

    public String getTxtHizmetSunanDoktor() {
        return txtHizmetSunanDoktor;
    }

    public void setTxtHizmetSunanDoktor(String txtHizmetSunanDoktor) {
        this.txtHizmetSunanDoktor = txtHizmetSunanDoktor;
    }

    public String getTxtHizmetSunanHemsire() {
        return txtHizmetSunanHemsire;
    }

    public void setTxtHizmetSunanHemsire(String txtHizmetSunanHemsire) {
        this.txtHizmetSunanHemsire = txtHizmetSunanHemsire;
    }

    public String getTxtHizmetSunanSekreter() {
        return txtHizmetSunanSekreter;
    }

    public void setTxtHizmetSunanSekreter(String txtHizmetSunanSekreter) {
        this.txtHizmetSunanSekreter = txtHizmetSunanSekreter;
    }

    public String getTxtHızmetSunanPosta() {
        return txtHızmetSunanPosta;
    }

    public void setTxtHızmetSunanPosta(String txtHızmetSunanPosta) {
        this.txtHızmetSunanPosta = txtHızmetSunanPosta;
    }

    public String getTxtGorusOneri() {
        return txtGorusOneri;
    }

    public void setTxtGorusOneri(String txtGorusOneri) {
        this.txtGorusOneri = txtGorusOneri;
    }
}
