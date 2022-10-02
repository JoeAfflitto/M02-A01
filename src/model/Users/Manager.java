package model.Users;

/**
 * The Manager class stores data respective of each  manager of a given business
 * and is used by the ManagerCntl class for authorization.
 *
 * @author  Joe Afflitto
 * @version 0.1
 * @since 2022-02-08
 */

public class Manager {
    private String name;
    private String logonName;
    private String password;

    /**
     *
     * @param n Managers name
     * @param ln Managers username for system logon
     * @param pass Managers password
     */
    public Manager(String n, String ln, String pass){
        this.name = n;
        this.logonName = ln;
        this.password = pass;
    }
}
