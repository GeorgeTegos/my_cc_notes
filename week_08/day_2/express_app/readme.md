install express
------------
const express = require('express');
const app = express();

app.get('/path',(req, res)=>{
    res.json({API / JSON})
})


app.listen(9000, ()=>{
    console.log("app listening on port 9000")
})
----------------



// so backend and frontend can move data
npm install cors
-------------------
const cors = require("cors")
//middleware
app.use(cors())
-------------------


//
npm install nodemon

package.json >> scripts >>     "start": "nodemon server.js"
