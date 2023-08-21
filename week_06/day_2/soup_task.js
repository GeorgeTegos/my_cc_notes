class Soup{
    constructor(name,ingredients = [],price = 0){
        this.name = name
        this.ingredients = ingredients
        this.price = price
    }

    describe(){
        return `For ${this.name} , we use ${this.ingredients}. \nPrice £${this.price}`
    }

    hasOnions(){
        let soupsToReturn = []
        for (let i =0; i < this.ingredients.length; i++){
            if (this.ingredients === "Onions"){
                soupsToReturn.push(this.name)
            }
        return soupsToReturn
        }
    }
}

const chickenSoup = new Soup("Chicken soup",["chicken", "Carrots", "Onions", "Water"],8)
const carrotSoup = new Soup("Carrot soup",["Carrots", "Onions", "Water"],8)
const tomatoSoup = new Soup("Tomato soup",["Tomato", "Carrots", "Onions", "Water"],8)

console.log(chickenSoup.describe())
console.log(carrotSoup.describe())
console.log(tomatoSoup.describe())

console.log(chickenSoup.hasOnions())