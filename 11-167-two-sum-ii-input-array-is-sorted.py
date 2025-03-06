class Solution:
    def twoSum(self, numbers: list[int], target: int) -> list[int]:
        left = 0
        right = len(numbers) - 1

        sum = numbers[left] + numbers[right]
        while sum != target:
            if sum < target:
                left += 1
            else:
                right -= 1
            
            sum = numbers[left] + numbers[right]

        return [left + 1, right + 1]
    
if __name__ == "__main__":
    def test(numbers: list[int], target: int, expected: list[int]):
        sol = Solution()
        actual = sol.twoSum(numbers, target)
        assert actual == expected, f"Expected {expected}, but got {actual}"

    test([2, 7, 11, 15], 9, [1, 2])
    test([2, 3, 4], 6, [1, 3])
    test([-1, 0], -1, [1, 2])
    print("All tests passed")