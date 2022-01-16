package businessLevelOperations;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import add.add;
import delete.delete;
import search.search;

public class operations {
public static void main1(String[] args) throws IOException {
	System.out.println("\tBusiness Level Operations");
	Scanner sc1=new Scanner(System.in);
	while(true) {
		 System.out.println("1.Add\n2.Delete\n3.Search\n4.Back to Menu");
	   	 int choice=sc1.nextInt();
	   	 switch(choice) {
	   	 case 1:
	   		 add ad= new add();
	   		 ad.main2(null);
	   		 break;
	   	 case 2:
	   		 delete de=new delete();
	   		 de.main3();
	   		 break;
	   	 case 3:
	   		 search srh= new search();
	   		 srh.main4(null);
	   		 break;
	   	 case 4:
	   		return;
		default:
	   		 System.out.println("Wrong Input");
	   	}
	   	
}
}
}
