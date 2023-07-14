from song import Song
from guest import Guest
from room import Room
from bar import Bar
from food import Food
from drink import Drink

guest_one = Guest("George",200,"Sparta")
guest_two = Guest("Nick",100,"Highway")
guest_three = Guest("Bill",300,"Bohemian")
guest_four = Guest("John",400,"Thunder")

room_one = Room(1,3)
room_two = Room(2,2)

song_one = Song("sparta")
song_two = Song("Bohemian")

food_one = Food("Club",10)
food_two = Food ("Chips",5)

drink_one = Drink("Beer",5)
drink_two = Drink("Cola",3)

room_one.add_guest_to_room(guest_one)
room_one.add_guest_to_room(guest_two)
room_one.add_guest_to_room(guest_three)
print(f"Room number {room_one.room_number} has {len(room_one.list_of_guests)} guest(s)\n ")
