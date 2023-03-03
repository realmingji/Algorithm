def solution(nums):
    # 1. 최대한 많은 폰켓몬 구하기 (최댓값 max 사용)
    # 2. 폰켓몬 종류는 중복되지 않도록 set 사용
    # 만약 최댓값이 중복되지 않는 값 갯수보다 작으면 최댓값 구하기
    # 최댓값이 중복되지 않는 값 갯수보다 크면 중복값 구하기
    # 최댓값과 중복값 같으면 최댓값 구하기

    max = len(nums)/2   # 최댓값 구하기
    arr = len(set(nums))  # set은 중복 제거
    
    if max >= arr:    # 최댓값이 중복되지 않는 값보다 크면 중복x 값 구하기
        return arr
    else:
        return max
