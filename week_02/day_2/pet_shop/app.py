from pet import Pet
from pet_shop import PetShop

monty = Pet("Monty","Snake","Python",500)
# print(monty.name,monty.type,monty.breed,monty.price)

charles = Pet("Charles", "Dog", "Spaniel", 250)

mrs_norris = Pet("Mrs. Norris", "Cat", "Maine Coon", 100)

pets = [monty,charles,mrs_norris]

cc_pet_shop = PetShop("CodeClan pet Shop",0,pets)

num_of_pets = cc_pet_shop.stock_count()
print(f"Shop has: {num_of_pets} pets in stock")

cc_pet_shop.increases_total_cash(100)
print(f"Shop now has £ {cc_pet_shop.cash}")

cc_pet_shop.remove_a_pet(mrs_norris)
print(cc_pet_shop.pets)


print("#"*22)
found_pet = cc_pet_shop.find_pet_by_name("Monty")
print(f"Found {found_pet.name}")

cc_pet_shop.increase_pets_sold()
print(f"Shop has now sold {cc_pet_shop.pet_sold}")




sold_pet = cc_pet_shop.sell_pet("Charles")
print(f"Shop now has £{cc_pet_shop.cash}") # 350
print(f"Shop now has {cc_pet_shop.stock_count()} pets") # 1
print(f"Shop has now sold {cc_pet_shop.pet_sold} pet(s)") # 2
print(f"{sold_pet.name} has a new home") # Charles