package chapters.chapter12;

public enum Apple {

    JONATHAN(10),
    GOLDEN_DEL(5),
    REND_DEL(8),
    WINESAP(15),
    CORTLAND(20);

    private int price;

    Apple(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
