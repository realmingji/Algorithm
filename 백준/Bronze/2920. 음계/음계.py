n=list(map(int, input().split()))
#1 2 3 4 5 6 7 8
if n == sorted(n):
	print('ascending')
elif n == sorted(n, reverse=True):
	print('descending')
else:
	print('mixed')
