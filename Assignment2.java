//Welcome to the Department of ILT Students Database System

import java.util.Arrays;
    import javax.swing.JOptionPane;
        public class Assignment2 {
             public static void main(String[] args) {


//Fields needed: six, with 4 addition sub fields in Address






//Enter number amount and press enter
            String Number = JOptionPane.showInputDialog("How many students’ data (“N”) are to be entered? ");
            int Count = 0;
            Count = Integer.parseInt(Number);
            getInfo(Count);

        }

        public static void getInfo(int Count) {

            int Count3 = Count;

//Strings Declaration

            String fName;
            String lName;
            String Id;
            String gClassification;
            String email;
            String address1;
            String city;
            String state;
            String zipCode;
//End of Strings




//Regular Expressions
            String re = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
            String idre = /*"^\\d{7}(\\d{2})?$";*/"^[0-9]{1,7}$";
            String[] standing = new String[]{"Freshman", "freshman", "Sophmore", "sophmore", "Junior","junior","Senior","senior"};
            String temail = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
            String address = "^\\d+\\s[A-z]+\\s[A-z]+";
            String ccity = "^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$";
            String[] street = new String[]{"AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND","NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV", "WY"};
            String zipcode = "^[0-9]{9}$";


//Title of Database
            System.out.println("Student Profile Database for the Department of ILT");
            System.out.println();



            for (int x = 0; x < Count; x++) {


// Enter First Name and press Enter
                fName = JOptionPane.showInputDialog("Enter First Name: ");
                while(!(fName.matches(re))){
                    fName = JOptionPane.showInputDialog("Invalid Name, Enter Correct First Name: ");
                }

// Enter Last Name and press Enter
                lName = JOptionPane.showInputDialog("Enter Last Name: ");
                while(!(lName.matches(re))){
                    lName = JOptionPane.showInputDialog("Invalid Name, Enter Correct Last Name: ");
                }

//Enter PeopleSoft ID press Enter
                Id = JOptionPane.showInputDialog("Enter PeopleSoft ID (<=7 digits): ");
                while(!(Id.matches(idre))) {
                    Id = JOptionPane.showInputDialog("Invalid ID, Enter PeopleSoft ID: ");

                }


//Enter Grade Classification and press Enter
                gClassification = JOptionPane.showInputDialog("Enter Grade Classification: ");
                while(!(Arrays.asList(standing).contains(gClassification))){
                    gClassification = JOptionPane.showInputDialog("Invalid Grade Classification, Enter Correct Grade Classification: ");

                }


//Enter Email Address and press Enter
                email = JOptionPane.showInputDialog("Enter Email Address: ");
                while(!(email.matches(email))){
                    email = JOptionPane.showInputDialog("Invalid Email Address, Enter Correct Email Address: ");
                }



//Enter Home Address and press Enter
                address1 = JOptionPane.showInputDialog("Enter Address Line 1 : ");
                while(!(address1.matches(address))){
                    address1 = JOptionPane.showInputDialog("Invalid Address line, Enter Correct Address Line: ");
                }

                city = JOptionPane.showInputDialog("Enter City: ");
                while(!(city.matches(city))){
                    city = JOptionPane.showInputDialog("Invalid City, Enter City: ");
                }

                state = JOptionPane.showInputDialog("Enter State: ");
                while(!(Arrays.asList(street).contains(state))){
                    state = JOptionPane.showInputDialog("Invalid State, Enter State: ");

                }

                zipCode = JOptionPane.showInputDialog("Enter Zip Code (9 digits): ");
                while(!(zipCode.matches(zipcode))){
                    zipCode = JOptionPane.showInputDialog("Invalid Zip Code, Enter Zip Code: ");
                }

                displayInfo(fName, lName, Id, gClassification, email, address1, city, state, zipCode, Count);


            }
            System.out.println();

            System.out.println("Number of Students: " + Count);

        }
        public static void displayInfo(String data1,String data2,String data3,String data4,String data5,String data6,String data7,String data8,String data9, int count){
            String datafname = data1;
            String datalname = data2;
            String dataId = data3;
            String datacStandings = data4;
            String dataemail = data5;
            String dataaddress1 = data6;
            String datacity = data7;
            String datastate = data8;
            String datazipCode = data9;

            String[] info = new String[]{datafname, datalname, dataId, datacStandings, dataemail, dataaddress1, datacity, datastate, datazipCode};

            for(int w = 0; w < info.length; w++){
                System.out.print(info[w] + "\t");
            }
            System.out.println();
        }
    }

//Data Has Been Stored into Database. Thank You!!!
