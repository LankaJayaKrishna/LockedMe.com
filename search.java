package search;
import java.io.File;
import java.util.Scanner;

public class search {
	static String path="C:\\LockedMe";
	public static void main4(String[] args) {
     File f=new File(path);
	 Scanner sc4=new Scanner(System.in);
	 System.out.println("enter the file to search");
	 String filenameserach=sc4.next();
	 File filename[]=f.listFiles();
	 int flag=0;
     for(File ff:filename) {
		 if(ff.getName().equals(filenameserach)){
			 flag=1;
			 break;
		 }
		 else {
		 flag=0; 
		 }
		 
	 }
	 if(flag==1) {
		 System.out.println("File is available");
	 }
	 else {
		 System.out.println("File is not available");
	 }
	 }	 
}
