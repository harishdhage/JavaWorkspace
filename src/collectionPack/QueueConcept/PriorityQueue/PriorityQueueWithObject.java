package collectionPack.QueueConcept.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueWithObject {
    public static void main(String[] args) {
        EmpComparator empComparator = new EmpComparator();
        PriorityQueue<Employee> pr = new PriorityQueue<Employee>(empComparator);
        pr.add(new Employee("A",200));
        pr.add(new Employee("C",250));
        pr.add(new Employee("B",100));
        pr.add(new Employee("H",500));
        pr.add(new Employee("Y",20));
        pr.add(new Employee("D",200));

        System.out.println(pr.toString());
    }
}

class Employee{
    String name;
    int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "Employee [name : "+name+", salary : "+salary+"]";
    }
}

class EmpComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp2.salary - emp1.salary;
    }
}
