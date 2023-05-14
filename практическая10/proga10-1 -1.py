file = open(r'C:/Users/Professional/Downloads/vvod2.txt', 'r')
filee = open(r'C:/Users/Professional/Downloads/vivod2.txt', 'w+', encoding='UTF-8')

A1 = file.readline(1)
A2 = file.readline(1)
A3 = file.readline(1)
A4 = file.readline(1)
A5 = file.readline(1)
A6 = file.readline(1)
A7 = file.readline(1)
A8 = file.readline(1)
A9 = file.readline(1)

n1 = [int(x) for x in A1]
n2 = [int(x) for x in A2]
n3 = [int(x) for x in A3]
n4 = [int(x) for x in A4]
n5 = [int(x) for x in A5]
n6 = [int(x) for x in A6]
n7 = [int(x) for x in A7]
n8 = [int(x) for x in A8]
n9 = [int(x) for x in A9]

file.close()
file = open(r'C:/Users/Professional/Downloads/vvod2.txt', 'r')

R = file.readlines()

e1 = n1+n2+n3
e2 = n4+n5+n6
e3 = n7+n8+n9

print('Исходный массив:')
print(e1)
print(e2)
print(e3)
print()

e12 = n3+n2+n1
e22 = n6+n5+n4
e32 = n9+n8+n7

print('Полученный массив:')
print(e12)
print(e22)
print(e32)

filee.write('\n')
filee.write(str(e12))
filee.write(str(e22))
filee.write(str(e32))
filee.close()
