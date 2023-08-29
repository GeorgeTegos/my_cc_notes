import React from 'react'
import dayjs from "dayjs"
import relativeTime from "dayjs/plugin/relativeTime"
import styled from "styled-components"

function ListStories ({storiesToRender}) {
   

    const returnTimeFrom = (time) => {
        dayjs.extend(relativeTime);
        const dayjsObject = dayjs.unix(time)
        return dayjs().to(dayjsObject)

    }

    const Wrapper = styled.div`
        display: flex;
        flex-flow: column wrap;
    `;

    const PostTitle = styled.span`
        font-weight: bold;
        font-family: Verdana, Geneva, Tahoma, sans-serif;
        font-size: 10pt;

    `;

    const BelowPostTitle = styled.span`
    color: #828282;
    font-size: 7pt;
    font-family: Verdana, Geneva, Tahoma, sans-serif;
    `;

    return (
      <>
      {storiesToRender.length >0 &&
      storiesToRender.map(story => 
        <Wrapper>
            <PostTitle>{story.title}</PostTitle>
            <BelowPostTitle>{returnTimeFrom(story.time)}</BelowPostTitle>
        </Wrapper>
      )
      }
      </>
    )
  }

export default ListStories