from models.order_list import orders_list
from flask import Blueprint,render_template

orders_blueprint = Blueprint("orders",__name__)


@orders_blueprint.route("/")
def greet():
    return render_template("index.html")

@orders_blueprint.route("/orders")
def index():
    return render_template("orders.html",orders=orders_list,title="Orders")

@orders_blueprint.route("/orders/date")
def orders_by_date():
    return render_template("date.html",orders=orders_list,title="Date")

@orders_blueprint.route("/orders/price")
def orders_by_price():
    return render_template("price.html",orders=orders_list,title = "Price")

@orders_blueprint.route("/orders/<id>")
def order_by_index(id):
    found_order= None
    for order in orders_list:
        if order.id == int(id):
            found_order = order
    if found_order == None:
        return ('Page not found')
    return render_template("order.html",order=found_order,title="Orders")