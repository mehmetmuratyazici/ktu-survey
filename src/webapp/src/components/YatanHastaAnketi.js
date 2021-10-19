import React, { Component , useState } from 'react'
import '../App.css'
import { Container , Row , Col , Alert , Button , Form, FormLabel , Card , NavLink} from 'react-bootstrap';
import axios from 'axios';
import General from '../base/General';

const initialState = {
    txtYil : "",
    rdbAnketKatilan :"",
    txtYattigiklinik :"",
    rdbYatisSuresi:"",
    txtKisiselBilgiler :"",
    rdbCinsiyet :"",
    rdbYasAralik:"",
    rdbEgitim:"",
    rdbHastaneUlasim:"",
    rdbDanismaHizmet:"",
    rdbKisiselMahremiyet:"",
    rdbYatisBekleme:"",
    rdbDoktorSure:"",
    rdbDoktorBilgilendirdi:"",
    rdbHemsireBilgilendirdi:"",
    rdbIhtiyacSaglikPeronelUlasim:"",
    rdbPersonelDavranis:"",
    rdbHastaneTemizlik:"",
    rdbOdadakiEsyalar:"",
    rdbYemekDagitan:"",
    rdbTaburculukSonrasi:"",
    rdbBeklenti:"",
    rdbTavsiye:"",
    txtHizmetSunanDoktor:"",
    txtHizmetSunanHemsire:"",
    txtHizmetSunanSekreter:"",
    txtHızmetSunanPosta:"",
    txtGorusOneri:""

}


