public class Customer extends Person {
    private String allegience;
    private int happinessLevel;
    private int drunkness;
    private int moneyAmount;
    private String location;

    public Customer(String name,int age,String allegience,int happinessLevel,int drunkness,int moneyAmount) {
        super(name,age);
        this.allegience = allegience;
        this.happinessLevel = happinessLevel;
        this.drunkness = drunkness;
        this.moneyAmount = moneyAmount;
    }
}