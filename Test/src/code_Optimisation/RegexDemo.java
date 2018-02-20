package code_Optimisation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 

public class RegexDemo {

//    private static String pattern =  "^[_A-Za-z--]+(\\.[_A-Za-z--]+)*@[A-Za-z-]+(\\.[A-Za-z-]+)*(\\.[A-Za-z]{,})$";

//    private static String pattern =  "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
   
	  private static String pattern =  "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";

    
    
    private static Pattern mypattern = Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);

    public static void main( String args[] ){

        String valEmail = "testemail@domain.com";

        String invalEmail = "....@domain.com";

        String invalEmail2 = ".$$%%@domain.com";

        String valEmail2 = "test.email@domain.com";

        System.out.println("Is Email ID valid? "+validateEMailID(valEmail));

        System.out.println("Is Email ID invalid? "+validateEMailID(invalEmail));

        System.out.println("Is Email ID invalid? "+validateEMailID(invalEmail2));

        System.out.println("Is Email ID valid? "+validateEMailID(valEmail2));

    }

    public static boolean validateEMailID(String emailID) {

        Matcher mtch = mypattern.matcher(emailID);

        if(mtch.matches()){
            return true;
        }

        return false;
    }  

}
