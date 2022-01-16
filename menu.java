package menu;
import java.io.File;
import java.io.IOException;

import java.util.Scanner;
import businessLevelOperations.operations;

public class menu {
	   public static void main(String[] args) throws IOException {
		   System.out.println("\n**************************************\n");
	       System.out.println("\tWelcome to LockedMe.com");
	       System.out.println("    Developed by Lanka Jaya Krishna");
	       System.out.println("    Email:lanka.krishna@mphasis.com\n");
	       System.out.println("**************************************\n");
	       String path="C:\\";
	       String filename0=path+"LockedMe\\";
		   File f0=new File(filename0);
		   f0.mkdir();
		   Scanner sc=new Scanner(System.in);
		   while(true) {
			    System.out.println("\t\tMENU");
			   	System.out.println("1.File List\n2.Business level Operations\n3.Close");
			   	int choice=sc.nextInt();
			   	String path1 ="C:\\LockedMe\\";
			   	switch(choice) {
			   	case 1:
			   	File f=new File(path1);
			   	File filename[]=f.listFiles();
			   	System.out.println("The list of files:");
			   	for(File ff:filename) { 
			   		 System.out.println(ff.getName());
			   	 }
			   		 break;
			   	case 2:
			   		 operations op = new operations();
			   	     op.main1(null);
			   	     break;
			   	case 3:
			   		 System.out.println("Closing The application\nThank You");
			   		 System.exit(0);
			   	default:
			   		 System.out.println("Wrong Input");
			   	     
		        } 
	       }

	   }
}
