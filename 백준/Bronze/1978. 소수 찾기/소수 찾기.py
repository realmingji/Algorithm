n = int(input())	# 4 입력

a=list(map(int, input().split()))	# 1 3 5 7 입력
count = 0

for i in a:
	cnt = 0
	if i > 1:
		for j in range(2, i):	# 2부터 i-1까지 for
			if i % j == 0:
				cnt = cnt + 1
		if cnt == 0:	# 소수
			count = count + 1
print(count)