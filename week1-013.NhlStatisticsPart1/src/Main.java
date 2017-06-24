
import nhlstats.NHLStatistics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

/*        System.out.println("Top ten by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.top(10);*/


        System.out.println("Top ten players based on goals");
        System.out.println();
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println();

        System.out.println("Top 25 players based on penalty amounts");
        System.out.println();
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println();

        System.out.println("Statistics for Sidney Crosby");
        System.out.println();
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println();
        System.out.println("Statistics for Philadelphia Flyers");
        System.out.println();
        NHLStatistics.teamStatistics("PHI");

        System.out.println();
        System.out.println("Players in Anaheim Ducks");
        System.out.println();
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");


    }
}
