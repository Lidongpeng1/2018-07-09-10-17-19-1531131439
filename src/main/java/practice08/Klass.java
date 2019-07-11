package practice08;

public class Klass {

    private Integer number;
    private String displayName;
    private Student leader;

    public Klass(Integer number) {
        this.number = number;
        this.displayName = "Class " + number;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void assignLeader(Student leader) {
        this.leader = leader;
    }

    public Student getLeader() {
        return leader;
    }
}