import React from 'react'
import styled from "styled-components"
import dayjs from 'dayjs';
import relativeTime from 'dayjs/plugin/relativeTime';

dayjs.extend(relativeTime)

const UserName = styled.h3`
    background-color: transparent;
    color: blue;
    background-image: url();
`;

const Image = styled.img`
max-width: 7rem;
max-height: 8rem;
`;

const Wrapper = styled.div`
 display: flex;
 gap: 10px;
 margin-bottom: 1rem;
 background-color: #dfd9d9;
 align-items: center;
 padding-left: 10px;
 max-width: 60%;
 color: ${(props)=> (props.color ?props.color :"black")} ;

 /* background-color: grey; */
`;

const Comment = styled.p`

`;

const RightBox = styled.div`
    
`;

// const dateX = dayjs(datePosted).format("YYYY/MM/DD")


function CommentCard({userName, imageUrl, comment, datePosted}) {
  
  
    return (
    <>
    <Wrapper>
    <Image src={imageUrl} />

    <RightBox>   
        <UserName>
            {userName}
        </UserName>
        <Comment>
            {comment}
        </Comment>

        <Wrapper color="blue">
            Like - Reply - {dayjs(datePosted).fromNow()}

        </Wrapper>


        </RightBox>
    </Wrapper>
    </>
  )
}

export default CommentCard