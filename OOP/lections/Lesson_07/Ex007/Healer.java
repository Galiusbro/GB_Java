package Lesson_07.Ex007;

public class Healer extends BaseHero {
    private int mana;
    private int maxMana;

    public Healer() {
        super(String.format("Hero_Healer #%d", ++Healer.number),
                Healer.r.nextInt(75, 150));
        this.maxMana = Magician.r.nextInt(150, 250);
        this.mana = maxMana;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d", super.getInfo(), this.mana);
    }
}
