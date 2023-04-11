import sys
n,m=map(int,sys.stdin.readline().split())

for i in range(m):
    sys.stdin.readline()# 입력만 받기  2
    book=list(map(int, sys.stdin.readline().split()))

    if book != sorted(book, reverse=True):
        print("No")
        exit(0)
print("Yes")