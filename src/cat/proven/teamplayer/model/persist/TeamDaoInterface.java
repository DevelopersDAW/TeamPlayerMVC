package cat.proven.teamplayer.model.persist;

import cat.proven.teamplayer.exceptions.AlreadyExistsTeam;
import cat.proven.teamplayer.exceptions.ParameterNull;
import cat.proven.teamplayer.exceptions.TeamHavePlayers;
import cat.proven.teamplayer.model.Team;
import java.util.List;

/**
 *
 * @author Jordi & David
 */
public interface TeamDaoInterface {

    /**
     * Selects all teams from data source
     *
     * @return list of all teams or empty list if none if found or null in case
     * of error
     */
    public List<Team> selectAll();

    /**
     * Selects a team given id
     *
     * @param id the id from the team
     * @return a team or empty in case not found, null in case of error
     */
    public Team selectWhereId(long id);

    /**
     * Selects a team given name
     *
     * @param name the name of the team
     * @return a team or empty in case not found, null in case of error
     * @throws ParameterNull in case parameter passed is null a exeception will
     * be throw
     */
    public Team selectWhereName(String name) throws ParameterNull;

    /**
     * Selects teams given name of coach
     *
     * @param coach the name of the coach
     * @return list of teams or empty in case not found, null in case of error
     * @throws ParameterNull in case parameter passed is null a exeception will
     * be throw
     */
    public List<Team> selectWhereCoach(String coach) throws ParameterNull;

    /**
     * Selects all teams that belongs to a category
     *
     * @param category the category to seach
     * @return list of all teams or empty list if none if found or null in case
     * of error
     * @throws ParameterNull in case parameter passed is null a exeception will
     * be throw
     */
    public List<Team> selectWhereCategory(String category) throws ParameterNull;

    /**
     * Inserts a new team
     *
     * @param team the team to add
     * @return 1 if its correctly inserted or -1 in case of error
     * @throws ParameterNull in case parameter passed is null a exeception will
     * be throw
     * @throws AlreadyExistsTeam in case of the new team introduced already
     * exists a exeception will be throw
     */
    public int insert(Team team) throws ParameterNull, AlreadyExistsTeam;

    /**
     * Updates the team given
     *
     * @param team the team to update their data
     * @return 1 if its correctly updated or -1 in case of error
     * @throws ParameterNull in case parameter passed is null a exeception will
     * be throw
     */
    public int update(Team team) throws ParameterNull;

    /**
     * Deletes the team given
     *
     * @param team the team to delete
     * @return 1 if its correctly updated or -1 in case of error
     * @throws ParameterNull in case parameter passed is null a exeception will
     * be throw
     * @throws TeamHavePlayers if the team to delete contains player a
     * exeception will be throw
     */
    public int delete(Team team) throws ParameterNull, TeamHavePlayers;

}
