package model.BusinessObjects;

import model.BusinessLists.*;

/**
 * The Business class is meant to be instantiated for each individual business which uses
 * the Food Ordering system and stores its respective data processed by the system.
 */
public class Business {
    private String businessName;
    private EmployeeList employees;
    private ManagerList managers;
    private ProductList products;

    /**
     * Defualt constructor
     * @param name Display name of the business
     */
    public Business(String name){
        employees = new EmployeeList();
        managers = new ManagerList();
        products = new ProductList();
        this.businessName = name;
    }

}
