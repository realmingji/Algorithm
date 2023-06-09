n = int(input())
arr = []

for i in range(n):
    arr.append(input())
lst = set(arr)	## set으로 변환해서 중복값을 제거
arr = list(lst)	## 다시 list로 변환
arr.sort()
arr.sort(key = len)

for i in arr:
    print(i)