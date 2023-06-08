arr=[]
for i in range(5):
	n=int(input())
	arr.append(n)
avg = sum(arr)//5

mid=sorted(arr)[2]
print(avg)
print(mid)