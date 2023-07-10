from bank_account import BankAccount

account = BankAccount("Rob",500, "business") # Instatiating a new objet of type BankAccount

print(account.holder_name)

account_2 = BankAccount("cass",1000,"personal")
print(account_2.balance)

account.pay_in(50)
print(account.balance)

account_2.pay_monthly_fee()
account.pay_monthly_fee()
print(account_2.balance)
print(account.balance)