s = str(input())	# b a e k j o o n

c = list('abcdefghijklmnopqrstuvwxyz')	# 문자열을 list에 넣는 방법

for i in range(len(c)):
	if c[i] in s:
		print(s.index(c[i]))
	else:
		print(-1)