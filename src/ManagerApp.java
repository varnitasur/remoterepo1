import java.util.Scanner;

public class ManagerApp {
	
	public static Repoters[] isort(Repoters[] r) {
		Repoters[] temp=r;
		for (int i = 0; i < r.length; i++) {
			Repoters objectTosort=r[i];
			int j=i;
			while(j>0 && r[j-1].getReportername().compareTo(objectTosort.getReportername())>1)
			{
				r[j]=r[j-1];
				j--;
			}
			r[j]=objectTosort;
		}
		return r;
		
		
	}
	
	
	public static Repoters[] bsort(Repoters[] r) {
		
		Repoters temp=new Repoters();
		for (int i = 0; i < r.length-1; i++) {
			for (int j = i+1; j < r.length; j++) {
				if(r[i].getReportername().compareTo(r[j].getReportername())>0)
				{
					temp=r[i];
					r[i]=r[j];
					r[j]=temp;
				}
			}

			
		}
		return r;
	}
	
	public static int binarys(Repoters[] r,String key) {
		
		int low=0; int high=r.length;
		
		while(low<high) {
			int mid=(low+high)/2;
			int res=key.compareTo(r[mid].getProjectname());
			if(res==0)
			{
				return mid;
			}
			else if(res<0)
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
		//System.out.println("Enter the no of managers");
		//int n=sc.nextInt();
		Manager[] manager=getRequiredmanager();
		
		while(true) {
			System.out.println("1.add all the details\n 2.sort reporters under manager based on magaer name\n 3.search repoters and manager for a particular project \n 4.exit");
			System.out.println("===================================");
			System.out.println("Enter the option");
			int option=sc.nextInt();
			switch(option) {
				
			case 1:
				
				for (int i = 0; i < manager.length; i++)
				{
					System.out.println("Manager id :"+manager[i].getManagerid());
					System.out.println("Manager name: "+manager[i].getManagername());
						for (int j = 0; j < manager[i].getRepoter().length; j++) 
						{
							System.out.println("Repoter id: "+manager[i].getRepoter()[j].getReporterid());
							System.out.println("Repoter name: "+manager[i].getRepoter()[j].getReportername());
							System.out.println("project name: "+manager[i].getRepoter()[j].getProjectname());	
						}
					
				}
				break;
			case 2:
				
				System.out.println("Enter the manager id to be searched");
				int mid=sc.nextInt();
				Manager[] manager1=manager;
				for (int j = 0; j < manager1.length; j++) 
				{
					if(mid==manager1[j].getManagerid())
					{
						Repoters[] result=isort(manager1[j].getRepoter());
						for (int i = 0; i < result.length; i++) {
						System.out.println(result[i].getReportername());}
					}
			}
				break;
			case 3:
				System.out.println("Enter project name to be searched:");
				String pname=sc.next();
				Manager[] manager2=manager;
				for (int i = 0; i < manager2.length; i++) 
				{
					for (int j = 0; j < manager2[i].getRepoter().length; j++) 
					{
						Repoters[] result1=bsort(manager2[j].getRepoter());
						int Result=binarys(result1,pname);
						if( Result == -1)
							System.out.println("String not found");
						else
							System.out.println("Project belong to "+manager2[i].getRepoter()[j].getReportername()+" "+"under manager name "+manager2[i].getManagername());	
					}
				}
					
				break;
			case 4: 
				System.exit(0);
					break;
				
			default:
				System.out.println("Invalid");
				
			}
		}
		
		
		

	}

	private static Manager[] getRequiredmanager() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of managers");
		int n=sc.nextInt();
		Manager[] result=new Manager[n];
		for (int i = 0; i < result.length; i++) {
			System.out.println("Enter the manager id");
			int managerid=sc.nextInt();
			System.out.println("Enter the manager name");
			String managername=sc.next();
			System.out.println("Enter the no of reporters");
			int num=sc.nextInt();
			Repoters[] repoters=new Repoters[num];
			for (int j = 0; j < repoters.length; j++) {
				System.out.println("Enter the repoter id");
				int repoterid=sc.nextInt();
				System.out.println("Entre the repoter name");
				String repotername=sc.next();
				System.out.println("Enter the project");
				String projectname=sc.next();
				repoters[j]=new Repoters(repoterid,repotername,projectname);
				
			}
			result[i]=new Manager(managerid,managername,repoters);
			
			
		}
		return result;
		
	}

}
