package model.BusinessObjects;

/**
 * Acts as datatype to store information about a given product
 */
public class Product {
    private String title;
    private String desc;
    private double price;

    /**
     *
     * @param t Product title
     * @param d Product description
     * @param p Listing price
     */
    public Product(String t, String d, double p){
        this.title = t;
        this.desc = d;
        this.price = p;
    }

}
