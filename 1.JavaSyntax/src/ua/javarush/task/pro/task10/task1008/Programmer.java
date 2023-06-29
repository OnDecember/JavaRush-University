package ua.javarush.task.pro.task10.task1008;

/* 
Зарплата
*/

public class Programmer {
    private int salary = 1000;

    public void setSalary(int salary) {
        this.salary = salary > this.salary ? salary : this.salary;
    }

    public int getSalary() {
        return salary;
    }
}
