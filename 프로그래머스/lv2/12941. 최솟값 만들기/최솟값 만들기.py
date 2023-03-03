def solution(A,B):
    # sort 정렬
    A.sort()
    B.sort(reverse = True)
    sum=0
    for i in range(len(A)): # 배열 길이만큼 반복
        sum += (A[i] * B[i])  # 두 수를 곱하고 곱한 값을 누적해서 더하기
        
    return sum