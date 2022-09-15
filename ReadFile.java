// Program to display the numbers of characters, lines and words in a text file
import java.io.*;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		int characters = 0;
		int words = 0;
        int lines = 0;
        
        try
        {
	       File file = new File("C:\\Users\\ARSHAD\\readfile.txt");
	       FileInputStream fileInputStream = new FileInputStream(file);
	       InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
	       BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
      
	       String currentLine = bufferedReader.readLine();
	       while (currentLine != null)
	       {
	    	   lines++;
	    	   String[] word = currentLine.split(" ");
	    	   words = words + word.length;
	    	   
	    	   for (String w : word)
	    	   {
	    		   characters = characters + w.length();
	    	   }
	    	   currentLine = bufferedReader.readLine();
	       }
	       System.out.println("Total Characters: "+characters);
	       System.out.println("Total Lines: "+lines);
	       System.out.println("Total Words: "+words);
	       
		}		
        catch(FileNotFoundException e) 
        {
        	System.out.println(e);
        }

	}
}

