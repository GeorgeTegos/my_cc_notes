"""
Write each function and test it works by printing a call to the function with any required inputs (argument values) and checking the output (return value) in your terminal by running:

python3 functions_lab.py

Each docstring (""" """) includes instructions for the function name, any parameters it takes, and what it returns

If there is a `pass` in the body of the function, replace it with your own code

Some functions and checks have been started for you!
"""

# === COMPLETED EXAMPLE ==============

"""
return_10 function
takes no parameters
returns the number 10
"""
def return_10():
    return 10

print("------------------------------")
print("By calling return_10, I'm expecting 10, and the result is")
print(return_10())


# === START HERE =====================

"""
add function 
takes the parameters num_1 and num_2
returns the result of adding num_1 and num_2
"""
def add(num_1, num_2):
    return num_1+num_2

print("------------------------------")
print("By adding 4 and 5, I'm expecting it to be 9, and the result is")
print(add(4, 5))


"""
subtract function
takes the parameters num_1 and num_2
returns the result of subtracting num_2 from num_1
"""
def subtract(num_1, num_2):
    return num_2-num_1

print("------------------------------")
print("By subtracting 3 from 10, I'm expecting it to be 7, and the result is")
# check by calling the function with the arguments 10 and 3:
print(subtract(3,10))


"""
multiply function
takes the parameters num_1 and num_2
returns the result of multiplying num_1 and num_2
"""
# create the multiply function:
def multiply(num_1,num_2):
    return num_1*num_2

print("------------------------------")
# replace _ with your own values and expectation:
print("By multiplying 3 and 5, I'm expecting it to be 15, and the result is")
# check by invoking the function with your own values:
print(multiply(3,5))


"""
divide function
takes the parameters num_1 and num_2
returns the resulting of dividing num_1 by num_2
"""
# define the divide function:
def divide(num_1,num_2):
    return num_1/num_2

print("------------------------------")
# replace _ with your own values and expectation:
print("By dividing 10 by 2, I'm expecting it to be 5, and the result is")
# check by calling the function with your own arguments:
print(divide(10,2))


# === NICE! CONTINUE =================

"""
length_of_string function
takes a parameter str
returns the length of str (number of characters, including spaces and punctuation)
"""
def length_of_string(string):
    return len(string)

print("------------------------------")
print("By calculating the length of the string 'How now, brown cow?', I'm expecting it to be 19, and the result is")
print(length_of_string('How now, brown cow?'))


"""
join_string function
takes the parameters str_1 and str_2
returns str_1 and str_2 joined as one string
"""
def join_string(str_1,str_2):
    return str_1+ " "+str_2

print("------------------------------")
print("By joining the strings 'go do' and 'good', I'm expecting it to be 'go do good', and the result is")
print(join_string("go do","good"))


"""
add_string_as_number function
takes the parameters str_1 and str_2
returns the result of adding str_1 and str_2 as ints
"""
def add_string_as_number(str_1,str_2):
    result = int(str_1) + int(str_2)
    return result

print("------------------------------")
print("By adding the strings '58' and '42' as numbers, I'm expecting it to be 100, and the result is")
print(add_string_as_number("58","42"))


"""
number_to_full_name function
takes a parameter month (int)
returns the full name of the month
"""
def number_to_full_name(month):
    months = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December']
    month = int(month) - 1
    return months[month]


# Sometimes, it's relevant to check the function with different values:
print("------------------------------")
print("By converting 1 to the full month name, I'm expecting it to be 'January', and the result is")
print(number_to_full_name(1))

print("------------------------------")
print("By converting 3 to the full month name, I'm expecting it to be 'March', and the result is")
print(number_to_full_name(3))

print("------------------------------")
print("By converting 9 to the full month name, I'm expecting it to be 'September', and the result is")
print(number_to_full_name(9))


"""
number_to_short_month_name function
takes a parameter month (int)
returns the short name of the month
"""
# HINT: Could you use `number_to_full_name` by calling it from within this function?
def number_to_short_month_name(month):
    result = number_to_full_name(month)
    return result[0:3]
    
    

print("------------------------------")
print("By converting 2 to the short month name, I'm expecting it to be 'Feb', and the result is")
print(number_to_short_month_name(2))

print("------------------------------")
print("By converting 4 to the short month name, I'm expecting it to be 'Apr', and the result is")
print(number_to_short_month_name(4))

print("------------------------------")
print("By converting 10 to the short month name, I'm expecting it to be 'Oct', and the result is")
print(number_to_short_month_name(10))


# === EXTENSIONS =====================

"""
volume_of_cube function
takes a parameter length_of_side
returns the volume of a cube with that length_of_side
"""
def volume_of_cube(length_of_side):
    return (length_of_side)*(length_of_side)*(length_of_side)


print("------------------------------")
print("By calculating the volume of a cube with the side of 3, I'm expecting it to be 27, and the result is")
print(volume_of_cube(3))


"""
string_reverse function
takes a parameter str
returns the result of reversing the str
"""
def string_reverse(str_1):
    return str_1[::-1]

print("------------------------------")
print("By reversing the string 'Scotland', I'm expecting it to be 'dnaltocS', and the result is")
print(string_reverse('Scotland'))


# Write a function that converts fahrenheit to celcius (rounded to 2 decimal places):
"""

"""
def fahrenheit_convert(numb):
    Fahrenheit_1 = (int(numb) -32) / 1.8 
    return round(Fahrenheit_1,2)

print("------------------------------")
print("By converting 0 fahrenheit to celcius, I'm expecting it to be -17.78, and the result is")
print(fahrenheit_convert(0))
