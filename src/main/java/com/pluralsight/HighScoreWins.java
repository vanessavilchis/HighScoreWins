package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter game score: ");
        String input = scan.nextLine().trim();

        String[] parts = input.split("\\|");
        String [] teams = parts[0].split("\\:");;
        String [] scores = parts[1].split("\\:");;

        String homeTeam = teams[0];
        String visitorTeam = teams[1];

        int homeTeamScore = Integer.parseInt(scores[0]);
        int visitorTeamScore = Integer.parseInt(scores[1]);

        if (homeTeamScore > visitorTeamScore) {
            System.out.println("Winner: " + homeTeam + "!");
        }else if (visitorTeamScore > homeTeamScore){
            System.out.println("Winner: " + visitorTeamScore + "!");
            else:
            System.out.println("Tie");
        }
}
