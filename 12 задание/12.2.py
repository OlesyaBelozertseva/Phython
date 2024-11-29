def k():
    num = int(input('введите число:'))
    if num == 0:
        return float('-inf')
    return max(num, k())
print(k())
