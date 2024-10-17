s=input("Введите текст: ")
count=0
for word in s.split():
    if word [0]=="е":
        count+=1
print(f"Количество слов, начинающихся с буквы 'е': {count}")
