package cat.proven.teamplayer.model.persist;

import cat.proven.teamplayer.exceptions.AlreadyExistsPlayer;
import cat.proven.teamplayer.model.Player;
import java.util.ArrayList;
import java.util.List;

/**
 * <strong>FriendDaoList.java</strong>
 * DAO class for Player persistence in a list. Implements singleton pattern.
 *
 * @author Jordi and David
 */
public class PlayerDaoList implements PlayerDaoInterface {

    private static PlayerDaoList instance;
    private final List<Player> data;

    private PlayerDaoList() {
        this.data = new ArrayList<>();
    }

    /**
     * Implements singleton pattern
     * @return current instance
     */
    public static PlayerDaoList getInstance() {
        if (instance == null) {
            instance = new PlayerDaoList();
        }
        return instance;
    }

    @Override
    public List<Player> selectAll() {
        //TODO
        return null;
    }

    @Override
    public Player selectWhereId(long id) {
        //TODO
        return null;
    }

    @Override
    public List<Player> selectWhereName(String name) {
        //TODO
        return null;
    }

    @Override
    public List<Player> selectWhereTeamId(long teamId) {
        //TODO
        return null;
    }

    @Override
    public int insert(Player player)throws AlreadyExistsPlayer {
        //TODO
        return 0;

    }

    @Override
    public int update(Player player) {
        //TODO
        return 0;
    }

    @Override
    public int delete(Player player) {
        //TODO
        return 0;
    }

}
