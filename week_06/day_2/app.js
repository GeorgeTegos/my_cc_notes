const Soup = require("./soup.js")
const chickenSoup = new Soup('chicken',["Chicken", 'Carrots', 'Onions', 'Water'],8)
console.log(chickenSoup.describe())

const SandwichDeal = require("./sandwitchDeal.js")
const deal = new SandwichDeal ('White',["Tomato","Cheese"],chickenSoup)

console.log(deal.describe("George"))