package cat.proven.teamplayer.model.persist;

import cat.proven.teamplayer.exceptions.AlreadyExistsPlayer;
import cat.proven.teamplayer.model.Player;

import java.util.ArrayList;
import java.util.Date;
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
        initData();
    }
    private void initData() {
        data.add(new Player(1, "Jordi", "Rocha", new Date(), 1200, 1));
        data.add(new Player(2, "R", "R", new Date(), 1200, 1));
        data.add(new Player(3, "L", "L", new Date(), 1200, 1));
        data.add(new Player(4, "B", "B", new Date(), 1200, 1));
    }
    /**
     * Implements singleton pattern
     *
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
        return data;
    }

    @Override
    public Player selectWhereId(long id) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == id) {
                return data.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Player> selectWhereName(String name) {
        List<Player> coincidence = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            String fullname = data.get(i).getName() + " " + data.get(i).getSurname();
            if (fullname.equalsIgnoreCase(name)) {
                coincidence.add((data.get(i)));
            }
        }
        return coincidence;
    }

    @Override
    public List<Player> selectWhereTeamId(long teamId) {
        List<Player> coincidence = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getIdTeam() == teamId) {
                coincidence.add((data.get(i)));
            }
        }
        return coincidence;
    }

    @Override
    public int insert(Player player) throws AlreadyExistsPlayer {
        if (data.contains(player)) {
            throw new AlreadyExistsPlayer("Player already exists");
        } else {
            data.add(player);
            return 1;
        }
    }

    @Override
    public int update(Player player) {
        if (data.contains(player)) {
            int index = data.indexOf(player);
            data.set(index, player);
            return 1;
        }
        return -1;
    }

    @Override
    public int delete(Player player) {
        if(data.contains(player)){
            data.remove(player);
            return 1;
        }
        return -1;
    }

}
