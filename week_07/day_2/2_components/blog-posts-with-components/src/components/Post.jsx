function Post({post, handleLike}){

    return(
        <li className="post">
            <h3>{post.title}</h3>
            <p>{post.description}</p>
            
            {/* <button>{isLiked()}</button> */}
            <button onClick={()=>handleLike(post)}>{post.liked==true ? "Unlike" : "like"}</button>

        </li>
    )
}

export default Post