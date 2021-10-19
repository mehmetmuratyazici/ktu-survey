package com.ktu.survey.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "AcilServisHastaAnketi")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AcilServisHastaAnketi {
    @Id
    @SequenceGenerator(
        name = "seqAcilServisAnket",
        sequenceName = "seqAcilServisAnket",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "seqAcilServisAnket"
        )
    @Getter
    private long id;


    @Getter
    @Setter
    @Column(name = "yil" , nullable = true)
    private Integer txtYil;

    @Getter
    @Setter
    private char rdbBasvuruSekli ;

    @Getter
    @Setter
    private char rdbCinsiyet ;

    @Getter
    @Setter
    private char rdbYasAralik ;

    @Getter
    @Setter
    private char rdbEgitim;

    @Getter
    @Setter
    private char rdbHastaneUlasim;

    @Getter
    @Setter
    private char rdbDanismaHizmet;

    @Getter
    @Setter
    private char rdbBirimlereUlasma;

    @Getter
    @Setter
    private char rdbKayitBekleme;

    @Getter
    @Setter
    private char rdbDoktorSure;

    @Getter
    @Setter
    private char rdbDoktorBilgilendirdi;


    @Getter
    @Setter
    private char rdbPersoneleKolayUlasim;

    @Getter
    @Setter
    private char rdbSunmusOlduguHimetler;

    @Getter
    @Setter
    private char rdbPersonelDavranis;

    @Getter
    @Setter
    private char rdbHastaneTemizlik;

    @Getter
    @Setter
    private char rdbBeklemeAlanKosul;

    @Getter
    @Setter
    private char rdbMuayeneBeklemeSuresi;

    @Getter
    @Setter
    private char rdbKisiselMahremiyet;

    @Getter
    @Setter
    private char rdbMuayeneOdasıKosul;

    @Getter
    @Setter
    private char rdbTahlilTetkikSureleri;

    @Getter
    @Setter
    private char rdbTahlilTetkik;

    @Getter
    @Setter
    private char rdbYeterliBilgi;

    @Getter
    @Setter
    private char rdbTavsiye;

    @Getter
    @Setter
    private String txtHizmetSunanDoktor;

    @Getter
    @Setter
    private String txtHizmetSunanHemsire;

    @Getter
    @Setter
    private String txtHizmetSunanSekreter;

    @Getter
    @Setter
    private String txtHızmetSunanPosta;

    @Getter
    @Setter
    private String txtGorusOneri;

    @Getter
    private LocalDateTime createdAt = LocalDateTime.now();
    
    
    
}
