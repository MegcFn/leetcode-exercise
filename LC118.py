class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        answer = list()
        for i in range(numRows):
            row = list()
            for j in range(i+1):
                if j == 0 or j == i:
                    answer.append(1)
                else:
                    row.append(answer[i-1][j-1] + answer[i-1][j])
            answer.append(row)
        return answer