package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity=1000;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String companySuffix="xyzcompany.com";
	
	
	/*constructor to recieve first anem and last name*/
	public Email(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Email Created:"+this.firstName+""+this.lastName);
		
		//call a method for dept-return the dept
		this.department = setDepartment();
		
		
		//call a method to return random password
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your password is:"+this.password);
		
		//combine elements to generate email 
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+"." +companySuffix;
		
	}
	
	
	
	//ask for dept
	private String setDepartment(){
		System.out.println("New Worker:"+firstName+".Department Codes:"
				+ "\nEnter the department\n"
				+ " 1 for Sales\n"
				+ " 2 for Development\n"
				+ " 3 for Accounting \n "
				+ "0 for none\n "
				+ "Enter Department code: ");
		Scanner in=new Scanner(System.in);
		int depchoice =in.nextInt();
		if(depchoice==1 ) {return "Sales";}
		else if(depchoice==2) {return "dev" ;}
		else if(depchoice==3) {return "acct";}
		else { return "";}
		
	}
	// return a random password
		private String randomPassword(int length) {
			String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%*";
			char [] password=new char[length];
			for(int i =0;i<length;i++) {
			int rand= (int)(Math.random() * passwordSet.length());
			password[i]=passwordSet.charAt(rand);
			}
			return new String(password);
		}
		//set mailbox capacity
		public void setMailBoxCapacity(int capacity) {
			this.mailboxCapacity=capacity;
		}
		//set alt email
		public void setAlternateEmail(String altEmail) {
			this.alternateEmail=altEmail;
		}
		//change password
		public void changePassword(String password) {
			this.password=password;
		}
		public int getMailBoxCapacity() {return mailboxCapacity;}
		public String getAlternateEmail() {return alternateEmail;}
		public String getPassword() {return password;}
		public String showInfo() {
			return " Display Name:"+firstName+""+lastName+
					"\nCompany email:"+email+
					"\nMailBox Capacity:"+mailboxCapacity+"mb";
		
			
		}
				
	}


