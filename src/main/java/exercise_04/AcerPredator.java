package exercise_04;

public class AcerPredator {

    private final GamingKeyboard keyboard;
    private final GamingMouse mouse;

    public AcerPredator() {
        keyboard = new GamingKeyboard();
        mouse = new GamingMouse();
    }

    public GamingKeyboard getKeyboard() {
        return keyboard;
    }

    public GamingMouse getMouse() {
        return mouse;
    }

}
