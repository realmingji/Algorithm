while True:
	a=[]
	num = 0
	n=int(input())
	
	if n == -1:
		break
	
	for i in range(1, n):
		if n % i == 0:
			a.append(i)
	if sum(a) == n:
		num = ' + '.join(map(str, a))
		print(n, '=', num)
	else:
		print(f'{n} is NOT perfect.')