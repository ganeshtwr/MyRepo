package code_Optimisation;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
public class ShellCommandExec {

	public static void main(String[] args) {

        String gnomeOpenCommand = "xdg-open /home/ganesh/Documents/MyDoc.pdf";

        try {

            Runtime rt = Runtime.getRuntime();

            Process processObj = rt.exec(gnomeOpenCommand);

            InputStream stdin = processObj.getErrorStream();

            InputStreamReader isr = new InputStreamReader(stdin);

            BufferedReader br = new BufferedReader(isr);

            String myoutput = "";

            while ((myoutput=br.readLine()) != null) {

                myoutput = myoutput+"\n";

            }

            System.out.println(myoutput);

        }

        catch (Exception e) {

            e.printStackTrace();

        }

    }

}
