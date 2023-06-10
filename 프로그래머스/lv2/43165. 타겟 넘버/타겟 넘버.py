def solution(numbers, target):
    arr= [0]
    for i in numbers:
        n = []
        for j in arr : 
            n.append(j+i)
            n.append(j-i)
        arr = n
    c=n.count(target)
    return(c)