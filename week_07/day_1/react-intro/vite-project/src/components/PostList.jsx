import Post from "./Post"

function PostList({posts}){

    const postItems = posts.map((post)=> <Post post={post} key={post.id}/>)

    return (
        <>
        <h1>Your feed</h1>
            <ul id="post-list">
                {postItems}
        </ul>
        </>
    )
}
export default PostList