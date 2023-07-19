from flask import Flask
from controllers.tasks_controler import tasks_blueprint

app = Flask(__name__)
app.register_blueprint(tasks_blueprint)

@app.route('/')
def index():
    pass
