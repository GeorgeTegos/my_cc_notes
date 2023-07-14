import unittest
from src.room import Room
from src.song import Song
from src.guest import Guest

class TestRoom(unittest.TestCase):
    
    def setUp(self):
        self.room_one = Room(1,3)

        self.list_of_guests = []
        self.song_one = Song("Sparta")
        self.song_two = Song("Bohemian")

        self.guest_one = Guest("George",100,"Bohemian")
        self.guest_two = Guest("Nick",200,"Sparta")
        self.guest_three = Guest("Bill",300,"Back in black")
        self.guest_four= Guest("john",400,"Thunder")
    
    def test_room_number(self):
        self.assertEqual(self.room_one.room_number,1)

    def test_room_capacity(self):
        self.assertEqual(self.room_one.capacity,3)

    def test_number_of_guests(self):
        self.room_one.add_guest_to_room(self.guest_four)
        self.room_one.add_guest_to_room(self.guest_four)
        self.room_one.add_guest_to_room(self.guest_four)
        self.assertEqual(self.room_one.number_of_guests(),3)

    def test_add_guest_to_room(self):
        self.room_one.add_guest_to_room(self.guest_one)
        self.assertEqual(len(self.room_one.list_of_guests),1)

    def test_remove_guest_from_room(self):
        self.room_one.add_guest_to_room(self.guest_one)
        self.room_one.remove_guest_from_room(self.guest_one)
        self.assertEqual(len(self.room_one.list_of_guests), 0)

    def test_add_song_to_room_playlist(self):
        self.room_one.add_song_to_room_playlist(self.song_one)
        self.assertEqual(len(self.room_one.playist),1)

    def test_check_room_capacity(self):
        self.room_one.add_guest_to_room(self.guest_one)
        self.room_one.add_guest_to_room(self.guest_two)
        self.room_one.add_guest_to_room(self.guest_three)
        self.assertEqual(self.room_one.check_room_capacity(),True)
    
    
    