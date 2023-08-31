use zoo; //Database
db.dropDatabase();

db.animals.insertMany( [     //animals = collections
    {
        name: 'penguin',
        age: 20,
        color: {
            one:"white",
            two:"black"
            }
    },
    {
        name:"pigeon",
        type:"bird",
        speed: 10
    }
])

db.animals.findOne({name:"penguin"})

db.animals.updateOne({ name: "penguin"}, { $set: {age:21} })

db.animals.deleteOne({name:"penguin"})

db.staff.insertMany( [     //animals = collections
    {
        name: 'Nick',
        age: 20,
        pet:db.animals.findOne({name:"pigeon"})
       
    },
    {
        name:"Josh",
        type:"human",
        speed: 10
    }
])



