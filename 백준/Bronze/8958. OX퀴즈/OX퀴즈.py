n=int(input())

for i in range(n):
    s = list(input())
    cnt = 0
    sum = 0
    
    for j in s:
        if j == 'O':
            cnt = cnt + 1
        elif j == 'X':
            cnt = 0
        sum = sum + cnt
    print(sum)