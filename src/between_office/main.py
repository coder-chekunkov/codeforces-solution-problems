# Level - 800
# Link - https://codeforces.com/problemset/problem/867/A

n = int(input())
string = input()

if string[0] == "S" and string[n - 1] == "F":
    print("YES")
else:
    print("NO")
