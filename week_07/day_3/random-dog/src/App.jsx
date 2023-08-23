import { useState } from 'react'
import './App.css'

function App() {
  const [countries,setCountries] = useState("")
  const [country,setCountry] = useState("")
  const [number,setNumber] = useState(0)
  

  // const fetchDog = function (){
  //   // fetch the JSON from URL
  //   fetch("https://dog.ceo/api/breeds/image/random") // Fetch returns a promise

  //       //turn the JSON into JavaScript
  //   .then(response => response.json()) // Promise , takes a function as an argument
  //   .then(data => setDogImgUrl(data.message))
  // }

  // const fetchCountries = async () =>{
    
  // }


  const showAllCountries = async () => {
    const response = await fetch("https://restcountries.com/v3.1/all")
    const data = await response.json()
    setCountries(data.map((item, index)=> <li key={index}>{item.name.common} <br />population :{item.population} <br /></li>))
  }
   
  const showCountry = async(number) => {
    const response = await fetch("https://restcountries.com/v3.1/all")
    const data = await response.json()
    setCountry(data[number].name.common)
  }

  

  return (
    <>
      <div id='app'>
        <h1> Countries</h1>

        <button onClick={showAllCountries}>Show all Countries</button>
        <label htmlFor="">
        <input type="number" onChange={(e)=>setNumber(e.target.value)}/>
        <button onClick={() =>showCountry(number)}>Show specific country</button>
        </label>
        <h4>
            {country}
          </h4>
        <div>
           <div>
            <ul>{countries}</ul>
          </div>
          
        </div>

      </div>
    </>
  )

}

export default App
