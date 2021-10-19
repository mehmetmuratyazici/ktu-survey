package com.ktu.survey.models;

import javax.persistence.*;

import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table
@ToString
public class YatanHastaAnketi {

    @Id
    @SequenceGenerator(
            name="seqYatanHastaAnketi",
            sequenceName = "seqYatanHastaAnketi",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "seqYatanHastaAnketi"
    )
    private long id;

    private Integer txtYil;
    private char rdbAnketKatilan ;
    private String txtYattigiklinik ;
    private char rdbYatisSuresi;
    private char rdbCinsiyet ;
    private char rdbYasAralik;
    private char rdbEgitim;
    private char rdbHastaneUlasim;
    private char rdbDanismaHizmet;
    private char rdbKisiselMahremiyet;
    private char rdbYatisBekleme;
    private char rdbDoktorSure;
    private char rdbDoktorBilgilendirdi;
    private char rdbHemsireBilgilendirdi;
    @Column(name="rbd_iht_sag_per_ulasim")
    private char rdbIhtiyacSaglikPeronelUlasim;
    private char rdbPersonelDavranis;
    private char rdbHastaneTemizlik;
    private char rdbOdadakiEsyalar;
    private char rdbYemekDagitan;
    private char rdbTaburculukSonrasi;
    private char rdbBeklenti;
    private char rdbTavsiye;
    private String txtHizmetSunanDoktor;
    private String txtHizmetSunanHemsire;
    private String txtHizmetSunanSekreter;
    private String txtHızmetSunanPosta;
    private String txtGorusOneri;
    private LocalDateTime createdAt = LocalDateTime.now();


    public YatanHastaAnketi() {
    }

    public YatanHastaAnketi(int txtYil, char rdbAnketKatilan, String txtYattigiklinik, char rdbYatisSuresi, char rdbCinsiyet, char rdbYasAralik, char rdbEgitim, char rdbHastaneUlasim, char rdbDanismaHizmet, char rdbKisiselMahremiyet, char rdbYatisBekleme, char rdbDoktorSure, char rdbDoktorBilgilendirdi, char rdbHemsireBilgilendirdi, char rdbIhtiyacSaglikPeronelUlasim, char rdbPersonelDavranis, char rdbHastaneTemizlik, char rdbOdadakiEsyalar, char rdbYemekDagitan, char rdbTaburculukSonrasi, char rdbBeklenti, char rdbTavsiye, String txtHizmetSunanDoktor, String txtHizmetSunanHemsire, String txtHizmetSunanSekreter, String txtHızmetSunanPosta, String txtGorusOneri) {
        this.txtYil = txtYil;
        this.rdbAnketKatilan = rdbAnketKatilan;
        this.txtYattigiklinik = txtYattigiklinik;
        this.rdbYatisSuresi = rdbYatisSuresi;
        this.rdbCinsiyet = rdbCinsiyet;
        this.rdbYasAralik = rdbYasAralik;
        this.rdbEgitim = rdbEgitim;
        this.rdbHastaneUlasim = rdbHastaneUlasim;
        this.rdbDanismaHizmet = rdbDanismaHizmet;
        this.rdbKisiselMahremiyet = rdbKisiselMahremiyet;
        this.rdbYatisBekleme = rdbYatisBekleme;
        this.rdbDoktorSure = rdbDoktorSure;
        this.rdbDoktorBilgilendirdi = rdbDoktorBilgilendirdi;
        this.rdbHemsireBilgilendirdi = rdbHemsireBilgilendirdi;
        this.rdbIhtiyacSaglikPeronelUlasim = rdbIhtiyacSaglikPeronelUlasim;
        this.rdbPersonelDavranis = rdbPersonelDavranis;
        this.rdbHastaneTemizlik = rdbHastaneTemizlik;
        this.rdbOdadakiEsyalar = rdbOdadakiEsyalar;
        this.rdbYemekDagitan = rdbYemekDagitan;
        this.rdbTaburculukSonrasi = rdbTaburculukSonrasi;
        this.rdbBeklenti = rdbBeklenti;
        this.rdbTavsiye = rdbTavsiye;
        this.txtHizmetSunanDoktor = txtHizmetSunanDoktor;
        this.txtHizmetSunanHemsire = txtHizmetSunanHemsire;
        this.txtHizmetSunanSekreter = txtHizmetSunanSekreter;
        this.txtHızmetSunanPosta = txtHızmetSunanPosta;
        this.txtGorusOneri = txtGorusOneri;
    }

    public long getId() {
        return id;
    }

