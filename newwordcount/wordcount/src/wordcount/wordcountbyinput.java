package wordcount;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;



public class wordcountbyinput {
	
	public static void main(String... args) throws IOException {   

	    FileInputStream fstream = new FileInputStream("c://users/phani/Desktop/ashok.txt");
	    DataInputStream in = new DataInputStream(fstream);
	    BufferedReader br = new BufferedReader(new InputStreamReader(in));
	    String strLine;
	    int wordcount = 0;
	    while ((strLine = br.readLine()) != null)   {
	        strLine = strLine.replaceAll("[\t\b]", "");
	        strLine = strLine.replaceAll(" {2,}", " ");
	        if (!strLine.isEmpty()){
	            wordcount = wordcount + strLine.split(" ").length;
	        }
	    }

	    System.out.println(wordcount);
	    in.close();
	}

}
