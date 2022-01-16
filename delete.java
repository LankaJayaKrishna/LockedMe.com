package delete;
import java.io.File;
import java.util.Scanner;

public class delete {
	public void main3() {
	 String path="C:\\LockedMe\\";
	 System.out.println("enter the file name to be deleted");
     Scanner sc3=new Scanner(System.in);
	 String filename=sc3.next();
	 String finalfilename=path+filename;
	 File f=new File(finalfilename);
	 int flag=0;
    
		 if(f.delete()){
			 flag=1;
		 }
		 else {
		 flag=0; 
		 }
		 if(flag==1) {
			 System.out.println("File deleted");
		 }
		 else {
			 System.out.println("File is not available");
		 }
	 
	}
}
