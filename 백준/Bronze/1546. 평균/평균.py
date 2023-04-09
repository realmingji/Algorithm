n=int(input())
arr=list(map(int, input().split()))
sum=0

for i in range(len(arr)):
    sum=sum+arr[i]/max(arr)*100    # 50/70*100 = 71.43
avg=sum/len(arr)    # 평균 구하기
print(avg)