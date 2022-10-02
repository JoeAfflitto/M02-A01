package model.BusinessObjects;

import model.BusinessLists.*;

/**
 * The Business class is meant to be instantiated for each individual business which uses
 * the Food Ordering system and stores its respective data processed by the system.
 */
public class Business {
    private EmployeeList employees;
    private ManagerList managers;
    private ProductList products;

    public Business(){

    }
}
