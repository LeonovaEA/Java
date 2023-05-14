def Zadanie92(n):
    A = []
    for i in range(n):
        b = []
        for j in range(n):
            print('Введите [',i,',',j,'] элемент')
            b.append(int(input()))
        A.append(b)
    print('Исходная матрица:')
    for i in range(n):
        for j in range(n):
            print(A[i][j], end=' ')
        print()
    for i in range(n):
        A[i][0], A[i][n-1] = A[i][n-1], A[i][0]
    print("Полученная матрица")
    for i in range(n):
        for j in range(n):
            print(A[i][j], end=' ')
        print()
Zadanie92(3)
