import React from 'react'
import SearchBar from './SearchBar'
import styled from "styled-components"

function Header({setSearch,search}) {
    const Nav = styled.nav`
    background-color: rgb(255, 102, 0);
    font-family: Arial, Helvetica, sans-serif;
    display: flex;
    justify-content:space-around;
    align-items: center;
    padding: 0px;
    margin: 0px;
    gap:40%;
    
  
    `;
    



  return (

   <Nav>
    <p><span style={{fontWeight: "bold"}}>HACKER NEWS CLONE</span> | NEWS | PAST | COMMENTS</p>
    <SearchBar setSearch={setSearch} search={search} />
    </Nav>
  
  )
}

export default Header
