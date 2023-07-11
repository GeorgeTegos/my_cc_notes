class Bus:



    def __init__(self,route_number,destination):
        self.route_number = route_number
        self.destination = destination
        self.passengers = []
        pass

    def drive(self):
        return "Brum Brum"
    
    def how_many_passenger(self):
        return len(self.passengers)
    
    def add_person(self,passenger):
        self.passengers.append(passenger)

    def drop_passenger(self,passenger_to_drop):
        self.passengers.remove(passenger_to_drop)
    
    def empty(self):
        self.passengers.clear()

    def collect_all_from_stop(self,people_to_pick_up):
        for person in people_to_pick_up:
            self.add_person(person)
        people_to_pick_up.clear()
    
    def next_stop(self,num_of_passengers,len_of_queue):
        print(f"People waiting in the queue {len_of_queue}")
        print(f"Number of passenger at stop: {num_of_passengers}")

    def passengers_list(self,passengers):
        # passengers_list = ""
        passengers_list = []
        for item in passengers:
            # passengers_list += " "+item.name
            passengers_list.append(item.name)
        return passengers_list