numbers = list(range(1,99))

"""
Exercise 1:
Write a program that takes a list of numbers and prints the sum of all the numbers in the list.
"""
def sum_of_numbers(list_of_num):
    print(sum(list_of_num))

sum_of_numbers(numbers)

"""
Exercise 2:
Write a program that takes a list of strings and prints the length of each string in the list.
"""
a_string = "This is just a normal string"
def length_of_string(string):
    print(len(string))

length_of_string(a_string)

"""
Exercise 3:
Write a program that prompts the user to enter 5 names and stores them in a list. Then, print the list in alphabetical order.
HINT: Use a range(5) with a for loop to loop 5 times
HINT: To get user input and store it in a variable: name = input("Enter a name: ") 
"""
def user_input():
    list_of_names =[]
    for name in range(0,5):
        name = input("Give a name: ")
        list_of_names.append(name)
    print(list_of_names)

# print(user_input())

"""
Exercise 4:
Write a program that takes a list of numbers and prints the largest and smallest numbers in the list.
HINT: min and max are built-in Python functions
"""

def min_max(list_of_numbers):
    return (f"The largest number is {max(list_of_numbers)} and the smallest is {min(list_of_numbers)}")

print(min_max(numbers))

"""
Exercise 5:
Write a program that takes a list of integers and prints the average of the numbers in the list.
"""
def average(list_of_numbers):
    print(f"The average of the list is: {sum(list_of_numbers) / len(list_of_numbers)}")

average(numbers)


"""
Exercise 6:
Write a program that takes a list of integers and removes all the duplicates, printing the updated list.
HINT: Python's in-built set function will remove duplicates from a list
"""
dupli = [ 1,2,2,3,3,4,5,6,6]
def duplicates(list_of_numbers):
    return set(list_of_numbers)

print(duplicates(dupli))


"""
Exercise 7:
Write a program that prompts the user to enter a sentence and prints the sentence in reverse order.
"""
def reverse():
    sentence = input("Enter a sentence: ")
    return sentence[::-1]
print(reverse())

"""
BONUS CHALLENGE!
Write a program that prompts the user to enter a sentence and counts the frequency of each word in the sentence using a dictionary.
HINT: Python's split() method will turn a set into a List
        """
def count():   
    sentence = input("Enter a sentence: ")
    word_frequency = {}
    words = sentence.split()

    for word in words:
        if word in word_frequency:
            word_frequency[word] += 1
        else:
            word_frequency[word] = 1
    print("Word frequency:", word_frequency)

count()