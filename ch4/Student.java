public class Student{

    private int age;
    private int grade;
    private String name;

    public Student(){
        age = 20;
        grade = 1;
        name = "NoName";
    }

    public Student( int age, int grade, String name ){
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

    public Student( int grade2 , String name2 ){
        grade = grade2;
        name = name2;
    }

    public int getAge(){
        return age;
    }

    public boolean setAge( int age ){
        this.age = age;
        return true;
    }

    public int getGrade(){
        return grade;
    }

    public boolean setGrade( int grade ){
        this.grade = grade;
        return true;
    }

    public String getName(){
        return name;
    }

    public boolean setName( String name ){
        this.name = name;
        return true;
    }

    public boolean setStudent(){
        age = 20;
        grade = 1;
        name = "NoName";
        return true;
    }

    public boolean setStudent( int grade ){
        age = 20;
        this.grade = grade;
        name = "NoName";
        return true;
    }

    public boolean setStudent( int age, int grade, String name ){
        this.age = age;
        this.grade = grade;
        this.name = name;
        return true;
    }


}