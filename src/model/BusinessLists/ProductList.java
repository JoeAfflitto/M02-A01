package model.BusinessLists;

import model.BusinessObjects.Product;

import java.util.ArrayList;

/**
 * Contains an ArrayList of Product objects
 * TODO: Implement respective manipulation functions
 */

public class ProductList {
    private ArrayList<Product> productArrayList;

    /**
     * Default constructor
     */
    public ProductList(){
        this.productArrayList = new ArrayList<Product>();
    }
}
