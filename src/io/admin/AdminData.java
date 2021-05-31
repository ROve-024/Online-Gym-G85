package io.admin;
/**
 * <p>
 *     This class is designed to handle data.
 * </p>
 *
 * @author Chuangchao Li
 * @version 3.0
 *
 */
public class AdminData {
    private String AdminID;
    private String Account;
    private String Password;

    /**
     * <p>
     *     This function is designed to get adminID.
     * </p>
     * @return AdminID
     */
    public String getAdminIO() {
        return AdminID;
    }

    /**
     * <p>
     *     This function is designed to set adminID.
     * </p>
     * @param adminID
     */
    public void setAdminID(String adminID) {
        AdminID = adminID;
    }

    /**
     * <p>
     *     This function is designed to get account.
     * </p>
     * @return Account
     */
    public String getAccount() {
        return Account;
    }


    /**
     * <p>
     *     This function is designed to set account.
     * </p>
     * @param account
     */
    public void setAccount(String account) {
        Account = account;
    }


    /**
     * <p>
     *     This function is designed to get password.
     * </p>
     * @return Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * <p>
     *     This function is designed to set password.
     * </p>
     * @param password
     */
    public void setPassword(String password) {
        Password = password;
    }
    public String toString()
    {

        return "----------------------------\n" +
                "CoachID: " + AdminID + "\n" +
                "Account: " + Account + "\n" +
                "Password: " + Password + "\n" +
                "----------------------------\n";

    }
}
