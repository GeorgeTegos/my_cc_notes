class Bar:

    def __init__(self,type_of_bar,till):
        self.bar_food_list = []
        self.bar_drink_list = []
        self.bar_till = till
        self.type_of_bar = type_of_bar
    
    def add_food_to_the_bar(self,food):
        self.bar_food_list.append(food)

    def add_drink_to_the_bar(self,drink):
        self.bar_drink_list.append(drink)
    
    def sell_food_to_guest(self,guest,food):
        guest.wallet -= food.price
        self.add_money_to_till(food.price)

    def sell_drink_to_guest(self,guest,drink):
        guest.wallet -= drink.price
        self.add_money_to_till(drink.price)

    def add_money_to_till(self,amount):
        self.bar_till += amount


