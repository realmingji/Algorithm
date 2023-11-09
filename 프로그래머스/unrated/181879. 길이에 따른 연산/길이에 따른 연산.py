def solution(num_list):
    answer = 0
    
    for i in range(len(num_list)):
        if len(num_list) >= 11:
            answer += num_list[i]
        else:
            if answer == 0:
                answer = 1
            answer *= num_list[i]
    return answer
