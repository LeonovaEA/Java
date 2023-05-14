def maximum():
    P = int(input('Введите число E: '))
    if P == 0:
        return 0
    else:
        return max(P, maximum())

print(" Максимальное число:")
print(maximum())
