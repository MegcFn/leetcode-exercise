class Solution:
   def isPalindrome(self, x: int) -> bool:
        if x == 0:
            return True
        if x < 0 or x%10 == 0:
            return False
        reversed_num = 0
        while x > reversed_num:
            reversed_num = reversed_num*10 + x%10
            x /= 10
        print(x,reversed_num)
        return reversed_num == int(x) or reversed_num/10 == int(x)

solution = Solution()
solution.isPalindrome(121)
        