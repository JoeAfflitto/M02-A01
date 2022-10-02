package controller;

import model.EndUser;
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

    public UserCntl(OrderingUI oUI, EndUser u){
        this.ui = oUI;
        this.user = u;
    }
}
