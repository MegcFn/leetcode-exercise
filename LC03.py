class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) in [0,1]:
            return len(s)
        head, tail, answer = 0, 1, 0
        hashset = set()
        hashset.add(s[head])
        while tail < len(s):
            if s[tail] in hashset:
                answer = len(hashset) if len(hashset) > answer else answer
                hashset.remove(s[head])
                head += 1
            else:
                hashset.add(s[tail])
                tail += 1
        return answer if answer > len(hashset) else len(hashset)
