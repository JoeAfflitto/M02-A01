package controller;

import model.BusinessObjects.Manager;
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

    public ManagerCntl(Manager m, ManagerUI mUI){
        this.manager = m;
        this.ui = mUI;
    }
}
