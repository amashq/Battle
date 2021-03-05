public abstract class Human {

    private String name;
    private String classWarrior;

    Human (String name, String classWarrior) {
        this.name = name;
        this.classWarrior = classWarrior;
    }

    public String getName() {
        return name;
    }

    public String getClassWarrior() {
        return classWarrior;
    }

    public abstract void run();

    public void death() {
        System.out.println(name + " погиб");
    };
}
