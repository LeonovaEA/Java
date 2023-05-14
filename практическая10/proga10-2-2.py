file = open(r'C:/Users/Professional/Downloads/vvod2.txt', 'r')
filee = open(r'C:/Users/Professional/Downloads/vivod2.txt', 'w+', encoding='UTF-8')
List=[1,2,3,4,5,6,7,8,9]
for i in range(len(List)):
    j=0
    while j<=len(List)-1:
        print(List[i]*List[j],end=' ')
        j+=1

file.close()
file = open(r'C:/Users/Professional/Downloads/vvod2.txt', 'r')

R = file.readlines()

import numpy as np
np.array1 = np.array(
    [[1, 2,3],
     [4,5,6],
     [7,8,9]])
total = np.sum(array1)
print('исходный массив' f'Sum of all the elements is {total}')

import numpy as np
np.array2 = np.array(
    [[3,2,1],
     [6,5,4],
     [9,8,7]])
total = np.sum(array2)
print('полученный массив:' f'Sum of all the elements is {total}')

filee.write('\n')
filee.write(str(array1))
filee.close()
