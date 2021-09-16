import {
  BrowserRouter, 
  Link,
  Switch,
  Route
} from 'react-router-dom';
import './App.css';
import Welcome from './components/Welcome';
import Number from './components/Input';
import StyledWord from './components/StyledWord';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <p>
          <Link to="/home">Home</Link>
          &nbsp; | &nbsp;
          <Link to="/input">Number/Word</Link>
          &nbsp; | &nbsp;
          <Link to="/word/fontColor/bgColor">Styled Word</Link>
        </p>
        <Switch>
          <Route path="/home">
            <Welcome/>
          </Route>
          <Route exact path="/:input">
            <Number/>
          </Route>
          <Route exact path="/:word/:fontColor/:bgColor">
            <StyledWord/>
          </Route>
        </Switch>
      </BrowserRouter>
    </div>
  );
}

export default App;
