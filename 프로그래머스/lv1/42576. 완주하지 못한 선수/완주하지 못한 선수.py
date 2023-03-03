def solution(participant, completion):
    # 1. 정렬 (sort 사용)
    # 2. participant와 completion 비교
    
    # 해시 풀어보기
    participant.sort()
    completion.sort()
    
    for i in range(len(completion)):
        if (participant[i] != completion[i]): # 같지않으면
            return participant[i]
    else:
        return participant[-1]