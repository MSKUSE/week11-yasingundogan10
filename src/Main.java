import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    public static void main(String[] args)  throws MyEmptyStackException{

    Stack stack = new StackArray();

    try {
        stack.pop();
    }catch (Exception e){

        System.out.println(e);
    }


/*
    ArrayList<String> stringList = new ArrayList<>();
    stringList.add("String");
    stringList.add("Yasin");
    System.out.println(stringList);
    HashMap< String, Double > grades = new HashMap();
    grades.put("Yasin", 10.0);
    grades.put("Mustafa" , 20.0);
    grades.put("Emre" , 30.0);
    System.out.println(grades);
    grades.put("Yasin" , 40.0);
    System.out.println(grades);
*/





    }
}
