import csv

with open("phonebook.csv", "a") as file:

    name = input("Name: ")
    phone_number = input("Phone Number: ")

    writer = csv.writer(file)
    writer.writerow([name, phone_number])
