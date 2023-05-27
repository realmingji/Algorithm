arr=[int(input())for i in range(9)]
total=sum(arr)

for i in range(9):
    for j in range(i+1,9):
        if total-(arr[i]+arr[j])==100:
            a=arr[i]
            b=arr[j]
            break
arr.remove(a)
arr.remove(b)
arr.sort()
for i in arr:
    print(i)