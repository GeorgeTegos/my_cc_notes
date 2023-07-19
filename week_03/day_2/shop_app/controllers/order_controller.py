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

@orders_blueprint.route("/orders/<index_of_order>")
def order_by_index(index_of_order):
    return render_template("order.html",order=orders_list[int(index_of_order)],title="Orders")