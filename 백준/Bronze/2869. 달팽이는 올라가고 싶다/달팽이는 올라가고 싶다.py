a,b,v=map(int, input().split())
day = int((v-b)/(a-b))

if(v-b)%(a-b)!=0:
    print(day+1)
else:
    print(day)