from flask import Flask
from flask_sqlalchemy import SQLAlchemy
from flask_migrate import Migrate

app = Flask(__name__)

#for new project, change tasks_app to database name
app.config["SQLALCHEMY_DATABASE_URI"] = "postgresql://user@localhost:5432/tasks_app"
db = SQLAlchemy(app)
migrate = Migrate(app, db) # flask db init  = Create migration folder

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

@app.route('/')
def hello_world():
    #delete all the rows
    Task.query.delete() # immediately delete
    User.query.delete()

    #create object in db
    sky =User(first_name='Sky',last_name='Su')  # INSERT INTO User (...) VALUES (...)
    db.session.add(sky) # stage change   
    print("Print sky before commit")
    print(sky)
    
    jason =User(first_name='Jason',last_name='Sweeney')# INSERT INTO User (...) VALUES (...)
    db.session.add(jason) # stage change

    db.session.commit() # commit all staged changes
    print('Sky after commit \n',sky)

    #get all the users
    users = User.query.all() #SELECT all FROM User <<
    print("get all the users\n",users)

    #get a user by id
    found_user = User.query.get(jason.id)   #SELECT * FROM User WHERE id = jason.id
    print(f'Get user by id = {jason.id}')
    print(found_user)

    #create tasks
    task1 = Task(description = 'Survive this lesson',duration =120, user = sky)
    db.session.add(task1)
    task2 = Task (description = 'Survive next lesson',duration =90 ,completed = True,user= jason)
    db.session.add(task2)

    db.session.commit()


    all_tasks = Task.query.all() #SELECT all FROM Task
    print('List of tasks')
    print(all_tasks)

    print('jason tasks')
    print(jason.tasks) #tasks = db.relationship('Task', backref='user') #Task.user 

    print('tasks [0]s ')
    print(all_tasks[0].user)#tasks = db.relationship('Task', backref='user') #Task.user 

    #mark task 1 as completed
    task1.completed = True
    db.session.commit()

    db.session.delete(task2)
    db.session.commit()

    return "Hello, World"