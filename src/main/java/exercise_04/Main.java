package exercise_04;

public class Main {

    public static void main(String[] args) {
        MacBookPro macBookPro = new MacBookPro();
        System.out.println(macBookPro.getKeyboard().getNAME());
        System.out.println(macBookPro.getMouse().getNAME());

        AcerPredator acerPredator = new AcerPredator();
        System.out.println(acerPredator.getKeyboard().getNAME());
        System.out.println(acerPredator.getMouse().getNAME());
    }

}
