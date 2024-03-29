n = int(input())

def fib(n):
    if (n == 1 or n == 2):
        return 1 
    else:
        return (fib(n - 1) + fib(n - 2))
    
def fibonacci(n):
    dp=[0]*(n+1)
    dp[1],dp[2]=1,1
    count = 0
    
    for i in range(3,n+1):
        count = count + 1
        dp[i]=dp[i-1]+dp[i-2]
    return count

print(fib(n),fibonacci(n))