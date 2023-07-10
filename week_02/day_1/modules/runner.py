# Modules = files    //      package = folders
# from folderName.filename import function_name  as    anotherName  to call it
# from folder import functions as name
import calculator               #imports all functions          calculator.(funtion name)
from calculator import add      #imports only what we need      just function name
import something.another_file as new_names

# print(calculator.add(10,20))
print(add(10,20))

print(calculator.multiply(10,20))

print(new_names.hello())