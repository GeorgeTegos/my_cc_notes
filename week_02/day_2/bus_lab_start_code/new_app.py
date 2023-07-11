from person import Person
from bus import Bus
from bus_stop import BusStop

bus = Bus(22,"Ocean Terminal")

passenger_one = Person("George",29)
passenger_two = Person("Nick",22)
passenger_three = Person("Bill",20)
passenger_four = Person("Lock",20)
passenger_five = Person("Jim",20)
passenger_six = Person("Samantha",20)
passenger_seven = Person("Jenny",20)

bus.add_person(passenger_one)
bus.add_person(passenger_two)
bus.add_person(passenger_three)


bus.drop_passenger(passenger_three)

# print(bus.how_many_passenger())
# bus.empty()
print(bus.how_many_passenger())

print("#"*32)

bus_stop = BusStop("Ocean Terminal")

bus_stop.add_person_to_queue(passenger_four)
bus_stop.add_person_to_queue(passenger_five)

bus_stop_two = BusStop("Princess Stree")
bus_stop_two.add_person_to_queue(passenger_six)
bus_stop_two.add_person_to_queue(passenger_seven)



# print(bus.passengers)
print(f"Number of passengers before bus stop {bus.how_many_passenger()}")
bus.collect_all_from_stop(bus_stop.queue)


print(f"People waiting in the queue {len(bus_stop.queue)}")
bus_stop.remove_all_people_from_queue()
print(f"Number of passenger at first stop: {bus.how_many_passenger()}")
print(f"The Bus stop now has {len(bus_stop.queue)} people in queue")

# bus.next_stop(bus.how_many_passenger(),len(bus_stop.queue))

print("#"*43)


print(f"People waiting in the queue {len(bus_stop_two.queue)}")
bus.collect_all_from_stop(bus_stop_two.queue)
bus_stop_two.remove_all_people_from_queue()
print(f"Number of passenger at second stop: {bus.how_many_passenger()}")
print(f"The Bus stop now has {len(bus_stop.queue)} people in queue")

print("#"*43)

current_passengers_list = bus.passengers_list(bus.passengers)
print(f"List of  current passengers names are: {current_passengers_list}")

# print(bus.passengers)

bus.empty()
print(f"Bus reached his destination and now has {len(bus.passengers)} passengers")



