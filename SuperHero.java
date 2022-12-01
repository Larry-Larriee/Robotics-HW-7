public class SuperHero {
    
    private int age;
    private String name;
    private String superPower;
    private String weakness;

    public SuperHero(){ // Two constructors, one with no parameters and one with all parameters
        age = 0;
        name = "Your mom";
        superPower = "Your mom";
        weakness = "Your dad";
    }

    public SuperHero(int age, String name, String superPower, String weakness) {
        this.age = age;
        this.name = name;
        this.superPower = superPower;
        this.weakness = weakness;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSuperPower() {
        return superPower;
    }

    public String getWeakness() {
        return weakness;
    }
}
