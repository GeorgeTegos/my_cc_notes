chickens = [
  { "name": "Margaret", "age": 2, "eggs": 0 },
  { "name": "Hetty", "age": 1, "eggs": 2 },
  { "name": "Henrietta", "age": 3, "eggs": 1 },
  { "name": "Audrey", "age": 2, "eggs": 0 },
  { "name": "Mabel", "age": 5, "eggs": 1 },
]
# ducks = [
#   { "name": "Margaret", "age": 2, "eggs": 4 },
#   { "name": "Hetty", "age": 1, "eggs": 2 },
#   { "name": "Henrietta", "age": 3, "eggs": 1 },
#   { "name": "Audrey", "age": 2, "eggs": 2 },
#   { "name": "Mabel", "age": 5, "eggs": 1 },
# ]



def count_eggs(birds):
    
    total_eggs = 0
    for chicken in birds:
        total_eggs += chicken["eggs"]
        chicken["eggs"] = 0 # eggs have been collected
    return (f"{total_eggs} eggs collected")

print(count_eggs(chickens))
# print(count_eggs(ducks))