package aviary;


import interfaces.ICommunication;

//Class Declaration
public class Bird implements ICommunication {
    //Fields
    private int age;
    private String gender;
    private String name;

    //Constructors

    public Bird(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    //Getters and Setters

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Methods
public boolean isAves(){
        return true;
}

public String swim(){
        return "Even I am bird, still I can swim...lol";
}

public String run(){
        return "I can run as every creature runs in their own way..like ting chick ting chick..:)";
}

public String fly(){
        return "Flying is the best qualification and I enjoy flying!!!";
}
    //ToString
    @Override
    public String toString() {
        return "Bird{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
