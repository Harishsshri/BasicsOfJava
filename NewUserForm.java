package sbi.application.createAccount;

import java.util.Scanner;

public class NewUserForm {

	static String bankName="SBI";
	static int branchCode=101;
	static String IFSCCode= "SBICMB001";
    static String location="Coimbedu";
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter user name");
		NonStaticVariables.accountHolderName=sc.nextLine(); 
		NonStaticVariables.accountHolderName=NonStaticVariables.accountHolderName.replaceAll("\\s", "");
		NonStaticVariables cf=new NonStaticVariables();
		cf.constantFunctions();
		System.out.println(NonStaticVariables.accountHolderName);
		
		//System.out.println(sc);
}

}
