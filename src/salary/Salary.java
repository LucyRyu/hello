package salary;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Salary {

    //yearID,teamID,lgID,playerID,salary

    private int yearId;
    private String teamId;
    private String lgId;
    private String playerId;
    private int salary;

    public Salary(){

    }

    public Salary(int yearId, String teamId, String lgId, String playerId, int salary) {
        this.yearId = yearId;
        this.teamId = teamId;
        this.lgId = lgId;
        this.playerId = playerId;
        this.salary = salary;
    }

    public int getYearId() {
        return yearId;
    }

    public void setYearId(int yearId) {
        this.yearId = yearId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getLgId() {
        return lgId;
    }

    public void setLgId(String lgId) {
        this.lgId = lgId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}