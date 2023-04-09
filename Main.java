import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
	        while (true) {
	            Login_info l1 = new Login_info();

	            System.out.println("Enter UserName : ");
	            Scanner mc = new Scanner(System.in);
	            String usname = mc.nextLine();
	            System.out.println("Enter Your Passworod: ");
	            String pas1 = mc.nextLine();
	            l1.setU_name("Rifat");
	            l1.setPass("773");
	            String xx = l1.getU_name();
	            String yy = l1.getPass();
	            int x = xx.compareTo(usname);
	            int y = yy.compareTo(pas1);
	            if (x == 0 && y == 0) {
	                System.out.println("Login Successfully");
	
}
	            else  {

	                l1.info();
	            }
}
	  }
}
