class Solution:
    def encode(self, strs: list[str]) -> str:
        encoded = ""
        for s in strs:
            encoded += str(len(s)) + "!" + s
        return encoded
    
    def decode(self, s: str) -> list[str]:
        decoded = []

        pointer = 0
        while pointer < len(s):

            next_len = ""
            while s[pointer] != "!":
                next_len += s[pointer]
                pointer += 1
            pointer += 1
            
            next_str = s[pointer:pointer + int(next_len)]
            pointer += int(next_len)
            
            decoded.append(next_str)

        return decoded

if __name__ == "__main__":
    def testEncode(input: list[str], expected: str):
        solution = Solution()
        actual = solution.encode(input)
        assert actual == expected

    def testDecode(input: str, expected):
        solution = Solution()
        actual = solution.decode(input)
        assert actual == expected

    testEncode(["neet", "code", "love", "you"], "4!neet4!code4!love3!you")
    testDecode("4!neet4!code4!love3!you", ["neet", "code", "love", "you"])
    
    testEncode(["we", "say", ":", "yes"], "2!we3!say1!:3!yes")
    testDecode("2!we3!say1!:3!yes", ["we", "say", ":", "yes"])

    testEncode(["abcdefghijk"], "11!abcdefghijk")
    testDecode("11!abcdefghijk", ["abcdefghijk"])

    testEncode(["", ""], "0!0!")
    testDecode("0!0!", ["", ""])

    print("All tests passed")
