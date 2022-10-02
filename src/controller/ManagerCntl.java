package controller;

import model.Users.Manager;
import view.ManagerUI;

/**
 * The ManagerCntl class passes data between related model classes
 * and an instance of the ManagerUI class.
 *
 * @author  Joe Afflitto
 * @version 0.1
 * @since 2022-02-08
 */
public class ManagerCntl {
    private Manager manager;
    private ManagerUI ui;

    /**
     *
     * @param m Points to the instance of Manager class respective of current user
     */
    public ManagerCntl(Manager m){
        this.manager = m;
        this.ui = new ManagerUI(this);
    }
}
