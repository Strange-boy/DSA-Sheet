package recursion.level1;

import java.util.Scanner;

public class FloodFill {

    // main flood fill logic to find all the path
    private static void floodFill(int[][] maze, int currentRow, int currentCol, String pathSoFar, boolean[][] visited){
        if(currentRow < 0 || currentCol < 0
                || currentRow == maze.length || currentCol == maze[0].length
                || maze[currentRow][currentCol] == 1 || visited[currentRow][currentCol]){
            return;
        }

        //path formed scneario
        if(currentRow == maze.length - 1 && currentCol ==  maze[0].length - 1){
            System.out.println(pathSoFar);
            return;
        }

        //all the possible traversal path
        visited[currentRow][currentCol] = true;
        floodFill(maze, currentRow - 1, currentCol, pathSoFar + "t", visited); //top
        floodFill(maze, currentRow, currentCol - 1, pathSoFar + "l", visited); //left
        floodFill(maze, currentRow + 1, currentCol, pathSoFar + "d", visited); // down
        floodFill(maze, currentRow, currentCol + 1, pathSoFar + "r", visited); //right
        visited[currentRow][currentCol ] = false;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int destinationRow = scn.nextInt();
        int destinationCol = scn.nextInt();

        int[][] maze = new int[destinationRow][destinationCol];

        for(int row = 0; row < destinationRow; row += 1){
            for(int col = 0; col < destinationCol; col += 1){
                maze[row][col] = scn.nextInt();
            }
        }

        boolean[][] visited = new boolean[destinationRow][destinationCol];

        floodFill(maze, 0, 0, "", visited);
    }
}
