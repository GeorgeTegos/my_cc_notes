import unittest
from src.card import Card
from src.card_game import CardGame

class TestCardGame(unittest.TestCase):
    
    def setUp(self):
        self.card1 = Card('Heart',10)
        self.card2 = Card('Heart',4)
        self.card3 = Card('Heart',8)
        self.card4 = Card('Heart',1)
        self.card_list = [self.card1,self.card2,self.card3,self.card4]
        self.card_game_one = CardGame()

    def test_check_for_ace(self):
        self.assertEqual(self.card_game_one.check_for_ace(self.card1),True)

    def test_highest_card(self):
        result = self.card_game_one.highest_card(self.card1,self.card2)
        self.assertEqual(result,self.card2)

    def test_cards_total(self):
        result = self.card_game_one.cards_total(self.card_list)
        self.assertEqual(result,"You have a total of 23X")