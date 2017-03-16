package pro.oop.model.journal.interfaces;

import pro.oop.model.book.impls.Book;
import pro.oop.model.book.impls.StudentsBook;
import pro.oop.model.book.interfaces.IBook;
import pro.oop.model.clerk.impls.Clerk;
import pro.oop.model.clerk.interfaces.IClerk;
import pro.oop.model.client.impls.LibСlient;
import pro.oop.model.client.interfaces.IClient;
import pro.oop.model.journal.impls.IJournal;
import pro.oop.model.metering.impls.Metering;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by nastu on 3/12/2017.
 */
public class Journal implements IJournal {
    List<Metering> journal = new ArrayList<Metering>();

    public Journal(List<Metering> journal) {
        this.journal = journal;
    }

    public Journal() {
        /*this.init();
        Metering record3 = null;
        this.journal.add(record3);*/

        IBook javaManual = new StudentsBook(1,120,
                "J.Smith", 120311, "one",
                "Fiction", "for students", "java");

        IBook newIsland = new Book(2,200,
                "A.Smith", 120311, "two",
                "Travel books", "for students", "newIsland");

        IBook aboutUniverse = new Book(3,300,
                "S.Hockings", 0304, "three",
                "Non-fiction", "for students","Universe");


        IClient vasia = new LibСlient(1, "student", "vasia",
                true);
        IClient vania = new LibСlient(2, "student", "vania", false);


        IClerk bibliotekar = new Clerk (1,2,"ivan");
        IClerk director = new Clerk(2, 3, "doesn't matter");

        Metering record1 = new Metering (1, javaManual, vasia, bibliotekar,
                true, new Date());
        Metering record2 = new Metering (2, newIsland , vania, bibliotekar,
                true, new Date());

        this.journal.add(record1);
        this.journal.add(record2);




    }

    public List<Metering> getJournal() {
        return journal;
    }

    public void setJournal(List<Metering> journal) {
        this.journal = journal;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "journal=" + journal +
                '}';
    }

    public void getInfo() {
        for (Metering metering : journal){
            System.out.println(metering.getBook().getInfo());
        }
    }

   /* private void init()

    {



     IBook javaManual = new StudentsBook(1,120,
            "J.Smith", 120311, "one",
            "Fiction", "for students");

    IBook newIsland = new Book(2,200,
            "A.Smith", 120311, "two",
            "Travel books", "for students");

    IBook aboutUniverse = new Book(3,300,
            "S.Hockings", 0304, "three",
            "Non-fiction", "for students");


    IClerk bibliotekar = new Clerk (1,2,"ivan");

    IClerk director = new Clerk(2, 3, "doesn't matter");

    IClient vasia = new LibСlient(1, "student", "vasia", true);
    IClient vania = new LibСlient(2, "student", "vania", false);

    Date date = new Date();

    Metering record1 = new Metering (1, javaManual, vasia, bibliotekar,
            true, date);
    Metering record2 = new Metering (2, newIsland , vania, bibliotekar,
            true, date);

    this.journal.add(record1);










    }*/
    }
