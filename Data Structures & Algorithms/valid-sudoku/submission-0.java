class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++)
        {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            for(int j = 0; j < 9; j++)
            {
                if(row.contains(board[i][j]) || col.contains(board[j][i]))
                {
                    return false;
                }
                if(board[i][j] != '.')
                row.add(board[i][j]);
                if(board[j][i] != '.')
                col.add(board[j][i]);
            }
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                int k = 3*i, l = 3*j;
                HashSet<Character> grid = new HashSet<>();
                for(int m = k; m < k+3; m++)
                {
                    for(int n = l; n < l+3; n++)
                    {
                        if(grid.contains(board[m][n]))
                        {
                            return false;
                        }
                        if(board[m][n] != '.')
                        grid.add(board[m][n]);
                    }
                }
            }
        }
        return true;
    }
}
