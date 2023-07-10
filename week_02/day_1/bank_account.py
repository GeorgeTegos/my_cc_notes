class BankAccount:
    
    def __init__(self,holder_name,balance,type):
        self.holder_name = holder_name        #   Class has:
        self.balance = balance                #       properties / attributes
        self.type = type                      #
        self.rates = {
            "personal": 50,
            "business": 100,
            "charity":0
        }

    def pay_in(self,amount):
        self.balance += amount

    def pay_monthly_fee(self):
        if self.type == "business":
            self.balance -= self.rates[self.type]
        elif self.type == "personal":
            self.balance -= self.rates[self.type]


