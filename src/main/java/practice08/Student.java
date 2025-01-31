package practice08;

public class Student extends Person {

    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce(){
        if (this.equals(klass.getLeader())) {
            return String.format("%s I am a Student. I am Leader of Class %d.", super.introduce(), klass.getNumber());
        } else {
            return String.format("%s I am a Student. I am at Class %d.", super.introduce(), klass.getNumber());
        }
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}