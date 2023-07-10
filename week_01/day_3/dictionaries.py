# # meals = ['eggs','pasta','fish']

# my_first_dictionary = {}

# # my_first_dictionary = dict()


meals = {
     "breakfast":"eggs",
     "lunch":"pasta",
     "dinner":"fish"
     }

print(meals)


print(meals["breakfast"])

meals["supper"] = "beans"
print(meals)
meals["dinner"] = "salad"
print(meals)

del meals["breakfast"]
print(meals)

# person_dict = {
#     "george":29,
#     "nick":20,
#     }
# print(person_dict)

# person_dict["josh"] = 25

# del person_dict["nick"]
# print(person_dict)

print(meals.keys())
print(meals.values())
print("\n\n\n")

coutries = {
    "uk":{
        "capital":"London",
        "population":1000,
        },
    "germany":{
        "capital":"Berlin",
        "population":200
    } 

}

print(coutries)

germany_population = coutries["germany"]["population"]
print(germany_population)
coutries["germany"]["population"] = 100
print(coutries)