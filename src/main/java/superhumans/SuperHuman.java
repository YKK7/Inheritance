package superhumans;

public class SuperHuman extends Human{

    private boolean good;
    private String heroName;
    private String superAbility;

    public SuperHuman(String name, int age, String gender, String occupation, String address, boolean good, String heroName, String superAbility) {
        super(name, age, gender, occupation, address);
        this.good = good;
        this.heroName = heroName;
        this.superAbility = superAbility;
    }

    public boolean isGood() {
        return good;
    }

    public void setGood(boolean good) {
        this.good = good;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Good?: " + good + "\nHero Name : " + heroName + "\nSuper Ability : " + superAbility + "\n\n");
    }
}
