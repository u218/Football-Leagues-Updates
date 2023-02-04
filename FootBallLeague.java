package Practical_12;
import java.util.*;

import static java.util.Collections.swap;

public class FootBallLeague {
    //setting of the attributes of the FootBallLeague
    private String League_ID;
    List<Team> list_of_teams=new LinkedList();
    //use the linkedList so can arrange the teams in the Linked List according to requirements
    public FootBallLeague(String League_ID) {           //assigning the values so can use it
        this.League_ID = League_ID;

    }
    public void Sorting(){
        Collections.sort(list_of_teams, new Comparator<Team>() {
            @Override           // overriding the function
            public int compare(Team o1, Team o2) {
                return -(o1.getPoints()-o2.getPoints());
            }
        });
    }
    //the humenFriendly function to print the analysis of a team
    public String toString() {
        String print = "";
        print += "practical12.FootballLeague: " + this.League_ID + "\n";
        Integer pos = 1;
        for (Team team : this.list_of_teams) {
            print += "\nRanking " + pos.toString() + "\n";
            print += team;
            pos += 1;
        }
        return print;
    }
    //Addition of the team in the league using the linked list
    public void AddTeam(Team toAdd) {
        this.list_of_teams.add(toAdd);
    }
    //if win need to upgrade the points
    public void WinMatch(Team Winning, Team Losing) {
        for (int i = 0; i < this.list_of_teams.size(); i++) {
            if (list_of_teams.get(i).getName().compareTo(Winning.getName()) == 0) {
                Winning.Wins_increased();
            }
            if (this.list_of_teams.get(i).getName().compareTo(Losing.getName()) == 0) {
                Losing.Losses_increased();
            }
        }
    }
    //if draw need to upgrade the points
    public void draw(Team one, Team two) {
        for (int i = 0; i < this.list_of_teams.size(); i++) {
            if (list_of_teams.get(i).getName().compareTo(one.getName()) == 0) {
                one.Draws_increased();
            }
            if (this.list_of_teams.get(i).getName().compareTo(two.getName()) == 0) {
                two.Draws_increased();
            }
            //no need for losses because it remains same if the team loss
        }
    }
    //function to remove a team from a league
    public void removeOldTeam(Team remove){
        this.list_of_teams.remove(remove);
    }

}
