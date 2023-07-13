class Bar:

    def __init__(self,type_of_bar,till):
        self.bar_food_list = []
        self.bar_drink_list = []
        self.bar_till = till
        self.type_of_bar = type_of_bar
    
    def add_food_to_the_bar(self,food):
        self.bar_food_list.append(food)

