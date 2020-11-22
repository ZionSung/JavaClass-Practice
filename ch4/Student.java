// Get Set Practice
/*
-------------------
Get Set的練習(1)
-------------------
請定義一個Class, 要求如下：
Class名稱為Student
Class為public class

擁有數個私有屬性:
  (1) 年級屬性，類型為int，屬性名稱為grade
  (2) 姓名屬性，類型為String，屬性名稱為name

Student擁有公開Constructor:
(1) 擁有一個無須任何參數的Constructor，此Constructor為公開的
      該Constructor的功能將grade設為1，name設為"NoName"
    
(2) 擁有一個需要2個參數的Constructor，參數依序為int, String，分別代表年級和姓名的初始值，此Constructor為公開的
      該Constructor的功能使將屬性grade, name初始化為輸入的年級和姓名

Student擁有公開的method:
(1) 擁有一個可回傳grade值的method，此method為公開的，method名稱為getGrade，該method沒有輸入參數，可回傳int類型的grade值

(2) 擁有一個可設定grade值的method，此method為公開的，method名稱為setGrade，該method需要一個int類型的參數，可回傳boolean類型的值，代表是否設定成功

(3) 擁有一個可回傳名字值的method，此method為公開的，method名稱為getName，該method沒有輸入參數，可回傳String類型的name值

(4) 擁有一個可設定name值的method，此method為公開的，method名稱為setName，該method需要一個String類型的參數，可回傳boolean類型的值，代表是否設定成功

P.S.因為評分需求，請在輸出答案時加上"student1 use getGrade and setGrade, student2 use getName and setName"及空行

*/
import java.util.*;

public class Student{

    private String name;
    private int grade;

    public Student(){
        setGrade(1);
        setName("NoName");
    }

    public Student( int grade2 , String name2 ){
        grade = grade2;
        name = name2;
    }

    public int getGrade(){
        return grade;
    }

    public boolean setGrade( int grade3 ){
        grade = grade3;
        return true;
    }

    public String getName(){
        return name;
    }

    public boolean setName( String name3 ){
        name = name3;
        return true;
    }

    //System.out.println("student1 use getGrade and setGrade, student2 use getName and setName");
}