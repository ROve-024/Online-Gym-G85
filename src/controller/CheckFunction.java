package controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 *     This class is designed to check the data.
 * </p>
 *
 * @author Dayou Yang
 * @version 3.0
 *
 */
public class CheckFunction {

    /**
     * <p>
     *     This function is designed to check the email.
     * </p>
     * @param email
     * @return whether the email is ok.
     */
    public static boolean checkEmail(String email){
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9]+)+"; // (Note: \ is an escape character）

        boolean flag = email.matches(regex);
        return flag;
    }
    /**
     * <p>
     *     This function is designed to check the date.
     * </p>
     * @param Date
     * @return whether the date is ok.
     */
    public boolean checkDate(String Date){
        return isLegalDate(Date,"yyyy-MM-dd HH:mm:ss");
    }
    /**
     * <p>
     *     This function is designed to check the password.
     * </p>
     * @param password
     * @return whether the password is ok.
     */
    public boolean checkPassword(String password){
        if(wrongLength(password)){
            return false;
        }
        else if(wrongLetter(password)){
            return false;
        }
        else{
            return true;
        }
    }
    /**
     * <p>
     *     This function is designed to check the date.
     * </p>
     * @param sDate,format.
     * @return whether the date is ok.
     */
    public static boolean isLegalDate(String sDate,String format) {
        if ((sDate == null)) {
            return false;
        }
        DateFormat formatter = new SimpleDateFormat(format);
        try {
            Date date = formatter.parse(sDate);
            return sDate.equals(formatter.format(date));
        } catch (Exception e) {
            return false;
        }
    }
    /**
     * <p>
     *     This function is designed to check the length of password.
     * </p>
     * @param password
     * @return whether the password is ok.
     */
    private boolean wrongLength(String password){
        int length = password.length();
        if(6<=length && length <=10){
            return false;
        }
        else{
            return true;
        }
    }
    /**
     * <p>
     *     This function is designed to check the letter of password.
     * </p>
     * @param password
     * @return whether the password is ok.
     */
    private boolean wrongLetter(String password){
        boolean ifWrong = false;
        int letter = 0;
        int digit = 0;

        for(int i=0;i<password.length();i++){
            if(Character.isDigit(password.charAt(i))){
                digit++;
            }
            else{
                int temp = (int)password.charAt(i);
                if((65<=temp && temp<=90) || (97<=temp && temp<=122)){
                    letter++;
                }
            }
        }

        if(letter == 0 || digit == 0 || letter+digit!=password.length()){
            ifWrong = true;
        }

        return ifWrong;
    }
}