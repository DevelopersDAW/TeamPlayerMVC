package cat.proven.teamplayer.model;

import java.util.Objects;

/**
 *
 * @author Jordi and David
 */
public class Team {

    private long id;
    private String name;
    private String coach;
    private String category;
    private double budget;

    public Team() {
    }

    public Team(long id, String name, String coach, String category, double budget) {
        this.id = id;
        this.name = name;
        this.coach = coach;
        this.category = category;
        this.budget = budget;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return id == team.id || Objects.equals(name, team.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
