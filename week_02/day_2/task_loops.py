ages = [5, 15, 64, 27, 84, 26]
odd_numbers = [age for age in ages if age % 2 != 0 ]

print(odd_numbers)


years = range(2000, 2100)
leap_years = [year for year in years if year%4==0 and year%100 != 0]
print(leap_years)


chicken_names = ["Hen Solo", "Cluck Norris", "Hennifer Lopez", "ChewPekka", "Feather Locklear"]
new_list = [name for name in chicken_names if len(name)>10 and name[0]=="H"]
print(new_list)


words = ["The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog"]
another_list = [letter[0].lower() for letter in words ]
print(another_list)
