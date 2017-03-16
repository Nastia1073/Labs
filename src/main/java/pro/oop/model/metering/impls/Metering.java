package pro.oop.model.metering.impls;

import pro.oop.model.book.interfaces.IBook;
import pro.oop.model.clerk.interfaces.IClerk;
import pro.oop.model.client.interfaces.IClient;
import pro.oop.model.metering.interfaces.IMetering;

import java.util.Date;

/**
 * Created by nastu on 3/11/2017.
 */
public class Metering implements IMetering {
   int id;
   IBook book;
   IClient client;
   IClerk clerk;
   boolean giveAway;//книга выдана
     Date date;//дата транзакция

    public Metering(int id, IBook book, IClient client, IClerk clerk, boolean giveAway, Date date) {
        this.id = id;
        this.book = book;
        this.client = client;
        this.clerk = clerk;
        this.giveAway = giveAway;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IBook getBook() {
        return book;
    }

    public void setBook(IBook book) {
        this.book = book;
    }

    public IClient getClient() {
        return client;
    }

    public void setClient(IClient client) {
        this.client = client;
    }

    public IClerk getClerk() {
        return clerk;
    }

    public void setClerk(IClerk clerk) {
        this.clerk = clerk;
    }

    public boolean isGiveAway() {
        return giveAway;
    }

    public void setGiveAway(boolean giveAway) {
        this.giveAway = giveAway;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Metering{" +
                "id=" + id +
                ", book=" + book.getInfo() +
                ", client=" + client.getInfo() +
                ", clerk=" + clerk.getInfo() +
                ", giveAway=" + giveAway +
                ", date=" + date +
                '}';
    }

    public String getInfo() {
        return this.toString();
    }
}
