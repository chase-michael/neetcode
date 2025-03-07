class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        triplets = []

        for anchor in range(len(nums) - 2):
            if anchor > 0 and nums[anchor] == nums[anchor - 1]:
                continue

            left, right = anchor + 1, len(nums) - 1

            while left < right:
                sum = nums[anchor] + nums[left] + nums[right]

                if sum == 0:
                    triplets.append([nums[anchor], nums[left], nums[right]])

                    while left < right and nums[left] == nums[left + 1]:
                        left += 1
                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1

                    left += 1
                    right -= 1

                elif sum < 0:
                    left += 1
                else:
                    right -= 1

        return triplets
    
if __name__ == "__main__":
    def test(nums: list[int], expected: list[list[int]]):
        sol = Solution()
        actual = sol.threeSum(nums)
        assert set(map(tuple, actual)) == set(map(tuple, expected)), \
            f"Expected {expected}, but got {actual}"
            
    test([-1,0,1,2,-1,-4], [[-1,-1,2],[-1,0,1]])
    test([0,1,1], [])
    test([0,0,0], [[0,0,0]])
    print("All tests passed")