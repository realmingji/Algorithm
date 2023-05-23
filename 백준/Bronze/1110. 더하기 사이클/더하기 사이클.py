n=num=int(input())
count=0

while True:
    a=num//10
    b=num%10
    sum=a+b
    count+=1
    
    num=int(str(num%10)+str(sum%10))
    
    if(n==num):
        break
print(count)