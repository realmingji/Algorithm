import sys

m=int(sys.stdin.readline())
i = 2
while m!=1:
    if m % i == 0:
        m = m // i
        print(i)
    else:
        i = i + 1