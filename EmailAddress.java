import org.junit.Assert;
import org.junit.Test;
import java.util.regex.Pattern;

public class EmailAddress {
    @Test
    public void Email_IfWrong_Return_False() {
        EmailValidation userValidater = new EmailValidation();
        boolean result = userValidater.Emailvalidate("Kumar@.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void Email_IfCorrect_Return_True() {
        EmailValidation emailValidation = new EmailValidation();
        boolean result = emailValidation.Emailvalidate("abc.xyz@bl.co.in");
        Assert.assertEquals(true, result);
    }

    class EmailValidation {
        public static  String Email = "[abc]{3}.[a-z]{3}+@[bl]{2}." +
                                            "[co]{2}.[a-z]{2}+";

        public boolean Emailvalidate(String Email) {
            Pattern p = Pattern.compile(Email);
            return p.matcher(Email).matches();
        }
    }
}
