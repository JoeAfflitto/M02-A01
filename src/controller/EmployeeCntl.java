package controller;

import model.Users.Employee;
import view.OperationsUI;

/**
 * The EmployeeCntl class passes data between related model classes
 * and an instance of the OperationsUI class.
 *
 * @author  Joe Afflitto
 * @version 0.1
 * @since 2022-02-08
 */
public class EmployeeCntl {
    private Employee employee;
    private OperationsUI ui;

    /**
     *
     * @param e Points to instance of current employee
     */
    public EmployeeCntl(Employee e){
        this.employee = e;
        this.ui = new OperationsUI(this);
    }

    

}
