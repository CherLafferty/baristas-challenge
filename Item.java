
public class Item {

    // MEMBER VARIABLES
    private String name;
    private Double price;

    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    // GETTERS
    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price){
        this.price = price;
    }


}