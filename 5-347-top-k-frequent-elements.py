from collections import Counter
import heapq

class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        freq_map = Counter(nums)
        
        max_heap = []
        for num, freq in freq_map.items():
            heapq.heappush(max_heap, (-freq, num))
        
        return [heapq.heappop(max_heap)[1] for _ in range(k)]
    
if __name__ == "__main__":
    def test(nums: list[int], k: int, expected: list[int]):
        solution = Solution()
        actual = solution.topKFrequent(nums, k)
        assert actual == expected

    nums = [1, 1, 1, 2, 2, 3]
    k = 2
    expected = [1, 2]
    test(nums, k, expected)

    nums = [1]
    k = 1
    expected = [1]
    test(nums, k, expected)

    print("All tests passed")