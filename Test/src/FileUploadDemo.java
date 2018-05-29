import java.io.BufferedReader;
import java.io.FileReader;

public class FileUploadDemo {

	public static void main(String[] args) throws Exception {

		//File file=new File("/home/ganesh/logger.log");
		
		
		// Scanner sc=new Scanner(System.in);

		FileReader fr=new FileReader("/home/ganesh/logger.log");
			
		BufferedReader br=new BufferedReader(fr);
			
		String text="";
		
//		// It keeps reading line after line from given stream.
//		// when file does not have content it contains null 
//		String line=br.readLine();
//		
//		while(line!=null){
//			
//			// Read first line, add text with it and add new line
//			text+=line+"\n";
//			
//			// next line
//			line=br.readLine();
//		}
//			
//		System.out.println(text);	
		
		
		while(br.readLine()!=null){
			text+=br.readLine()+"\n";
		}
		System.out.println(text);
		
	}

}
