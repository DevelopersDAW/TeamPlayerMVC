package cat.proven.teamplayer;

import cat.proven.teamplayer.exceptions.AlreadyExistsPlayer;
import cat.proven.teamplayer.exceptions.AlreadyExistsTeam;
import cat.proven.teamplayer.model.Player;
import cat.proven.teamplayer.model.Team;
import cat.proven.teamplayer.model.TeamPlayerModel;

import java.util.List;

/**
 * @author Jordi and David
 */
public class Main {

    /**
     * Principal function
     *
     * @param args array
     */
    public static void main(String[] args) {
        TeamPlayerModel test = new TeamPlayerModel();

        List<Team> teams = test.findAllTeams();
        if (!teams.isEmpty()) System.out.println("Data retrieve");

        if (test.findTeamById(5) == null) System.out.println("Team doesn't exist");

        if (test.findTeamByName("T1") != null) System.out.println("Team exist");

        if (!test.findTeamsByCategory("C1").isEmpty()) System.out.println("Team by category given exists");

        try {
            if (test.addTeam(new Team(2,"T2","C2","C1",2300)) == 1) System.out.println("New team added");
        } catch (AlreadyExistsTeam aet) {
            System.out.println("Team with same id not added");
        }

        try {
            if (test.addPlayer(new Player(1)) != -1) System.out.println("Player id 1 added correctly");
            test.addPlayer(new Player(1));
        } catch (AlreadyExistsPlayer aep) {
            System.out.println("Player with same id not added");
        }


    }

}
