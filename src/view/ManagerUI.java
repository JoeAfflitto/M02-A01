package view;

import controller.ManagerCntl;

/**
 * The ManagerUI class provides a view providing business management
 * capability to a properly authorized Manager-user.
 *
 * @author  Joe Afflitto
 * @version 0.1
 * @since 2022-02-08
 */
public class ManagerUI {
    ManagerCntl controller;

    /**
     * Main constructor.
     * @param ctl Stores pointer to controller which instantiated this class
     */
    public ManagerUI(ManagerCntl ctl){
        this.controller = ctl;
    }
}
