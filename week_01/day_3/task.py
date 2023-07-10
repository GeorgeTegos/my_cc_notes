avengers = {
    "Iron_man": {
        "name": "Tony_Stark",
        "attacks":{
                "punch":10,
                "kick":100
            }        
    },
    
    "Hulk": {
        "name": "Bruce_Banner",
        "attacks":{
                "smash":1000,
                "roll":500
            }
    }
}


hulk_smash_power = avengers["Hulk"]["attacks"]["smash"]
print(hulk_smash_power)