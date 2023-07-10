#Start

# Turn Computer ON 

def answer(answer):
    answer = answer.lower()
    yes_list =["yes","y"]
    no_list = ["no","n"]

    if answer in yes_list:
        return True
    elif answer in no_list:
        return False
    else:
        print("wrong input, Try again")
        return exit()

#Did it boot ?
user_answer = input("Did Computer Boot ?\nYes\nNo\n")
computer_state = answer(user_answer)

#Computer boot
if computer_state == True:   
    #login with password
    password = input("Give your password")
    print("Finish!")
else:  
        #Computer is plugged 
    user_answer = input("Is computer plugged? Yes / No \n")
    is_it_plugged = answer(user_answer)  
    
    if is_it_plugged == True:
        #Computer is broken 
        print("The Computer is broken\nFinish")
    
    elif is_it_plugged == False:
        #Plug in the computer
        print("plug it in")
        user_answer = input("Did that fixed the problem? Yes / No\n")
        problem_fixed = answer(user_answer)

        #problem fixed
        if problem_fixed == True:
            #problem fixed, you can login
            password  = input("Login with your password ")
            print("Finish")
        else:
            #problem didn't fixed
            print("Computer is broken\nFinish")