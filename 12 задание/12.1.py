def f(x, n):
    def fac(n):
        if n==0:
            return 1
        return n * fac(n - 1)
    return x**n / fac(n)
x = int(input('Введите число x:'))
n = int(input('Введите число n:'))
print(f(x,n))
