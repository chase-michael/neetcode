class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        n = len(nums)
        output = [1] * n

        prefix = 1
        for i in range(n):
            output[i] = prefix
            prefix *= nums[i]

        suffix = 1
        for i in range(n - 1, -1, -1):
            output[i] *= suffix
            suffix *= nums[i]
        
        return output
    
if __name__ == "__main__":
    def test(input: list[int], expected: list[int]):
        solution = Solution()
        actual = solution.productExceptSelf(input)
        assert actual == expected
    
    test([1, 2], [2, 1])
    test([1, 2, 3, 4], [24, 12, 8, 6])
    test([-1, 0, 1], [0, -1, 0])
    print("All tests passed")