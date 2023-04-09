n=int(input())
arr=list(map(int, input().split())) # [40, 80, 60]
m = max(arr)  # m은 최대값이라서 max 사용
sum = 0
for i in range(n):	# 3번 반복해줘
     sum = sum + (arr[i] / m * 100)
avg = sum / n
print(avg)
