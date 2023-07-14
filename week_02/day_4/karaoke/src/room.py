class Room:

    def __init__(self,room_number,capacity):
        self.room_number = room_number
        self.capacity = capacity
        self.list_of_guests= []
        self.playist = []

    def add_guest_to_room(self,guest_to_add):
        if self.check_room_capacity() == True:
            self.list_of_guests.append(guest_to_add)

    def remove_guest_from_room(self,guest_to_remove):
        self.list_of_guests.remove(guest_to_remove)

    def add_song_to_room_playlist(self,song):
        self.playist.append(song)
    
    def check_room_capacity(self):
        if self.capacity > len(self.list_of_guests):
            return True
        else:
            return False
        

