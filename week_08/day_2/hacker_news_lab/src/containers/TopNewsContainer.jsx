import React from 'react'
import { useState, useEffect } from 'react'
import ListStories from '../components/ListStories'
import SearchBar from '../components/SearchBar'
import Header from '../components/Header'

const TopNewsContainer = () => {
    const [topStories,setTopStories] = useState([])
    const [search,setSearch] = useState("")
    
    
    useEffect(()=>{
      
    fetch("https://hacker-news.firebaseio.com/v0/topstories.json")
    .then(res => res.json())
    .then(data => data.slice(0,20))
    .then((top20IDs) => {
      const topStoriesById = top20IDs.map((eachID) => 
      fetch(`https://hacker-news.firebaseio.com/v0/item/${eachID}.json`)
      .then(res => res.json()))
      
      Promise.all(topStoriesById).then((data)=> {
        setTopStories(data)
      })
    }
    ) //top20ids
    },[]) // useEffect
    
    const storiesToRender = (topStories) => {
      const storiesToRender = []
      if (topStories.length > 0) {
        if (search == "") {
          storiesToRender.push(topStories)
        } else {
          storiesToRender.push(
            topStories.filter(story => story.title.toLowerCase().indexOf(search.toLowerCase()) != -1 )
          )
        }
      }
      return storiesToRender.flat()
    }
   
    
    
    
    return (
      <>
       <Header search={search} setSearch={setSearch}/>
        <hr/>
        {/* <SearchBar search={search} setSearch={setSearch}/> */}
        <ListStories storiesToRender={storiesToRender(topStories)}/>
        </>
    )
    }

export default TopNewsContainer
