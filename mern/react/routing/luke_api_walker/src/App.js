import Search from './components/Search';
import Results from './components/Results';
import {
  BrowserRouter,
  Switch,
  Route
} from 'react-router-dom';
import './App.css';
import Error from './components/Error';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
          <Search/>

        <Switch>
          <Route path="/:cat/:num">
            <Results/>
          </Route>
          <Route path="/404">
            <Error/>
          </Route>
        </Switch>

      </BrowserRouter>
    </div>
  );
}

export default App;
