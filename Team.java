


package Practical_12;
public class Team implements Comparable<Team> {
    //storing data
    private String Name;
    private int Wins;
    private int Draws;
    private Integer Loses;
    private Integer Points;

    public Team(String Name) {
        this.Name = Name;
        this.Wins = 0;
        this.Loses = 0;
        this.Draws = 0;
        this.Points = 0;
    }



    //to upgrade the points

    public void Wins_increased(){
        Wins+=1;
        Points+=3;

    }
    //to upgrade the points
    public void Losses_increased(){
        this.Loses+=1;


    }
    //to upgrade the points


    public int getPoints() {
        return Wins;
    }
    public void Draws_increased(){
        Draws+=1;
        Points+=1;

    }
    //to print all the data related to the team
    public String toString(){
        String output = "";
        output += "Team{\n";
        output += "\tName: " + this.Name + "\n";
        output += "\tWins: " + this.Wins + "\n";
        output += "\tDraw: " + this.Draws + "\n";
        output += "\tLoss: " + this.Loses + "\n";
        output += "\tPoints: " + this.Points + "\n";
        output += "}\n";
        return output;
    }

    //for comparing
    @Override
    public int compareTo(Team o) {
        return -this.Points.compareTo(o.Points);

    }

    //to get the name of the team
    public String getName() {
        return this.Name;
    }
    //to get the point of the team

    public int getPoints(int nextToCompare) {
        return Points;
    }
}


 

