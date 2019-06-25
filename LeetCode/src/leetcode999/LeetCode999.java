package leetcode999;

public class LeetCode999 {

    public static final int WIDTH = 8;

    public static void main(String[] args) {
        char[][] params = new char[][] {
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','R','.','.','.','p'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},

        };
        int num = new LeetCode999().numRookCaptures(params);
        System.out.println(num);
    }

    public int numRookCaptures(char[][] board) {
        int[] rookPosition = getRookPosition(board);
        char[] left = getLeftLines(rookPosition[0], rookPosition[1], board);
        char[] right = getRightLines(rookPosition[0], rookPosition[1], board);
        char[] top = getTopLines(rookPosition[1], rookPosition[0], board);
        char[] bottom = getBottomLines(rookPosition[1], rookPosition[0], board);


        return getCaptureNum(left) + getCaptureNum(right) + getCaptureNum(top) + getCaptureNum(bottom);
    }

    private int[] getRookPosition(char[][] board) {
        int[] result = new int[2];
        for (int i = 0; i < WIDTH; i ++) {
            for (int j = 0; j < WIDTH; j ++) {
                if (board[i][j] == 'R') {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
    private char[] getLeftLines(int line, int position, char[][] board) {
        if (position == 0) {
            return null;
        }
        char[] result = new char[position];
        for (int i = position - 1; i >= 0; i --) {
            result[position - 1 - i] = board[line][i];
        }
        return result;
    }

    private char[] getRightLines(int line, int position, char[][] board) {
        if (position == 7) {
            return null;
        }
        char[] result = new char[7 - position];
        System.arraycopy(board[line], position + 1, result, 0, result.length);
        return result;
    }

    private char[] getTopLines(int line, int position, char[][] board) {
        if (position == 0) {
            return null;
        }
        char[] result = new char[position];
        for (int i = position - 1; i >= 0; i --) {
            result[position - 1 - i] = board[i][line];
        }
        return result;
    }

    private char[] getBottomLines(int line, int position, char[][] board) {
        if (position == 7) {
            return null;
        }
        char[] result = new char[7 - position];
        for (int i = position + 1; i < 8; i ++) {
            result[i - (position + 1)] = board[i][line];
        }
        return result;
    }

    private int getCaptureNum(char[] lines) {
        if (lines == null) {
            return 0;
        }
        for (char c : lines) {
            if (c == 'B') {
                return 0;
            }
            if (c == 'p') {
                return 1;
            }
        }
        return 0;
    }
}
