import java.util.Scanner;
public class MessageBoard {
	
	public static void main(String[] args) {
		 Scanner scan =  new Scanner (System.in);
		   
		   System.out.println ("Enter message board post:");
		   
		   //Post format: Name - message
		   String post = scan.nextLine();

		   int name = post.indexOf("-");
		   String username = post.substring(0,name);
		   name+=2;
		   String message = post.substring(name);
		   
		   message = message.toLowerCase() + " ";
		   
		   //Inappropriate characters: ^^ , qey , $
		   int arrows = 0;
		   int qey = 0;
		   int money = 0;
		   int i = 0;
		   
		   while (i < 10){  	
		     i++;
		     String word = " " + (message.substring (0, (message.indexOf(" ") + 1))) + " ";
		     message = message.substring(message.indexOf(" ") + 1); 
		     
		     if (word.indexOf("^^") == 0 && word.indexOf("qey") == 0 && word.indexOf("$") == 0){
		     }
		     if (word.indexOf("^^") >= 0){
		       arrows++;
		     } 
			 
			 if (word.indexOf("qey") >= 0){
		         qey++;
		     }    
		     if (word.indexOf("$") >= 0){
		       money++;
		     }      
		   }   
		   
		   //If message has no inappropriate characters displays message is CLEAN
		   if (arrows == 0 && qey == 0 && money == 0){
		   System.out.println ("Results:");
		   System.out.println ("CLEAN"); 
		   }
		   //If message contains inappropriate characters displays message is BAD & prints user's name
		   else {
		   System.out.println ("Results:");
		   System.out.println ("BAD");
		   System.out.println (username);
		   }
		   //Displays number of each inappropriate character if present
		   System.out.println ("^^: " + arrows);
		   System.out.println ("qey: "+ qey);
		   System.out.println ("$: " + money);

	}

}