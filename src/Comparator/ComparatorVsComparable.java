package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorVsComparable {
    public static void main(String[] args) {

        Comparator<Students> studentsComparator = new Comparator<Students>() {
            public int compare(Students student1, Students student2) {
                return student1.age < student2.age? -1:1;

            }

            public boolean equals(Students student1, Students student2) {
                return student1.equals(student2);
            }
        };

        List<Students> studentsList = new ArrayList<>();
        studentsList.add(new Students(35, "Harish"));
        studentsList.add(new Students(20, "Shashwath"));
        studentsList.add(new Students(30,"Pooja"));
        studentsList.add(new Students(20,"Shriya"));
        studentsList.add(new Students(16,"Ishaan"));

        System.out.println("******** Sort by Comparator() ");
        Collections.sort(studentsList, studentsComparator);
        for (Students studs : studentsList){
            System.out.println(studs);
        }
        System.out.println("******* Original List after Sort by comparable *******");
        System.out.println(studentsList);

        System.out.println("******** Sort by Comparable() *******");
        Collections.sort(studentsList); //This will not work until Student class implements
//        Comparable which we can see in wrapper class like Integer
        for (Students studs : studentsList){
            System.out.println(studs);
        }
        System.out.println("******* Original List after Sort by comparable *******");
        System.out.println(studentsList);


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
        if (this.age < that.age)
            return 1;
        else
            return -1;
    }
}
