package sbi.application.createAccount;

public class NonStaticVariables {
	static String accountHolderName;
	 static String bankName="SBI";
	 static int branchCode=101;
	 static String IFSCCode= "SBICMB001";
     static String location="Coimbedu";
	
	public void constantFunctions()
	{
		
		System.out.println("Bank Name:"+ bankName);
		System.out.println("Branch Code:"+ branchCode);
		System.out.println("IFSC code"+ IFSCCode);
		System.out.println("Branch Location:"+ location);
	}

}
