package ua.javarush.task.jdk13.task41.task4109;

import java.util.Date;

public abstract class AbstractEntity {
    public int id;
    public Date createdTime;
    public Date updatedTime;

    public AbstractEntity() {
    }

    public AbstractEntity(AbstractEntity entity) {
        id = entity.id;
        createdTime = entity.createdTime;
        updatedTime = entity.updatedTime;
    }

    public abstract AbstractEntity clone();
}