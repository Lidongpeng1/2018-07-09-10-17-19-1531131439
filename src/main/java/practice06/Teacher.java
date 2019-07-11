package practice06;

public class Teacher extends Person{

    private int  klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (klass == null) {
            return String.format("%s I am a Teacher. I teach No Class.", super.introduce());
        } else {
            return String.format("%s I am a Teacher. I teach Class %d.", super.introduce(), klass);
        }
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }
}