//const [SendFrm, setSendFrm] = useState(initialState);
const YatanHastaAnketi = () => {
    const [SendFrm, setSendFrm] = useState(initialState)

    const handleChange = (event) => {
        const {name , value} = event.target;

        setSendFrm({...SendFrm,[name]:value});
    }
    
    const handleSubmit = (event) => {

        event.preventDefault();
        if(!General.isExistNullWithStart(SendFrm)){
            
            alert("Lütfen boş alan bırakmayınız !");
            return;
        }
        sendRequestFrm(SendFrm);
    }

    async function sendRequestFrm(sendObj){
        const response = await axios.post('/ktusurvey/ktu/survey/yatan/setYatanlar.ajax', sendObj);
              
        if(response.data.success){
            window.open("/ktusurvey/#/survey/success","_self");
        }

    }

    //console.log(SendFrm);
    return (
        <div className="App">
        <header className="App-header">

            <Container style={{}}>
                <Form className="mb-3" >
                    <Form.Row style={{ fontSize : "20px" }}>
                    <Form.Group  controlId="frmTitle">
                        <Col>
                        <Form.Label>KARADENİZ TEKNİK ÜNİVERSİTESİ SAĞLIK UYGULAMA VE ARAŞTIRMA MERKEZİ</Form.Label>
                        </Col>
                        <Col>
                        <Form.Label>BAŞHEKİMLİĞİ</Form.Label>
                        </Col>
                    </Form.Group>
                    </Form.Row>
                    <Row>
                    <Form.Label>YATAN HASTA DENEYİM ANKETİ</Form.Label>
                    </Row>
                    <Row>
                    <Row>
                        <FormLabel column="sm">Kaliteli hizmet sunmayı hedefleyen hastanemizin bundan sonraki çalışmalarında yol gösterici olması açısından aşağıda yer alan soruların sizler tarafındn yanıtlanması büyük önem taşımaktadır. Bu konuda göstermiş olduğunuz ilgi ve yardımlarınızdan dolayı şimdiden teşekkür eder, geçmiş olsun dileklerimizi iletiriz</FormLabel>
                    </Row>
                    <Row>
                        <FormLabel column="sm"> NOT: Kişisel bilgileriniz ve ankette verdiğiniz bilgiler kesinlikle gizli tutulacaktır. </FormLabel>
                    </Row>
                    </Row>
                </Form>
                <Form onSubmit={handleSubmit}>
                <Form.Group className="mb-3">
                <Row >
                    <Col md xs ="auto">
                        <Row >
                            <Col md xs="auto">
                                <Form.Label inline>Yıl :</Form.Label>
                            </Col>
                            <Col md xs="auto">
                            <Form.Control onChange={handleChange} inline name="txtYil" type="number" placeholder="Yılı Giriniz" ></Form.Control>
                            </Col>
                        </Row>
                    </Col>
                    <Col md >
                        <Row >
                        <Col md xs="auto" >
                            <Form.Label >Ankete Katılan : </Form.Label>
                        </Col>
                        <Col md xs="auto" className="my-1">
                            <Form.Check value="0" onChange={handleChange} inline name="rdbAnketKatilan" label="Hasta" id="rbdAnketKatilan1" type="radio" />
                            <Form.Check value="1" onChange={handleChange} inline name="rdbAnketKatilan" label="Hasta Yakını" id="rbdAnketKatilan2" type="radio" />
                        </Col>
                        </Row>
                    </Col>
                </Row>  
                </Form.Group>
                <Form.Group className="mb-3">
                <Row>
                    
                    <Col md xs="auto">
                        <Form.Label>Yattığı Klinik :</Form.Label>
                    </Col>
                    <Col md >
                        <Form.Control onChange={handleChange} type="text" controlId="txtYattigiklinik" name ="txtYattigiklinik" />
                    </Col>
                    
                    </Row>
                </Form.Group>
                <Form.Group className="mb-3">
                <Row>
                    <Col md xs ="auto">
                    <Form.Label>Yatış Süresi :</Form.Label>
                    </Col>
                    <Col md xs="auto">
                    <Form.Check value="0" onChange={handleChange} label="0-5 gün" type="radio" inline name="rdbYatisSuresi" id="rdbYatisSuresi1"/>
                    <Form.Check value="1" onChange={handleChange} label="6-10 gün" type="radio" inline name="rdbYatisSuresi" id="rdbYatisSuresi2"/>
                    <Form.Check value="2" onChange={handleChange} label="10 günün üzeri" type="radio" inline name="rdbYatisSuresi" id="rdbYatisSuresi3"/>
                    </Col>
                </Row>
                

                </Form.Group>
                <Form.Group className="mb-3">
                <Row>
                    
                    <Col md xs="auto">
                        <Form.Label>Kişisel Bilgiler :</Form.Label>
                    </Col>
                    
                    
                    </Row>
                </Form.Group>
                <Form.Group className="mb-3">

                <Row>
                    <Col md xs ="auto">
                    <Form.Label>Cinsiyetiniz :</Form.Label>
                    </Col>
                    <Col md xs="auto">
                    <Form.Check value="0" onChange={handleChange} label="Kadın" type="radio" inline name="rdbCinsiyet" id="rdbCinsiyet1"/>
                    <Form.Check value="1" onChange={handleChange} label="Erkek" type="radio" inline name="rdbCinsiyet" id="rdbCinsiyet2"/>
                    </Col>
                </Row>
                
                </Form.Group>
                <Form.Group className="mb-3">
                
                <Row>
                    <Row md xs="auto">
                    <Form.Label>Ait olduğunuz yaş kategorisini giriniz .</Form.Label>
                    </Row>
                
                    <Col md xs="auto">
                    <Form.Check value="0" onChange={handleChange} label="20'nin altında" type="radio" inline name="rdbYasAralik" id="rdbYasAralik1"/>
                    <Form.Check value="1" onChange={handleChange} label="20-29" type="radio" inline name="rdbYasAralik" id="rdbYasAralik2"/>
                    <Form.Check value="2" onChange={handleChange} label="30-39" type="radio" inline name="rdbYasAralik" id="rdbYasAralik3"/>
                    <Form.Check value="3" onChange={handleChange} label="40-49" type="radio" inline name="rdbYasAralik" id="rdbYasAralik4"/>
                    <Form.Check value="4" onChange={handleChange} label="50-59" type="radio" inline name="rdbYasAralik" id="rdbYasAralik5"/>
                    <Form.Check value="5" onChange={handleChange} label="60 üstü" type="radio" inline name="rdbYasAralik" id="rdbYasAralik6"/>
                    </Col>
                </Row>
                
                </Form.Group>
                <Form.Group className="mb-3">
                
                <Row>
                    <Row md xs="auto">
                    <Form.Label>Eğitim durumunuzu belirtiniz .</Form.Label>
                    </Row>
                
                    <Col md xs="auto">
                    <Form.Check value="0" onChange={handleChange} label="Okuryazar değil" type="radio" inline name="rdbEgitim" id="rdbEgitim1"/>
                    <Form.Check value="1" onChange={handleChange} label="Okuryazar" type="radio" inline name="rdbEgitim" id="rdbEgitim2"/>
                    <Form.Check value="2" onChange={handleChange} label="İlkokul" type="radio" inline name="rdbEgitim" id="rdbEgitim3"/>
                    <Form.Check value="3" onChange={handleChange} label="Ortaokul" type="radio" inline name="rdbEgitim" id="rdbEgitim4"/>
                    <Form.Check value="4" onChange={handleChange} label="Lise" type="radio" inline name="rdbEgitim" id="rdbEgitim5"/>
                    <Form.Check value="5" onChange={handleChange} label="Üniversite" type="radio" inline name="rdbEgitim" id="rdbEgitim6"/>
                    <Form.Check value="6" onChange={handleChange} label="Yüksek Lisans" type="radio" inline name="rdbEgitim" id="rdbEgitim7"/>
                    <Form.Check value="7" onChange={handleChange} label="Doktora" type="radio" inline name="rdbEgitim" id="rdbEgitim8"/>
                    </Col>
                </Row>
                
                </Form.Group>
                <Form.Group className="mt-5 mb-3">
                    <Card style={{ backgroundColor : "transparent"}}>
                    <Card.Body>
                        <Card.Title className="mb-3">Lütfen aşağıdaki ifadelerle ilgili görüşlerinizi sizin için uygun olan kutucuğu işaretleyerek belirtiniz</Card.Title>
                        
                        <Form.Group className="mb-3">
                        
                        <Row>
                            <Row md xs="auto" style={{fontSize:"24px"}}>
                            <Form.Label>1.Hastane ulaşımında zorluk yaşamadım .</Form.Label>
                            </Row>
                        
                            <Col md xs="auto" style={{fontSize:"17px"}}>
                            <Form.Check value="0" onChange={handleChange} label="Tamamen Katılıyorum" type="radio" inline name="rdbHastaneUlasim" id="rdbHastaneUlasim1"/>
                            <Form.Check value="1" onChange={handleChange} label="Katılıyorum" type="radio" inline name="rdbHastaneUlasim" id="rdbHastaneUlasim2"/>
                            <Form.Check value="2" onChange={handleChange} label="Kararsızım" type="radio" inline name="rdbHastaneUlasim" id="rdbHastaneUlasim3"/>
                            <Form.Check value="3" onChange={handleChange} label="Katılmıyorum" type="radio" inline name="rdbHastaneUlasim" id="rdbHastaneUlasim4"/>
                            <Form.Check value="4" onChange={handleChange} label="Kesinlikle Katılmıyorum" type="radio" inline name="rdbHastaneUlasim" id="rdbHastaneUlasim5"/>
                            </Col>
                        </Row>
                        
                        </Form.Group>

                        <Form.Group className="mb-3">
                        
                        <Row>
                            <Row md xs="auto" style={{fontSize:"24px"}}>
                            <Form.Label>2.Danışma ve yönlendirme hizmetleri yeterliydi .</Form.Label>
                            </Row>
                        
                            <Col md xs="auto" style={{fontSize:"17px"}}>
                            <Form.Check value="0" onChange={handleChange} label="Tamamen Katılıyorum" type="radio" inline name="rdbDanismaHizmet" id="rdbDanismaHizmet1"/>
                            <Form.Check value="1" onChange={handleChange} label="Katılıyorum" type="radio" inline name="rdbDanismaHizmet" id="rdbDanismaHizmet2"/>
                            <Form.Check value="2" onChange={handleChange} label="Kararsızım" type="radio" inline name="rdbDanismaHizmet" id="rdbDanismaHizmet3"/>
                            <Form.Check value="3" onChange={handleChange} label="Katılmıyorum" type="radio" inline name="rdbDanismaHizmet" id="rdbDanismaHizmet4"/>
                            <Form.Check value="4" onChange={handleChange} label="Kesinlikle Katılmıyorum" type="radio" inline name="rdbDanismaHizmet" id="rdbDanismaHizmet5"/>
                            </Col>
                        </Row>
                        
                        </Form.Group>

                        <Form.Group className="mb-3">
                        
                        <Row>
                            <Row md xs="auto" style={{fontSize:"24px"}}>
                            <Form.Label>3.Muayene ve tetkikler sırasında kişisel mahremiyetime özen gösterildi .</Form.Label>
                            </Row>
                        
                            <Col md xs="auto" style={{fontSize:"17px"}}>
                            <Form.Check value="0" onChange={handleChange} label="Tamamen Katılıyorum" type="radio" inline name="rdbKisiselMahremiyet" id="rdbKisiselMahremiyet1"/>
                            <Form.Check value="1" onChange={handleChange} label="Katılıyorum" type="radio" inline name="rdbKisiselMahremiyet" id="rdbKisiselMahremiyet2"/>
                            <Form.Check value="2" onChange={handleChange} label="Kararsızım" type="radio" inline name="rdbKisiselMahremiyet" id="rdbKisiselMahremiyet3"/>
                            <Form.Check value="3" onChange={handleChange} label="Katılmıyorum" type="radio" inline name="rdbKisiselMahremiyet" id="rdbKisiselMahremiyet4"/>
                            <Form.Check value="4" onChange={handleChange} label="Kesinlikle Katılmıyorum" type="radio" inline name="rdbKisiselMahremiyet" id="rdbKisiselMahremiyet5"/>
                            </Col>
                        </Row>
                        
                        </Form.Group>

                        <Form.Group className="mb-3">
                        
                        <Row>
                            <Row md xs="auto" style={{fontSize:"24px"}}>
                            <Form.Label>4.Hastaneye yatış işlemleri için çok beklemedim .</Form.Label>
                            </Row>
                        
                            <Col md xs="auto" style={{fontSize:"17px"}}>
                            <Form.Check value="0" onChange={handleChange} label="Tamamen Katılıyorum" type="radio" inline name="rdbYatisBekleme" id="rdbYatisBekleme1"/>
                            <Form.Check value="1" onChange={handleChange} label="Katılıyorum" type="radio" inline name="rdbYatisBekleme" id="rdbYatisBekleme2"/>
                            <Form.Check value="2" onChange={handleChange} label="Kararsızım" type="radio" inline name="rdbYatisBekleme" id="rdbYatisBekleme3"/>
                            <Form.Check value="3" onChange={handleChange} label="Katılmıyorum" type="radio" inline name="rdbYatisBekleme" id="rdbYatisBekleme4"/>
                            <Form.Check value="4" onChange={handleChange} label="Kesinlikle Katılmıyorum" type="radio" inline name="rdbYatisBekleme" id="rdbYatisBekleme5"/>
                            </Col>
                        </Row>
                        
                        </Form.Group>
                        <Form.Group className="mb-3">
                        
                        <Row>
                            <Row md xs="auto" style={{fontSize:"24px"}}>
                            <Form.Label>5.Doktorumun bana ayırdığı süre yeterliydi .</Form.Label>
                            </Row>
                        
                            <Col md xs="auto" style={{fontSize:"17px"}}>
                            <Form.Check value="0" onChange={handleChange} label="Tamamen Katılıyorum" type="radio" inline name="rdbDoktorSure" id="rdbDoktorSure1"/>
                            <Form.Check value="1" onChange={handleChange} label="Katılıyorum" type="radio" inline name="rdbDoktorSure" id="rdbDoktorSure2"/>
                            <Form.Check value="2" onChange={handleChange} label="Kararsızım" type="radio" inline name="rdbDoktorSure" id="rdbDoktorSure3"/>
                            <Form.Check value="3" onChange={handleChange} label="Katılmıyorum" type="radio" inline name="rdbDoktorSure" id="rdbDoktorSure4"/>
                            <Form.Check value="4" onChange={handleChange} label="Kesinlikle Katılmıyorum" type="radio" inline name="rdbDoktorSure" id="rdbDoktorSure5"/>
                            </Col>
                        </Row>
                        
                        </Form.Group>
                        <Form.Group className="mb-3">
                        
                        <Row>
                            <Row md xs="auto" style={{fontSize:"24px"}}>
                            <Form.Label>6.Doktorum tarafından hastalığım ve tedavim ile ilgili yeterli bilgilendirme yapıldı .</Form.Label>
                            </Row>
                        
                            <Col md xs="auto" style={{fontSize:"17px"}}>
                            <Form.Check value="0" onChange={handleChange} label="Tamamen Katılıyorum" type="radio" inline name="rdbDoktorBilgilendirdi" id="rdbDoktorBilgilendirdi1"/>
                            <Form.Check value="1" onChange={handleChange} label="Katılıyorum" type="radio" inline name="rdbDoktorBilgilendirdi" id="rdbDoktorBilgilendirdi2"/>
                            <Form.Check value="2" onChange={handleChange} label="Kararsızım" type="radio" inline name="rdbDoktorBilgilendirdi" id="rdbDoktorBilgilendirdi3"/>
                            <Form.Check value="3" onChange={handleChange} label="Katılmıyorum" type="radio" inline name="rdbDoktorBilgilendirdi" id="rdbDoktorBilgilendirdi4"/>
                            <Form.Check value="4" onChange={handleChange} label="Kesinlikle Katılmıyorum" type="radio" inline name="rdbDoktorBilgilendirdi" id="rdbDoktorBilgilendirdi5"/>
                            </Col>
                        </Row>
                        
                        </Form.Group>
                        <Form.Group className="mb-3">
                        
                        <Row>
                            <Row md xs="auto" style={{fontSize:"24px"}}>
                            <Form.Label>7.Hemşireler tarafından tedavim ve bakımım ile ilgili yeterli bilgilendirme yapıldı .</Form.Label>
                            </Row>
                        
                            <Col md xs="auto" style={{fontSize:"17px"}}>
                            <Form.Check value="0" onChange={handleChange} label="Tamamen Katılıyorum" type="radio" inline name="rdbHemsireBilgilendirdi" id="rdbHemsireBilgilendirdi1"/>
                            <Form.Check value="1" onChange={handleChange} label="Katılıyorum" type="radio" inline name="rdbHemsireBilgilendirdi" id="rdbHemsireBilgilendirdi2"/>
                            <Form.Check value="2" onChange={handleChange} label="Kararsızım" type="radio" inline name="rdbHemsireBilgilendirdi" id="rdbHemsireBilgilendirdi3"/>
                            <Form.Check value="3" onChange={handleChange} label="Katılmıyorum" type="radio" inline name="rdbHemsireBilgilendirdi" id="rdbHemsireBilgilendirdi4"/>
                            <Form.Check value="4" onChange={handleChange} label="Kesinlikle Katılmıyorum" type="radio" inline name="rdbHemsireBilgilendirdi" id="rdbHemsireBilgilendirdi5"/>
                            </Col>
                        </Row>
                        
                        </Form.Group>
                        <Form.Group className="mb-3">
                        
                        <Row>
                            <Row md xs="auto" style={{fontSize:"24px"}}>
                            <Form.Label>8.İhtiyaç halinde sağlık personeline kolaylıkla ulaşabildim .</Form.Label>
                            </Row>
                        
                            <Col md xs="auto" style={{fontSize:"17px"}}>
                            <Form.Check value="0" onChange={handleChange} label="Tamamen Katılıyorum" type="radio" inline name="rdbIhtiyacSaglikPeronelUlasim" id="rdbIhtiyacSaglikPeronelUlasim1"/>
                            <Form.Check value="1" onChange={handleChange} label="Katılıyorum" type="radio" inline name="rdbIhtiyacSaglikPeronelUlasim" id="rdbIhtiyacSaglikPeronelUlasim2"/>
                            <Form.Check value="2" onChange={handleChange} label="Kararsızım" type="radio" inline name="rdbIhtiyacSaglikPeronelUlasim" id="rdbIhtiyacSaglikPeronelUlasim3"/>
                            <Form.Check value="3" onChange={handleChange} label="Katılmıyorum" type="radio" inline name="rdbIhtiyacSaglikPeronelUlasim" id="rdbIhtiyacSaglikPeronelUlasim4"/>
                            <Form.Check value="4" onChange={handleChange} label="Kesinlikle Katılmıyorum" type="radio" inline name="rdbIhtiyacSaglikPeronelUlasim" id="rdbIhtiyacSaglikPeronelUlasim5"/>
                            </Col>
                        </Row>
                        
                        </Form.Group>
                        <Form.Group className="mb-3">
                        
                        <Row>
                            <Row md xs="auto" style={{fontSize:"24px"}}>
                            <Form.Label>9.Hastane personelinin bana karşı davranışları nezaket kurallarına uygundu .</Form.Label>
                            </Row>
                        
                            <Col md xs="auto" style={{fontSize:"17px"}}>
                            <Form.Check value="0" onChange={handleChange} label="Tamamen Katılıyorum" type="radio" inline name="rdbPersonelDavranis" id="rdbPersonelDavranis1"/>
                            <Form.Check value="1" onChange={handleChange} label="Katılıyorum" type="radio" inline name="rdbPersonelDavranis" id="rdbPersonelDavranis2"/>
                            <Form.Check value="2" onChange={handleChange} label="Kararsızım" type="radio" inline name="rdbPersonelDavranis" id="rdbPersonelDavranis3"/>
                            <Form.Check value="3" onChange={handleChange} label="Katılmıyorum" type="radio" inline name="rdbPersonelDavranis" id="rdbPersonelDavranis4"/>
                            <Form.Check value="4" onChange={handleChange} label="Kesinlikle Katılmıyorum" type="radio" inline name="rdbPersonelDavranis" id="rdbPersonelDavranis5"/>
                            </Col>
                        </Row>
                        
                        </Form.Group>
                        <Form.Group className="mb-3">
                        
                        <Row>
                            <Row md xs="auto" style={{fontSize:"24px"}}>
                            <Form.Label>10.Hastane genel olarak temizdi .</Form.Label>
                            </Row>
                        
                            <Col md xs="auto" style={{fontSize:"17px"}}>
                            <Form.Check value="0" onChange={handleChange} label="Tamamen Katılıyorum" type="radio" inline name="rdbHastaneTemizlik" id="rdbHastaneTemizlik1"/>
                            <Form.Check value="1" onChange={handleChange} label="Katılıyorum" type="radio" inline name="rdbHastaneTemizlik" id="rdbHastaneTemizlik2"/>
                            <Form.Check value="2" onChange={handleChange} label="Kararsızım" type="radio" inline name="rdbHastaneTemizlik" id="rdbHastaneTemizlik3"/>
                            <Form.Check value="3" onChange={handleChange} label="Katılmıyorum" type="radio" inline name="rdbHastaneTemizlik" id="rdbHastaneTemizlik4"/>
                            <Form.Check value="4" onChange={handleChange} label="Kesinlikle Katılmıyorum" type="radio" inline name="rdbHastaneTemizlik" id="rdbHastaneTemizlik5"/>
                            </Col>
                        </Row>
                        
                        </Form.Group>
                        <Form.Group className="mb-3">
                        
                        <Row>
                            <Row md xs="auto" style={{fontSize:"24px"}}>
                            <Form.Label>11.Odadaki eşyalar çalışır durumdaydı .</Form.Label>
                            </Row>
                        
                            <Col md xs="auto" style={{fontSize:"17px"}}>
                            <Form.Check value="0" onChange={handleChange} label="Tamamen Katılıyorum" type="radio" inline name="rdbOdadakiEsyalar" id="rdbOdadakiEsyalar1"/>
                            <Form.Check value="1" onChange={handleChange} label="Katılıyorum" type="radio" inline name="rdbOdadakiEsyalar" id="rdbOdadakiEsyalar2"/>
                            <Form.Check value="2" onChange={handleChange} label="Kararsızım" type="radio" inline name="rdbOdadakiEsyalar" id="rdbOdadakiEsyalar3"/>
                            <Form.Check value="3" onChange={handleChange} label="Katılmıyorum" type="radio" inline name="rdbOdadakiEsyalar" id="rdbOdadakiEsyalar4"/>
                            <Form.Check value="4" onChange={handleChange} label="Kesinlikle Katılmıyorum" type="radio" inline name="rdbOdadakiEsyalar" id="rdbOdadakiEsyalar5"/>
                            </Col>
                        </Row>
                        
                        </Form.Group>
                        <Form.Group className="mb-3">
                        
                        <Row>
                            <Row md xs="auto" style={{fontSize:"24px"}}>
                            <Form.Label>12.Yemek dağıtan personel temizlik kurallarına uygun davrandı ( Bone , eldiven , maske takması vb. ) .</Form.Label>
                            </Row>
                        
                            <Col md xs="auto" style={{fontSize:"17px"}}>
                            <Form.Check value="0" onChange={handleChange} label="Tamamen Katılıyorum" type="radio" inline name="rdbYemekDagitan" id="rdbYemekDagitan1"/>
                            <Form.Check value="1" onChange={handleChange} label="Katılıyorum" type="radio" inline name="rdbYemekDagitan" id="rdbYemekDagitan2"/>
                            <Form.Check value="2" onChange={handleChange} label="Kararsızım" type="radio" inline name="rdbYemekDagitan" id="rdbYemekDagitan3"/>
                            <Form.Check value="3" onChange={handleChange} label="Katılmıyorum" type="radio" inline name="rdbYemekDagitan" id="rdbYemekDagitan4"/>
                            <Form.Check value="4" onChange={handleChange} label="Kesinlikle Katılmıyorum" type="radio" inline name="rdbYemekDagitan" id="rdbYemekDagitan5"/>
                            </Col>
                        </Row>
                        
                        </Form.Group>
                        <Form.Group className="mb-3">
                        
                        <Row>
                            <Row md xs="auto" style={{fontSize:"24px"}}>
                            <Form.Label>13.Hastaneden ayrılırken taburculuk sonrası süreç ile ilgili yeterli bilgilendirme yapıldı .</Form.Label>
                            </Row>
                        
                            <Col md xs="auto" style={{fontSize:"17px"}}>
                            <Form.Check value="0" onChange={handleChange} label="Tamamen Katılıyorum" type="radio" inline name="rdbTaburculukSonrasi" id="rdbTaburculukSonrasi1"/>
                            <Form.Check value="1" onChange={handleChange} label="Katılıyorum" type="radio" inline name="rdbTaburculukSonrasi" id="rdbTaburculukSonrasi2"/>
                            <Form.Check value="2" onChange={handleChange} label="Kararsızım" type="radio" inline name="rdbTaburculukSonrasi" id="rdbTaburculukSonrasi3"/>
                            <Form.Check value="3" onChange={handleChange} label="Katılmıyorum" type="radio" inline name="rdbTaburculukSonrasi" id="rdbTaburculukSonrasi4"/>
                            <Form.Check value="4" onChange={handleChange} label="Kesinlikle Katılmıyorum" type="radio" inline name="rdbTaburculukSonrasi" id="rdbTaburculukSonrasi5"/>
                            </Col>
                        </Row>
                        
                        </Form.Group>
                        <Form.Group className="mb-3">
                        
                        <Row>
                            <Row md xs="auto" style={{fontSize:"24px"}}>
                            <Form.Label>14.Hastanenin sunduğu hizmetler beklentilerimi karşıladı .</Form.Label>
                            </Row>
                        
                            <Col md xs="auto" style={{fontSize:"17px"}}>
                            <Form.Check value="0" onChange={handleChange} label="Tamamen Katılıyorum" type="radio" inline name="rdbBeklenti" id="rdbBeklenti1"/>
                            <Form.Check value="1" onChange={handleChange} label="Katılıyorum" type="radio" inline name="rdbBeklenti" id="rdbBeklenti2"/>
                            <Form.Check value="2" onChange={handleChange} label="Kararsızım" type="radio" inline name="rdbBeklenti" id="rdbBeklenti3"/>
                            <Form.Check value="3" onChange={handleChange} label="Katılmıyorum" type="radio" inline name="rdbBeklenti" id="rdbBeklenti4"/>
                            <Form.Check value="4" onChange={handleChange} label="Kesinlikle Katılmıyorum" type="radio" inline name="rdbBeklenti" id="rdbBeklenti5"/>
                            </Col>
                        </Row>
                        
                        </Form.Group>
                        <Form.Group className="mb-3">
                        
                        <Row>
                            <Row md xs="auto" style={{fontSize:"24px"}}>
                            <Form.Label>15.Bu hastaneyi aileme ve arkadaşlarıma tavsiye ederim .</Form.Label>
                            </Row>
                        
                            <Col md xs="auto" style={{fontSize:"17px"}}>
                            <Form.Check value="0" onChange={handleChange} label="Tamamen Katılıyorum" type="radio" inline name="rdbTavsiye" id="rdbTavsiye1"/>
                            <Form.Check value="1" onChange={handleChange} label="Katılıyorum" type="radio" inline name="rdbTavsiye" id="rdbTavsiye2"/>
                            <Form.Check value="2" onChange={handleChange} label="Kararsızım" type="radio" inline name="rdbTavsiye" id="rdbTavsiye3"/>
                            <Form.Check value="3" onChange={handleChange} label="Katılmıyorum" type="radio" inline name="rdbTavsiye" id="rdbTavsiye4"/>
                            <Form.Check value="4" onChange={handleChange} label="Kesinlikle Katılmıyorum" type="radio" inline name="rdbTavsiye" id="rdbTavsiye5"/>
                            </Col>
                        </Row>
                        
                        </Form.Group>
                        <Form.Group className="mb-3">
                        <Row>
                            
                            <Col md xs="auto" style={{fontSize:"24px"}}>
                                <Form.Label>Hizmet sunumundan memnun kaldığınız Doktorun adını yazınız :</Form.Label>
                            </Col>
                            <Col md >
                                <Form.Control onChange={handleChange} type="text" controlId="txtHizmetSunanDoktor" name="txtHizmetSunanDoktor"/>
                            </Col>
                            
                            </Row>
                        </Form.Group>
                        <Form.Group className="mb-3">
                        <Row>
                            
                            <Col md xs="auto" style={{fontSize:"24px"}}>
                                <Form.Label>Hizmet sunumundan memnun kaldığınız Hemşirenin adını yazınız :</Form.Label>
                            </Col>
                            <Col md >
                                <Form.Control onChange={handleChange} type="text" controlId="txtHizmetSunanHemsire" name="txtHizmetSunanHemsire"/>
                            </Col>
                            
                            </Row>
                        </Form.Group>
                        <Form.Group className="mb-3">
                        <Row>
                            
                            <Col md xs="auto" style={{fontSize:"24px"}}>
                                <Form.Label>Hizmet sunumundan memnun kaldığınız Sekreterin adını yazınız :</Form.Label>
                            </Col>
                            <Col md >
                                <Form.Control onChange={handleChange} type="text" controlId="txtHizmetSunanSekreter" name="txtHizmetSunanSekreter"/>
                            </Col>
                            
                            </Row>
                        </Form.Group>
                        <Form.Group className="mb-3">
                        <Row>
                            
                            <Col md xs="auto" style={{fontSize:"24px"}}>
                                <Form.Label>Hizmet sunumundan memnun kaldığınız Temizlik/Posta görevlisinin adını yazınız :</Form.Label>
                            </Col>
                            <Col md >
                                <Form.Control onChange={handleChange} type="text" controlId="txtHızmetSunanPosta" name="txtHızmetSunanPosta"/>
                            </Col>
                            
                            </Row>
                        </Form.Group>
                        <Form.Group className="mb-3">
                        <Row>
                            
                                <Form.Label style={{fontSize:"24px" , fontWeight:"bold"}}>Varsa görüş ve önerileriniz</Form.Label>
                            <Col md >
                                <Form.Control onChange={handleChange} as="textArea" controlId="txtGorusOneri" name="txtGorusOneri"/>
                            </Col>
                            
                            </Row>
                        </Form.Group>
                        <Form.Group>
                            <Button type="submit" variant="primary">Gönder</Button>
                        </Form.Group>
                    </Card.Body>
                    </Card>
                </Form.Group>
            </Form>
            </Container>
        
                </header>
        </div>
    )
    
}

export default YatanHastaAnketi
