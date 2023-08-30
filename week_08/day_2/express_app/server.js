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

const teasRouter = createRouter(teas)
app.use('/api/teas', teasRouter)

//Get all teas
app.get('/api/teas',(req, res)=>{
    // res.send("test")
    res.json(teas)
})


//Get Individual Tea (GET)
app.get('/api/teas/:id',(req,res)=>{
    res.json(teas[req.params.id])
})

//Create a new tea (POST)
app.post('/api/teas',(req,res)=>{
    teas.push(req.body)
    res.json(teas)
})

//Delete tea      (DELETE)
app.delete('/api/teas/:id',(req,res)=>{
    teas.splice(req.params.id, 1)
    res.json(teas)
})

//Update Tea    (PUT)
app.put('/api/teas/:id',(req,res)=>{
    teas[req.params.id] = req.body
    res.json(teas)
})





app.listen(9000, ()=>{
    console.log("app listening on port 9000")
})