public class Witch extends Human implements Witchcraft, CloseCombat {

    Witch (String name, String classWarrior) {
        super(name, classWarrior);
    }

    @Override
    public void run() {
        System.out.println(super.getClassWarrior() + " " + super.getName() + " телепортировался");
    }

    @Override
    public void lightBall() {
        System.out.println(super.getClassWarrior() + " " + super.getName() + " запустил световой шар");
    }

    @Override
    public void protectiveSphere() {
        System.out.println(super.getClassWarrior() + " " + super.getName() + " использовал защитную сферу");
    }

    @Override
    public void invisible() {
        System.out.println(super.getClassWarrior() + " " + super.getName() + " стал невидимым");
    }

    @Override
    public void swordStrike() {
        System.out.println(super.getClassWarrior() + " " + super.getName() + " нанес удар мечом");
    }

    @Override
    public void reflectBlow() {
        System.out.println(super.getClassWarrior() + " " + super.getName() + " отразил удар");

    }
}
