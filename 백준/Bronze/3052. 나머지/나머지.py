# 먼저 배열해주자!
arr = []
for i in range(10):
    A = int(input())
    B = A % 42
    arr.append(B)
# [39, 40, 41, 0, 1, 2, 40, 41, 0, 1] 중복있어서 set 사용해줘야 함!
print(len(set(arr)))
