const express = require('express')


const createRouter = (data)=>{
    const router = express.Router()
    //Get all data
    router.get('/',(req, res)=>{
    // res.send("test")
    res.json(data)
    })


    //Get Individual Tea (GET)
    router.get('/:id',(req,res)=>{
    res.json(data[req.params.id])
    })

    //Create a new tea (POST)
    router.post('/',(req,res)=>{
    data.push(req.body)
    res.json(data)
    })

    //Delete tea      (DELETE)
    router.delete('/:id',(req,res)=>{
    data.splice(req.params.id, 1)
    res.json(data)
    })

    //Update Tea    (PUT)
    router.put('/:id',(req,res)=>{
    data[req.params.id] = req.body
    res.json(data)
    })

    

return router
}

module.exports = createRouter