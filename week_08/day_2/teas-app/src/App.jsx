import { useEffect, useState } from 'react'
import AddTeaForm from './components/AddTeaForm'
import AddBiscuitForm from './components/AddBiscuitForm'
// import './App.css'

function App() {

  const [teas,setTeas] = useState([])
  const [biscuits,setBiscuits] = useState([])

  useEffect(()=>{
    fetchTeas()
    fetchBiscuits()
  },[])

  const fetchTeas =() =>{
    fetch("http://localhost:9000/api/teas")
    .then(res => res.json())
    .then(teaData => setTeas(teaData))
  }
  const fetchBiscuits =() =>{
    fetch("http://localhost:9000/api/biscuits")
    .then(res => res.json())
    .then(biscuitsData => setBiscuits(biscuitsData))
  }


  const deleteTea =(id) =>{
    const config={
      method: "DELETE"
    }

    fetch(`http://localhost:9000/api/teas/${id}`, config)
    .then(res => res.json())
    .then(data=> setTeas(data))
  }

  const deleteBiscuit =(id) =>{
    const config={
      method: "DELETE"
    }

    fetch(`http://localhost:9000/api/biscuits/${id}`, config)
    .then(res => res.json())
    .then(data=> setBiscuits(data))
  }




  return(
    <>
    <h1>Teas App</h1>

    <AddTeaForm setTeas={setTeas}/>


    <h3>Teas</h3>
    <ul>
      {teas.map((tea, index) => 
      <>
      <li>{tea.name} / {tea.brand}</li>
      <button onClick={()=> deleteTea(index)}>Delete</button>
      </>)
      }
    </ul>

    <hr />
    <h3>Biscuits</h3>
    <AddBiscuitForm setBiscuits={setBiscuits}/>
    <ul>
      {biscuits.map((biscuit,index) =>
      <>
       <li>{biscuit.name} / {biscuit.calories}calories</li>
       <button onClick={()=> deleteBiscuit(index)}>Delete</button>
       </>
       )}
    </ul>

    </>
  )
}





export default App
