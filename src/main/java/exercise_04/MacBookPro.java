package exercise_04;

public class MacBookPro {

    private final StandardKeyboard keyboard;
    private final StandardMouse mouse;

    public MacBookPro() {
        keyboard = new StandardKeyboard();
        mouse = new StandardMouse();
    }

    public StandardKeyboard getKeyboard() {
        return keyboard;
    }

    public StandardMouse getMouse() {
        return mouse;
    }

}
