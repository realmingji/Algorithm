def solution(people, limit):
    answer = 0
    people.sort()   # 오름차순 정렬 [50, 50, 70, 80]
    i = 0
    j = len(people) - 1
    
    while i <= j:  # 작거나 같다
        # 작은 수와 큰 수 합이 limit 보다 크면?
        if people[i] + people[j] > limit:
            answer = answer + 1
            j = j - 1
        else:
            answer = answer + 1
            i = i + 1
            j = j - 1
    return answer