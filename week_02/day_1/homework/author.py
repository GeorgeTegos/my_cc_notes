
class Author:

    def __init__(self, name,age,nationality):
        self.name = name
        self.age = age
        self.nationality = nationality
    
    def author_informations(self):
        info = {
            "name": self.name,
            "age": self.age,
            "nationality": self.nationality          
            }
        return info
    
    def write_a_page(self):
        pass

    def write_a_chapter(self):
        pass

    def write_book_description(self):
        pass

    def write_book_table_of_content(self):
        pass
