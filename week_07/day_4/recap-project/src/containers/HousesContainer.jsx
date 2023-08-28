
import { useEffect, useState } from "react";

const HousesContainer = () => {
  const [houses, setHouses] = useState([]);

  useEffect(() => {
    // Fetch all of the houses from the API
    fetch("https://wizard-world-api.herokuapp.com/Houses")
      .then((res) => res.json())
      .then((data) => setHouses(data));
  }, []);

  return (
    <>
      <Title title="Houses" />
      <AddHouseForm houses={houses} setHouses={setHouses}/>
      <HousesList houses={houses} />
    </>
  );
};

const Title = ({ title }) => {
  return <h1>{title}</h1>;
};

const HousesList = ({ houses }) => {
  return houses.map((house) => <House house={house} />);
};

const House = ({ house }) => {
  return (
    <>
      <h2>{house.name}</h2>
      <p>{house.animal}</p>
    </>
  );
};

const AddHouseForm = ({houses,setHouses}) => {
    const [name, setName] = useState("")
    const [animal,setAnimal] = useState("")

  return (
    <form>
      <div>
        <label>Name</label>
        <input onChange={(e)=> setName(e.target.value)} 
        value={name}/>
      </div>

      <div>
        <label>Animal</label>
        <input onChange={(e)=>setAnimal(e.target.value)} value={animal}/>
      </div>
      <button onClick={(e) => {
        e.preventDefault()
        setHouses([...houses,{name,animal}])}}> Add</button>
    </form>
  );
};

export default HousesContainer;