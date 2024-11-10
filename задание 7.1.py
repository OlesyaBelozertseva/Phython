n=int(input("Введите длину массива:"))
a=[]
for i in range(n):
    print("Введите",i,"элемент:")
    a.append(int(input()))
print("Максимальный элемент:"+str(max(a)))
print("В обратном порядке:"+str(list(reversed(a))))
