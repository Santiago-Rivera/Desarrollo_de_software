import logo from './logo.svg';
import './App.css';
import Greating from './components/pure/greating';
import Fgreating from './components/pure/fgreating';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        {/*Componente propio greating.jsx*/}
        {/*<Greating>name = "Santiago"</Greating>*/}
        <Fgreating></Fgreating>
      </header>
    </div>
  );
}

export default App;
