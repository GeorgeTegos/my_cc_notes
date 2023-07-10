#Ask a user "Give me an animal"
#store user input into variable of animal
#If animal is "penguin"
#   then print "This is my favourite animal"
#end

animal = input("Give me an Animal ")
animal = animal.lower()
if animal == "penguin":
    print("This is my favourite animal")
elif animal == "dog":
    print("Dogs are pretty cool")
else:
    print("This is not my favourite animal ")