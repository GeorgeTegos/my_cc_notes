from pet import Pet

class PetShop:

    def __init__(self,name,cash,pets):
        self.name = name
        self.pets = pets
        self.cash = cash
        self.pet_sold = 0
    
    def stock_count(self):
        return len(self.pets)
    
    def increases_total_cash(self,amount):
        self.cash += amount

    def remove_a_pet(self,pet):
        self.pets.remove(pet)

    def find_pet_by_name(self,pet_name_input):
        for pet in self.pets:
            if pet_name_input == pet.name:
                return pet
    
    def increase_pets_sold(self):
        self.pet_sold += 1

    def sell_pet(self, pet_name_to_sell):
        pet_to_sell = self.find_pet_by_name(pet_name_to_sell)
        self.increases_total_cash(pet_to_sell.price)
        self.remove_a_pet(pet_to_sell)
        self.increase_pets_sold()
        return pet_to_sell
