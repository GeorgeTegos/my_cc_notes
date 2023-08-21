import { useState } from 'react'
// import './App.css'

function App() {

  const [counter,setCounter] = useState(0);
  const [anotherCounter, setAnotherCounter] = useState(0)
  const [name,setName] = useState('Jason')

  const increment = (counter,setCounter) => {
    setCounter(counter+1);
  }

  const decrement = (counter,setCounter) =>{
    setCounter(counter-1);
  }
  

  return (
    <>
  <h1> Hello {name}</h1>
    <input value={name} onChange={(e)=> setName(e.target.value)}/>
  {/* <button onClick={() => setName("George")}>Change name</button> */}
  <hr />
  <p>Counter: {counter}</p>
  <button onClick={() => decrement(counter,setCounter)}>Decrement</button>
  <button onClick={() => increment(counter,setCounter)}>Increment</button>
  <hr />
  <p>Another Counter:</p>
  <p>Counter: {anotherCounter}</p>
  <button onClick={() => decrement(anotherCounter,setAnotherCounter)}>Decrement</button>
  <button onClick={() => increment(anotherCounter, setAnotherCounter)}>Increment</button>

  </>
  );
}

export default App
