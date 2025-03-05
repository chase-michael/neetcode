class Solution:
    def isValidSudoku(self, board: list[list[str]]) -> bool:
        rows = {i: set() for i in range(9)}
        columns = {i: set() for i in range(9)}
        sub_boxes = {(i, j): set() for i in range(3) for j in range(3)}

        for i in range(9):
            for j in range(9):
                value = board[i][j]
                if value == ".":
                    continue

                sub_box_index = (i // 3, j // 3)

                if value in rows[i] or value in columns[j] or value in sub_boxes[sub_box_index]:
                    return False

                rows[i].add(value)
                columns[j].add(value)
                sub_boxes[sub_box_index].add(value)
        
        return True

if __name__ == "__main__":
    def test(input: list[list[str]], expected: bool):
        solution = Solution()
        actual = solution.isValidSudoku(input)
        assert actual == expected, f"Expected {expected}, but got {actual}"
    
    board = [
        ["5","3",".",".","7",".",".",".","."],
        ["6",".",".","1","9","5",".",".","."],
        [".","9","8",".",".",".",".","6","."],
        ["8",".",".",".","6",".",".",".","3"],
        ["4",".",".","8",".","3",".",".","1"],
        ["7",".",".",".","2",".",".",".","6"],
        [".","6",".",".",".",".","2","8","."],
        [".",".",".","4","1","9",".",".","5"],
        [".",".",".",".","8",".",".","7","9"]
    ]
    test(board, True)

    board = [
        ["8","3",".",".","7",".",".",".","."],
        ["6",".",".","1","9","5",".",".","."],
        [".","9","8",".",".",".",".","6","."],
        ["8",".",".",".","6",".",".",".","3"],
        ["4",".",".","8",".","3",".",".","1"],
        ["7",".",".",".","2",".",".",".","6"],
        [".","6",".",".",".",".","2","8","."],
        [".",".",".","4","1","9",".",".","5"],
        [".",".",".",".","8",".",".","7","9"]
    ]
    test(board, False)

    print("All tests passed")