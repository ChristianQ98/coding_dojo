import React from 'react';
import './App.css';

import Header from './components/Header';
import Navigation from './components/Navigation';
import Main from './components/Main';
import Subcontent from './components/Subcontent';
import Advertisement from './components/Advertisement';

function App() {
  return (
    <div className="app" style={{ 'backgroundColor': "#dddddd", 'width': '65%', 'margin': '0 auto', 'padding': '1%', 'marginTop': '1%', 'border': '3px solid black' }}>
        <Header />
        <div className="flex" style={{ 'display': 'flex', 'justifyContent': 'space-around', 'width': '100%', 'margin': '0 auto', 'marginTop': '2%' }}>
          <Navigation />
          <Main>
            <div style={{ 'display': 'flex', 'justifyContent': 'space-evenly' }}>
            <Subcontent />
            <Subcontent />
            <Subcontent />
            </div>
            <div style={{ 'marginTop': '4%', 'height': '10%' }}>
              <Advertisement />
              </div>
        </Main>
      </div>
    </div>
  );
}

export default App;
