import { useState } from "react";
import Header from "../components/Header";
import PostForm from "../components/PostForm";
import PostList from "../components/PostList";

function PostContainer(){
  const [posts, setPosts] = useState([
    {
      id: 1,
      title: "What is a function?",
      description:
        "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Consequuntur repellendus autem fuga sapiente nulla aut natus",
    },
  ]);
  
  return (
        <>
            <Header />
            <PostForm posts={posts} setPosts={setPosts}/>
            <PostList posts={posts}/>
        </>
        )
}

export default PostContainer