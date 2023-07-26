from app import db

class User(db.Model):
    __tablename__ = "users"

    id = db.Column(db.Integer, primary_key=True) #primary_key will auto increment id
    first_name = db.Column(db.String(64))
    last_name = db.Column(db.String(64))
    tasks = db.relationship('Task', backref='user') #Task.user

    def __repr__(self):  #Return string instead of memory address
        return f'<User {self.id}: {self.first_name} {self.last_name} >'

class Task(db.Model):
    __tablename__ = "tasks"
                                                                #CREATE TABLE tasks {
    id =db.Column(db.Integer, primary_key=True)                 # id INT SERIAL PRIMARY KEY     
    description = db.Column(db.Text())                          # description TEXT
    duration = db.Column(db.Integer)                            # duration INT
    completed = db.Column(db.Boolean, default = False)          # completed BOOLEAN DEFAULT false
    user_id = db.Column(db.Integer, db.ForeignKey('users.id'))  # user_id INT FOREIGN KEY -
                                                                # REFERENCES users(id)
    #'table_name.primary_key_column

    def __repr__(self):
        return f'<Task {self.id}: {self.description}>'
