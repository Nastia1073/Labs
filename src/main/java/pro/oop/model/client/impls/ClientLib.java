package pro.oop.model.client.impls;

import pro.oop.model.client.interfaces.IClient;

/**
 * Created by nastu on 3/11/2017.
 */
public class ClientLib implements IClient {
    int id;
    String status;
    String name;
    Boolean creditor;

    public ClientLib(int id, String status, String name, Boolean creditor) {
        this.id = id;
        this.status = status;
        this.name = name;
        this.creditor = creditor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCreditor() {
        return creditor;
    }

    public void setCreditor(Boolean creditor) {
        this.creditor = creditor;
    }

    @Override
    public String toString() {
        return "ClientLib{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", name='" + name + '\'' +
                ", creditor=" + creditor +
                '}';
    }

    public String getInfo() {
        return this.toString();
    }
}
