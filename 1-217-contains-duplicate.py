class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
      if len(nums) < 2:
        return False
      
      seen = set()
      
      for num in nums:
          if num in seen:
              return True
          seen.add(num)
      
      return False

if __name__ == "__main__":
    solution = Solution()
    assert solution.containsDuplicate([]) == False
    assert solution.containsDuplicate([1]) == False
    assert solution.containsDuplicate([1, 2, 3, 4]) == False
    assert solution.containsDuplicate([1, 2, 3, 3]) == True
    assert solution.containsDuplicate(list(range(100000))) == False
    assert solution.containsDuplicate(list(range(99999)) + [50000]) == True
    assert solution.containsDuplicate([-1, 2, 3, 2]) == True
    assert solution.containsDuplicate([-1, -2, -3, -1]) == True
    print("Passed all tests")