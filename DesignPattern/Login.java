import java.util.*;
import java.io.*;

public class Login{  		// It stores the username and password in Facade design pattern  by creating the login functionalities

    private String username;

    private String password, y;

	char c;

    public boolean login( int userType) {
		System.out.println("Enter Username ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		username = scan.next();
		System.out.println("Enter Password ");
		password = scan.next();
		boolean success = false;
        if(userType == 0) {
			success = validation("C:\\Users\\vbodavul\\Documents\\Assignments-515\\DesignPatterns\\DesignPatterns\\BuyerInfo.txt");
		}
		
		else {
			success = validation("C:\\Users\\vbodavul\\Documents\\Assignments-515\\DesignPatterns\\DesignPatterns\\SellerInfo.txt");
		}
		return success;
	}

    public boolean validation(String str) {
		Scanner sc;
		try {
			sc = new Scanner(new File(str));
			while (sc.hasNextLine()) {
				y=y+c;
				String st[]= sc.next().split(":");
				
				if(st[0].equals(username)&&st[1].equals(password)) {
					return true;
				}
			}
		} catch (FileNotFoundException f) {
			System.out.println("Error finding the user");
			f.printStackTrace();
		}
		return false;
	}
	
	
}


