package entities;

import java.time.LocalDate;
import java.util.Scanner;

public class Internet {
    public static void main(String[] args) {

        Client male = new Client(7557, "Godwin", "Wilson", "kadezomail", new String[]{"gjhg", "knbn", "knbgknb"});
        Shop negozio = new Shop("www.above.com", "this is Customer support", 5000);
        Cart cart = new Cart("support@y.com", "pretty good product", 199, 77,
                "knbfhnnb", 77);
        /*Articles selected = new Articles("www.buy.come", "customersupport",
                5000, new Client(7399,
                "Godwin", "Wilson", "dezomail@y.com", new String[]{"gjhg", "knbn", "knbgknb"});*/


        /*cart.price(190);
        cart.setArticlenum(74893);
        negozio.support();
        male.call();
        negozio.checkOutReport();*/

        /*selected.list("clothes");*/
        Scanner input = new Scanner(System.in);

        System.out.println("Type in 1: for complain and checkout support, or 2 to exit chat");
        int risp = Integer.parseInt(input.nextLine());
        switch(risp){
            case(1) :
            {
                System.out.println("How may i help you?");
                negozio.support();
                System.out.println("What is your Cart number");
                int num = Integer.parseInt(input.nextLine());
                if(num == 74893)
                {
                    System.out.println("Unfortunately the item you are searching for is currently out of stock. " +
                            "Please check your email for more info");
                    break;
                }else{
                    System.out.println("I will check and get back to you in a minute");
                }
                System.out.println("How much worth of goods are in your cart?");
                int checkout = Integer.parseInt(input.nextLine());
                if (checkout <= 200){
                    System.out.println("You can get a discount if you spend 200euro or more");

                }else {
                    System.out.println("this purchase of: " + checkout + " means you are eligible for discount type 2:");
                    int lastLine = Integer.parseInt(input.nextLine());
                    if(lastLine == 2){
                        System.out.println("Happy shopping");
                    }
                    break;
                }
                System.out.println("Please add more products to your cart or type 2");
                int lastLine = Integer.parseInt(input.nextLine());
                if(lastLine == 1){
                    System.out.println("Happy shopping");
                    break;
                }else{
                    System.out.println("Here is a link to our latest collection of trousers, have fun");
                    break;
                }

            } case(2):
            {
                System.out.println("Thanks for stopping by, until next time");
            }
        }

        input.close();


        System.out.println();
    }


}
