const express = require('express');
const app = express();
const cors = require("cors")
const createRouter = require("./helpers/create_router.js")


//middleware
app.use(cors())
app.use(express.json())


const teas = [
    { name: "Early Grey", brand: "Twinings" },
    { name: "Irish Breakfast", brand: "Barry's Tea" },
    { name: "Lemon and Ginger", brand: "Lipton" },
    { name: "Rooibos", brand: "Tick Tock" },
    { name: "Green", brand: "Clipper" }
]

// initialise biscuits data
const biscuits = [
    {name: "Chocolate Chip", calories:"100"},
    {name: "Vanilla Chip", calories:"90"},
    {name: "Hazelnut", calories:"130"},
    {name: "Strawberry", calories:"90"},

]


const teasRouter = createRouter(teas)
app.use('/api/teas', teasRouter)

const biscuitsRouter = createRouter(biscuits)
app.use('/api/biscuits', biscuitsRouter)



app.listen(9000, ()=>{
    console.log("app listening on port 9000")
})