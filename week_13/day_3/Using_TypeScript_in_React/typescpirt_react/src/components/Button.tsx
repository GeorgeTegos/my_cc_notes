export enum Colour{
    RED = "#f00505",
    BLUE = "#061ef8",
    GREEN = "#45ab00"
}

interface ButtonProps {
    size: "small" | "large",
    colour: Colour,
    text: string,
    borderColour?:Colour;
    onClick?:(e: React.MouseEvent<HTMLElement>) => void;
}

const Button = ({size , colour , text, borderColour, onClick}: ButtonProps) =>{

    return <button className={`button__${size}`} 
    style={{backgroundColor: colour , borderColor:borderColour}} 
    onClick={onClick}>{text}</button>
}

export default Button