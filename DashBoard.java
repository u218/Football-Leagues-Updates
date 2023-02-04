package Practical_12;
public class DashBoard {
    //adding teams
    public static void main(String[] args) {
        Team Team1=new Team("Argentina");
        Team Team2= new Team("Portugal");
        Team Team3= new Team("Pakistan");

        Team Team4=new Team("Brazil");
        Team Team5= new Team("Morocoo");
        Team Team6= new Team("Italy");

      //  Team one=new Team("aaaa");
       // Team two= new Team("sssss");
       // Team three= new Team("dddddd");
        //creating a football league
        FootBallLeague leagues= new FootBallLeague("Serie A");
        //adding teams to the league
        leagues.AddTeam(Team1);
        leagues.AddTeam(Team2);
        leagues.AddTeam(Team3);
        leagues.AddTeam(Team4);
        leagues.AddTeam(Team5);
        leagues.AddTeam(Team6);
        leagues.WinMatch(Team2,Team1);
        leagues.WinMatch(Team2,Team4);
        leagues.WinMatch(Team4,Team5);
        leagues.draw(Team1,Team5);
        leagues.Sorting();
        System.out.println(leagues);
    }
}
