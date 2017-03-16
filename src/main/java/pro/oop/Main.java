package pro.oop;

import pro.oop.model.journal.impls.IJournal;
import pro.oop.model.journal.interfaces.Journal;

/**
 * Created by nastu on 3/11/2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        IJournal journal = new Journal();
        journal.getInfo();

    }
}
