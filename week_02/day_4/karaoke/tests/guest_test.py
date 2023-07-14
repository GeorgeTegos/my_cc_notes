import unittest
from src.guest import Guest
from src.room import Room
from src.song import Song
from src.bar import Bar
from src.food import Food

class TestGuest(unittest.TestCase):
    
    def setUp(self):
        self.guest_one = Guest("George",100,"Bohemian")
        self.room_one = Room(1,3)
        
        self.song_one = Song("Bohemian")
        self.song_two = Song("Sparta")

        self.bar_one = Bar("Main Bar",500)
        self.food_one = Food("Club",10)
        self.bar_one.add_food_to_the_bar(self.food_one)


    def test_guest_name(self):
        self.assertEqual(self.guest_one.name,"George")
    
    def test_guest_wallet(self):
        self.assertEqual(self.guest_one.wallet,100)
    
    def test_guest_favourite_song(self):
        self.assertEqual(self.guest_one.favourite_song,"Bohemian")

    def test_cheer_for_favourite_song(self):
        self.room_one.add_song_to_room_playlist(self.song_one)
        self.assertEqual(self.guest_one.cheer_for_favourite_song(self.room_one.playist),"Whoo!")

    def test_pay(self):
        self.guest_one.pay(self.bar_one.bar_food_list[0].price)
        self.assertEqual(self.guest_one.wallet,90)
    