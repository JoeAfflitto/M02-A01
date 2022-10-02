package model.Users;

/**
 * The EndUser class stores information about the current user of the online service
 * necessary for proper system functionality.
 *
 * @author  Joe Afflitto
 * @version 0.1
 * @since 2022-02-08
 */
public class EndUser {
    private int psuID;
    private String displayName;

    /**
     *
     * @param id the user's PSU ID, for connecting to PSU Single Sign On service.
     * @param dn The user's preferred display name.
     */
    public EndUser(int id, String dn){
        this.psuID = id;
        this.displayName = dn;
    }
}
