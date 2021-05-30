package controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckFunction {
    public boolean checkEmail(String email){
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9]+)+"; // (Note: \ is an escape character）

        boolean flag = email.matches(regex);
        return flag;
    }

    public boolean checkDate(String Date){
        return isLegalDate(Date,"yyyy-MM-dd HH:mm:ss");
    }

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

    private boolean wrongLength(String password){
        int length = password.length();
        if(6<=length && length <=10){
            return false;
        }
        else{
            return true;
        }
    }

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