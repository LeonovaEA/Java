with open(r'C:/Users/Professional/Downloads/vvod1.txt', 'r') as f:
    line = f.readlines()
    l = [element.replace ("\n", "").split() for element in line]
B = len(l)
A = len(l[0])
a = l
for i in range(B):
    for k in range(A):
        a[i][k] = int(a[i][k])
    print()

def zadanie101(mas):
    K = B
    Y = int(input(f'Выберите номер строки из {K} '))
    Y -= 1
    b=range(n)
    for j in b:
        mas[Y][j]/=mas[Y][Y]
    return mas
with open('C:/Users/Professional/Downloads/vivod1.txt', 'w') as f2:
    f2.write(str(pr(a)))
    f2.write('\n')
with open(r'C:/Users/Professional/Downloads/vvod1.txt', 'r')as f:
    line = f.readlines()
    l = [element.replace ("\n", "").split() for element in line]
B = len(l)
A = len(l[0])
a = l
for i in range(B):
    for k in range(m):
        a[i][Y] = int(a[i][Y])
    print()
def zadanie102(matr):
    res=[]
    for j in range(A):
        tmp=[]
        for i in range(B):
            tmp=tmp+[matr[i][j]]
        res=res+[tmp]
    return res

with open('C:/Users/Professional/Downloads/vivod1.txt', 'a+') as f2:
    f2.write('\n')
    f2.write(str(transponse(a)))
    f2.write('\n')
if open('C:/Users/Professional/Downloads/vivod1.txt', 'a+'): 
    print(" Матрица явяется магическим квадратом")
    filee.write('\n')
    filee.write(str("Матрица явяется магическим квадратом"))
    filee.close()
            
else:
    print("Матрица не явяется магическим квадратом")
    filee.write('\n')
    filee.write(str("Матрица не явяется магическим квадратом"))
    filee.close()

