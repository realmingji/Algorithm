def solution(dot):
    # 1사분면 (x, y), 2사분면 (-x, y), 3사분면 (-x, -y), 4사분면 (-x, -y)
    answer = 0
    x = dot[0]
    y = dot[1]
    
    if (x > answer and y > answer):
        return 1
    elif (x < answer and y > answer):
        return 2
    elif (x < answer and y < answer):
        return 3
    else:
        return 4