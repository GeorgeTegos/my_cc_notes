numbers = range(1,11)
even_numbers = []
for number in numbers:
    if number %2 == 0:
        even_numbers.append(number)

# print(even_numbers)

# [ expression for item in list if condition ]

list_of_numbers= range(1,11)
#                   Loop            list               Condition
new_list = [number for number in list_of_numbers if number%2==0]                    # without Else
print(new_list)

#take a lsit of numbers and output a list with "Even" if number i even
#Else "Odd" if number is odd

odd_even = ["Even" if number % 2 ==0 else "Odd" for number in list_of_numbers]      # with IF and ELSE

print(odd_even)

adjectives = ["Jolly","Damp","CHeeky"]
animals = ["Koala","Snail","Axolotl"]

usernames =[]

for adjective in adjectives:
    for animal in animals:
        usernames.append(f"{adjective}{animal}")

usernames = [f"{adjective}{animal}" for adjective in adjective for animal in animals ]
print(usernames)

print(usernames)