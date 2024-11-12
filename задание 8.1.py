import math
print("1-круг, 2-треугольник, 3-прямоугольник")
figure = input("Выберите фигуру: ")
if figure == '1':
    r=float(input("Радиус круга R="))
    print("Площадь:%.2f" % (3.14 *r**2))
elif figure=='2':
    print("Длины сторон треугольника:")
    a=float(input("a="))
    b=float(input("b="))
    c=float(input("c="))
    p=(a + b + c)/2
    s=math.sqrt(p * (p - a) * (p - b) * (p - c))
    print("Площадь: %.2f" % s)
elif figure == '3':
    print("Длины сторон прямоугольника:")
    a=float(input("a="))
    b=float(input("b="))
    print("Площадь: %.2f" % (a * b))
else:
    print("Ошибка")
