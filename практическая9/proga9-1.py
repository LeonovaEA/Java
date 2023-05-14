def Zadanie91(n):
    s = 0
    a = []
    for i in range(n):
        b = []
        for j in range(n):
            print('Введите [',i,',',j,'] элемент')
            b.append(int(input()))
        a.append(b)
    print('Исходный массив:')
    for i in range(n):
        for j in range(n):
            print(a[i][j], end=' ')
        print()
    for i in range(n):
        s += a[0][i]
    ss = s
    for i in range(n):
        w = i-1
        if ss != s:
            break
        ss = 0
        for j in range(n):
            t = j-1
            ss += a[w][t]
    sss = s
    for i in range(n-1):
        w = i-1
        if sss != s:
            break
        sss = 0
        for j in range(n):
            t = j-1
            sss += a[t][w]
    if (sss==ss) and (ss==s) and (s==sss):
        print("Матрица является магическим квадратом")
    else:
        print("Матрица не является магическим квадратом")
Zadanie91(3)
