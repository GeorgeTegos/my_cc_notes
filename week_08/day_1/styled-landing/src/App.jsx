import { useState } from 'react'
import styled from "styled-components"
import {Button, SecondaryButton} from "../src/components/styles/Button.style"

const Title = styled.h1`
color:red;
`;

const SubTitle = styled.p`
  color:blue;
`;




function App() {
  
  return <>
  <Title>
    My blog post (using styled-components)
  </Title>

  <SubTitle>
    This is a subtitle (using styled components)
  </SubTitle>

  <Button bg="orange">
    Click me !
  </Button>

  <Button bg="blue" size="lg">
    Click me blue!
  </Button>

  <SecondaryButton bg="yellow">
    Secondary Button
  </SecondaryButton>

  </>
}

export default App
