public class Battle {

    public void start() {
        Witch witch = new Witch("Фиал", "Маг");
        Archer archer = new Archer("Лео", "Лучник");

        archer.arrowShot();
        witch.toBlind();
        witch.lightBall();
        archer.barrageOfArrowsShot();
        witch.reflectBlow();
        witch.protectiveSphere();
        witch.swordStrike();
        archer.dodge();
        archer.run();
        witch.invisible();
        archer.death();

        System.out.println("Бой завершен");
    };
}