    public int getTxtYil() {
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

    public String getTxtYattigiklinik() {
        return txtYattigiklinik;
    }

    public void setTxtYattigiklinik(String txtYattigiklinik) {
        this.txtYattigiklinik = txtYattigiklinik;
    }

    public char getRdbYatisSuresi() {
        return rdbYatisSuresi;
    }

    public void setRdbYatisSuresi(char rdbYatisSuresi) {
        this.rdbYatisSuresi = rdbYatisSuresi;
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

    public char getRdbYatisBekleme() {
        return rdbYatisBekleme;
    }

    public void setRdbYatisBekleme(char rdbYatisBekleme) {
        this.rdbYatisBekleme = rdbYatisBekleme;
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

    public char getRdbHemsireBilgilendirdi() {
        return rdbHemsireBilgilendirdi;
    }

    public void setRdbHemsireBilgilendirdi(char rdbHemsireBilgilendirdi) {
        this.rdbHemsireBilgilendirdi = rdbHemsireBilgilendirdi;
    }

    public char getRdbIhtiyacSaglikPeronelUlasim() {
        return rdbIhtiyacSaglikPeronelUlasim;
    }

    public void setRdbIhtiyacSaglikPeronelUlasim(char rdbIhtiyacSaglikPeronelUlasim) {
        this.rdbIhtiyacSaglikPeronelUlasim = rdbIhtiyacSaglikPeronelUlasim;
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

    public char getRdbOdadakiEsyalar() {
        return rdbOdadakiEsyalar;
    }

    public void setRdbOdadakiEsyalar(char rdbOdadakiEsyalar) {
        this.rdbOdadakiEsyalar = rdbOdadakiEsyalar;
    }

    public char getRdbYemekDagitan() {
        return rdbYemekDagitan;
    }

    public void setRdbYemekDagitan(char rdbYemekDagitan) {
        this.rdbYemekDagitan = rdbYemekDagitan;
    }

    public char getRdbTaburculukSonrasi() {
        return rdbTaburculukSonrasi;
    }

    public void setRdbTaburculukSonrasi(char rdbTaburculukSonrasi) {
        this.rdbTaburculukSonrasi = rdbTaburculukSonrasi;
    }

    public char getRdbBeklenti() {
        return rdbBeklenti;
    }

    public void setRdbBeklenti(char rdbBeklenti) {
        this.rdbBeklenti = rdbBeklenti;
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


    @Override
    public String toString() {
        return "YatanHastaAnketi{" +
                "id=" + id +
                ", txtYil=" + txtYil +
                ", rdbAnketKatilan=" + rdbAnketKatilan +
                ", txtYattigiklinik='" + txtYattigiklinik + '\'' +
                ", rdbYatisSuresi=" + rdbYatisSuresi +
                ", rdbCinsiyet=" + rdbCinsiyet +
                ", rdbYasAralik=" + rdbYasAralik +
                ", rdbEgitim=" + rdbEgitim +
                ", rdbHastaneUlasim=" + rdbHastaneUlasim +
                ", rdbDanismaHizmet=" + rdbDanismaHizmet +
                ", rdbKisiselMahremiyet=" + rdbKisiselMahremiyet +
                ", rdbYatisBekleme=" + rdbYatisBekleme +
                ", rdbDoktorSure=" + rdbDoktorSure +
                ", rdbDoktorBilgilendirdi=" + rdbDoktorBilgilendirdi +
                ", rdbHemsireBilgilendirdi=" + rdbHemsireBilgilendirdi +
                ", rdbIhtiyacSaglikPeronelUlasim=" + rdbIhtiyacSaglikPeronelUlasim +
                ", rdbPersonelDavranis=" + rdbPersonelDavranis +
                ", rdbHastaneTemizlik=" + rdbHastaneTemizlik +
                ", rdbOdadakiEsyalar=" + rdbOdadakiEsyalar +
                ", rdbYemekDagitan=" + rdbYemekDagitan +
                ", rdbTaburculukSonrasi=" + rdbTaburculukSonrasi +
                ", rdbBeklenti=" + rdbBeklenti +
                ", rdbTavsiye=" + rdbTavsiye +
                ", txtHizmetSunanDoktor='" + txtHizmetSunanDoktor + '\'' +
                ", txtHizmetSunanHemsire='" + txtHizmetSunanHemsire + '\'' +
                ", txtHizmetSunanSekreter='" + txtHizmetSunanSekreter + '\'' +
                ", txtHızmetSunanPosta='" + txtHızmetSunanPosta + '\'' +
                ", txtGorusOneri='" + txtGorusOneri + '\'' +
                '}';
    }
}
