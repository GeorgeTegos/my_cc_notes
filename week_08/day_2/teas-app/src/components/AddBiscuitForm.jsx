import { useState } from "react";

const AddBiscuitForm =({setBiscuits}) =>{

    const [name,setName] = useState("")
    const [calories,setCalories] = useState("")
  
    const handleSubmit =(e) =>{
      e.preventDefault()
  
      const biscuit = {name, calories}
      const config ={
        method: 'POST',
        headers:{'Content-Type':"application/json"},
        body: JSON.stringify(biscuit)
      }
  
      fetch("http://localhost:9000/api/biscuits", config)
      .then(res => res.json())
      .then(data => setBiscuits(data))
    } 
  
    return(
      <form onSubmit={handleSubmit}>
        <label htmlFor="name">Name</label>
        <input type="text" onChange={(e) => setName(e.target.value)} 
        value={name} name='name'/>
        
        <label htmlFor="calories">Calories</label>
        <input type="number" onChange={(e) => setCalories(e.target.value)} 
        value={calories} name='brand'/>
        <button type="submit">Add Biscuit</button>

      </form>
    )
  };
  

  const editTea=(e)=>{
    
    const tea={name,brand}
  
    const config={
      method: 'PUT',
      headers:{'Content-Type':"application/json"},
      body: JSON.stringify(tea)
    }
  
    fetch(`http://localhost:9000/api/teas/${id}`, config)
    .then(res => res.json())
    .then(data=>setTeas(data))
  
  }

  export default AddBiscuitForm