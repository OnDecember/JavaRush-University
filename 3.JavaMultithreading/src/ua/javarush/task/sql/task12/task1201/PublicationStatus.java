package ua.javarush.task.sql.task12.task1201;

/* 
Створюємо Entity з класу
*/

public enum PublicationStatus {
    LENT,
    DUE,
    LEND_OVERDUE,
    AVAILABLE,
    LOST,
    LOST_AND_PAID,
    DAMAGED,
    DO_NOT_LEND
}
