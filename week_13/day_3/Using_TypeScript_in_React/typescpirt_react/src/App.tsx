import { useState } from 'react'
import './App.css'
import Button, {Colour} from './components/Button'
import { User } from './types';

function App() {
  const [user,setUser] = useState<User | null>(null)
  const [counter,setCounter] = useState<number>(0);

  const increment= (e: React.MouseEvent<HTMLElement>) =>{

    setCounter(counter+1);
  }

  const decrement = (e: React.MouseEvent<HTMLElement>) => {
    setCounter(counter-1);
  }

const onSubmit = (e: React.FormEvent<HTMLFormElement>) => {
  e.preventDefault;
}

if(!user){
  return <h1>Loading</h1>
}

  return (
  <>
    <h1>{user.name}</h1>

    <h1 onClick={increment}>{counter}</h1>

    <Button size="small" colour={Colour.GREEN} text="Decrement" onClick={decrement}/>
    <Button size="large" colour={Colour.BLUE} text="Increment" onClick={increment} borderColour={Colour.RED}/>
  </>
  )
}

export default App
