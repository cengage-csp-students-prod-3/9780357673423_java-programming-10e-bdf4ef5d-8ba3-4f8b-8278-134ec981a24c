// Write your code here
/* 
Use the Web to locate the lyrics to the traditional song “The Twelve Days of Christmas.” 
The song contains a list of gifts received for the holiday. The list is cumulative so 
that as each “day” passes, a new verse contains all the words of the previous verse, 
plus a new item. 
Write an application called TwelveDays that displays the words to the song starting 
with any day the user enters.
On the twelfth day of Christmas, my true love sent to me
Twelve drummers drumming
    VAR
get day.

    input 
From what day do you want to start
the song The Twelve Days of Christmas? >>

    COMPUTE
switch(getDay == (optionNumber)) {
case 1:
    print (firstday);
}
casse 2:
    print (secondDay)
    ...
*/

import java.util.Scanner;

public class TwelveDays {
    
    public static void main(String[] args) {
        int getDay;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("From what day do you want to start the song The Twelve Days of Christmas? >>");
        getDay = keyboard.nextInt();
        System.out.println("On the "+getDay+" day of Christmas");       
        System.out.println("My true love sent to me");   

        switch (getDay) {
            case 12:
                System.out.println("Twelve drummers drumming");
            case 11:
                System.out.println("Eleven pipers piping");
            case 10:
                System.out.println("Ten lords a-leaping");
            case 9:
                System.out.println("Nine ladies dancing");
            case 8:
                System.out.println("Eight maids a-milking");
            case 7:
                System.out.println("Seven swans a-swimming");
            case 6:
                System.out.println("Six geese a-laying");
            case 5:
                System.out.println("Five golden rings");
            case 4:
                System.out.println("Four calling birds");
            case 3:
                System.out.println("Three french hens");
            case 2:
                System.out.println("Two turtle doves and");
            case 1:
                System.out.println("A partridge in a pear tree");
            
        
            default:
                break;
        }
    }
    
}