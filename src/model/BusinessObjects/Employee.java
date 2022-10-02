package model.BusinessObjects;

/**
 * The Employee class stores data respective of each individual employee of a given business
 * who uses the service.
 *
 * @author  Joe Afflitto
 * @version 0.1
 * @since 2022-02-08
 */
public class Employee {
    private String name;
    private String logonName;
    private String password;

    public Employee(String n, String ln, String p){
        this.name = n;
        this.logonName = ln;
        this.password = p;
    }
}
