package pro.oop.model.clerk.impls;

import pro.oop.model.clerk.interfaces.IClerk;

/**
 * Created by nastu on 3/11/2017.
 */
public class Clerk implements IClerk{
int id;
int levelOfSeal;
String name;

    public Clerk(int id, int levelOfSeal, String name) {
        this.id = id;
        this.levelOfSeal = levelOfSeal;
        this.name = name;
    }

    public Clerk() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevelOfSeal() {
        return levelOfSeal;
    }

    public void setLevelOfSeal(int levelOfSeal) {
        this.levelOfSeal = levelOfSeal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clerk{" +
                "id=" + id +
                ", levelOfSeal=" + levelOfSeal +
                ", name='" + name + '\'' +
                '}';
    }

    public String getInfo() {
        return this.toString();
    }
}
