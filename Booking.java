package classPresentation;

import java.util.Scanner;

public class Booking {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Book A train ticket");
        System.out.println("2.Exit");
        int i = sc.nextInt();
     
        if(i==1)
        {
            System.out.println("Enter your starting city location in form:like Pune");
            String mystart = sc.next();
            if(mystart.contains("Mumbai")|| mystart.contains("Pune")||mystart.contains("Nagpur")||mystart.contains("Thane")||mystart.contains("Pimpri-Chichwad")||mystart.contains("Kalyan")||mystart.contains("Dombivli")||mystart.contains("Vasai")||mystart.contains("Virar")||mystart.contains("Aurangabad")||mystart.contains("Navi-Mumbai")||mystart.contains("Solapur")||mystart.contains("Mira-Bhayandar")||mystart.contains("Bhiwandi")||mystart.contains("Nizampur")||mystart.contains("Amravati")||mystart.contains("Nanded")||mystart.contains("Kolhapur")||mystart.contains("Akola")||mystart.contains("Panvel")||mystart.contains("Ulhasnagar")||mystart.contains("Sangli")||mystart.contains("Miraj")||mystart.contains("Malegoan")||mystart.contains("Jalgoan")||mystart.contains("Latur")||mystart.contains("Dhule")||mystart.contains("Ahmednagar")||mystart.contains("Chandrapur")||mystart.contains("Parbhani")||mystart.contains("Ichalkaranji")||mystart.contains("Jalna")||mystart.contains("Ambarnath")||mystart.contains("Bhusawal")||mystart.contains("Ratnagiri")||mystart.contains("Beed")||mystart.contains("Gondia")||mystart.contains("Satara")||mystart.contains("Barshi")||mystart.contains("Yavatmal")||mystart.contains("Achalpur")||mystart.contains("Osmanabad")||mystart.contains("Nandurbar")||mystart.contains("Wardha")||mystart.contains("Udgir")||mystart.contains("Hinganghat")||mystart.contains("Kandivali")||mystart.contains("Goa"))
            {
            System.out.println("Enter your destination city location in form:like Beed");
            String mydest = sc.next();
            if(mydest.contains("Mumbai")|| mydest.contains("Pune")||mydest.contains("Nagpur")||mydest.contains("Thane")||mydest.contains("Pimpri-Chichwad")||mydest.contains("Kalyan")||mydest.contains("Dombivli")||mydest.contains("Vasai")||mydest.contains("Virar")||mydest.contains("Aurangabad")||mydest.contains("Navi-Mumbai")||mydest.contains("Solapur")||mydest.contains("Mira-Bhayandar")||mydest.contains("Bhiwandi")||mydest.contains("Nizampur")||mydest.contains("Amravati")||mydest.contains("Nanded")||mydest.contains("Kolhapur")||mydest.contains("Akola")||mydest.contains("Panvel")||mydest.contains("Ulhasnagar")||mydest.contains("Sangli")||mydest.contains("Miraj")||mydest.contains("Malegoan")||mydest.contains("Jalgoan")||mydest.contains("Latur")||mydest.contains("Dhule")||mydest.contains("Ahmednagar")||mydest.contains("Chandrapur")||mydest.contains("Parbhani")||mydest.contains("Ichalkaranji")||mydest.contains("Jalna")||mydest.contains("Ambarnath")||mydest.contains("Bhusawal")||mydest.contains("Ratnagiri")||mydest.contains("Beed")||mydest.contains("Gondia")||mydest.contains("Satara")||mydest.contains("Barshi")||mydest.contains("Yavatmal")||mydest.contains("Achalpur")||mydest.contains("Osmanabad")||mydest.contains("Nandurbar")||mydest.contains("Wardha")||mydest.contains("Udgir")||mydest.contains("Hinganghat")||mydest.contains("Kandivali")||mydest.contains("Goa"))
            {   
            System.out.println("Enter the date:like 23 or 12");
            int date = sc.nextInt();
            
            if(date==1 || date==2 || date==3 || date==4 || date==5 || date==6 || date==7 || date==8 || date==9 || date==10 || date==11 || date==12 || date==13 || date==14 || date==15 || date==16 || date==17 || date==18 || date==19 || date==20 || date==21 || date==22 || date==23 || date==24 || date==25 || date==26 || date==27 || date==28 || date==29 || date==30 || date==31)
            {
                System.out.println("Enter the Month:like January or March");
                String month = sc.next();
                if(month.contains("January")&&(date==1 || date==2 || date==3 || date==4 || date==5 || date==6 || date==7 || date==8 || date==9 || date==10 || date==11 || date==12 || date==13 || date==14 || date==15 || date==16 || date==17 || date==18 || date==19 || date==20 || date==21 || date==22 || date==23 || date==24 || date==25 || date==26 || date==27 || date==28 || date==29 || date==30 || date==31) || 
                   month.contains("February")&&(date==1 || date==2 || date==3 || date==4 || date==5 || date==6 || date==7 || date==8 || date==9 || date==10 || date==11 || date==12 || date==13 || date==14 || date==15 || date==16 || date==17 || date==18 || date==19 || date==20 || date==21 || date==22 || date==23 || date==24 || date==25 || date==26 || date==27 || date==28) || 
                   month.contains("March")&&(date==1 || date==2 || date==3 || date==4 || date==5 || date==6 || date==7 || date==8 || date==9 || date==10 || date==11 || date==12 || date==13 || date==14 || date==15 || date==16 || date==17 || date==18 || date==19 || date==20 || date==21 || date==22 || date==23 || date==24 || date==25 || date==26 || date==27 || date==28 || date==29 || date==30 || date==31) ||
                   month.contains("April")&&(date==1 || date==2 || date==3 || date==4 || date==5 || date==6 || date==7 || date==8 || date==9 || date==10 || date==11 || date==12 || date==13 || date==14 || date==15 || date==16 || date==17 || date==18 || date==19 || date==20 || date==21 || date==22 || date==23 || date==24 || date==25 || date==26 || date==27 || date==28 || date==29 || date==30) ||
                   month.contains("May")&&(date==1 || date==2 || date==3 || date==4 || date==5 || date==6 || date==7 || date==8 || date==9 || date==10 || date==11 || date==12 || date==13 || date==14 || date==15 || date==16 || date==17 || date==18 || date==19 || date==20 || date==21 || date==22 || date==23 || date==24 || date==25 || date==26 || date==27 || date==28 || date==29 || date==30 || date==31) ||
                   month.contains("June")&&(date==1 || date==2 || date==3 || date==4 || date==5 || date==6 || date==7 || date==8 || date==9 || date==10 || date==11 || date==12 || date==13 || date==14 || date==15 || date==16 || date==17 || date==18 || date==19 || date==20 || date==21 || date==22 || date==23 || date==24 || date==25 || date==26 || date==27 || date==28 || date==29 || date==30) ||
                   month.contains("July")&&(date==1 || date==2 || date==3 || date==4 || date==5 || date==6 || date==7 || date==8 || date==9 || date==10 || date==11 || date==12 || date==13 || date==14 || date==15 || date==16 || date==17 || date==18 || date==19 || date==20 || date==21 || date==22 || date==23 || date==24 || date==25 || date==26 || date==27 || date==28 || date==29 || date==30 || date==31) ||
                   month.contains("August")&&(date==1 || date==2 || date==3 || date==4 || date==5 || date==6 || date==7 || date==8 || date==9 || date==10 || date==11 || date==12 || date==13 || date==14 || date==15 || date==16 || date==17 || date==18 || date==19 || date==20 || date==21 || date==22 || date==23 || date==24 || date==25 || date==26 || date==27 || date==28 || date==29 || date==30 || date==31) ||
                   month.contains("September")&&(date==1 || date==2 || date==3 || date==4 || date==5 || date==6 || date==7 || date==8 || date==9 || date==10 || date==11 || date==12 || date==13 || date==14 || date==15 || date==16 || date==17 || date==18 || date==19 || date==20 || date==21 || date==22 || date==23 || date==24 || date==25 || date==26 || date==27 || date==28 || date==29 || date==30) ||
                   month.contains("October")&&(date==1 || date==2 || date==3 || date==4 || date==5 || date==6 || date==7 || date==8 || date==9 || date==10 || date==11 || date==12 || date==13 || date==14 || date==15 || date==16 || date==17 || date==18 || date==19 || date==20 || date==21 || date==22 || date==23 || date==24 || date==25 || date==26 || date==27 || date==28 || date==29 || date==30 || date==31) ||
                   month.contains("November")&&(date==1 || date==2 || date==3 || date==4 || date==5 || date==6 || date==7 || date==8 || date==9 || date==10 || date==11 || date==12 || date==13 || date==14 || date==15 || date==16 || date==17 || date==18 || date==19 || date==20 || date==21 || date==22 || date==23 || date==24 || date==25 || date==26 || date==27 || date==28 || date==29 || date==30) ||
                   month.contains("December")&&(date==1 || date==2 || date==3 || date==4 || date==5 || date==6 || date==7 || date==8 || date==9 || date==10 || date==11 || date==12 || date==13 || date==14 || date==15 || date==16 || date==17 || date==18 || date==19 || date==20 || date==21 || date==22 || date==23 || date==24 || date==25 || date==26 || date==27 || date==28 || date==29 || date==30 || date==31))
                {
                    System.out.println("Enter the time of Journey in hour:like 07 or 00");
                    int hour = sc.nextInt();
                    if(hour==00 || hour==1 || hour==2 || hour==3 || hour==4 || hour==5 || hour==6 || hour==7 || hour==8 || hour==9 || hour==10 || hour==11 || hour==12 || hour==13 || hour==14 || hour==15 || hour==16 || hour==17 || hour==18 || hour==19 || hour==20 || hour==21 || hour==22 || hour==23)
                    {
                        System.out.println("Enter the time of Journey in minutes:like 00 or 25");
                        int minute = sc.nextInt();
                        if(minute==00||minute==1||minute==2||minute==3||minute==4||minute==5||minute==6||minute==7||minute==8||minute==9||minute==10||minute==11||minute==12||minute==13||minute==14||minute==15||minute==16||minute==17||minute==18||minute==19||minute==20||minute==21||minute==22||minute==23||minute==24||minute==25||minute==26||minute==27||minute==28||minute==29||minute==30||minute==31||minute==32||minute==33||minute==34||minute==35||minute==36||minute==37||minute==38||minute==39||minute==40||minute==41||minute==42||minute==43||minute==44||minute==45||minute==46||minute==47||minute==48||minute==49||minute==50||minute==51||minute==52||minute==53||minute==54||minute==55||minute==56||minute==57||minute==58||minute==59)
                        {
                            System.out.println("Select the Type of train");
                            System.out.println("Passenger");
                            System.out.println("Local");
                            System.out.println("Super-fast");
                            System.out.println("Express");
                            String choice = sc.next();
                            if(choice.contains("Passenger")||choice.contains("Local")||choice.contains("Super-fast")||choice.contains("Express"))
                            {
                                System.out.println("To confirm your ticket from " + mystart + " to " + mydest + " on date " + date + "-" + month +" on time " + hour + " hour:" + minute + " minutes" + " by " + choice + " train:-\nPress 1.yes\n2.no");
                                int yn = sc.nextInt();
                                if(yn==1)
                                {
                                    System.out.println("Your ticket is booked.\nHave a safe journey\nThank you....!");
                                }
                                else
                                {
                                    System.out.print("");
                                }
                            }
                            else
                            {
                                System.out.print("Enter the valid train type for journey.");
                            }
                        }
                        else
                        {
                            System.out.print("Enter the valid time in minutes.");
                        }
                    }
                    else
                    {
                        System.out.print("Enter the valid time in hour.");
                    } 
                }
                else
                {
                    System.out.print("Enter the valid month.");
                }
            }
            else
            {
                System.out.println("Enter the valid date.");
            }
            }
            else
            {
                System.out.println("Enter the valid destination place.");
            }
            }
            else
            {
                System.out.println("Enter the valid starting location.");
            }
        }

    }

}
