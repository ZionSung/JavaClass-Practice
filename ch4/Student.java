public class Student{

    public int age;
    public int grade;
    public String name;
    public String id;

    public Student(){
        age = 20;
        grade = 1;
        name = "NoName";
        id = "ACS001";
    }

    public Student( int age ){
        this.age = age;
        grade = 1;
        name = "NoName";
        id = "ACS001";
    }

    public Student(  String name ){
        this.name = name;
        age = 20;
        grade = 1;
        id = "ACS001";
    }

    public Student( int age, int grade, String name, String id ){
        this.age = age;
        this.grade = grade;
        this.name = name;
        this.id = id;
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