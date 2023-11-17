package bai10;

public class FootballTeam implements Comparable<FootballTeam> {
    @Override
    public int compareTo(FootballTeam o) {
        return this.getScore()-o.getScore();
    }

    private int id;
    private String name;
    private int numberOFPlayer;
    private int score;

    public FootballTeam() {
    }

    public FootballTeam(int id, String name, int numberOFPlayer, int score) {
        this.id = id;
        this.name = name;
        this.numberOFPlayer = numberOFPlayer;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOFPlayer() {
        return numberOFPlayer;
    }

    public void setNumberOFPlayer(int numberOFPlayer) {
        this.numberOFPlayer = numberOFPlayer;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOFPlayer=" + numberOFPlayer +
                ", score=" + score +
                '}';
    }

    public void setScore(int score) {
        this.score = score;

    }
}