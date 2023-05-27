m = int(input())
n = int(input())
arr = []

for i in range(m, n+1): # m부터 n까지 for 
    count = 0 
    if i > 1: 
        for j in range(2, i):
            if i % j == 0:
                count += 1 # 카운트 증가
                break 
        if count == 0: 
            arr.append(i)


if len(arr) > 0:
    print(sum(arr)) 
    print(min(arr))
else:
    print(-1) # 소수가 없으면 -1 출력

