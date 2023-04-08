cost = [500, 100, 50, 10, 5, 1]
price = int(input())    # 380
buy = 1000-price        # 620
sum = 0

for i in cost:
    sum = sum + (buy//i)
    buy %= i
print(sum)
    
