import { useEffect, useState } from 'react'
// import './App.css'

function App() {

  const [teas,setTeas] = useState([])

  useEffect(()=>{
    fetchTeas()
  },[])

  const fetchTeas =() =>{
    fetch("http://localhost:9000/api/teas")
    .then(res => res.json())
    .then(teaData => setTeas(teaData))
  }

  return(
    <>
    <h1>Teas App</h1>
    </>
  )
}

export default App
