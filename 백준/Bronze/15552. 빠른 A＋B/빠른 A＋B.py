import sys

n=int(input())
for i in range(n):
    a,b=map(int, sys.stdin.readline().split())
    c=a+b
    print(c)