import {useState} from 'react'

function PostForm({posts, setPosts}){

    const [title, setTitle] = useState("");
    const [description, setDescription] = useState("");

    const createPost = () => {
        const newPost = {
        id: posts.length + 1,
        title: title,
        description: description,
        };

        setPosts([newPost, ...posts])
        setTitle("")
        setDescription("")
    };

    return (
        <>
            <h2>Add Post</h2>
            <div>
                <label>Title</label>
                <input onChange={(e) => setTitle(e.target.value)} value={title} />
            </div>
            <div>
                <label>Description</label>
                <textarea
                onChange={(e) => setDescription(e.target.value)}
                value={description}
                ></textarea>
            </div>
            <button onClick={createPost}>Create Post</button>
        </>
    )
}

export default PostForm