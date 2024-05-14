package p1;
import java.io.*;

public class H {
	public static void main(String[] args) {
		System.out.println("Omkar Biradar");
		
		// A new directory is created 
		
		/*File f = new  File("C:\\My_Personal_Space\\Tech Notes\\New Folder");
		boolean val = f.mkdir();
		System.out.println(val);*/
		
		
		
		//Creating a new file A and checking its properties.
		
		/*
	 	File f = new File("C:\\My_Personal_Space\\Tech Notes\\New Folder\\A.txt");
		
		System.out.println("File is present: " +f.exists());
		System.out.println("Length of file : "+f.length());
		System.out.println("Can we read file : "+f.canRead());
		System.out.println("Can we write to file : "+f.canWrite());
		System.out.println("Path of the file : "+f.getAbsolutePath());
		System.out.println("Name of the file : "+f.getName());
		System.out.println("List : "+f.list());
		
		*/
		
		
		
		
		// A new file is created using createNewFile().
		
	/*	
	 File f = new File("C:\\My_Personal_Space\\Tech Notes\\New Folder\\B.txt");
		try {
			
		System.out.println("File created : "+f.createNewFile());
		
		}catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	*/
		
		
		
		//Getting list of files present in an directory 
	/*
		File f = new File("C:\\My_Personal_Space\\Tech Notes\\New Folder");
		String [] str = f.list();
		
		for(String name :str)
		{
		System.out.println(name);
		}
	*/
		
		
		
		
		//Reading data from a file using FileWriter class.
		
		/*try {
			
			FileReader fr = new FileReader("C:\\My_Personal_Space\\Tech Notes\\New Folder\\A.txt");
			for(int i=0;i<15;i++)
			{
				System.out.print((char)(fr.read()));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
		
		
		
		//Reading file data using length() and FileReader class.
		
		/*File f = new File("C:\\My_Personal_Space\\Tech Notes\\New Folder\\A.txt");
		try {
			
			FileReader fr = new FileReader("C:\\My_Personal_Space\\Tech Notes\\New Folder\\A.txt");
			for(int i=0;i<f.length();i++)
			{
				System.out.print((char)(fr.read()));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		*/
		
		
		
		// Writing data to the files using FileWriter Class
				
		try {
			
		FileWriter fw = new FileWriter("C:\\My_Personal_Space\\Tech Notes\\New Folder\\B.txt",true);
		
		// Used to improve the performance.
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		//different ways to write in a file
		
		bw.write(".....Myself Omkar Biradar.....");
		bw.newLine();
		bw.write(97);
		bw.newLine();
		
		char [] ch = {'o','m','k','a','r'};
		bw.write(ch);
		bw.flush();
		fw.flush();
		bw.close();
		fw.close();
		
		
		
		System.out.println("Written Successfully");
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
				
		
		
	}

}
