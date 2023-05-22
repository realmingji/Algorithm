a = 123456
b = a*2

prime = [False, False] + [True]*( b - 1 )
arr = []

for i in range(2, b+1):
  if prime[i]:
      arr.append(i)
      for j in range(2*i, b+1, i):
        prime[j] = False # 소수가 아니다 
        
while True:
    n = int(input())

    if n == 0:
        break
    else:
        print(sum(prime[n+1:n*2+1]))