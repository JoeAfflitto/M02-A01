package model;

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

    public EndUser(int id, String dn){
        this.psuID = id;
        this.displayName = dn;
    }
}
