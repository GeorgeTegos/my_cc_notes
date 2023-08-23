import {useState} from 'react'
import Header from '../components/Header'
import PostForm from '../components/PostForm';
import PostList from '../components/PostList';

function PostContainer(){

    const [posts, setPosts] = useState([
        {
            id: 1,
            title: "What is a function?",
            description:
            "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Consequuntur repellendus autem fuga sapiente nulla aut natus",
            liked: false
        },
    ]);

    const handleLike = (post) => {
        setPosts(posts.map((postItem) => 
            post.id == postItem.id
            ? {...postItem, liked:!(postItem.liked)}
            : postItem))
                   
    }
    
    return (
        <>
            <Header/>
            <section className="container feed">
                <PostForm posts={posts} setPosts={setPosts}/>
                <PostList posts={posts} handleLike={handleLike}/>
            </section>
        </>
    )
}

export default PostContainer