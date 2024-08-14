import logo from './logo.svg';
import './App.css';
import Greating from './Components/pure/greating';
import Fgreating from './Components/pure/fgreating';
import TaskListComponent from './Components/container/task_list';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        {/*Componente propio Greating.jsx*/}
        <Greating></Greating>
        {/*Componente de ejemplo funcional*/}
        <Fgreating></Fgreating>
        {/*Componente de tareas*/}
        <TaskListComponent></TaskListComponent>
      </header>
    </div>
  );
}

export default App;
