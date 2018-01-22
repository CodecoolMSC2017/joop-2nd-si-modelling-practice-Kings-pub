public class Personnel extends Person {
    private int closeingTime;

    public Personnel(String name,int age,int closeingTime) {
        super(name,age);
        this.closeingTime = closeingTime;
    }
}