import React from 'react'

const SearchBar = ({setSearch, search}) => {

  return (
    <input type="text" onChange={(e)=> setSearch(e.target.value)} 
    value={search} 
    placeholder='Search'
    style={{maxHeight: "1.5rem"}}
    autoFocus/>
  )
}

export default SearchBar