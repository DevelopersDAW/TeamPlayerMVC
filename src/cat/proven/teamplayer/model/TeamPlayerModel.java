package cat.proven.teamplayer.model;

import cat.proven.teamplayer.exceptions.DuplicateExeception;
import cat.proven.teamplayer.exceptions.ParameterNull;
import cat.proven.teamplayer.exceptions.AlreadyEnrolled;
import cat.proven.teamplayer.model.persist.PlayerDaoInterface;
import cat.proven.teamplayer.model.persist.PlayerDaoList;
import cat.proven.teamplayer.model.persist.TeamDaoInterface;
import cat.proven.teamplayer.model.persist.TeamDaoList;
import java.util.List;

/**
 *
 * @author Jordi and David
 */
public class TeamPlayerModel {

    // DAO for Friend objects
    private final PlayerDaoInterface playerDao;
    private final TeamDaoInterface teamDao;

    /**
     * Constructor initialize DAO interfaces
     */
    public TeamPlayerModel() {
        this.playerDao = PlayerDaoList.getInstance();
        this.teamDao = TeamDaoList.getInstance();
    }

    /**
     * Retrieves a list of all teams from data source.
     *
     * @return list of all teams or null if there aren't teams
     */
    public List<Team> findAllTeams() {
        List<Team> teams = null;
        //TODO
        return teams;
    }

    /**
     * Retrieves the team given id
     *
     * @param id the id to search a specific team
     * @return the team with the given id or null in case of error
     */
    public Team findTeamById(long id) {
        Team team = null;
        //TODO
        return team;
    }

    /**
     * Retrieves the team given name
     *
     * @param name the name to search a specific team
     * @return the team with the given name or null in case not found
     */
    public Team findTeamByName(String name) {
        Team team = null;
        //TODO
        return team;
    }

    /**
     * Retrieves a list with given category
     *
     * @param category the categoy to search teams
     * @return a list of teams given a category, null list in case not found
     */
    public List<Team> findTeamsByCategory(String category) {
        List<Team> teams = null;
        //TODO
        return teams;
    }

    /**
     * Adds a team to the data source. It prevents null objects, teams with null
     * name and duplicates
     *
     * @param team the team to add
     * @return 1 if successfully added, or -1 otherwise
     * @throws DuplicateExeception if team name already exists a exception will
     * be throw
     */
    public int addTeam(Team team) throws DuplicateExeception{
        int result = 0;
        //TODO
        return result;
    }

    /**
     * Modifies a team given a Team
     *
     * @param team the team to modify
     * @return 1 if successfully modified or -1 in case of error
     */
    public int modifyTeam(Team team) {
        int result = 0;
        //TODO
        return result;
    }

    /**
     * Removes a team given Team
     *
     * @param team the team to remove
     * @return 1 if successfully removed or -1 in case of error
     */
    public int removeTeam(Team team) {
        int result = 0;
        //TODO
        return result;
    }

    /**
     * Retrieves a single player given a id
     *
     * @param id is the id of the player to search.
     * @return a player if exits or null in case not found
     */
    public Player findPlayerById(long id) {
        Player player = null;
        //TODO
        return player;
    }

    /**
     * Retrieves a single player given a full name.
     *
     * @param fullname is the full name of the player to search
     * @return a list of players with the given full name
     */
    public Player findPlayerByFullName(String fullname) {
        Player player = null;
        //TODO
        return player;
    }

    /**
     * Retrieves a list of player that belongs to the given team
     *
     * @param team is the team of the players to search
     * @return a list of players that belongs to the given team or null in case
     * not found
     * @throws ParameterNull if team given is null a exception will be throw
     */
    public List<Player> findPlayersByTeam(Team team) {
        List<Player> players = null;
        //TODO
        return players;
    }

    /**
     * Adds a player given a Player
     *
     * @param player is the player to add
     * @return 1 if successfully added or -1 otherwise
     * @throws DuplicateExeception if team name given is null or if player
     * already exists in data source a exception will be throw
     * @throws ParameterNull if player given is null an exception will be thrown
     */
    public int addPlayer(Player player) throws DuplicateExeception, ParameterNull {
        int result = 0;
        //TODO
        return result;
    }

    /**
     * Modifies a player given Player
     *
     * @param player is the player to modify
     * @return 1 if successfully modified or -1 otherwise
     */
    public int modifyPlayer(Player player) {
        int result = 0;
        //TODO
        return result;
    }

    /**
     * Enrols a player given to the team given
     *
     * @param team is the team to join the player introduced
     * @param player is the player that will join to the team introduced
     * @return 1 if the player is enrolled in the team or -1 otherwise
     * @throws AlreadyEnrolled if player is already enrolled a exception will be
     * throw
     */
    public int enrolPlayerToTeam(Team team, Player player) throws AlreadyEnrolled {
        int result = 0;
        //TODO
        return result;
    }

    /**
     * Unenrols a player given to the team given
     *
     * @param team is the team to unenrol the player introduced
     * @param player is the player that will unenrol the team introduced
     * @return 1 if the player is unenrolled of the team or -1 otherwise
     */
    public int unenrolPlayerToTeam(Team team, Player player) {
        int result = 0;
        //TODO
        return result;
    }
}
