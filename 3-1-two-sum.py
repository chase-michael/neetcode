class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        num_map = {}

        for i, num in enumerate(nums):
            complement = target - nums[i]

            if complement in num_map:
                return [num_map[complement], i]
            
            num_map[num] = i
        
        return []

if __name__ == "__main__":
    def test(nums: list[int], target: int, expected: list[int]):
        solution = Solution()
        assert sorted(solution.twoSum(nums, target)) == sorted(expected)

    test([2, 7, 11, 15], 9, [0, 1])
    test([3, 2, 4], 6, [1, 2])
    test([3, 3], 6, [0, 1])
    print("All tests passed")