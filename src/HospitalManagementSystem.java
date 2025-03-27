import java.util.Scanner;
class logic
{	
	String FullName,age,Address,MobileNumber,AdmissionDate,AdmissionDay,ID,DoctorName;
    int AppoinmentCount = 0;
	Scanner sc = new Scanner(System.in);
	void Registration()
	{
		System.out.println("write registration date (DD/MM/YYYY)");
		AdmissionDate = sc.nextLine();
		System.out.println("write registration day");
		AdmissionDay = sc.nextLine();
		System.out.println("write patient ID");
		ID = sc.nextLine();
		System.out.println("enter your full name");
		FullName = sc.nextLine();
		System.out.println("enter your age");
		age = sc.nextLine();
		System.out.println("enter current living address ");
		Address = sc.nextLine();
		System.out.println("enter your using mobile number");
		MobileNumber = sc.nextLine();
		if(MobileNumber.length()!=10)
		{
			System.out.println("enter a valid mobile number");
		}
	}
	void AvailableFacilities()
	{
		System.out.println("list of available specialisation and respective doctors:-");
		System.out.println("-------------------------------------------------------------");
		System.out.println("1) otolaryngologist");
		System.out.println("   1a)---->Dr. Atul Kumar Mittal");
		System.out.println("   1b)---->Dr. P. L. Dhingra");
		System.out.println("   1c)---->Dr. EV Raman");
		System.out.println("2) gastroenterologist");
		System.out.println("   2a)---->Dr. Amit Maydeo");
		System.out.println("   2b)---->Dr. Aruna Bhave");
		System.out.println("   2c)---->Dr. Subhash Agal");
		System.out.println("3) general physicians");
		System.out.println("   3a)---->Dr. kamlesh patel");
		System.out.println("   3b)---->Dr. dhruv bhatt");
		System.out.println("   3c)---->Dr. Ananddeep Agarwal");
		System.out.println("   3d)---->Dr. Bhaskar S");
		System.out.println("4) orthopedists");
		System.out.println("   4a)---->Dr. tejas patel");
		System.out.println("   4b)---->Dr. Naveen Polavarapu");
		System.out.println("   4c)---->Dr. Gaurav Mehta");
		System.out.println("5) psychiatrist");
		System.out.println("   5a)---->Dr. Gorav Gupta ");
		System.out.println("   5b)---->Dr. Ajit Dandekar");
		System.out.println("   5c)---->Dr. Murali Raj");
		System.out.println("   5d)---->Dr. Vishal Chhabra");
		System.out.println("6) surgeons");
		System.out.println("   6a)---->Dr. Shilpi Budhiraja");
		System.out.println("   6b)---->Dr. PAL");
		System.out.println("   6c)---->Dr. UN mehta");
		System.out.println("   6d)---->Dr. Vasantha Jayaraman ");
		System.out.println("   6e)---->Dr. Ashok Rajgopal");
		System.out.println("   6f)---->Dr. Naresh Trehan");
	}
	void Appoinment_Scheduling()
	{
		System.out.println("press 1 for otolaryngologist");
		System.out.println("press 2 for gastroenterologist");
		System.out.println("press 3 for general physicians");
		System.out.println("press 4 for orthopedists");
		System.out.println("press 5 for psychiatrist");
		int choice = sc.nextInt();
		sc.nextLine();
		if(choice==1)
		{
			System.out.println("issue appoinment day");
			String Appoinment_Day = sc.nextLine();
			if(AppoinmentCount<=90 && (Appoinment_Day.equals("monday") || Appoinment_Day.equals("tuesday")))
			{
				System.out.println("issue appoinment date");
				String Appoinment_Date = sc.nextLine();
				System.out.println("issue appoinment time");
				String Appoinment_Time = sc.nextLine();
				DoctorName = "Dr. Atul Kumar Mittal";
				System.out.println("YOUR APPOINMENT HAS BEEN SUCCESSFULLY SCHEDULED BELOW ARE THE DETAILS");
				System.out.println("*****************************************************");
				System.out.println("your appoinment date is:" + Appoinment_Date);
				System.out.println("your appoinment time is:" + Appoinment_Time);
				System.out.println("your name is:" + FullName);
				System.out.println("your ID number is:" + ID);
				System.out.println("doctor who treat you is:" + DoctorName);
				System.out.println("*****************************************************");
			}
			else if(AppoinmentCount<=90 && (Appoinment_Day.equals("wednesday") || Appoinment_Day.equals("thursday") || Appoinment_Day.equals("friday")))
			{
				System.out.println("issue appoinment date");
				String Appoinment_Date = sc.nextLine();
				System.out.println("issue appoinment time");
				String Appoinment_Time = sc.nextLine();
				DoctorName = "Dr. P. L. Dhingra";
				System.out.println("YOUR APPOINMENT HAS BEEN SUCCESSFULLY SCHEDULED");
				System.out.println("*****************************************************");
				System.out.println("your appoinment date is:" + Appoinment_Date);
				System.out.println("your appoinment time is:" + Appoinment_Time);
				System.out.println("your name is:" + FullName);
				System.out.println("your ID number is:" + ID);
				System.out.println("doctor who treat you is:" + DoctorName);
				System.out.println("*****************************************************");
			}
			else if(AppoinmentCount<=90 && (Appoinment_Day.equals("saturday") || Appoinment_Day.equals("sunday")))
			{
				System.out.println("issue appoinment date");
				String Appoinment_Date = sc.nextLine();
				System.out.println("issue appoinment time");
				String Appoinment_Time = sc.nextLine();
				DoctorName = "Dr. EV Raman";
				System.out.println("YOUR APPOINMENT HAS BEEN SUCCESSFULLY SCHEDULED");
				System.out.println("*****************************************************");
				System.out.println("your appoinment date is:" + Appoinment_Date);
				System.out.println("your appoinment time is:" + Appoinment_Time);
				System.out.println("your name is:" + FullName);
				System.out.println("your ID number is:" + ID);
				System.out.println("doctor who treat you is:" + DoctorName);
				System.out.println("*****************************************************");
			}
			else
			{
				System.out.println("SORRY! Appoinment limit has reached maximum size try again tomorrow");
			}
			AppoinmentCount++;
		}
		else if(choice==2)
		{
			System.out.println("issue appoinment day");
			String Appoinment_Day = sc.nextLine();
			if(AppoinmentCount<=90 && (Appoinment_Day.equals("monday") || Appoinment_Day.equals("tuesday")))
			{
				System.out.println("issue appoinment date");
				String Appoinment_Date = sc.nextLine();
				System.out.println("issue appoinment time");
				String Appoinment_Time = sc.nextLine();
				DoctorName = "Dr. Amit Maydeo";
				System.out.println("YOUR APPOINMENT HAS BEEN SUCCESSFULLY SCHEDULED");
				System.out.println("*****************************************************");
				System.out.println("your appoinment date is:" + Appoinment_Date);
				System.out.println("your appoinment time is:" + Appoinment_Time);
				System.out.println("your name is:" + FullName);
				System.out.println("your ID number is:" + ID);
				System.out.println("doctor who treat you is:" + DoctorName);
				System.out.println("*****************************************************");
			}
			else if(AppoinmentCount<=90 && (Appoinment_Day.equals("wednesday") || Appoinment_Day.equals("thursday") || Appoinment_Day.equals("friday")))
			{
				System.out.println("issue appoinment date");
				String Appoinment_Date = sc.nextLine();
				System.out.println("issue appoinment time");
				String Appoinment_Time = sc.nextLine();
				DoctorName = "Dr. Aruna Bhave";
				System.out.println("YOUR APPOINMENT HAS BEEN SUCCESSFULLY SCHEDULED");
				System.out.println("*****************************************************");
				System.out.println("your appoinment date is:" + Appoinment_Date);
				System.out.println("your appoinment time is:" + Appoinment_Time);
				System.out.println("your name is:" + FullName);
				System.out.println("your ID number is:" + ID);
				System.out.println("doctor who treat you is:" + DoctorName);
				System.out.println("*****************************************************");
			}
			else if(AppoinmentCount<=90 && (Appoinment_Day.equals("saturday") || Appoinment_Day.equals("sunday")))
			{
				System.out.println("issue appoinment date");
				String Appoinment_Date = sc.nextLine();
				System.out.println("issue appoinment time");
				String Appoinment_Time = sc.nextLine();
				DoctorName = "Dr. Subhash Agal";
				System.out.println("YOUR APPOINMENT HAS BEEN SUCCESSFULLY SCHEDULED");
				System.out.println("*****************************************************");
				System.out.println("your appoinment date is:" + Appoinment_Date);
				System.out.println("your appoinment time is:" + Appoinment_Time);
				System.out.println("your name is:" + FullName);
				System.out.println("your ID number is:" + ID);
				System.out.println("doctor who treat you is:" + DoctorName);
				System.out.println("*****************************************************");
			}
			else
			{
				System.out.println("SORRY! Appoinment limit has reached maximum size try again tomorrow");
			}
			AppoinmentCount++;
		}
		else if(choice==3)
		{
			System.out.println("issue appoinment day");
			String Appoinment_Day = sc.nextLine();
			if(AppoinmentCount<=90 && (Appoinment_Day.equals("monday") || Appoinment_Day.equals("tuesday")))
			{
				System.out.println("issue appoinment date");
				String Appoinment_Date = sc.nextLine();
				System.out.println("issue appoinment time");
				String Appoinment_Time = sc.nextLine();
				DoctorName = "Dr. kamlesh patel";
				System.out.println("YOUR APPOINMENT HAS BEEN SUCCESSFULLY SCHEDULED");
				System.out.println("*****************************************************");
				System.out.println("your appoinment date is:" + Appoinment_Date);
				System.out.println("your appoinment time is:" + Appoinment_Time);
				System.out.println("your name is:" + FullName);
				System.out.println("your ID number is:" + ID);
				System.out.println("doctor who treat you is:" + DoctorName);
				System.out.println("*****************************************************");
			}
			else if(AppoinmentCount<=90 && (Appoinment_Day.equals("wednesday") || Appoinment_Day.equals("thursday") || Appoinment_Day.equals("friday")))
			{
				System.out.println("issue appoinment date");
				String Appoinment_Date = sc.nextLine();
				System.out.println("issue appoinment time");
				String Appoinment_Time = sc.nextLine();
				DoctorName = "Dr. dhruv bhatt";
				System.out.println("YOUR APPOINMENT HAS BEEN SUCCESSFULLY SCHEDULED");
				System.out.println("*****************************************************");
				System.out.println("your appoinment date is:" + Appoinment_Date);
				System.out.println("your appoinment time is:" + Appoinment_Time);
				System.out.println("your name is:" + FullName);
				System.out.println("your ID number is:" + ID);
				System.out.println("doctor who treat you is:" + DoctorName);
				System.out.println("*****************************************************");
			}
			else if(AppoinmentCount<=90 && (Appoinment_Day.equals("saturday") || Appoinment_Day.equals("sunday")))
			{
				System.out.println("issue appoinment date");
				String Appoinment_Date = sc.nextLine();
				System.out.println("issue appoinment time");
				String Appoinment_Time = sc.nextLine();
				DoctorName = "Dr. Bhaskar S";
				System.out.println("YOUR APPOINMENT HAS BEEN SUCCESSFULLY SCHEDULED");
				System.out.println("*****************************************************");
				System.out.println("your appoinment date is:" + Appoinment_Date);
				System.out.println("your appoinment time is:" + Appoinment_Time);
				System.out.println("your name is:" + FullName);
				System.out.println("your ID number is:" + ID);
				System.out.println("doctor who treat you is:" + DoctorName);
				System.out.println("*****************************************************");
			}
			else
			{
				System.out.println("SORRY! Appoinment limit has reached maximum size try again tomorrow");
			}
			AppoinmentCount++;
		}
		else if(choice==4)
		{
			System.out.println("issue appoinment day");
			String Appoinment_Day = sc.nextLine();
			if(AppoinmentCount<=90 && (Appoinment_Day.equals("monday") || Appoinment_Day.equals("tuesday")))
			{
				System.out.println("issue appoinment date");
				String Appoinment_Date = sc.nextLine();
				System.out.println("issue appoinment time");
				String Appoinment_Time = sc.nextLine();
				DoctorName = "tejas patel";
				System.out.println("YOUR APPOINMENT HAS BEEN SUCCESSFULLY SCHEDULED");
				System.out.println("*****************************************************");;
				System.out.println("your appoinment date is:" + Appoinment_Date);
				System.out.println("your appoinment time is:" + Appoinment_Time);
				System.out.println("your name is:" + FullName);
				System.out.println("your ID number is:" + ID);
				System.out.println("doctor who treat you is:" + DoctorName);
				System.out.println("*****************************************************");;
			}
			else if(AppoinmentCount<=90 && (Appoinment_Day.equals("wednesday") || Appoinment_Day.equals("thursday") || Appoinment_Day.equals("friday")))
			{
				System.out.println("issue appoinment date");
				String Appoinment_Date = sc.nextLine();
				System.out.println("issue appoinment time");
				String Appoinment_Time = sc.nextLine();
				DoctorName = "Naveen Polavarapu";
				System.out.println("YOUR APPOINMENT HAS BEEN SUCCESSFULLY SCHEDULED");
				System.out.println("*****************************************************");;
				System.out.println("your appoinment date is:" + Appoinment_Date);
				System.out.println("your appoinment time is:" + Appoinment_Time);
				System.out.println("your name is:" + FullName);
				System.out.println("your ID number is:" + ID);
				System.out.println("doctor who treat you is:" + DoctorName);
				System.out.println("*****************************************************");;
			}
			else if(AppoinmentCount<=90 && (Appoinment_Day.equals("saturday") || Appoinment_Day.equals("sunday")))
			{
				System.out.println("issue appoinment date");
				String Appoinment_Date = sc.nextLine();
				System.out.println("issue appoinment time");
				String Appoinment_Time = sc.nextLine();
				DoctorName = "Dr. Gaurav Mehta";
				System.out.println("YOUR APPOINMENT HAS BEEN SUCCESSFULLY SCHEDULED");
				System.out.println("*****************************************************");;
				System.out.println("your appoinment date is:" + Appoinment_Date);
				System.out.println("your appoinment time is:" + Appoinment_Time);
				System.out.println("your name is:" + FullName);
				System.out.println("your ID number is:" + ID);
				System.out.println("doctor who treat you is:" + DoctorName);
				System.out.println("*****************************************************");;
			}
			else
			{
				System.out.println("SORRY! Appoinment limit has reached maximum size try again tomorrow");
			}
			AppoinmentCount++;
		}
		else if(choice==5)
		{
			System.out.println("issue appoinment day");
			String Appoinment_Day = sc.nextLine();
			if(AppoinmentCount<=90 && (Appoinment_Day.equals("monday") || Appoinment_Day.equals("tuesday")))
			{
				System.out.println("issue appoinment date");
				String Appoinment_Date = sc.nextLine();
				System.out.println("issue appoinment time");
				String Appoinment_Time = sc.nextLine();
				DoctorName = "Dr. Gorav Gupta";
				System.out.println("YOUR APPOINMENT HAS BEEN SUCCESSFULLY SCHEDULED");
				System.out.println("*****************************************************");;
				System.out.println("your appoinment date is:" + Appoinment_Date);
				System.out.println("your appoinment time is:" + Appoinment_Time);
				System.out.println("your name is:" + FullName);
				System.out.println("your ID number is:" + ID);
				System.out.println("doctor who treat you is:" + DoctorName);
				System.out.println("*****************************************************");;
			}
			else if(AppoinmentCount<=90 && (Appoinment_Day.equals("wednesday") || Appoinment_Day.equals("thursday") || Appoinment_Day.equals("friday")))
			{
				System.out.println("issue appoinment date");
				String Appoinment_Date = sc.nextLine();
				System.out.println("issue appoinment time");
				String Appoinment_Time = sc.nextLine();
				DoctorName = "Dr. Murali Raj";
				System.out.println("YOUR APPOINMENT HAS BEEN SUCCESSFULLY SCHEDULED");
				System.out.println("*****************************************************");;
				System.out.println("your appoinment date is:" + Appoinment_Date);
				System.out.println("your appoinment time is:" + Appoinment_Time);
				System.out.println("your name is:" + FullName);
				System.out.println("your ID number is:" + ID);
				System.out.println("doctor who treat you is:" + DoctorName);
				System.out.println("*****************************************************");;
			}
			else if(AppoinmentCount<=90 && (Appoinment_Day.equals("saturday") || Appoinment_Day.equals("sunday")))
			{
				System.out.println("issue appoinment date");
				String Appoinment_Date = sc.nextLine();
				System.out.println("issue appoinment time");
				String Appoinment_Time = sc.nextLine();
				DoctorName = "Dr. Vishal Chhabra";
				System.out.println("YOUR APPOINMENT HAS BEEN SUCCESSFULLY SCHEDULED");
				System.out.println("*****************************************************");;
				System.out.println("your appoinment date is:" + Appoinment_Date);
				System.out.println("your appoinment time is:" + Appoinment_Time);
				System.out.println("your name is:" + FullName);
				System.out.println("your ID number is:" + ID);
				System.out.println("doctor who treat you is:" + DoctorName);
				System.out.println("*****************************************************");;
			}
			else
			{
				System.out.println("SORRY! Appoinment limit has reached maximum size try again tomorrow");
			}
			AppoinmentCount++;
		}
		else
		{
			System.out.println("enter a valid choice");
		}
	}
	void BedBooking()
	{
		boolean[][][] bedAvailability = new boolean[5][20][20];
        System.out.println("Enter floor number (1-5):");
        int floor = sc.nextInt() - 1;
        sc.nextLine();

        System.out.println("Enter room number (1-20):");
        int room = sc.nextInt() - 1;
        sc.nextLine();

        System.out.println("Enter bed number (1-20):");
        int bed = sc.nextInt() - 1;
        sc.nextLine();

        // Check bed availability
        if (bedAvailability[floor][room][bed])
		{
				System.out.println("Bed is already booked. Please choose another one.");
		} 
		else 
		{
            // Book the bed
            bedAvailability[floor][room][bed] = true;
            System.out.println("Bed booked successful!");
        }
    }

