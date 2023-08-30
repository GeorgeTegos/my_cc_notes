import { useState } from "react";

const AddTeaForm =({setTeas}) =>{

    const [name,setName] = useState("")
    const [brand,setBrand] = useState("")
  
    const handleSubmit =(e) =>{
      e.preventDefault()
  
      const tea = {name:'New', brand:"New"}


      const config ={
        method: 'POST',
        headers:{'Content-Type':"application/json"},
        body: JSON.stringify(tea)
      }
  
      fetch("http://localhost:9000/api/teas", config)
      .then(res => res.json())
      .then(data => setTeas(data))
    } 

  
    return(
      <form onSubmit={handleSubmit}>
        <label htmlFor="name">Name</label>
        <input type="text" onChange={(e) => setName(e.target.value)} value={name} name='name'/>
        
        <label htmlFor="brand">Brand</label>
        <input type="text" onChange={(e) => setBrand(e.target.value)} value={brand} name='brand'/>
        <button type="submit">Add Tea</button>
        
      </form>
    )
  };

  export default AddTeaForm