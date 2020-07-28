public class Produts {
    private int id;
    private String name;
    private String nsx;
    private int price;

    public Produts(int id, String name, String nsx, int price) {
        this.id = id;
        this.name = name;
        this.nsx = nsx;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + this.id
                +" Name: " + this.name
                +" NSX: " + this.nsx
                +" Price: " + this.price;
    }
}
