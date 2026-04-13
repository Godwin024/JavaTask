import java.util.Scanner;

public class Nokiaphone{
  
  public static void main(String[] args){
    
   Scanner input = new Scanner(System.in);
       
     System.out.println("NOKIA MENU");
     System.out.println(" ");
     System.out.println("1.  Phone Book");
     System.out.println("2.  Messages");
     System.out.println("3.  Chat");
     System.out.println("4.  Call Register");
     System.out.println("5.  Tones");
     System.out.println("6.  Settings");
     System.out.println("7.  Call Divert");
     System.out.println("8.  Games");
     System.out.println("9.  Calculator");
     System.out.println("10. Reminders");
     System.out.println("11. Clock");
     System.out.println("12. Profile");
     System.out.println("13. SIM service\n");

 System.out.println("Select options above:");
     int selectOption = input.nextInt();

 switch(selectOption){
       case 1: System.out.println("PHONE BOOK\n");
               System.out.println("1. Search ");
               System.out.println("2. Service Nos.");
               System.out.println("3. Add name");
               System.out.println("4. Erase");
               System.out.println("5. Edit");
               System.out.println("6. Assign tone");
               System.out.println("7. Send b`card");
               System.out.println("8. Options");
               System.out.println("9. Speed dails");
               System.out.println("10. Voice tags\n");

 System.out.println("PHONE BOOK Selections:");
     int phonebookSelection = input.nextInt();
  
  switch (phonebookSelection){
         case 1: System.out.println("-> Search");
              break;
         case 2: System.out.println("-> Service Nos");
              break;
         case 3:  System.out.println("-> Add name");
              break;
         case 4:  System.out.println("-> Erase");
              break;
         case 5:  System.out.println("-> Edit");
              break;
         case 6:  System.out.println("-> Assign tone");
              break;
         case 7:  System.out.println("-> Sendb b`card");
              break;
         case 8:  System.out.println("-> Options");
                  System.out.println("1: Type of view");
                  System.out.println("2: Memory status");
 
 System.out.println("Select options:");
     int typeView = input.nextInt();

  switch(typeView) {
         case 1: System.out.println("-> Type View");
              break;
         case 2: System.out.println("-> Memory status");
              break; 
         default: System.out.println("Invalid selection");
         }    
              break;

         case 9: System.out.println("-> Speed dails");
              break;
         case 10: System.out.println("-> Voice tags");
              break;
         default: System.out.println("Invalid selection");

         }
              break;

         

          case 2: System.out.println("MESSAGES\n");
                  System.out.println("1. Write message");
                  System.out.println("2. Inbox");
                  System.out.println("3. Outbox");
                  System.out.println("4. Picture messages");
                  System.out.println("5. Templates");
                  System.out.println("6. Semileys");
                  System.out.println("7. Messages settings");

  System.out.println("MESSAGE selection:");
    int messageSelection = input.nextInt();

  switch(messageSelection){
             case 1: System.out.println("-> Write messages");
              break;
         case 2: System.out.println("-> Inbox");
              break;
         case 3:  System.out.println("-> Outbox");
              break;
         case 4:  System.out.println("-> picture messages");
              break;
         case 5:  System.out.println("-> Templates");
              break;
         case 6:  System.out.println("-> Smileys");
              break;
         case 7:  System.out.println("-> Messages settings");
                  System.out.println("1: Set");
                  System.out.println("2: Common");

   System.out.println("Selection option:");
    int setSelection = input.nextInt();

    switch(setSelection){
         case 1: System.out.println("-> Set");
                 System.out.println("Message center number");
                 System.out.println("Messages sent as");
                 System.out.println("Message validity");
  
    System.out.println("Select:");
      int set =input.nextInt();

    switch (set){

          case 1: System.out.println("-> Message center number");
               break; 
          case 2: System.out.println("-> Message sent as ");
               break;
          case 3: System.out.println("Message validity");
               break;
          default: System.out.println("Invalid"); 
          }
          
          case 2: System.out.println("->Common");
                  System.out.println("-> Delivery reports");
                  System.out.println("-> Reply via same center");
                  System.out.println("-> character support");

    System.out.println("Select option");
      int commonOption = input.nextInt();
  
     switch (commonOption){
           case 1: System.out.println("-> Delivery reports");
                break;
           case 2: System.out.println("-> Reply via same center");
                break;
           case 3: System.out.println("-> character support");
                break;
           default: System.out.println("-> Invalid");
           }
                break;
            
            
           case 4:  System.out.println("8. Info service");
                break;
           case 5:  System.out.println("9. Voice mailbox number");
                break;
           case 6:  System.out.println("10. Service command editor");
                break;
           default: System.out.println("Invalid selection");
           }

         

                  
                 
               
  
             


}



  
          

                 

                 



               
                       
            
        


}     
  


   
   }


}
