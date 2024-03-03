def solution(num_list):
    answer = []
    
    # num_list 길이만큼 for문 돌리자
    for i in range(len(num_list)):
        answer.append(num_list[i])  # [2, 1, 6]
        # print(i)
        
    if(answer[-1] > answer[-2]):    # 6이 1보다 크다 (마지막 원소가 클 때)
        answer.append(answer[-1] - answer[-2])        # 뺀 값
    else:   # 마지막 원소가 작을 때
        answer.append(answer[-1] * 2)   # 마지막 원소 두 배 값
    return answer