package aviary;

public class Penguin extends Bird{
    //Fields
    private int sizeInFeet;
    private boolean canEatFish;
    private boolean canFly;

    //Constructor

    public Penguin(int age, String gender, String name, int sizeInFeet, boolean canEatFish, boolean canFly) {
        super(age, gender, name);
        this.sizeInFeet = sizeInFeet;
        this.canEatFish = canEatFish;
        this.canFly = canFly;
    }

    //Getters and Setters

    public int getSizeInFeet() {
        return sizeInFeet;
    }

    public void setSizeInFeet(int sizeInFeet) {
        this.sizeInFeet = sizeInFeet;
    }

    public boolean isCanEatFish() {
        return canEatFish;
    }

    public void setCanEatFish(boolean canEatFish) {
        this.canEatFish = canEatFish;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    //Methods
    public String swim(){
        return "I can SWIM and can get deeper in water to catch fish!!";
    }

    public String run(){
        return "I am slow runner";
    }

    public String hipernate(){
        return "I can hipernate during winter";
    }
    //To Strings

@Override
    public String toString(){
        return "Penguin name: " + getName() + " Penguin Age: " + getAge();
}
}

