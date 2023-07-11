class BusStop:

    def __init__(self,name):
        self.queue = []
        
    def add_person_to_queue(self,person):
        self.queue.append(person)

    def remove_all_people_from_queue(self):
        self.queue.clear()
        