//Welcome to the Department of ILT Students Database System

import java.util.Arrays;
    import javax.swing.JOptionPane;
        public class Assignment2 {
             public static void main(String[] args) {


//Fields needed: six, with 4 addition sub fields in Address


            String Number = JOptionPane.showInputDialog("How many students’ data (“N”) are to be entered? ");
                int Count = 0;
                    Count = Integer.parseInt(Number);
                        getInfo(Count);
//Enter number amount and press enter

        }

        public static void getInfo(int Count) {

            int Count3 = Count;

//Strings Declaration
            String fName;
            String lName;

            String ID;
            String gClassification;
            String Email;
            
            String Address;
            String State;
            String City;
            String ZipCode;
//End of Strings




//Regular Expressions
            String re = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
            String idre = /*"^\\d{7}(\\d{2})?$";*/"^[0-9]{1,7}$";
            String[] classification = new String[]{"Freshman", "freshman", "Sophomore", "sophomore", "Junior","junior","Senior","senior"};
            String temail = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

            String address = "^\\d+\\s[A-z]+\\s[A-z]+";
            String[] street = new String[]{"AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND","NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV", "WY"};
            String ccity = "^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$";
            String zipcode = "^[0-9]{9}$";


//Title of Database
            System.out.println("Student Profile Database for the Department of ILT");
            System.out.println();



            for (int y = 0; y < Count; y++) {


// Enter First Name and press Enter
                fName = JOptionPane.showInputDialog("Enter Your First Name: ");

                while(!(fName.matches(re))){
                    fName = JOptionPane.showInputDialog("Invalid Name, Enter a Correct First Name: ");
                }

// Enter Last Name and press Enter
                lName = JOptionPane.showInputDialog("Enter Your Last Name: ");

                while(!(lName.matches(re))){
                    lName = JOptionPane.showInputDialog("Invalid Name, Enter a Correct Last Name: ");
                }

//Enter PeopleSoft ID press Enter
                ID = JOptionPane.showInputDialog("Enter PeopleSoft ID: ");

                while(!(ID.matches(idre))) {
                    ID = JOptionPane.showInputDialog("Invalid ID, Enter PeopleSoft ID must be 7 digits: ");

                }


//Enter Grade Classification and press Enter
                gClassification = JOptionPane.showInputDialog("Enter Your Grade Classification: ");

                while(!(Arrays.asList(classification).contains(gClassification))){
                    gClassification = JOptionPane.showInputDialog("Invalid Grade Classification, Enter A Correct Grade Classification: ");

                }


//Enter Email Address and press Enter
                Email = JOptionPane.showInputDialog("Enter Your Email Address: ");

                while(!(Email.matches(Email))){
                    Email = JOptionPane.showInputDialog("Invalid Email Address, Enter A Correct Email Address: ");
                }



//Enter Home Address and press Enter
                Address = JOptionPane.showInputDialog("Enter Address Line: ");

                while(!(Address.matches(address))){
                    Address = JOptionPane.showInputDialog("Invalid Address line, Enter A Correct Address: ");
                }


//Enter the State and press Enter
                State = JOptionPane.showInputDialog("Enter The State: ");

                while(!(Arrays.asList(street).contains(State))) {
                    State = JOptionPane.showInputDialog("Invalid Data, Enter A Correct State: ");
                }


//Enter a city and press Enter
                City = JOptionPane.showInputDialog("Enter Your City: ");

                while(!(City.matches(City))){
                    City = JOptionPane.showInputDialog("Invalid City, Enter A Correct City: ");

                }

//Enter your Zipcode and then press enter
                ZipCode = JOptionPane.showInputDialog("Enter Your Zip Code (Must be 5 digits): ");

                while(!(ZipCode.matches(zipcode))){
                    ZipCode = JOptionPane.showInputDialog("Invalid Zip Code, Enter 5 digit Zip Code: ");
                }


                displayInfo(fName, lName, ID, gClassification, Email, Address, State, City, ZipCode, Count);


            }
            System.out.println();

//Show number of students present
            System.out.println("Number of Students present are: " + Count);

        }

        public static void displayInfo(String data1,String data2,String data3,String data4,String data5,String data6,String data7,String data8,String data9, int Count){

     //Strings Declaration

            String datafname = data1;

            String datalname = data2;

            String dataID = data3;

            String datagClassification = data4;

            String dataEmail = data5;

            String dataAddress = data6;

            String dataState = data8;

            String dataCity = data7;

            String dataZipCode = data9;

            String[] info = new String[]{datafname, datalname, dataID, datagClassification, dataEmail, dataAddress, dataState, dataCity, dataZipCode};

//END

            for(int e = 0; e < info.length; e++){
                System.out.print(info[e] + "\t");
            }
            System.out.println();
        }
    }

//END Code
//Data Has Been Successfully Stored into Database. Thank You!!!
