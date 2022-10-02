package controller;

import model.Users.EndUser;
import view.OrderingUI;

/**
 * The UserCntl class passes data between related model classes
 * and an instance of the OrderingUI class.
 *
 * @author  Joe Afflitto
 * @version 0.1
 * @since 2022-02-08
 */
public class UserCntl {
    private OrderingUI ui;
    private EndUser user;

    /**
     *
     * @param u EndUser object containing current users' data
     */
    public UserCntl(EndUser u){
        this.ui = new OrderingUI(this);
        this.user = u;
    }
}
