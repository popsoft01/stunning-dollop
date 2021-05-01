package com.company;
import java.util.*;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] board = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};


        while(true) {
            printBoard(board);
            isGameOver(board);
            playerTurn(board, input);
            computerTurn(board);
            printBoard(board);
        }
//        input.close();




    }
    private static boolean hasConsteseantWon(char[][] board, char symbol){
        return (board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) ||
                (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
                (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||

                (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
                (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
                (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||

                (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);
    }

    private static boolean isGameOver(char[][] board) {
       if (hasConsteseantWon(board, 'X' )){
           printBoard(board);
           System.out.println("Player wins");
           return true;
       }
        if (hasConsteseantWon(board, 'O' )){
            printBoard(board);
            System.out.println("Computer wins");
            return true;
        }

        for (int i =0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        printBoard(board);
        System.out.println("the game ended in a tie!");
        return true;

    }

    private static void computerTurn(char[][] board) {
        Random random = new Random();
        int systemPlay;
        while (true){
        systemPlay = random.nextInt(9) + 1;
        if (isvalidMove(board, systemPlay)) {
            break;
            }
        }
        System.out.println("computer move" + systemPlay);
        placeMove(board, Integer.toString(systemPlay), 'O');
    }

    private static boolean isvalidMove(char[][] board, int position){
        switch (position) {
            case 1:
                return (board[0][0] == ' ');
            case 2:
                return (board[0][1] == ' ');
            case 3:
                return  (board[0][2] == ' ');
            case 4:
                return (board[1][0] == ' ');
            case 5:
                return (board[1][1] == ' ');
            case 6:
                return  (board[1][2] == ' ');
            case 7:
                return (board[2][0] == ' ');
            case 8:
                return (board[2][1] == ' ');
            case 9:
                return  (board[2][2] == ' ');
        }
    return true;
    }

    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" +  board[2][2]);
    }
    private static void playerTurn(char[][] board, Scanner input){
        while(true){
        System.out.println("where will you like to play(1-9)");
        String userInput = input.nextLine();
        if (isvalidMove(board, Integer.parseInt(userInput))){
            break;
        } else {
                System.out.println(userInput + "Not a valid move");
            }
        placeMove(board, userInput, 'X');
        }

    }
    private  static  void placeMove(char[][] board, String position, char symbol){


        switch (position) {
            case "1" -> board[0][0] = symbol;
            case "2" -> board[0][1] = symbol;
            case "3" -> board[0][2] = symbol;
            case "4" -> board[1][0] = symbol;
            case "5" -> board[1][1] = symbol;
            case "6" -> board[1][2] = symbol;
            case "7" -> board[2][0] = symbol;
            case "8" -> board[2][1] = symbol;
            case "9" -> board[2][2] = symbol;
            default -> System.out.println(":(");

    }



}
}
