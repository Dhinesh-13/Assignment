package mr.cooper;

import java.util.ArrayList;
import java.util.Scanner;

public class mr_broadband {
	static Scanner in=new Scanner(System.in);
	static ArrayList<String>user=new ArrayList<String>();
	static ArrayList<String>usernn=new ArrayList<String>();
	static ArrayList<String>useremail=new ArrayList<String>();
	static ArrayList<String>userpassword=new ArrayList<String>();
	static ArrayList<String>userphone=new ArrayList<String>();
	static ArrayList<String>subscription=new ArrayList<String>();
	static ArrayList<String>subscriptionss=new ArrayList<String>();
	//static ArrayList<Integer>amount=new ArrayList<Integer>();
	static char ch;
	static int k;
	public static void data()
	{
		System.out.println("1.User");
		System.out.println();
		System.out.println("2.Service plan");
		System.out.println();
		System.out.println("3.Billing and payment");
		System.out.println();
		System.out.println("4.Feedback");
		System.out.println();
		int n=in.nextInt();
		subscription o=new subscription ();
		feedback o1=new feedback();
		switch(n)
		{
			case 1:
				account();
				break;
			case 2:
				service_plane kk=new service_plane();
				kk.plane();
				break;
				
			case 3:
				o.id();
				break;
			case 4:
				o1.des();
				break;
//				
//			case 6:
//				feedback();
				
				
		}
		
	}
	public static void account()
	{
		 
		System.out.println("1.Create a account");
		System.out.println();
		System.out.println("2.Show the profile");
		System.out.println();
		System.out.println("3.Update your profile");
		System.out.println();
		int z=in.nextInt();
		switch(z)
		{
			case 1:			
					System.out.println("-------------------------user form---------------------------");
					System.out.println();
					System.out.print("Enter the userID : ");
					String userid=in.next();
					for(int i=0;i<user.size();i++)
					{
						if(userid.equals(user.get(i)))
						{
							System.err.println("The user name already exist");
							enter();
							break;
						}
					}
					user.add(userid);
					System.out.println();
					System.out.print("Enter the user name : ");
					String username=in.next();
					int o=1;
					subscription.add(userid+o++);
					subscriptionss.add("Invalid");
					usernn.add(username);
					System.out.println();
					System.out.print("Enter the email : ");
					String email=in.next();
					useremail.add(email);
					System.out.println();
					//System.out.println();
					System.out.print("Enter the Password : ");
					String password=in.next();
					userpassword.add(password);
					System.out.println();
					System.out.print("Enter the Phone number: ");
					//System.out.println();
					String phone=in.next();
					userphone.add(phone);
					System.out.println();
					System.out.println("----------------------complete your profile------------------");
					System.out.println();
				//	break;
				enter();
				
			case 2:
						System.out.print("Enter the userid :");
						String a=in.next();
						System.out.print("Enter the password :");
						String a1=in.next();
						int k=0;
						for(int i=0;i<user.size();i++)
						{
							
							if(a.equals(user.get(i))&&  a1.equals(userpassword.get(i)))
							{
								k=1;
								System.out.println("--------------------Your details-------------------------");
								System.out.println(user.get(i));
								System.out.println();
								System.out.println(usernn.get(i));
								System.out.println();
								System.out.println(useremail.get(i));
								System.out.println();
								System.out.println(userphone.get(i));
								System.out.println();
								System.out.println("--------------------------------------------------------");
								break;
							}
						}
						
						if(k!=1)
						{
							System.err.println("Invalid user id");
							System.out.println();
						}
						//break;
						enter();	
			case 3:
				System.out.print("Enter the user id :");
				String a2=in.next();
				System.out.print("Enter the password :");
				String a3=in.next();
				k=0;
				for(int i=0;i<user.size();i++)
				{
					if(a2.equals(user.get(i))   )
					{
						if(a3.equals(userpassword.get(i)))
						k=1;
						System.out.println("1.Update your name");
						System.out.println();
						System.out.println("2.Update your email");
						System.out.println();
						System.out.println("3.Update your Password");
						System.out.println();
						System.out.println("4.Update your Phone Number");
						System.out.println();
//						System.out.print("Enter the userID : ");
//						String userid1=in.next();
//						user.set(i,userid1);
//						System.out.println();
						int f=in.nextInt();
						switch(f)
						{
							case 1:
								System.out.print("Enter the user name : ");
		  						String username1=in.next();
								usernn.set(i,username1);
								System.out.println();
								System.out.println("----------------------update complete your profile------------------");
								break;
							case 2:
								System.out.print("Enter the email : ");
								String email1=in.next();
								useremail.set(i,email1);
								System.out.println();
								System.out.println("----------------------update complete your profile------------------");
								break;
							case 3:
								System.out.print("Enter the Password : ");
								String password1=in.next();
								String password2=in.next();
								if(password1.equals(password2))
								{
									userpassword.set(i,password1);
									System.out.println("----------------------update complete your profile------------------");
									break;
								}
								else
								{
									System.out.println("Invalid password");
									enter();
									break;
								}
								case 4:
								System.out.print("Enter the Phone number: ");
								//System.out.println();
								String phone1=in.next();
								userphone.set(i,phone1);
								System.out.println();
								System.out.println("----------------------update complete your profile------------------");
								break;
								
						}
    					
						
						//System.out.println();
						
						
						
					
					}
				}
				if(k==0)
				{
					System.err.println("Invalid user id,password");
				}
			
				enter();
		}
	}
				
	
	
		public static void enter()
		{
			System.out.println("enter to continue");
			String a=in.next();
			data();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		System.out.println();
		data();
	}

}
