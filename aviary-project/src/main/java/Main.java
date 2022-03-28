import aviary.Bird;
import aviary.Eagle;
import aviary.Goose;
import aviary.Penguin;


public class Main {
    public static void main(String[] args) {

    //Object 1
        Eagle Eagle1 = new Eagle(2, "Female", "Sameli");
        System.out.println(Eagle1);

    //Object 2
        Eagle Eagle2 = new Eagle(3, "Male", "Motto Samela");
        System.out.println(Eagle2);

    //Object 3
        Penguin Penguin1 = new Penguin(5, "Male","Ravi", 3, true, false);
        System.out.println(Penguin1);
    //Object 4
        Penguin Penguin2 = new Penguin(6, "Female","Sandya", 4, true, false);
        System.out.println(Penguin2);
    //Object 5
        Goose Goose1 = new Goose(3, "Male", "Dav", true, true);
        Goose1.setAge(6);
        Goose1.setGender("Male");
        Goose1.setName("Barnie");
        Goose1.setCanFly(true);
        Goose1.setWaterfowl(true);
        System.out.println("Goose1 Name is: " + Goose1.getName() + ", Age: " +
                Goose1.getAge() + " Gender " + Goose1.getGender() + " and is Waterfowl Bird" + ", also can Fly");
        System.out.println(Goose1);

    //Object 6
        Goose Goose2 = new Goose(4, "Female", "Cecie", true, true );
        Goose2.setAge(5);
        Goose2.setGender("Female");
        Goose2.setName("Susan");
        Goose2.setCanFly(true);
        Goose2.setWaterfowl(true);
        System.out.println("Goose2 Name is: " + Goose2.getName() + ", Age: " +
                Goose2.getAge() + " Gender " + Goose2.getGender() + " and is Waterfowl Bird " + ", also can Fly");
        System.out.println(Goose2);
    }
}
