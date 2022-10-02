package view;

import controller.UserCntl;

/**
 * The OrderingUI class is an interface used to perform
 * the intended functionality of the Food Ordering system by end-users.
 *
 * @author  Joe Afflitto
 * @version 0.1
 * @since 2022-02-08
 */
public class OrderingUI {
    private UserCntl controller;

    /**
     * Main constructor.
     * @param ctl Stores pointer to controller which instantiated this class
     */
    public OrderingUI(UserCntl ctl){
        this.controller = ctl;
    }
}
