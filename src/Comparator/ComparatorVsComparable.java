package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorVsComparable {
    public static void main(String[] args) {

        Comparator<Students> studentsComparator = new Comparator<Students>() {
            public int compare(Students student1, Students student2) {
                return student1.age > student2.age? -1:1;

            }
        };

        List<Students> studentsList = new ArrayList<>();
        studentsList.add(new Students(35, "Harish"));
        studentsList.add(new Students(20, "Shashwath"));
        studentsList.add(new Students(30,"Pooja"));
        studentsList.add(new Students(22,"Shriya"));
        studentsList.add(new Students(16,"Ishaan"));

//        Collections.sort(studentsList, studentsComparator);
        Collections.sort(studentsList); //This will not work until Student class implements
//        Comparable which we can see in wrapper class like Intiger
        for (Students studs : studentsList){
            System.out.println(studs);
        }
    }
}

class Students implements Comparable<Students>{
    int age;
    String name;

    public Students(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [Age : "+age+", Name : "+name+"]";
    }

    //compareTo() of Comparable interface is implemented in Student class.
    public int compareTo(Students that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }
}
