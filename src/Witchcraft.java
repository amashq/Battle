public interface Witchcraft {
    void lightBall();

    default void toBlind() {
        System.out.println("На всех в битве наложено ослепление");
    };

    void invisible();
    void protectiveSphere ();
}
