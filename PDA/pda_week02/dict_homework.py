#We create a dictionary of items and prices using
# dictionaries Keys : Values for each item.
shop_prices = {
    "banana":2,
    "apple":3,
    "orange":4
}

#This function takes as arguments our dictionary and the item we searching for .
#It searches our item if it exists as a Key in our dictionary and returns
#A print with both Key as item name and Value as item price
def ask_for_item_price(dict_of_items,item_we_search_for):
    if item_we_search_for in dict_of_items:
        return print(f"The price of {item_we_search_for} is £{dict_of_items[item_we_search_for]}") 


# After this run we expect the following print statement
# "The price of apple is £3"
ask_for_item_price(shop_prices,"apple")
