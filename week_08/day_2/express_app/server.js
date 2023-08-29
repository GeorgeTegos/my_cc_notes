const express = require('express');
const app = express();

// res = Request  res=
app.get('/api',(req, res)=>{
    res.json({message: "Hello world"})
})


app.listen(9000, ()=>{
    console.log("app listening on port 9000")
})