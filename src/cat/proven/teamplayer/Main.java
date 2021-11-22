package cat.proven.teamplayer;

import cat.proven.teamplayer.exceptions.AlreadyEnrolled;
import cat.proven.teamplayer.exceptions.AlreadyExistsPlayer;
import cat.proven.teamplayer.exceptions.AlreadyExistsTeam;
import cat.proven.teamplayer.exceptions.TeamHavePlayers;
import cat.proven.teamplayer.model.Player;
import cat.proven.teamplayer.model.Team;
import cat.proven.teamplayer.model.TeamPlayerModel;

import java.util.Date;
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

        //FIND ALL TEAMS
        if (!test.findAllTeams().isEmpty()) {
            System.out.println("Find all teams true.");
        } else {
            System.out.println("Find all teams false");
        }

        //FIND TEAM BY ID
        if (test.findTeamById(1) != null) {
            System.out.println("Find team by id true.");
        } else {
            System.out.println("Find team by id false.");
        }

        //FIND TEAM BY NAME
        if (test.findTeamByName("T1") != null) {
            System.out.println("Find team by name true.");
        } else {
            System.out.println("Find team by name false.");
        }

        //FIND TEAM BY CATEGORY
        if (!test.findTeamsByCategory("C1").isEmpty()) {
            System.out.println("Find team by category true.");
        } else {
            System.out.println("Find team by category false.");
        }

        //ADD TEAM
        try {
            if (test.addTeam(new Team(5, "T2", "C2", "C1", 2300)) == 1) {
                System.out.println("Add team true.");
            }
        } catch (AlreadyExistsTeam alreadyExistsTeam) {
            System.out.println("Add team false.");
        }

        //MODIFY TEAM
        if (test.modifyTeam(new Team(5, "T2", "CD", "CD", 3000)) == 1) {
            System.out.println("Modify team true.");
        } else {
            System.out.println("Modify team false.");
        }

        //REMOVE TEAM
        Team team = new Team(1, "T1", "CD", "CD", 3000);
        List<Player> players = test.findPlayersByTeam(team);
        if (players.isEmpty()) {
            try {
                if (test.removeTeam(team) == 1) {
                    System.out.println("Remove team true.");
                }
            } catch (TeamHavePlayers teamHavePlayers) {
                System.out.println("Remove team false.");
            }
        } else {
            System.out.println("Remove team false.");
        }


        //FIND PLAYER BY ID
        if (test.findPlayerById(1) != null) {
            System.out.println("Find player by id true.");
        } else {
            System.out.println("Find player by id false.");
        }

        //FIND PLAYER BY FULL NAME
        if (!test.findPlayerByFullName("Jordi Rocha").isEmpty()) {
            System.out.println("Find players by Full name true.");
        } else {
            System.out.println("Find players by Full name false.");
        }

        //FIND PLAYER BY TEAM
        if (!test.findPlayersByTeam(new Team(4, "T1", "CD", "CD", 3000)).isEmpty()) {
            System.out.println("Find players by team true.");
        } else {
            System.out.println("Find players by team false.");
        }

        //ADD PLAYER
        try {
            if (test.addPlayer(new Player(6)) != -1) System.out.println("Add player true");
            test.addPlayer(new Player(1));
        } catch (AlreadyExistsPlayer aep) {
            System.out.println("Add player false");
        }

        //MODIFY PLAYER
        if (test.modifyPlayer(new Player(7, "Rocha", "Rocha", new Date(), 2000, 1)) == 1) {
            System.out.println("Modify player true.");
        } else {
            System.out.println("Modify player false.");
        }

        //ENROL PLAYER TO TEAM
        try {
            if (test.enrolPlayerToTeam(new Team(4, "T1", "CD", "CD", 3000),
                    new Player(7, "Jordi", "Rocha", new Date(), 2000, 0)) == 1) {
                System.out.println("Enrol player true.");
            } else {
                System.out.println("Enrol player false.");
            }
        } catch (AlreadyEnrolled e) {
            System.out.println("Enrol player false.");
        }
    }

}
