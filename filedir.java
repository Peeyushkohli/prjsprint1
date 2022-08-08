package day13;
import java.io.*;
import java.util.*;
import java.nio.*;



public class filedir {
	

	

	
	
	

	public static void main(String[] args) throws  Exception,InputMismatchException {
		// TODO Auto-generated method stub
		char r;
		
		do {
		int ch;
		
		System.out.println(" *******LockedMe.com  First Prototype  Peeyush Kohli July 11 Batch**********");
		
		System.out.println(" Main Menu (Select your choice to perform any operration (1-4)");
		System.out.println("Choice 1 - List Files in specific directory in Asc order ");
		System.out.println("Choice 2 - Add new File in the specific directory ");
		System.out.println("Choice 3 - Delete file from the specific directory  ");
		System.out.println("Choice 4 - Search your File by name in specific Directory ");
		System.out.println("Choice 5 - Exit the programe");
		Scanner obj1=new Scanner(System.in);
		ch=obj1.nextInt();
		
		switch (ch)
		{
		case 1:
			filedir zz=new filedir();
			zz.c();
			break;
		case 2:
			filedir aa= new filedir();
			aa.AddF();
				
			break;
		case 3:
			filedir bb= new filedir();
			bb.Del();
			break;
		case 4:
			filedir yy=new filedir();
			yy.s1();
			break;
		case 5:
			filedir xx=new filedir();
			xx.exit();
			break;
		default:
			System.out.println("Invalid choice ");
			break;
		}
			//System.out.println("Invalid Choice");
			System.out.println("do you want to continue Press Y/N");
			r= obj1.next().charAt(0);
		}
		
			while(r=='y'||r=='Y');
		
		if (r=='n'||r=='N') {
			System.exit(0);}
			else 
			{ 
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
	
	//Add Module
	void AddF() {
			
	try {
		Scanner obj4=new Scanner(System.in);
					System.out.println("Enter path");
		String pathuser = obj4.next();
		
				File f = new File(pathuser);
						boolean flag =f.createNewFile();
					if(flag)
					{
						System.out.println("File created"+"  "+f.getName());
						}
	else {
		
		System.out.println("File already exists or enter complete name");
	}


	}
	catch(IOException e) 
	{
		
	}}

		
	//List all the File and Directories in sorted Order
		
	void c () throws IOException ,NullPointerException{
		 
			Scanner obj6= new Scanner(System.in);
			String userpath;
			System.out.println("Enter Directory path to list file in sorted order ");
			userpath=obj6.next();
		File f= new File(userpath.toUpperCase());
		File All[]=f.listFiles();
		Arrays.sort(All);
		
		for (File e : All) {
			
			if ((e.isFile())) {
				System.out.println("File"+" "+e.getName());
			}
			else if 
			((e.isDirectory())) {
				System.out.println("Directory"+" "+e.getName());
			}
			else 
			{
				System.out.println("Not Known "+e.getName());
		}
			}
			
			}
		
			//Search module
				void s1() throws IOException ,FileNotFoundException
		{	
					Scanner user_input = new Scanner(System.in);
					String user_i;
					String user_typeD;
					System.out.println(" Enter Directory to List and search format Drivename");
					user_i = user_input.next();
					System.out.println(" Enter file name full or partial character  to search");
					user_typeD = user_input.next();
					File dir = new File(user_i);
					for (File f:dir.listFiles()) {
						if (f.getName().contains(user_typeD)) {
							System.out.println(f.getName());
						}
					}			
		}
				//Exit Module
				void exit()
				{
					System.exit(0);
				}
				
				//Delete Module
				
				void Del()  throws FileNotFoundException ,IOException,NullPointerException
				{
					Scanner obj2=new Scanner(System.in);
					String s2;
					System.out.println("Enter path  to delete  file(s) ");
					s2=obj2.nextLine();
					File f3= new File( s2);
					String[] s4 = f3.list();
					for (String s5:s4)
					{
												
								File f4 = new File(f3,s5);
							
							f4.delete();
							System.out.println("Files in the Folder  "+ s2 +"  "+ "got deleted "+f4.getName());	
					
					
					
					
					}
				}}
						


			
		
	

		


