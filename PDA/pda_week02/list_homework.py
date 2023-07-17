my_list = list(range(1,11))

def int_list_to_string(list_of_int_numbers):
    string_to_return = ""
    for number in list_of_int_numbers:
        string_to_return += " "+str(number)
    return string_to_return

print(int_list_to_string(my_list))
