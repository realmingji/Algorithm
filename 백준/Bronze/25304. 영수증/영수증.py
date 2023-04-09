x=int(input())    # 총 금액
n=int(input())    # 물건 종류 수
sum=0

for i in range(n):
    a,b=map(int,input().split())    # a와 b는 공백
    sum=(a*b)+sum                         # 20000 × 5 + 30000 × 2 + 10000 × 6 + 5000 × 8 = 260000
    
if x==sum:
    print("Yes")
else:
    print("No")