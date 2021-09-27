package com.company;



public class Main {

    public static void main(String[] args) {
        winner("rock", "paper");
        winner("scissors", "scissors");

    }

    private static void winner (String str01, String str02) {


        if (str01.equals("scissors") && str02.equals("paper") ||
                str01.equals("rock") && str02.equals("scissors") ||
                str01.equals("paper") && str02.equals("rock")) {

            System.out.println("Player 1 win");
        }

        else if (str01.equals("rock") && str02.equals("paper") ||
                str01.equals("scissors") && str02.equals("rock") ||
                str01.equals("paper") && str02.equals("scissors")){

            System.out.println("Player 2 win");
        }

        else {
            System.out.println("TIE");
        }

    }
}
