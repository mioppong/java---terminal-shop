import java.io.*;
import java.text.NumberFormat;
public class Opingpong
{



    //protected variable
    protected double total;
    protected String password;
    protected String username;
    protected int acctNumb;
    protected String cartItems[] = new String [100];
    protected int size;
    protected int checkOut;
    protected int continent;
    protected double tax[] = {0.12, 0.11, 0.22, 0.13, 0.14, 0.16, 0.19};
    protected char exit;
    protected double subTotal;
    protected String adress;
    protected long credit;



    public void Receipt ()  //receipt method
    { //opens method

	//Rounding numbers
	NumberFormat nf = NumberFormat.getInstance ();
	nf.setMaximumFractionDigits (2); //this sets the max # of digits after the decimal
	nf.setMinimumFractionDigits (2); //this sets the min # of digits after the decimal


	//receipt output
	System.out.println (" ");
	System.out.println ("*******************************************************");
	System.out.println ("RECEIPT.");
	System.out.println (" ");

	//cart loop
	for (int c = 0 ; c < 100 ; c++)
	{
	    if (cartItems [c] != null)
	    {
		System.out.println (cartItems [c]);
	    }
	}

	//cont receipt output
	System.out.println (" ");
	System.out.println ("Sub total: $" + nf.format (subTotal)); //without tax
	System.out.println ("Total: $" + nf.format (total));
	System.out.println ("Delivered at: " + adress);
	System.out.println ("Credit card: " + credit);
	System.out.println ("*******************************************************");
 
	Exit (); //calls exit method
    }


    public void LocationandPay ()  //tax and location method
    { //opens method

	//location output
	System.out.println (" ");
	System.out.println ("Please select your continent");
	System.out.println (" ");
	System.out.println ("1.North America ");
	System.out.println ("2.South America ");
	System.out.println ("3.Africa ");
	System.out.println ("4.Europe ");
	System.out.println ("5.Asia ");
	System.out.println ("6.Australia ");
	System.out.println ("7.Antartica ");
	System.out.println (" ");
	System.out.print ("Choice: ");
	continent = TextIO.getlnInt (); //gets the users choice
	subTotal = total; //sets subtotal as total
	if (continent == 1)
	{ //opens continent if loop

	    total = total + (total * tax [0]);

	} //closes continent if loop

	if (continent == 2)
	{ //opens continent if loop

	    total = total + (total * tax [1]);

	} //closes continent if loop

	if (continent == 3)
	{ //opens continent if loop

	    total = total + (total * tax [2]);

	} //closes continent if loop

	if (continent == 4)
	{ //opens continent if loop

	    total = total + (total * tax [3]);

	} //closes continent if loop

	if (continent == 5)
	{ //opens continent if loop

	    total = total + (total * tax [4]);

	} //closes continent if loop

	if (continent == 6)
	{ //opens continent if loop

	    total = total + (total * tax [5]);

	} //closes continent if loop

	if (continent == 7)
	{ //opens continent if loop

	    total = total + (total * tax [6]);

	} //closes continent if loop

	System.out.print ("Please enter your adress: "); //prompts user
	adress = TextIO.getlnString (); //gets the users answer

	System.out.print ("Please enter your debit or visa card #: "); //prompts user
	credit = TextIO.getlnLong ();

	Receipt (); //calls receipt

    } //closes method


    public void Size (String a)
    { //opens size method

	//size output
	System.out.println (" ");
	System.out.println ("Select your size,");
	System.out.println ("1.Small");
	System.out.println ("2.Medium");
	System.out.println ("3.Large");
	System.out.println (" ");
	System.out.print ("Choice: ");
	size = TextIO.getlnInt (); //gets the users choice

	if (size == 1)
	{ //opens size if loop

	    a = (a + ": Small");

	} //closes size if loop

	if (size == 2)
	{ //opens size if loop

	    a = (a + ": Medium");

	} //closes size if loop

	if (size == 3)
	{ //opens size if loop

	    a = (a + ": Large");

	} //closes size if loop

	Cart (a, 0); //calls cart method


    } //closes size method


    public void Exit ()  //Exit method
    { //opens Exit method

	//Exit output
	System.out.println (" ");
	System.out.println ("Thank you for shopping with us, come back soon :D!");
	System.out.print ("Enter any character to exit, ");
	exit = TextIO.getlnChar (); //gets the users answer
	System.exit (exit); //closes the program

    } //closes Exit method


    public void CheckTotal ()  //method that to check if user has bought something and asks user to check out
    { //opens CheckTotal method

	if (total > 0)
	{ //opens total if loop

	    //check out output
	    System.out.println (" ");
	    System.out.println ("Do you want to Check Out");
	    System.out.println ("1.yes");
	    System.out.println ("2.No");
	    System.out.println (" ");
	    System.out.print ("Choice: ");
	    checkOut = TextIO.getlnInt (); //gets the users choice

	    if (checkOut == 1)
	    { //opens checkOut if loop

		CheckOut ();

	    } //closes checkOut if loop

	} //closes total if loop

    } //closes CheckTotal method


    public void CheckOut ()  //check out method
    { //opens CheckOut method


	for (int b = 0 ; b < cartItems.length ; b++) //for loop that prints out the cart
	{ //opens for loop

	    if (cartItems [b] != null)
	    { //opens cartItems if loopx

		System.out.println (b + 1 + "." + cartItems [b]); //output of cart

	    } //closes cartItems if loop

	    else //if there is no item in that position
	    { //opens cartItems else loop

		break; //break out of loop

	    } //closes cartItems else loop

	} //closes for loop

	LocationandPay (); //calls the method LocationandPay

    } //closes Checkout method








    public void Setusername (String y)
    { //opens Setusername method

	username = y; //sets username to y

    } //closes Setusername method


    public void Setpassword (String y)
    { //opens Setpassword method

	password = y; //sets password to y

    } //closes Setpassword method


    public void Settotal (double tot)
    { //opens Settotal method

	total = tot + total; //sets total to total plus tot

    } //closes Settotal method


    public void Cart (String a, int x)  //loop to store things added to card
    { //opens Cart method

	if (cartItems [x] == null)
	{ //opens if loop
	    cartItems [x] = a;



	} //closes if loop


	else //
	{ //opens else loop


	    Cart (a, x + 1);

	} //closes else loop

    } //closes Cart method
} //closes public class


