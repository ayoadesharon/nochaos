sum = 0
count = 0

number = int(input("Enter a number (-1 to stop): "))

while number != -1:

    sum = sum + number
    count = count + 1

    average = sum / count

    print("Average:", average)

    number = int(input("Enter another number (-1 to stop): "))
