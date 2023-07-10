my_number = 13

value = int(input("What number am i thinking off? "))

# value = 22

while (value != my_number):
    print("Nope!")
    if value > my_number:
        print("Guess lower")
    else:
        print("Guess Higher")

    value = int(input("Try again.. "))




print("Congrats!")
