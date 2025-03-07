class Solution:
    def longestConsecutive(self, nums: list[int]) -> int:
        nums_set = set(nums)

        seen = set()
        longest_seq = 0
        for num in nums:
            if num in seen:
                continue

            seen.add(num)
            
            if num - 1 not in nums_set:
                current_seq = 1
                next_num = num + 1

                while next_num in nums_set:
                    seen.add(next_num)
                    current_seq += 1
                    next_num += 1

                longest_seq = max(longest_seq, current_seq)

        return longest_seq
    
if __name__ == "__main__":
    def test(input: list[int], expected: int):
        solution = Solution()
        actual = solution.longestConsecutive(input)
        assert actual == expected, f"Expected {expected}, but got {actual}"

    test([100, 4, 200, 1, 3, 2], 4)
    test([0, 3, 7, 2, 5, 8, 4, 6, 0, 1], 9)
    test([1, 0, 1, 2], 3)

    print("All tests passed")