	void HelpDesk()
	{
		System.out.println("CONTACT US:");
		System.out.println("");
		System.out.println("Jainam's Hospitals Road, Sarkhej - Gandhinagar Hwy, nr. Sola Bridge, Ahmedabad, Gujarat 380054");
		System.out.println("E-mail: mailto:infoahd@Jainam'shospitals.com (General Inquiry)");
		System.out.println("E-mail: mailto:ahmird@Jainam'shospitals.com (International Patient Care)");
		System.out.println("1800 123 5433(India TollFree)");
		System.out.println("+917874412345(Emergency)");
		System.out.println("+919909021667(International Patient Care)");
		System.out.println("");
	}
	void Update_Details()
	{
		System.out.println("press 1 if you want to update your mobile number");
		System.out.println("press 2 if you want to update your address number");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice)
		{
			case 1:
			{
				System.out.println("enter your new mobile number");
				MobileNumber = sc.nextLine();
				if(MobileNumber.length()!=10)
		        {
					System.out.println("enter a valid mobile number");
				}
				System.out.println("your mobile number has been updated successfully");
				break;
			}
			case 2:
			{
				System.out.println("enter your new address");
				Address = sc.nextLine();
				System.out.println("your address has been updated successfully");
				break;
			}
			default :
			{
				System.out.println("kindly, press a valid number");
				break;
			}
		}
	}
}
class HospitalManagementSystem
{
	public static void main(String[] args)
	{
		System.out.println("...........................................");
		System.out.println("...........................................");
		System.out.println("..                                       ..");
		System.out.println(".. WELCOME TO HOSPITAL MANAGEMENT SYSTEM ..");
		System.out.println("..                                       ..");
		System.out.println("...........................................");
		System.out.println("...........................................");
		Scanner sc = new Scanner(System.in);
		logic[] patient = new logic[10];
		int CurrentPatient = 0;
		boolean bbb = true; 
		while(bbb)
		{
			System.out.println("write NEW if you are new patient or OLD if you are existing patient or enter EXIT to leave the system");
			String ch = sc.nextLine().toLowerCase();
			if(ch.equals("new"))
			{
				patient[CurrentPatient] = new logic();
				patient[CurrentPatient].Registration();
				System.out.println("press 1 for APPOINMENT BOOKING");
				System.out.println("press 2 for BED BOOKING");
				System.out.println("press 3 for UPDATING DETAILS");
				System.out.println("press 4 for HELP DESK");
				int choice = sc.nextInt();
				sc.nextLine();
				switch(choice)
				{
					case 1:
					{
						patient[CurrentPatient].AvailableFacilities();
						patient[CurrentPatient].Appoinment_Scheduling();
						break;
					}
					case 2:
					{
						patient[CurrentPatient].BedBooking();
						break;
					}
					case 3:
					{
						patient[CurrentPatient].Update_Details();
						break;
					}
					case 4:
					{
						patient[CurrentPatient].HelpDesk();
						break;
					}
					default :
					{
						System.out.println("press a valid number");
						break;
					}
				}
				CurrentPatient++;
			}
			else if(ch.equals("old"))
			{
				System.out.println("write you ID");
				String ID = sc.nextLine();
				for(int i=0; i<patient.length; i++)
				{
					if(patient[i] != null && patient[i].ID.equals(ID))
					{
						System.out.println("PATIENT FOUND SUCCESSFULLY BELOW ARE DETAILS:");
						System.out.println("");
						System.out.println("ID:" + patient[i].ID);
						System.out.println("full name is:" + patient[i].FullName);
						System.out.println("age is:" + patient[i].age);
						System.out.println("address is:" + patient[i].Address);
						System.out.println("mobile number is:" + patient[i].MobileNumber);
						System.out.println("visited date is:" + patient[i].AdmissionDate);
						System.out.println("visted day is:" + patient[i].AdmissionDay);
					    System.out.println("*****************************************************");;
					}
				}
				break;
			}
			else if(ch.equals("exit"))
		    {
				bbb = false;
				System.out.println("THANK YOU FOR VISITING SYSTEM HAVE A NICE DAY!");
			}
			else
			{
				System.out.println("write a valid statement");
			}
		}
        sc.close();
	}
}