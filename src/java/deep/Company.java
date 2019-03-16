package deep;

import java.io.*;
import java.io.Serializable;

public class Company implements Serializable {
    private String id;
    private String name;
    private String address;
    private Invoice invoice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public Company clone() throws CloneNotSupportedException {
        Company o = null;
        try {
            o = deepclone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }

    public Company deepclone() throws Exception{
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        Company copy = (Company) ois.readObject();
        return copy;
    }

}
