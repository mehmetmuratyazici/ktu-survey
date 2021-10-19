import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';

import { BrowserRouter as Router, Switch, Route, HashRouter } from "react-router-dom";
import YatanHastaAnketi from './components/YatanHastaAnketi';
import AcilServisHastaAnketi from './components/AcilServisHastaAnketi'
import AyaktanHastaAnketi from './components/AyaktanHastaAnketi'
import SuccessScreen from './components/SuccessScreen';

ReactDOM.render(
  <React.StrictMode>
    <HashRouter basename={"/survey"}>
    
      <Switch>
        <Route exact path="/" component={App}/>
        <Route path="/YatanHastaAnketi" component={YatanHastaAnketi} />
        <Route path="/AyaktanHastaAnketi" component={AyaktanHastaAnketi} />
        <Route path="/AcilServisHastaAnketi" component={AcilServisHastaAnketi} />
        <Route path="/success" component={SuccessScreen} />

        
      </Switch>
    </HashRouter>
  </React.StrictMode>,
  document.getElementById('root')
);
