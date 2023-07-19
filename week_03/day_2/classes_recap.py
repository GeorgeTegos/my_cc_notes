class Account():
    
    def __init__(self,username,dob):
        self.username = username
        self.dob = dob
        self.followers = []
        self.likes = []
        self.post = []

account_one = Account("George","16-aug-93")

print(account_one.username)