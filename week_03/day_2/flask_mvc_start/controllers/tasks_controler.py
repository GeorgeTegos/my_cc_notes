from flask import Blueprint, render_template
from models.task_list import tasks

tasks_blueprint = Blueprint("tasks",__name__)

@tasks_blueprint.route("/tasks")
def index():
    return render_template("index.html",title="My Task List",
                           task_list =tasks)



