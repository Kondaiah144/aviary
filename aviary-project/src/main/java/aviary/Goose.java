package aviary;

public class Goose extends Bird{
    //Fields
    private boolean isWaterfowl;
    private boolean canFly;

    //Constructors

    public Goose(int age, String gender, String name, boolean isWaterfowl, boolean canFly) {
        super(age, gender, name);
        this.isWaterfowl = isWaterfowl;
        this.canFly = canFly;
    }


    //Getters and Setters

    public boolean isWaterfowl() {
        return isWaterfowl;
    }

    public void setWaterfowl(boolean waterfowl) {
        isWaterfowl = waterfowl;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    //Methods

    //To String


    @Override
    public String toString() {
        return "Goose Name: " + getName() + " Goose Age: " + getAge();
    }
}
