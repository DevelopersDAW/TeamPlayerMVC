package cat.proven.teamplayer.model.persist;

import cat.proven.teamplayer.exceptions.AlreadyExistsPlayer;
import cat.proven.teamplayer.model.Player;
import java.util.List;

/**
 *
 * @author Jordi and David
 */
public interface PlayerDaoInterface {

    /**
     * Selects all players from data source
     *
     * @return list of all players or empty list if none if found or null in
     * case of error
     */
    public List<Player> selectAll();

    /**
     * Selects a player given id
     *
     * @param id the id from the player
     * @return a player or empty in case not found, null in case of error
     * be
     */
    public Player selectWhereId(long id);

    /**
     * Selects a player given name
     *
     * @param name the name of the player
     * @return a list of players or empty in case not found, null in case of
     * error
     */
    public Player selectWhereName(String name);

    /**
     * Selects player given team ID
     *
     * @param teamId the team id from the player's team
     * @return list of players or empty in case not found, null in case of error
     */
    public List<Player> selectWhereTeamId(long teamId);

    /**
     * Inserts a new player, prevents if the player given is null, already exists or the PK is null.
     *
     * @param player the player to add
     * @return 1 if its correctly inserted or -1 in case of error
     * @throws AlreadyExistsPlayer in case of the new player introduced already
     * exists a exeception will be throw
     */
    public int insert(Player player) throws AlreadyExistsPlayer;

    /**
     * Updates the player given, prevents update if the player does not exist or the PK is null.
     *
     * @param player the player to update their data
     * @return 1 if its correctly updated or -1 in case of error
     */
    public int update(Player player);

    /**
     * Deletes the player given, prevents if the player does not exist or the PK is null.
     *
     * @param player the player to delete
     * @return 1 if its correctly updated or -1 in case of error
     */
    public int delete(Player player);

}
