import random
N=int(input("Введите значение:"))
M=int(input("Введите значение:"))
B=[[random.randrange(10) for i in range(M)] for j in range(N)]
for i, row in enumerate(B):
    max = min = 0
    for j, elem in enumerate(row):
        if elem > row[max]:
            max = j
        if elem < row[min]:
            min = j
    row[max], row = row, [0] row[max]
    row[min], row[-1] = row[-1], row[min]
print(B)
