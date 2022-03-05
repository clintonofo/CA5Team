import java.util.Objects;

public class team implements Comparable<team> {

    private String playerName;
    private String teamName;
    private int salary;
    private String manager;
    private String coach;
    private String city;



    public team(String playerName, String teamName, int salary, String manager, String coach, String city) {
        super();
        this.playerName = playerName;
        this.teamName = teamName;
        this.salary = salary;
        this.manager = manager;
        this.coach = coach;
        this.city = city;

    }
    @Override
    public String toString() {
        return "team{" +
                "playerName='" + playerName + '\'' +
                ", teamName='" + teamName + '\'' +
                ", salary=" + salary +
                ", manager='" + manager + '\'' +
                ", coach='" + coach + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(team o) {
        return 0;
    }
}

