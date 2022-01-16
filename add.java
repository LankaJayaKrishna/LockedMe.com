package add;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import menu.menu;

public class add {
public static void main2(String[] args) throws IOException {
         String path="C:\\LockedMe\\";
	   	 Scanner sc2=new Scanner(System.in);	 
 	   	 System.out.println("enter the file name to be created");
	   	 String filename=path+sc2.next();
	   	 File f=new File(filename);
	   	 boolean result=f.createNewFile();
	   	 if(result==false) {
	   		 System.out.println("file is not created");
	   	 }
	   	 else {
	   		 System.out.println("file is created at : "+filename);
   	 }
	   
 }

}