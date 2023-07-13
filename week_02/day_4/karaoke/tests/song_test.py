import unittest
from src.song import Song

class TestSong(unittest.TestCase):

    def setUp(self):
        self.song_one = Song("Sparta")
    
    def test_song_name(self):
        self.assertEqual(self.song_one.name_of_song,"Sparta")


    