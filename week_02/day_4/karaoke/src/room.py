class Room:

    def __init__(self,room_number,capacity):
        self.room_number = room_number
        self.capacity = capacity
        self.list_of_guests= []
        self.playist = []
        self.total_room_charge = 0

    def add_guest_to_room(self,guest_to_add):
        if self.check_room_capacity() == True:
            self.list_of_guests.append(guest_to_add)
        else:
            print(f"Sorry no space for more Guessts at room number {self.room_number}")

    def remove_guest_from_room(self,guest_to_remove):
        # if self.room_charge_to_pay() != 0:
        #     guest_to_remove.pay(self.room_charge_to_pay())
        self.list_of_guests.remove(guest_to_remove)


    def add_song_to_room_playlist(self,song):
        self.playist.append(song)
    
    def check_room_capacity(self):
        if self.capacity > self.number_of_guests():
            return True
        else:
            return False

    
    def number_of_guests(self):
        return len(self.list_of_guests)
    
    def room_charge_to_pay(self):
        return self.total_room_charge
        

