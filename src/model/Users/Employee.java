package model.Users;

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

    /**
     *
     * @param n The first and last name of the employee
     * @param ln The username this employee will use to log into the system
     * @param p The employee's password
     */

    public Employee(String n, String ln, String p){
        this.name = n;
        this.logonName = ln;
        this.password = p;
    }
}
