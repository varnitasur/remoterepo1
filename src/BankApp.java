import java.util.Scanner;

public class BankApp {
	
	public static Bank[] isort(Bank[] b) {
		Bank[] temp=b;
		for (int i = 0; i < b.length; i++) {
			Bank objectTosort=b[i];
			int j=i;
			while(j>0 && b[j-1].getBankName().compareTo(objectTosort.getBankName())>1)
			{
				b[j]=b[j-1];
				j--;
			}
			b[j]=objectTosort;
		}
		return b;
		
		
	}
	
	
public static int binarys(Bank[] b,int key) {
	
	int low=0; int high=b.length;
	int mid=(low+high)/2;
	while(low<high) {
		if(b[mid].getBankid()==key)
		{
			return mid;
		}
		else if(b[mid].getBankid()>key)
		{
			high=mid-1;
			//return mid;
		}
		else 
		{
			low=mid+1;
			//return m
		}
	}
		return -1;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of banks");
		int n=sc.nextInt();
		Bank[] bank=new Bank[n];
		for (int i = 0; i < bank.length; i++) {
			System.out.println("Enter the bank id");
			int bankid=sc.nextInt();
			System.out.println("Enter bank name");
			String bankname=sc.next();
			System.out.println("Enter the bank ifsc");
			String bankifsc=sc.next();
			BankDetails[] bankdetails=new BankDetails[1];
			for (int j = 0; j < bankdetails.length; j++) {
				System.out.println("Enter the complete address");
				String customeradd=sc.next();
				System.out.println("Enter the distance covered");
				float distance=sc.nextFloat();
				BankDetails b=new BankDetails(customeradd,distance);
				bankdetails[j]=b;
				
			}
			Bank b1=new Bank(bankid,bankname,bankifsc,bankdetails);
			bank[i]=b1;
			
		}
		Bank[] result=new Bank[n];
		result=isort(bank);
		for (int i = 0; i < result.length; i++) {
			System.out.println("Bankid :"+result[i].getBankid());
			System.out.println("bank name: "+result[i].getBankName() );
			System.out.println("Bank ifsc: "+result[i].getBankifsc());
			for(int j=0;j<result[i].getBankdetails().length;j++)
			{
				System.out.println("Adress :"+result[i].getBankdetails()[j].getCompleteAdd());
				System.out.println("Distance: "+result[i].getBankdetails()[j].getDistance());
			}
			
			System.out.println("Enter the bankid to be searched");
			int key=sc.nextInt();
			int result1=binarys(bank,key);
			for (int j = 0; j < bank.length; j++) {
				System.out.println("Bankid :"+result1);
				//System.out.println("Details of the founded code: ");
				
				
			}
			
		}
		

	}

}
