import math
x=int(input("введите переменную x:"))
y=int(input("введите переменную y:"))
z=int(input("введите переменную z:"))
s=((math.pow((math.fabs((math.cos(x))-(math.cos(y)))),(1+2*math.sin(y))))*(1+z+(math.pow(z,2))/2+(math.pow(z,3))/3+(math.pow(z,4))/4))
print("s= {0:.5f}".format(s))
