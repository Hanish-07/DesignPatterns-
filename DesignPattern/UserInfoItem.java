import java.util.*;
import java.util.Map.Entry;

public class UserInfoItem {  // Implements the class that displayes the info of the items of the user or add new items.

    HashMap<String,String> userProducts = new HashMap<>();

    UserInfoItem(){
        userProducts.put("Beef","tutu");
        userProducts.put("Tomato","tutu");
        userProducts.put("Beef","mimi");
        userProducts.put("Onion","mimi");
        userProducts.put("Beef","pepe");
        userProducts.put("Tomato","pepe");
        userProducts.put("Onion","pepe");
    }
    public void createUSer() {
		System.out.println(" User Created ....");
	}

    public void getUserProducts(String username, int userType){
        if(username.equalsIgnoreCase("tutu") && (userType == 0)){
            System.out.println("Buyer Tutu has the following products ");
            for (Entry<String, String> entry : userProducts.entrySet()) {
                if(entry.getValue() == "tutu"){
                    System.out.println(entry.getKey());
                }
            }
        }
        if(username.equalsIgnoreCase("mimi") && (userType == 0)){
            System.out.println("Buyer Mimi has the following products ");
            for (Entry<String, String> entry : userProducts.entrySet()) {
                if(entry.getValue() == "mimi"){
                    System.out.println(entry.getKey());
                }
            }
        }
        if(username.equalsIgnoreCase("pepe") && (userType == 1)){
            System.out.println("Seller Pepe has the following products ");
            for (Entry<String, String> entry : userProducts.entrySet()) {
                if(entry.getValue() == "pepe"){
                    System.out.println(entry.getKey());
                }
            }
        }
    }

}
