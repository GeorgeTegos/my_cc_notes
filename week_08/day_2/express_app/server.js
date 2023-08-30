const express = require('express');
const app = express();
const cors = require("cors")

//middleware
app.use(cors())

const teas = [
    { name: "Early Grey", brand: "Twinings" },
    { name: "Irish Breakfast", brand: "Barry's Tea" },
    { name: "Lemon and Ginger", brand: "Lipton" },
    { name: "Rooibos", brand: "Tick Tock" },
    { name: "Green", brand: "Clipper" }
]


app.get('/api/teas',(req, res)=>{
    // res.send("test")
    res.json(teas)
})


app.listen(9000, ()=>{
    console.log("app listening on port 9000")
})