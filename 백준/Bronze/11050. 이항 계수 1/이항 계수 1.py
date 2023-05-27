a, b = map(int, input().split())    # N = a = 5, K = b = 2

def factorial(n):    
    if n > 1:
        return n * factorial(n - 1)
    else:
        return 1
    
print(factorial(a) // (factorial(b)*factorial(a-b)))