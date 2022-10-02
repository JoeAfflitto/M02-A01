package view;

import controller.EmployeeCntl;

/**
 * The OperationsUI class takes live operations data and
 * outputs it in a fashion optimized for order fulfillment operations.
 *
 * @author  Joe Afflitto
 * @version 0.1
 * @since 2022-02-08
 */
public class OperationsUI {
    EmployeeCntl controller;

    /**
     * Main constructor.
     * @param ctl Stores pointer to controller which instantiated this class
     */
    public OperationsUI(EmployeeCntl ctl){
        this.controller = ctl;
    }
}
