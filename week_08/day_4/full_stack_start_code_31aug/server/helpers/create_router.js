const express = require('express');
const ObjectID = require("mongodb").ObjectID;

const createRouter = function (collection) {

  const router = express.Router();

  router.get('/', (req, res) =>{
    collection.find()
    .toArray()
    .then((docs)=>{ res.json(docs);
     }).catch((err)=>{
      console.log(`On ho! ${err}`)
      res.status(500);
      res.json({status: 500, error: err})
     });
  });

  router.get('/:id', (req,res)=>{
    const someId = req.params.id
    collection.findOne({_id: ObjectID(someId)})
    .then(doc => res.json(doc))
    .catch((err)=>{
      console.log(`On ho! ${err}`)
      res.status(500);
      res.json({status: 500, error: err})
     });
  });

  router.post('/', (req,res)=>{
    const newData = req.body
    newData.playingTime = Number(newData.playingTime)

    collection.insertOne(newData)
    .then(doc => {
      res.json(doc.ops[0])
    })
  })

  router.delete('/:id', (req,res)=>{
    collection.deleteOne({_id: ObjectID(req.params.id)})
    .then((doc) => {
      res.json(doc)})
    .catch((err)=>{
      console.log(`On ho! ${err}`)
      res.status(500);
      res.json({status: 500, error: err})
     });
  })

  router.put('/:id', (req,res)=>{
    const someId = req.params.id
    const newData = req.body

    collection.updateOne({_id: ObjectID(someId)},{$set: newData})
    .then(doc => {
      res.json(doc)
    }).catch((err)=>{
      console.log(`On ho! ${err}`)
      res.status(500);
      res.json({status: 500, error: err})
     });
  })

  return router;

};

module.exports = createRouter;
