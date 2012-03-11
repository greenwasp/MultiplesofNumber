import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class MultiplesOfNumber {
	private String fName;
	private int x;
	private int n;
	
	
	MultiplesOfNumber(){
		
	}
	private void SetFileName(String name){
		fName = name;
	}
	private BufferedReader readFromFile(){
		BufferedReader br=null;
		try
		{
			FileReader fReader = new FileReader(fName);//this.fileName contains the name of file passed as command line argument
			br = new BufferedReader(fReader);
		}
		catch(FileNotFoundException ex){
			System.out.println("File " + fName + " not Found. Program will exit.");
			System.out.println("Execute again and provide proper file name with entire path.");
			System.exit(0);
			return null;
		}
	    return br;
	}
	private void SetParameters(){
		String line = null;
		BufferedReader bReader = readFromFile();
		
		try{
			while((line = bReader.readLine()) != null){
				StringTokenizer st = new StringTokenizer(line,",");
				x = Integer.parseInt(st.nextToken()) ;
				n = Integer.parseInt(st.nextToken());
				ProcessOutput();
				System.out.println();
				
			}
		}
		catch (IOException ex) {
			System.out.println("IO Exception");
			System.exit(0);
			
		}
		
	
	}
	private void ProcessOutput(){
		while (n < x){
			n=n+n;
			
		}
		System.out.print(n);
	}
	
	public static void main(String[] args){
		MultiplesOfNumber mn = new MultiplesOfNumber();
		
		String fileName = null;
		
		//fileName = "E:\\Eclipse workspace\\MultiplesOfNumber\\src\\in3.txt";
		fileName = args[0];
		mn.SetFileName(fileName);
		
		mn.SetParameters();
		System.exit(0);
		
	}

}
