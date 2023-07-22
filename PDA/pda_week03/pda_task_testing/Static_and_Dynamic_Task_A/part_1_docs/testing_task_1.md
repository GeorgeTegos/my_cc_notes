### Testing task 1:

# Carry out static testing on the code below.
# Comment on any errors that you see below.

Note that we are only looking for errors here.

**Not** any issues with, i.e.: 
Thinking that methods should be renamed or should be class level, or using string interpolation etc. 

These aren't errors but rather standards that vary from developer to developer. 

Only comment on errors that would stop the tests running.

```python

class CardGame:

  def check_for_ace(self, card):
    if card.value = 1:  # needs double equal ( == ) for condition to check
      return True
    else  # missing colon ( : ) after else  
      return False
   

  dif highest_card(self, card1 card2): # Replace dif with def to create a function
  if card1.value > card2.value:        # Add Comma ( , ) at line 26 between (card1 card2) 
    return card                        # replace card with card1
  else:                                # From line 27 to line 30 we need indentation
    return card2                       
  


def cards_total(self, cards): #This function block need indentation to be part of the class CardGame
  total           #We have to assign 0 to our variable total (total = 0) to have a start point 
  for card in cards:
    total += card.value
    return "You have a total of" + total #total has to change to str(total) for concatenation
                                         #return should be outside of for loop (no indentation)  
```
