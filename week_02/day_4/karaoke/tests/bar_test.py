import unittest

from src.bar import Bar
from src.food import Food
from src.drink import Drink
from src.guest import Guest

class TestBar(unittest.TestCase):

    def setUp(self):
        self.guest_one = Guest("George",100,"Bohemian")

        self.main_bar = Bar("Main Bar",500)

        self.food_one = Food("Club",10)
        self.food_two = Food("Chips",4)
        self.food_three = Food("Toast",5)

        self.drink_one = Drink("Beer",5)
        self.drink_two = Drink("Whiskey",8)




    def test_add_food_to_the_bar(self):
        self.main_bar.add_food_to_the_bar(self.food_one)
        self.assertIn("Club",self.main_bar.bar_food_list[0].food_name)
    
    def test_add_drink_to_the_bar(self):
        self.main_bar.add_drink_to_the_bar(self.drink_one)
        self.assertEqual("Beer",self.main_bar.bar_drink_list[0].drink_name)
    
    def test_sell_food_to_guest(self):
        self.main_bar.sell_food_to_guest(self.guest_one,self.food_one)
        self.assertEqual(self.guest_one.wallet,90)
        self.assertEqual(self.main_bar.bar_till,510)
    
    def test_sell_drink_to_guest(self):
        self.main_bar.sell_drink_to_guest(self.guest_one,self.drink_one)
        self.assertEqual(self.main_bar.bar_till,505)
        self.assertEqual(self.guest_one.wallet,95)
    
