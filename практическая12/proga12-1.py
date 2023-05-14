
def sum(N,X=0):
    A, B = divmod(N, 10)
    X += B
    if A == 0:
        return print(X)
    sum(A, X)

sum(int(input()))

