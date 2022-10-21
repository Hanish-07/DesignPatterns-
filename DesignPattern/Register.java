import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Register{

    private String username;

    private String password;
    private String path = System.getProperty("user.dir");

    public boolean Registration(int userType) throws IOException
    {
        System.out.println("Enter Username ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		username = scan.next();
		System.out.println("Enter Password ");
		password = scan.next();
        if(userType == 0){
            try{
                String f1 = path +"\\BuyerInfo.txt";
                FileWriter fw =new FileWriter(f1, true);
                fw.write(username);
                fw.write(":");
                fw.write(password);
                fw.write("\n");
                fw.close();
                }
                catch(IOException e)
                {
                    System.out.println("File not found");
                }  
        }
        else{
            try{
                String f1 = path +"\\SellerInfo.txt";
                FileWriter fw =new FileWriter(f1, true);
                fw.write(username);
                fw.write(":");
                fw.write(password);
                fw.write("\n");
                fw.close();
                }
                catch(IOException e)
                {
                    System.out.println("File not found");
                }  
        }
          
        return true;
    }
}