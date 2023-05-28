s = input().upper()		# Mississipi 입력 upper은 대문자
word = list(set(s))		# set을 이용해 중복 제거 {'P', 'I', 'S', 'M'} 출력
arr = []			    # word를 배열로 담아주기

for i in word:		    # i번 반복하기
	count = s.count	 # 총 4번 반복 MISSISSIPI MISSISSIPI MISSISSIPI MISSISSIPI
	arr.append(count(i))

if arr.count(max(arr)) > 1:
	print("?")
else:
	print(word[(arr.index(max(arr)))])