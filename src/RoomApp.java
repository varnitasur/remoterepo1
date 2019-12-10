import java.util.Scanner;

public class RoomApp {
	
	public static Room[] bsort(Room[] r) {
		
		Room temp=new Room();
		for (int i = 0; i < r.length-1; i++) {
			for (int j = i+1; j < r.length; j++) {
				if(r[i].getCampusminds().length>r[j].getCampusminds().length)
				{
					temp=r[i];
					r[i]=r[j];
					r[j]=temp;
				}
			}

			
		}
		return r;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rooms");
		int size=sc.nextInt();
		
		Room[] room=new Room[size];
		for (int i = 0; i < room.length; i++)
		{
			System.out.println("Enter room name");
			String roomname=sc.next();
			CampusMind[] campusmind=new CampusMind[2];
			for (int j = 0; j < campusmind.length; j++) 
			{
				System.out.println("Enter the mid");
				String mid=sc.next();
				System.out.println("Enter name of campus mind");
				String cname=sc.next();
				System.out.println("Enter the campus address");
				String cAddress=sc.next();
				CampusMind c=new CampusMind(mid,cname,cAddress);
				campusmind[j]=c;
				
			}
			
			Room r=new Room(roomname,campusmind);
			room[i]=r;
			
		}
	/*	for (int i = 0; i < room.length; i++) {
			System.out.println(room[i].getRoomName());
			System.out.println("Enter the search by room");
			String searchRoom=sc.next();
			if(room[i].getRoomName().equals(searchRoom))
			{L
			for (int j = 0; j < room[i].getCampusminds().length; j++) {
				System.out.println(room[i].getCampusminds()[j].mid+" "+room[i].getCampusminds()[j].Cname+" "+room[i].getCampusminds()[j].cAddress);
			}
				System.out.println();*/
		
		/*System.out.println("Enter the name of campus mind");
		String searchCname=sc.next();
				
			for (int i = 0; i < room.length; i++) {
				for (int j = 0; j < room[i].getCampusminds().length; j++) {
					
					if(room[i].getCampusminds()[j].Cname.equals(searchCname))
					{
						//for (int j = 0; j < room[i].getCampusminds().length; j++) {
							System.out.println(room[i].getRoomName());
						}
					
				}
			}*/
		Room[] result=new Room[room.length];
		result=bsort(room);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i].getRoomName());
			
		}
		
	}

}
