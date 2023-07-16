# In variable my_list we assign a list with list class
# from number 1 to 10
my_list = list(range(1,11))

#This function uses our list to safe the integers
# of this list one by one as a string to a new variable
# named string.
def int_list_to_string(list_of_int_numbers):
    string_to_return = ""
    for number in list_of_int_numbers:
        string_to_return += " "+str(number)
    return string_to_return


#The output of this function is a string 
#from number 1 to number 10.
print(int_list_to_string(my_list))
