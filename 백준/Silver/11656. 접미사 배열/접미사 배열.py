n=input()
arr=[]
for i in range(len(n)):
    arr.append(n[i:])
arr.sort()
print('\n'.join(arr))