from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        anagram_map = defaultdict(list)

        for str in strs:
            key = ''.join(sorted(str))
            anagram_map[key].append(str)

        return list(anagram_map.values())
    
if __name__ == "__main__":
    def test(input: list[str], expected):
        solution = Solution()
        actual_t = {tuple(sorted(sublist)) for sublist in solution.groupAnagrams(input)}
        expected_t = {tuple(sorted(sublist)) for sublist in expected}
        assert actual_t == expected_t

    test(["eat", "tea", "tan", "ate", "nat", "bat"], [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]])
    test([""], [[""]])
    test(["a"], [["a"]])
    print("All tests passed")