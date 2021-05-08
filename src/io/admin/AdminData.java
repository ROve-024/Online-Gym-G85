package io.admin;

public class AdminData {
    private String AdminID;
    private String Account;
    private String Password;

    public String getAdminIO() {
        return AdminID;
    }

    public void setAdminID(String adminID) {
        AdminID = adminID;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
    }

    public String getPassword() {
        return Password;
    }

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
