package ua.javarush.task.jdk13.task41.task4122;

/* 
Memento mori
*/

public class Solution {

    public static void main(String[] args) {
        Notepad notepad = new Notepad(new TextWindow());
        notepad.write("Шаблон проектування Хранитель.\n");
        notepad.write("Як його застосовувати в Java?\n");
        notepad.save();

        notepad.write("Візьміть 300г борошна, 0.5л молока та 2 яйця...\n");

        notepad.undo();

        System.out.println(notepad.print());
    }
}
