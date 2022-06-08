package exercise_01;

public class Student {

    // Student details
    private int studentNo;
    private String name;
    private int age;

    // Address
    private int streetNo;
    private String streetName;
    private String city;
    private String state;

    Student(int studentNo, String name, int age, int streetNo, String streetName, String city, String state) {
        this.studentNo = studentNo;
        this.name = name;
        this.age = age;
        this.streetNo = streetNo;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
    }

}
