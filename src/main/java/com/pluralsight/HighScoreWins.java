package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] game = input.split("\\|");
        String [] teams = game[0].split(":");;
        String homeTeam = teams[0];
        String visitorTeam = teams[1];

        String[] scores = game[1].split(":");
        int homeTeamScore = teams [0];
        String []
    }
}
