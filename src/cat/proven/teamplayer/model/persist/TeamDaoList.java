package cat.proven.teamplayer.model.persist;

import cat.proven.teamplayer.exceptions.AlreadyExistsTeam;
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
        initData();
    }

    private void initData() {
        data.add(new Team(1, "T1", "C1", "C1", 3000));
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
        return data;
    }

    @Override
    public Team selectWhereId(long id) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == id) return data.get(i);
        }
        return null;
    }

    @Override
    public Team selectWhereName(String name) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(name)) return data.get(i);
        }
        return null;
    }

    @Override
    public List<Team> selectWhereCoach(String coach) {
        List<Team> teams = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getCoach().equals(coach)) teams.add(data.get(i));
        }
        return null;
    }

    @Override
    public List<Team> selectWhereCategory(String category) {
        List<Team> teams = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) if (data.get(i).getCategory().equals(category)) teams.add(data.get(i));

        return teams;
    }

    @Override
    public int insert(Team team) throws AlreadyExistsTeam {
        if (!data.contains(team)) {
            data.add(team);
            return 1;
        } else {
            throw new AlreadyExistsTeam("Already exists team");
        }
    }

    @Override
    public int update(Team team) {
        if (data.contains(team)) {
            int index = data.indexOf(team);
            data.set(index, team);
            return 1;
        }
        return -1;
    }

    @Override
    public int delete(Team team) throws TeamHavePlayers {
        if(data.contains(team)){
            data.remove(team);
            return 1;
        }
        return -1;
    }

}
