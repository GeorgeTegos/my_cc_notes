class Guest:

    def __init__(self,name,wallet,favourite_song):
        self.name = name
        self.wallet = wallet
        self.favourite_song = favourite_song
        self.spend = 0
    
    def cheer_for_favourite_song(self,room_playlist):
        for song in room_playlist:
            if self.favourite_song in song.name_of_song:
                return "Whoo!"