def solution(sides):
    sides.sort()
    max = sides[2]
    a = sides[0]
    b = sides[1]
    c = a + b
    
    if ( max < c ):
        return 1
    else:
        return 2