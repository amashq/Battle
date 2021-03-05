public class Archer extends Human implements Shooting {

    Archer (String name, String classWarrior) {
        super(name, classWarrior);
    }

    @Override
    public void run() {
        System.out.println(super.getClassWarrior() + " " + super.getName() + " бежит прочь");
    }

    @Override
    public void arrowShot() {
        System.out.println(super.getClassWarrior() + " " + super.getName() + " выпустил стрелу в врага");
    }

    @Override
    public void barrageOfArrowsShot() {
        System.out.println(super.getClassWarrior() + " " + super.getName() + " обрушил град стрел");
    }

    @Override
    public void dodge() {
        System.out.println(super.getClassWarrior() + " " + super.getName() + " уклонился");
    }
}
