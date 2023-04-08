n=int(input()) # 다섯개 입력(?)
arr = []		

for i in range(n):    # i부터 n까지 반복해줘
    arr.append(int(input())) # [5,4,3,2,1]
for i in sorted(arr): # [1,2,3,4,5]
     print(i)