class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        charCount = [0] * 26

        for i in range(len(s)):
            charCount[ord(s[i]) - 97] += 1
            charCount[ord(t[i]) - 97] -= 1

        return all(x == 0 for x in charCount)

if __name__ == "__main__":

    def test(s: str, t: str, assertion: bool):
        solution = Solution()
        assert solution.isAnagram(s, t) == assertion
    
    # One or fewer
    test("", "", True)
    test("a", "a", True)
    test("a", "b", False)

    # Different lengths
    test("a", "aa", False)

    test("rat", "car", False)
    test("anagram", "nagaram", True)

    print("All tests passed")
