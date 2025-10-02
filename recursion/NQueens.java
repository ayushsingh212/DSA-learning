import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        int[] queens = new int[n];
        placeQueens(0, queens, n, results);
        return results;
    }

    private static void placeQueens(int row, int[] queens, int n, List<List<String>> results) {
        if (row == n) {
            results.add(generateBoard(queens, n));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(row, col, queens)) {
                queens[row] = col;
                placeQueens(row + 1, queens, n, results);
            }
        }
    }

    private static boolean isValid(int row, int col, int[] queens) {
        for (int i = 0; i < row; i++) {
            int placedCol = queens[i];
            if (placedCol == col || Math.abs(placedCol - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    private static List<String> generateBoard(int[] queens, int n) {
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (queens[i] == j) {
                    row.append("Q");
                } else {
                    row.append(".");
                }
            }
            board.add(row.toString());
        }
        return board;
    }

    public static void main(String[] args) {
        int n = 8;
        List<List<String>> solutions = solveNQueens(n);
        System.out.println("Total solutions for " + n + "-Queens: " + solutions.size());
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
