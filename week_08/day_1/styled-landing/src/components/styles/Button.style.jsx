import styled from "styled-components"

export const Button = styled.button`
  background-color: ${({bg}) => bg};
  color: white;
  border: none;
  padding: ${(props)=> (props.size == "lg" ?"2rem" :"1rem")};
`;

export const SecondaryButton = styled(Button)`
  border: 2px solid purple;
  background-color: transparent;
  color:purple;
`;