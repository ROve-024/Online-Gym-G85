import controller.CheckFunction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckTest {

    @Test
    void CorrectEmail(){
        CheckFunction checkFunction = new CheckFunction();
        assertTrue(checkFunction.checkEmail("123@qq.com"));
    }

    @Test
    void wrongEmail(){
        CheckFunction checkFunction = new CheckFunction();
        assertFalse(checkFunction.checkEmail("123"));
        assertFalse(checkFunction.checkEmail("123@"));
        assertFalse(checkFunction.checkEmail("123@ "));
        assertFalse(checkFunction.checkEmail("123@qq"));
        assertFalse(checkFunction.checkEmail("123."));
        assertFalse(checkFunction.checkEmail("123. "));
        assertFalse(checkFunction.checkEmail("123.com"));
        assertFalse(checkFunction.checkEmail("123@."));
        assertFalse(checkFunction.checkEmail("123@. "));
        assertFalse(checkFunction.checkEmail("123@.com"));
        assertFalse(checkFunction.checkEmail("123@ ."));
        assertFalse(checkFunction.checkEmail("123@ . "));
        assertFalse(checkFunction.checkEmail("123@ .com"));
        assertFalse(checkFunction.checkEmail("123@qq."));
        assertFalse(checkFunction.checkEmail("123@qq. "));

        assertFalse(checkFunction.checkEmail("@"));
        assertFalse(checkFunction.checkEmail("@ "));
        assertFalse(checkFunction.checkEmail("@qq"));
        assertFalse(checkFunction.checkEmail("@."));
        assertFalse(checkFunction.checkEmail("@. "));
        assertFalse(checkFunction.checkEmail("@.com"));
        assertFalse(checkFunction.checkEmail("@ ."));
        assertFalse(checkFunction.checkEmail("@ . "));
        assertFalse(checkFunction.checkEmail("@ .com"));
        assertFalse(checkFunction.checkEmail("@qq."));
        assertFalse(checkFunction.checkEmail("@qq. "));
        assertFalse(checkFunction.checkEmail("@qq.com"));
    }

    @Test
    void CorrectDate(){
        CheckFunction checkFunction = new CheckFunction();
        assertTrue(checkFunction.checkDate("2020-11-22 16:01:59"));
    }

    @Test
    void wrongDateInvalidFormat(){
        CheckFunction checkFunction = new CheckFunction();
        assertFalse(checkFunction.checkDate("2020-11-2216:01:59"));
        assertFalse(checkFunction.checkDate("11-22 16:01:59"));
        assertFalse(checkFunction.checkDate("-11-22 16:01:59"));
        assertFalse(checkFunction.checkDate("20-11-22 16:01:59"));
        assertFalse(checkFunction.checkDate("2020-22 16:01:59"));
        assertFalse(checkFunction.checkDate("2020--22 16:01:59"));

        assertFalse(checkFunction.checkDate("202-11-22 16:01:59"));
        assertFalse(checkFunction.checkDate("2020-1-22 16:01:59"));
        assertFalse(checkFunction.checkDate("2020-11-2 16:01:59"));

        assertFalse(checkFunction.checkDate("2020-11-22 0:01:59"));
        assertFalse(checkFunction.checkDate("2020-11-22 16:1:59"));
        assertFalse(checkFunction.checkDate("2020-11-22 16:01:9"));
        assertFalse(checkFunction.checkDate("2020-11-22 1601:59"));
    }

    @Test
    void invalidDate() {
        CheckFunction checkFunction = new CheckFunction();
        assertFalse(checkFunction.checkDate("2020-16-22 16:01:59"));
        assertFalse(checkFunction.checkDate("2020-01-56 16:01:59"));
        assertFalse(checkFunction.checkDate("2020-13-22 25:01:59"));
        assertFalse(checkFunction.checkDate("2020-13-22 16:61:59"));
        assertFalse(checkFunction.checkDate("2020-13-22 16:01:61"));
        assertFalse(checkFunction.checkDate("2020-02-30 16:01:59"));

    }

    @Test
    void CorrectPassword(){
        CheckFunction checkFunction = new CheckFunction();
        assertTrue(checkFunction.checkPassword("123456"));
        assertTrue(checkFunction.checkPassword("abcdef"));
        assertTrue(checkFunction.checkPassword("1234567890"));
        assertTrue(checkFunction.checkPassword("abcdefghij"));
        assertTrue(checkFunction.checkPassword("1a2c58e6"));
        assertTrue(checkFunction.checkPassword("1a2c5^#si"));
        assertTrue(checkFunction.checkPassword("5du%pd):_"));
    }

    @Test
    void wrongLengthPassword(){
        CheckFunction checkFunction = new CheckFunction();
        assertFalse(checkFunction.checkPassword("1"));
        assertFalse(checkFunction.checkPassword("12"));
        assertFalse(checkFunction.checkPassword("123"));
        assertFalse(checkFunction.checkPassword("1234"));
        assertFalse(checkFunction.checkPassword("12345"));
        assertFalse(checkFunction.checkPassword("12345678901"));
        assertFalse(checkFunction.checkPassword("a"));
        assertFalse(checkFunction.checkPassword("ab"));
        assertFalse(checkFunction.checkPassword("abc"));
        assertFalse(checkFunction.checkPassword("abcd"));
        assertFalse(checkFunction.checkPassword("abcde"));
        assertFalse(checkFunction.checkPassword("adgrefdbtuthderg"));
    }

    @Test
    void wrongPasswordContainSpaces(){
        CheckFunction checkFunction = new CheckFunction();
        assertFalse(checkFunction.checkPassword(" "));
        assertFalse(checkFunction.checkPassword(" 1a2c5^#si"));
        assertFalse(checkFunction.checkPassword("1a2c 5^#si"));
        assertFalse(checkFunction.checkPassword("1a2c5^# si"));
        assertFalse(checkFunction.checkPassword("1a2c5^#si "));
    }

}
