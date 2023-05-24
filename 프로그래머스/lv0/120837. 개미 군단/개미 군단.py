def solution(hp): # hp가 23이다. 
    sum = 0
    a = hp // 5  # 23을 5로 나누었을 때 몫은 4  
    b = (hp - (5*a)) // 3  # 23-20=3   4를 3으로 나눴을 때 1    
    c = (hp - ((5*a)+(3*b))) // 1
    sum = a + b + c
    return sum