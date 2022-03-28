package aviary;


public class Eagle extends Bird {
    //Fields
    private static final String BEAKCOLOR = "Brown";

    //Override
    //Constructors

    public Eagle(int age, String gender, String name) {
        super(age, gender, name);

    }


    //Methods
public String scream(){
        return "I am screaming";
}

public String highFlyer(){
        return "I can fly higher altitudes";
}

public String greatVision(){
        return "I can see every small creature from sky";
}


    //Override Methods

    //To Strings

    @Override
    public String toString() {
        return "The Bird name is " + getName() +
                " Age: " + getAge() +
                "color is: " + BEAKCOLOR;
    }
}
