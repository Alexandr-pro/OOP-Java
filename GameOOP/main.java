import Units.Crossbowman;
import Units.Monk;
import Units.Peasant;
import Units.Sniper;
import Units.Spearman;
import Units.Thief;
import Units.Wizard;

public class main {
    public static void main(String[] args) {
        Peasant peasant = new Peasant("Федя");
        Thief thief = new Thief("Ваня");
        Sniper sniper = new Sniper("Валера");
        Spearman spearman = new Spearman("Антон");
        Crossbowman crossbowman = new Crossbowman("Колян");
        Monk monk = new Monk("Юрец");
        Wizard wizard = new Wizard("Илья");
        System.out.println(peasant);
        System.out.println(thief);
        System.out.println(sniper);
        System.out.println(spearman);
        System.out.println(crossbowman);
        System.out.println(monk);
        System.out.println(wizard);
    }
}
