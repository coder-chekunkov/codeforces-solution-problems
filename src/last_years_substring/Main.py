# Level - 800
# Link - https://codeforces.com/problemset/problem/1462/B

def solution():
    x = int(input())
    string = input()
    if x == 4 and string == "2020":
        return "YES"
    else:
        if (string[0] == "2" and string[1] == "0" and string[2] == "2" and string[3] == "0") or (
                string[x - 4] == "2" and string[x - 3] == "0" and string[x - 2] == "2" and string[x - 1] == "0") or (
                string[0] == "2" and string[1] == "0" and string[x - 2] == "2" and string[x - 1] == "0") or (
                string[0] == "2" and string[x - 3] == "0" and string[x - 2] == "2" and string[x - 1] == "0") or (
                string[0] == "2" and string[1] == "0" and string[2] == "2" and string[x - 1] == "0"):
            return "YES"
        else:
            return "NO"


n = int(input())

for i in range(n):
    print(solution())
