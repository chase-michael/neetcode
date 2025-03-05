class Solution:
    def isPalindrome(self, s: str) -> bool:
        left = 0
        right = len(s) - 1

        while right > left:
            if not s[left].isalnum():
                left += 1
                continue
            if not s[right].isalnum():
                right -= 1
                continue
            if s[left].lower() == s[right].lower():
                left += 1
                right -= 1
                continue
            return False

        return True
    
if __name__ == "__main__":
    def test(input: str, expected: bool):
        solution = Solution()
        actual = solution.isPalindrome(input)
        assert actual == expected, f"Expected {expected}, but got {actual}"

    test("A man, a plan, a canal: Panama", True)
    test("", True)
    test(" ", True)
    test("a", True)
    test("aa", True)
    test("ab", False)
    test("race a car", False)

    print("Passed all tests")