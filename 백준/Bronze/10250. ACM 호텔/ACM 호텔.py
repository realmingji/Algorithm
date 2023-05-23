t = int(input())

for i in range(t):
    h, w, n = map(int, input().split())
    a = n % h    # a는 층, b는 호실
    b = n//h + 1
    
    if a == 0:  # 나머지가 0이다.
        a = h
        b = n//h
    print(a*100 + b*1)