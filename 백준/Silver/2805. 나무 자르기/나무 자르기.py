n,m=map(int,input().split())    # m은 가져갈 수 
num=list(map(int,input().split())) #[20,25,10,17]
answer=0
start=0
end=max(num)

while start<=end:
    mid=(start+end)//2 # 높이
    total=0
    
    for i in num:    #for 돌려
        if i > mid:    # i가 num(높이)보다 클때 for 돌려
            total=total+(i-mid)
        if total>=m:
            break;
    if total >= m:
        answer=mid
        start=mid+1
    else:
        end=mid-1
print(answer)