import './App.css';
import {  Card , Nav } from 'react-bootstrap';

import 'bootstrap/dist/css/bootstrap.min.css';
import YatanHastaAnketi from './components/YatanHastaAnketi';
import AcilServisHastaAnketi from './components/AcilServisHastaAnketi';
import AyaktanHastaAnketi from './components/AyaktanHastaAnketi';
import {LinkContainer} from 'react-router-bootstrap'


function App() {
  return (

      <div className="App">
        <header className="App-header" >

          <Card style={{backgroundColor:'transparent'}}>
            <Card.Body>
              <Card.Title className="mb-5">
                KTÜ Farabi Hastanesi Anket Sistemi
              </Card.Title>

                <LinkContainer to="/YatanHastaAnketi" className="mb-3">
                    <Nav.Link className="homePageLinks">Yatan Hasta Anketi</Nav.Link>
                </LinkContainer>
                
                <LinkContainer to="/AyaktanHastaAnketi" className="mb-3">
                    <Nav.Link className="homePageLinks">Ayaktan Hasta Anketi</Nav.Link>
                </LinkContainer>

                <LinkContainer to="/AcilServisHastaAnketi" >
                    <Nav.Link className="homePageLinks">Acil Servis Hasta Anketi</Nav.Link>
                </LinkContainer>

            </Card.Body>
          </Card>
          
        </header>
      </div>
  );
}

export default App;
