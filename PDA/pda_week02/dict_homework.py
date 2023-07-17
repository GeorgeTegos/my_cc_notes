shop_prices = {
    "banana":2,
    "apple":3,
    "orange":4
}

def ask_for_item_price(dict_of_items,item_we_search_for):
    if item_we_search_for in dict_of_items:
        return print(f"The price of {item_we_search_for} is £{dict_of_items[item_we_search_for]}") 

ask_for_item_price(shop_prices,"apple")
