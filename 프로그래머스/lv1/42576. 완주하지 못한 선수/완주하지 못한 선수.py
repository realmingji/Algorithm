def solution(participant, completion):
    # 1. 정렬 (sort 사용)
    # 2. participant와 completion 비교
    
    # 해시로 반드시 풀어보기
    participant.sort()
    completion.sort()
    
    for i in range(len(completion)):
        if (participant[i] != completion[i]): # 같지 않으면
            return participant[i]
    return participant[-1]
