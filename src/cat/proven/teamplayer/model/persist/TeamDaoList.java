package cat.proven.teamplayer.model.persist;

import cat.proven.teamplayer.exceptions.AlreadyExistsTeam;
import cat.proven.teamplayer.exceptions.ParameterNull;
import cat.proven.teamplayer.exceptions.TeamHavePlayers;
import cat.proven.teamplayer.model.Team;
import java.util.ArrayList;
import java.util.List;

/**
 * <strong>FriendDaoList.java</strong>
 * DAO class for Team persistence in a list. Implements singleton pattern.
 *
 * @author Jordi and David
 */
public class TeamDaoList implements TeamDaoInterface {

    private static TeamDaoList instance;
    private final List<Team> data;

    private TeamDaoList() {
        this.data = new ArrayList<>();
    }

    /**
     * Implements singleton pattern
     *
     * @return current instance
     */
    public static TeamDaoList getInstance() {
        if (instance == null) {
            instance = new TeamDaoList();
        }
        return instance;
    }

    @Override
    public List<Team> selectAll() {
        //TODO
        return null;
    }

    @Override
    public Team selectWhereId(long id) {
        //TODO
        return null;
    }

    @Override
    public Team selectWhereName(String name) {
        //TODO
        return null;
    }

    @Override
    public List<Team> selectWhereCoach(String coach) {
        //TODO
        return null;
    }

    @Override
    public List<Team> selectWhereCategory(String category) {
        //TODO
        return null;
    }

    @Override
    public int insert(Team team) throws AlreadyExistsTeam {
        //TODO
        return 0;
    }

    @Override
    public int update(Team team) {
        //TODO
        return 0;
    }

    @Override
    public int delete(Team team) throws TeamHavePlayers {
        //TODO
        return 0;
    }

}
