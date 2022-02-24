# Level - 800
# Link - https://codeforces.com/problemset/problem/721/A

n = int(input())
string = input()
mas = []
buff = 0

for i in range(n):
    if i != n - 1:
        if string[i] == "B":
            buff += 1
        else:
            if buff != 0:
                mas.append(buff)
                buff = 0
    else:
        if string[i] == "B":
            buff += 1
            mas.append(buff)
        if string[i] == "W" and buff != 0:
            mas.append(buff)

if len(mas) == 1 and mas[0] == 0:
    print(0)
else:
    print(len(mas))
    ans = ""
    for i in mas:
        ans += str(i) + " "
    print(ans)
