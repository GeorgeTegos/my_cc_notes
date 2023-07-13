import unittest

from src.bar import Bar

class TestBar(unittest.TestCase):

    def setUp(self):
        self.main_bar = Bar("Main Bar",500)

    def test_add_food_to_the_bar(self):
        self.main_bar.add_food_to_the_bar("Pasta")
        self.assertIn("Pasta",self.main_bar.bar_food_list)