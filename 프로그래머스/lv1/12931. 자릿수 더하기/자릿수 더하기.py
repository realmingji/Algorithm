def solution(n):
    n = list(map(int, str(n)))
    sum=0
    for i in range (len(n)):
        sum+=n[i]
                   
    return sum