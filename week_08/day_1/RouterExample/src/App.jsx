import { useState } from 'react'
import './App.css'
import {Routes, Route, Outlet, Link} from "react-router-dom"

function App() {

  return (
    <div>
      <h1>React Router Example</h1>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route index element={<Home />}/>
          <Route path="about" element={<About />}/>
          <Route path="dashboard" element={<Dashboard />}/>
          <Route path="*" element={<NoMatch />}/>
        </Route>
      </Routes>
    </div>
  )
}

function Layout(){
  return(
    <div>
      <nav>
        <ul>
          <li>
            <Link to="/">Home</Link>
          </li>
          <li>
            <Link to="/about">About</Link>
          </li>
          <li>
            <Link to="/dashboard">Dashboard</Link>
          </li>
        </ul>
      </nav>
    <hr />
    <Outlet />
    </div>
  )
}


function Home(){
  return (
    <div>
      Home
    </div>
  )
}

function About(){
  return (
    <div>
      About
    </div>
  )
}

function Dashboard(){
  return (
    <div>
      Dashboard
    </div>
  )
}

function NoMatch(){
  return (
    <div>
     404 Not Found
    </div>
  )
}

export default App
