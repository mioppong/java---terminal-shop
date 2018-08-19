//shipping shystem
//names infront of prices
//check if price they entered is actually true
//login properly
//add remove stuff
//keep askin if they wana check out

import java.io.*;
import java.text.NumberFormat;
public class Opingpongmain
{
    public static void main (String[] args) throws IOException
    {
    
	//Rounding numbers
	NumberFormat nf = NumberFormat.getInstance ();
	nf.setMaximumFractionDigits (2); //this sets the max # of digits after the decimal
	nf.setMinimumFractionDigits (2); //this sets the min # of digits after the decimal

	//variables
	int category;
	int gender;
	int option;
	int Option1;
	int size;
	String Continent;
	String address;
	double Option2;
	double cost = 0;

	//2D arrays
	double topsMale[] [] = {{16.99, 15.93, 13.43}, {10.99, 12.45, 11.50}, {24.99, 34.99, 30.50}};
	double bottomsMale[] [] = {{20.62, 18.38, 17.96}, {24.36, 30.00, 28.53}, {10.25, 11.35, 15.69}};
	double topsFemale[] [] = {{19.99, 15.99, 14.45}, {12.32, 11.99, 9.56}};
	double bottomsFemale[] [] = {{25.99, 26.54, 32.99}, {24.99, 22.45, 26.99}, {27.99, 25.65, 29.85}};
	double dressFemale[] [] = {{19.99, 20.90, 30.11}};
	double CandT[] [] = {{499.99, 549.99, 999.99}, {349.99, 249.99, 149.99}, {699.99, 799.99, 1699.99}};
	double TVandHT[] [] = {{299.99, 199.99}, {200.00, 399.99}, {99.99, 159.99}};
	double CandC[] [] = {{99.99, 199.99}, {789.99, 899.99}, {249.99, 149.99}};


	BufferedWriter out = new BufferedWriter (new FileWriter (new File ("password.txt"))); //send the information the user enters to a blank

	//sign up information variables
	String userName;
	String userPassword;

	System.out.println ("Create a username and a password"); //prompts the user

	System.out.println (" "); //space
	System.out.print ("Enter a username: ");
	userName = TextIO.getlnString (); //retrieves the username entered
	System.out.print ("Enter a password: ");
	userPassword = TextIO.getlnString (); //retrieves the password entered


	out.write (String.valueOf (userName)); //sends the username to the file
	out.newLine (); //makes the file go to the next line
	out.write (String.valueOf (userPassword)); //sends the password to the file

	out.flush ();
	out.close (); //closes the file



	Opingpong user = new Opingpong ();
	user.Setusername (userName);
	user.Setpassword (userPassword);


	while (true) //while loop of the store
	{ //opens while loop

	    user.CheckTotal (); //calls CheckTotal from Opingpong
	    //home screen output
	    System.out.println (" ");
	    System.out.println ("Please select a category,");
	    System.out.println (" ");
	    System.out.println ("1.Clothing");
	    System.out.println ("2.Electronics");
	    System.out.println (" ");
	    System.out.print ("Choice: ");
	    category = TextIO.getlnInt (); //gets the category they have selected


	    if (category == 1)
	    { //opens category if loop

		//clothing home screen output
		System.out.println (" ");
		System.out.println ("Please select gender,");
		System.out.println (" ");
		System.out.println ("1.Male");
		System.out.println ("2.Female");
		System.out.println ("Enter 3 to go back to main menu/checkout");
		System.out.println (" ");
		System.out.print ("Choice: ");
		gender = TextIO.getlnInt (); //gets gender user has selected or if the user wishes to return to home screen

		if (gender == 1)
		{ //opens gender if loop

		    //male output
		    System.out.println (" ");
		    System.out.println ("1.Tops");
		    System.out.println ("2.Bottoms");
		    System.out.println ("Enter 3 to go back to main menu/checkout");
		    System.out.println (" ");
		    System.out.print ("Choice: ");
		    option = TextIO.getlnInt (); //gets male option chosen


		    if (option == 1)
		    { //opens option if loop

			//male tops output
			System.out.println (" ");
			System.out.println ("1.Long Sleeve Shirts");
			System.out.println ("2.Short Sleeves Shirts");
			System.out.println ("3.Dress Shirts");
			System.out.println ("Enter 4 to go back to main menu/checkout");
			System.out.println (" ");
			System.out.print ("Choice: ");
			Option1 = TextIO.getlnInt (); //gets male tops Option1 choice

			if (Option1 == 1) //if user selected 1 for previous question
			{ //opens Option1 if loop

			    //male long sleeve shirts output
			    System.out.println (" ");
			    System.out.println ("Enter the number of the product you want,");
			    System.out.println (" ");
			    System.out.println ("1.Tommy Hilfiger Long Sleeve Shirt : $16.99");
			    System.out.println ("2.Lacoste Long Sleeve Polo Shirt   : $15.93");
			    System.out.println ("3.Gap Long Sleeve Sweater          : $13.43");
			    System.out.println ("Enter 4 to go back to main menu/checkout");
			    System.out.println (" ");
			    System.out.print ("Choice: ");
			    Option2 = TextIO.getlnInt (); //gets male long sleeve shirts choice


			    if (Option2 == 1) //if they chose top 1
			    { //opens Option2 if loop

				user.Settotal (topsMale [0] [0]); //calls Settotal from Opingpong and sends the price for long sleeve 1
				user.Size ("Male, Tommy Hilfiger Long Sleeve Shirt: $" + topsMale [0] [0]); //calls Size from Opinpong and sends the information of the top with the price

			    } //closes Option2 if loop

			    if (Option2 == 2) //if they chose top 2
			    { //opens Option2 if loop

				user.Settotal (topsMale [0] [1]); //calls Settotal from Opingpong and sends the price for long sleeve 2
				user.Size ("Male, Lacoste Long Sleeve Polo Shirt: $" + topsMale [0] [1]); //calls Size from Opinpong and sends the information of the top with the price

			    } //closes Option2 if loop

			    if (Option2 == 3) //if they chose top 3
			    { //opens Option2 if loop

				user.Settotal (topsMale [0] [2]); //calls Settotal from Opingpong and sends the price for long sleeve 3
				user.Size ("Male, Gap Long Sleeve Sweater: $" + topsMale [0] [2]); //calls Size from Opinpong and sends the information of the top with the price

			    } //closes Option2 if loop

			} // closes Option1 if loop


			if (Option1 == 2) //if user selected 2 for previous question
			{ //opens Option1 if loop

			    //male short sleeve shirts output
			    System.out.println (" ");
			    System.out.println ("Enter the number of the product you want,");
			    System.out.println (" ");
			    System.out.println ("1.Ralph Lauren Short Sleeve Polo Shirt   : $10.99 ");
			    System.out.println ("2.Tommy Hilfiger Short Sleeve Button Up  : $12.45");
			    System.out.println ("3.Lacoste Short Sleeve Polo Shirt        : $11.50");
			    System.out.println ("Enter 4 to go back to main menu/checkout");
			    System.out.println (" ");
			    System.out.print ("Choice: ");
			    Option2 = TextIO.getlnInt (); //gets male short sleeve shirt choice

			    if (Option2 == 1)
			    { //opens Option2 if loop

				user.Settotal (topsMale [1] [0]); //calls Settotal from Opingpong and sends the price for short sleeve 1
				user.Size ("Male, Ralph Lauren Short Sleeve Polo Shirt: $" + topsMale [1] [0]); //calls Size from Opinpong and sends the information of the top with the price

			    } //closes Option2 if loop

			    if (Option2 == 2)
			    { //opens Option2 if loop

				user.Settotal (topsMale [1] [1]); //calls Settotal from Opingpong and sends the price for short sleeve 2
				user.Size ("Male, Tommy Hilfiger Short Sleeve Button Up: $" + topsMale [1] [1]); //calls Size from Opinpong and sends the information of the top with the price

			    } //closes Option2 if loop

			    if (Option2 == 3)
			    { //opens Option2 if loop

				user.Settotal (topsMale [1] [2]); //calls Settotal from Opingpong and sends the price for short sleeve 3
				user.Size ("Male, Lacoste Short Sleeve Polo Shirt: $" + topsMale [1] [2]); //calls Size from Opinpong and sends the information of the top with the price

			    } //closes Option2 if loop

			} //closes Option1 if loop

			if (Option1 == 3)
			{ //opens Option1 if loop

			    //male dress shirts output
			    System.out.println (" ");
			    System.out.println ("Enter the number of the product you want,");
			    System.out.println (" ");
			    System.out.println ("1.Supreme Dress Shirt : $24.99");
			    System.out.println ("2.Levis Dress Shirt   : $34.99");
			    System.out.println ("3.Guess Dress Shirt   : $30.50");
			    System.out.println ("Enter 4 to go back to main menu/checkout");
			    System.out.println (" ");
			    System.out.print ("Choice: ");
			    Option2 = TextIO.getlnInt (); //gets male dress shirt choice


			    if (Option2 == 1)
			    { //opens Option2 if loop

				user.Settotal (topsMale [2] [0]); //calls Settotal from Opingpong and sends the price for dress shirt 1
				user.Size ("Male, Supreme Dress Shirt: $" + topsMale [2] [0]); //calls Size from Opinpong and sends the information of the top with the price

			    } //closes Option2 if loop

			    if (Option2 == 2)
			    { //opens Option2 if loop

				user.Settotal (topsMale [2] [1]); //calls Settotal from Opingpong and sends the price for dress shirt 2
				user.Size ("Male, Levis Dress Shirt: $" + topsMale [2] [1]); //calls Size from Opinpong and sends the information of the top with the price

			    } //closes Option2 if loop

			    if (Option2 == 3)
			    { //opens Option2 if loop

				user.Settotal (topsMale [2] [2]); //calls Settotal from Opingpong and sends the price for dress shirt 3
				user.Size ("Male, Guess Dress Shirt : $" + topsMale [2] [2]); //calls Size from Opinpong and sends the information of the top with the price

			    } //closes Option2 if loop

			} //closes Option1 if loop

		    } //closes option if loop

		    if (option == 2)
		    { //opens option if loop

			//male bottoms output
			System.out.println (" ");
			System.out.println ("1.Shorts");
			System.out.println ("2.Pants");
			System.out.println ("3.Boxers");
			System.out.println ("Enter 4 to go back to main menu/checkout");
			System.out.println (" ");
			System.out.print ("Choice: ");
			Option1 = TextIO.getlnInt (); //gets male bottoms choice

			if (Option1 == 1)
			{ //opens Option1 if loop

			    //male shorts output
			    System.out.println (" ");
			    System.out.println ("Enter the number of the product you want,");
			    System.out.println (" ");
			    System.out.println ("1. Nike Black Shorts            : $20.62");
			    System.out.println ("2. Adiddas Red and Black Shorts : $18.38");
			    System.out.println ("3. Puma Navy Blue Shorts        : $17.96");
			    System.out.println ("Enter 4 to go back to main menu/checkout");
			    System.out.println (" ");
			    System.out.print ("Choice: ");
			    Option2 = TextIO.getlnInt (); //gets male shorts choice

			    if (Option2 == 1)
			    { //opens Option2 if loop

				user.Settotal (bottomsMale [0] [0]); //calls Settotal from Opingpong and sends the price for shorts 1
				user.Size ("Male, Nike Black Shorts: $" + bottomsMale [0] [0]); //calls Size from Opinpong and sends the information of the bottom with the price

			    } //closes Option2 if loop

			    if (Option2 == 2)
			    { //opens Option2 if loop

				user.Settotal (bottomsMale [0] [1]); //calls Settotal from Opingpong and sends the price for shorts 2
				user.Size ("Male, Adiddas Red and Black Shorts: $" + bottomsMale [0] [1]); //calls Size from Opinpong and sends the information of the bottom with the price

			    } //closes Option2 if loop

			    if (Option2 == 3)
			    { //opens Option2 if loop

				user.Settotal (bottomsMale [0] [2]); //calls Settotal from Opingpong and sends the price for shorts 3
				user.Size ("Male, Puma Navy Blue Shorts: $" + bottomsMale [0] [2]); //calls Size from Opinpong and sends the information of the bottom with the price

			    } //closes Option2 if loop

			} //closes Option1 if loop

			if (Option1 == 2)
			{ //opens Option1 if loop

			    //male pants output
			    System.out.println (" ");
			    System.out.println ("Enter the number of the product you want,");
			    System.out.println (" ");
			    System.out.println ("1.True Religion Jeans : $24.36");
			    System.out.println ("2.Levis Jeans         : $30.00");
			    System.out.println ("3.Dickies Cargo Pants : $28.53");
			    System.out.println ("Enter 4 to go back to main menu/checkout");
			    System.out.println (" ");
			    System.out.print ("Choice: ");
			    Option2 = TextIO.getlnInt (); //gets male pants choice

			    if (Option2 == 1)
			    { //opens Option2 if loop

				user.Settotal (bottomsMale [1] [0]); //calls Settotal from Opingpong and sends the price for pants 1
				user.Size ("Male, True Religion Jeans: $" + bottomsMale [1] [0]); //calls Size from Opinpong and sends the information of the bottom with the price

			    } //closes Option2 if loop

			    if (Option2 == 2)
			    { //opens Option2 if loop

				user.Settotal (bottomsMale [1] [1]); //calls Settotal from Opingpong and sends the price for pants 2
				user.Size ("Male, Levis Jeans: $" + bottomsMale [1] [1]); //calls Size from Opinpong and sends the information of the bottom with the price

			    } //closes Option2 if loop

			    if (Option2 == 3)
			    { //opens Option2 if loop

				user.Settotal (bottomsMale [1] [2]); //calls Settotal from Opingpong and sends the price for pants 3
				user.Size ("Male, Dickies Cargo Pants: $" + bottomsMale [1] [2]); //calls Size from Opinpong and sends the information of the bottom with the price

			    } //closes Option2 if loop

			} //closes Option1 if loop

			if (Option1 == 3)
			{ //opens Option1 if loop

			    //male boxers output
			    System.out.println (" ");
			    System.out.println ("Enter the number of the product you want,");
			    System.out.println (" ");
			    System.out.println ("1.Tommy Hilfigher Boxers : $10.25");
			    System.out.println ("2.Addids Boxers          : $11.35");
			    System.out.println ("3.Nike Boxers            : $15.69");
			    System.out.println ("Enter 4 to go back to main menu/checkout");
			    System.out.println (" ");
			    System.out.print ("Choice: ");
			    Option2 = TextIO.getlnInt (); //gets male boxers`choice

			    if (Option2 == 1)
			    { //opens Option2 if loop

				user.Settotal (bottomsMale [2] [0]); //calls Settotal from Opingpong and sends the price for boxers 1
				user.Size ("Male, Tommy Hilfigher Boxers: $" + bottomsMale [2] [0]); //calls Size from Opinpong and sends the information of the bottom with the price

			    } //closes Option2 if loop

			    if (Option2 == 2)
			    { //opens Option2 if loop

				user.Settotal (bottomsMale [2] [1]); //calls Settotal from Opingpong and sends the price for boxers 2
				user.Size ("Male, Adiddas Boxers: $" + bottomsMale [2] [1]); //calls Size from Opinpong and sends the information of the bottom with the price

			    } //closes Option2 if loop

			    if (Option2 == 3)
			    { //opens Option2 if loop

				user.Settotal (bottomsMale [2] [2]); //calls Settotal from Opingpong and sends the price for boxers 3
				user.Size ("Male, Nike Boxers: $" + bottomsMale [2] [2]); //calls Size from Opinpong and sends the information of the bottom with the price

			    } //closes Option2 if loop

			} //closes Option1 if loop

		    } //closes option if loop

		} //closes gender if loop

		if (gender == 2)
		{ //opens gender if loop

		    //female home screen output
		    System.out.println (" ");
		    System.out.println ("1.Tops");
		    System.out.println ("2.Bottoms");
		    System.out.println ("3.Dresses");
		    System.out.println ("Enter 4 to go back to main menu/checkout");
		    System.out.println (" ");
		    System.out.print ("Choice: ");
		    option = TextIO.getlnInt (); //gets option choice

		    if (option == 1)
		    { //opens option if loop

			//female tops output
			System.out.println (" ");
			System.out.println ("1.Long Sleeve Shirts");
			System.out.println ("2.Short Sleeve Shirts");
			System.out.println ("Enter 3 to go back to main menu/checkout");
			System.out.println (" ");
			System.out.print ("Choice: ");
			Option1 = TextIO.getlnInt (); //gets female tops choice

			if (Option1 == 1)
			{ //opens Option1 if loop

			    //female long sleeve output
			    System.out.println (" ");
			    System.out.println ("Enter the number of the product you want,");
			    System.out.println (" ");
			    System.out.println ("1.H&M Long Sleeve Shirt           : $19.99");
			    System.out.println ("2.Nike Long Sleeve Workout Shirt  : $15.99");
			    System.out.println ("3.Forever 21 Long Sleeve Crop Top : $14.45");
			    System.out.println ("Enter 4 to go back to main menu/checkout");
			    System.out.println (" ");
			    System.out.print ("Choice: ");
			    Option2 = TextIO.getlnInt (); //gets female long sleeve choice

			    if (Option2 == 1)
			    { //opens Option2 if loop

				user.Settotal (topsFemale [0] [0]); //calls Settotal from Opingpong and sends the price for female long sleeve 1
				user.Size ("Female, H&M Long Sleeve Shirt: $" + topsFemale [0] [0]); //calls Size from Opinpong and sends the information of the top with the price

			    } //closes Option2 if loop

			    if (Option2 == 2)
			    { //opens Option2 if loop

				user.Settotal (topsFemale [0] [1]); //calls Settotal from Opingpong and sends the price for female long sleeve 2
				user.Size ("Female, Nike Long Sleeve Workout Shirt: $" + topsFemale [0] [1]); //calls Size from Opinpong and sends the information of the top with the price

			    } //closes Option2 if loop

			    if (Option2 == 3)
			    { //opens Option2 if loop

				user.Settotal (topsFemale [0] [0]); //calls Settotal from Opingpong and sends the price for female long sleeve 3
				user.Size ("Female, Forever 21 Long Sleeve Crop Top: $" + topsFemale [0] [2]); //calls Size from Opinpong and sends the information of the top with the price

			    } //closes Option2 if loop

			} //closes Option1 if loop

			if (Option1 == 2)
			{ //opens Option1 if loop

			    //female short sleeve output
			    System.out.println (" ");
			    System.out.println ("Enter the number of the product you want,");
			    System.out.println (" ");
			    System.out.println ("1.Forever 21 Short Sleeve Graphic Tee : $12.32");
			    System.out.println ("2.Urban Outfitters Plaid Tee          : $11.99");
			    System.out.println ("3.H&M Short Sleeve Crop Top           : $9.56");
			    System.out.println ("Enter 4 to go back to main menu/checkout");
			    System.out.println (" ");
			    System.out.print ("Choice: ");
			    Option2 = TextIO.getlnInt (); //gets short sleeve choice

			    if (Option2 == 1)
			    { //opens Option2 if loop

				user.Settotal (topsFemale [1] [0]); //calls Settotal from Opingpong and sends the price for female short sleeve 1
				user.Size ("Female, Forever 21 Short Sleeve Graphic Tee: $" + topsFemale [1] [0]); //calls Size from Opinpong and sends the information of the top with the price

			    } //closes Option2 if loop

			    if (Option2 == 2)
			    { //opens Option2 if loop

				user.Settotal (topsFemale [1] [1]); //calls Settotal from Opingpong and sends the price for female short sleeve 2
				user.Size ("Female, Urban Outfitters Plaid Tee: $" + topsFemale [1] [1]); //calls Size from Opinpong and sends the information of the top with the price

			    } //closes Option2 if loop

			    if (Option2 == 3)
			    { //opens Option2 if loop

				user.Settotal (topsFemale [1] [2]); //calls Settotal from Opingpong and sends the price for female short sleeve 3
				user.Size ("Female, H&M Short Sleeve Crop Top: $" + topsFemale [1] [2]); //calls Size from Opinpong and sends the information of the top with the price

			    } //closes Option2 if loop

			} //closes Option1 if loop

		    } //closes option if loop

		    if (option == 2)
		    { //opens option if loop

			//female bottoms output
			System.out.println (" ");
			System.out.println ("1.Shorts");
			System.out.println ("2.Skirts");
			System.out.println ("3.Pants");
			System.out.println ("Enter 4 to go back to main menu/checkout");
			System.out.println (" ");
			System.out.print ("Choice: ");
			Option1 = TextIO.getlnInt (); //gets female bottoms choice

			if (Option1 == 1)
			{ //opens Option1 if loop

			    //female shorts output
			    System.out.println (" ");
			    System.out.println ("Enter the number of the product you want,");
			    System.out.println (" ");
			    System.out.println ("1.American Eagle Jean Shorts : $25.99");
			    System.out.println ("2.Forever 21 Cotton Shorts   : $26.54");
			    System.out.println ("3.Nike Workout Shorts        : $32.99");
			    System.out.println ("Enter 4 to go back to main menu/checkout");
			    System.out.println (" ");
			    System.out.print ("Choice: ");
			    Option2 = TextIO.getlnInt (); //gets female shorts choice

			    if (Option2 == 1)
			    { //opens Option2 if loop

				user.Settotal (bottomsFemale [0] [0]); //calls Settotal from Opingpong and sends the price for female shorts 1
				user.Size ("Female, American Eagle Jean Shorts: $" + bottomsFemale [0] [0]); //calls Size from Opinpong and sends the information of the bottoms with the price

			    } //closes Option2 if loop

			    if (Option2 == 2)
			    { //opens Option2 if loop

				user.Settotal (bottomsFemale [0] [1]); //calls Settotal from Opingpong and sends the price for female shorts 2
				user.Size ("Female, Forever 21 Cotton Shorts: $" + bottomsFemale [0] [1]); //calls Size from Opinpong and sends the information of the bottoms with the price

			    } //closes Option2 if loop

			    if (Option2 == 3)
			    { //opens Option2 if loop

				user.Settotal (bottomsFemale [0] [2]); //calls Settotal from Opingpong and sends the price for female shorts 3
				user.Size ("Female, Nike Workout Shorts: $" + bottomsFemale [0] [2]); //calls Size from Opinpong and sends the information of the bottoms with the price

			    } //closes Option2 if loop


			} //closes Option1 if loop

			if (Option1 == 2)
			{ //opens Option1 if loop

			    //female skirts output
			    System.out.println (" ");
			    System.out.println ("Enter the number of the product you want,");
			    System.out.println (" ");
			    System.out.println ("1.H&M High Waisted Skirt               : $24.99");
			    System.out.println ("2.Forever 21 High Waisted Fitted Skirt : $22.45");
			    System.out.println ("3.Top Shop High Wasited Fitted Skirt   : $26.99");
			    System.out.println ("Enter 4 to go back to main menu/checkout");
			    System.out.println (" ");
			    System.out.print ("Choice: ");
			    Option2 = TextIO.getlnInt (); //gets female skirt choice

			    if (Option2 == 1)
			    { //opens Option2 if loop

				user.Settotal (bottomsFemale [1] [0]); //calls Settotal from Opingpong and sends the price for female skirts 1
				user.Size ("Female, H&M High Waisted Skirt: $" + bottomsFemale [1] [0]); //calls Size from Opinpong and sends the information of the bottoms with the price

			    } //closes Option2 if loop

			    if (Option2 == 2)
			    { //opens Option2 if loop

				user.Settotal (bottomsFemale [1] [1]); //calls Settotal from Opingpong and sends the price for female skirts 2
				user.Size ("Female, Forever 21 High Waisted Fitted Skirt: $" + bottomsFemale [1] [1]); //calls Size from Opinpong and sends the information of the bottoms with the price

			    } //closes Option2 if loop
			    if (Option2 == 3)
			    { //opens Option2 if loop

				user.Settotal (bottomsFemale [1] [2]); //calls Settotal from Opingpong and sends the price for female skirts 3
				user.Size ("Female, Top Shop High Wasited Fitted Skirt: $" + bottomsFemale [1] [2]); //calls Size from Opinpong and sends the information of the bottoms with the price

			    } //closes Option2 if loop

			} //closes Option1 if loop

			if (Option1 == 3)
			{ //opens Option1 if loop

			    //female pants output
			    System.out.println (" ");
			    System.out.println ("Enter the number of the product you want,");
			    System.out.println (" ");
			    System.out.println ("1.American Apparel Jeans      :$27.99");
			    System.out.println ("2.Top Shop Faux Leather Pants              : $25.65");
			    System.out.println ("3.American Eagle Light Wash Low Rise Jeans : $29.85");
			    System.out.println ("Enter 4 to go back to main menu/checkout");
			    System.out.println (" ");
			    System.out.print ("Choice: ");
			    Option2 = TextIO.getlnInt (); //gets female pants choice

			    if (Option2 == 1)
			    { //opens Option2 if loop

				user.Settotal (bottomsFemale [2] [0]); //calls Settotal from Opingpong and sends the price for female pants 1
				user.Size ("Female, American Apparel Jeans: $" + bottomsFemale [2] [0]); //calls Size from Opinpong and sends the information of the bottoms with the price

			    } //closes Option2 if loop

			    if (Option2 == 2)
			    { //opens Option2 if loop

				user.Settotal (bottomsFemale [2] [1]); //calls Settotal from Opingpong and sends the price for female pants 1
				user.Size ("Female, Top Shop Faux Leather Pants: $" + bottomsFemale [2] [1]); //calls Size from Opinpong and sends the information of the bottoms with the price

			    } //closes Option2 if loop

			    if (Option2 == 3)
			    { //opens Option2 if loop

				user.Settotal (bottomsFemale [2] [2]); //calls Settotal from Opingpong and sends the price for female pants 1
				user.Size ("Female, American Eagle Light Wash Low Rise Jeans: $" + bottomsFemale [2] [2]); //calls Size from Opinpong and sends the information of the bottoms with the price

			    } //closes Option2 if loop

			} //closes Option1 if loop

		    } //closes option if loop

		    if (option == 3)
		    { //opens option if loop

			//female dress output
			System.out.println (" ");
			System.out.println ("Enter the number of the product you want,");
			System.out.println (" ");
			System.out.println ("1.Forever 21 Knee High Stripped Dress : $19.99 ");
			System.out.println ("2.H&M Floor Length Blue Dress         : $20.90 ");
			System.out.println ("3.Top Shop Pink Cupcake Style Dress   : $30.11 ");
			System.out.println ("Enter 4 to go back to main menu/checkout");
			System.out.println (" ");
			System.out.print ("Choice: ");
			Option2 = TextIO.getlnInt (); //gets female dress choice

			if (Option2 == 1)
			{ //opens Option2 if loop

			    user.Settotal (dressFemale [0] [0]); //calls Settotal from Opingpong and sends the price for female dress 1
			    user.Size ("Female, Forever 21 Knee High Stripped Dress: $" + dressFemale [0] [0]); //calls Size from Opinpong and sends the information of the dress with the price

			} //closes Option2 if loop

			if (Option2 == 2)
			{ //opens Option2 if loop

			    user.Settotal (dressFemale [0] [1]); //calls Settotal from Opingpong and sends the price for female dress 2
			    user.Size ("Female, H&M Floor Length Blue Dress: $" + dressFemale [0] [1]); //calls Size from Opinpong and sends the information of the dress with the price

			} //closes Option2 if loop

			if (Option2 == 3)
			{ //opens Option2 if loop

			    user.Settotal (dressFemale [0] [2]); //calls Settotal from Opingpong and sends the price for female dress 3
			    user.Size ("Female, Top Shop Pink Cupcake Style Dress: $" + dressFemale [0] [2]); //calls Size from Opinpong and sends the information of the dress with the price

			} //closes Option2 if loop

		    } //closes option if loop

		} //closes gender if loop

	    } //closes category if loop

	    if (category == 2)
	    { //opens category if loop

		//electronic homescreen output
		System.out.println (" ");
		System.out.println ("Please select a category,");
		System.out.println (" ");
		System.out.println ("1.Computers and Tablets");
		System.out.println ("2.TVs and Home Theater");
		System.out.println ("3.Cameras and Camcorders");
		System.out.println ("Enter 4 to go back to main menu/checkout");
		System.out.println (" ");
		System.out.print ("Choice: ");
		option = TextIO.getlnInt (); //gets the users choice

		if (option == 1)
		{ //opens option if loop

		    //Computers and Tablets output
		    System.out.println (" ");
		    System.out.println ("1.Laptops and MacBook's");
		    System.out.println ("2.IPads and Tablets");
		    System.out.println ("3.Desktops and IMacs");
		    System.out.println ("Enter 4 to go back to main menu/checkout");
		    System.out.println (" ");
		    System.out.print ("Choice: ");
		    Option1 = TextIO.getlnInt (); //gets the users choice

		    if (Option1 == 1)
		    { //opens Option1

			//Laptops and macbooks output
			System.out.println (" ");
			System.out.println ("Enter the number of the product you want,");
			System.out.println (" ");
			System.out.println ("1.Dell Inspiron Laptop          : $499.99");
			System.out.println ("2.HP Pavilion Touchsmart Laptop : $549.99");
			System.out.println ("3.MacBook Pro                   : $999.99");
			System.out.println ("Enter 4 to go back to main menu/checkout");
			System.out.println (" ");
			System.out.print ("Choice: ");
			Option2 = TextIO.getlnInt (); //gets the users choice

			if (Option2 == 1)
			{ //opens Option2 if loop

			    user.Settotal (CandT [0] [0]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("Dell Inspiron Laptop: $499.99", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

			if (Option2 == 2)
			{ //opens Option2 if loop

			    user.Settotal (CandT [0] [1]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("HP Pavilion Touchsmart Laptop: $549.99", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

			if (Option2 == 3)
			{ //opens Option2 if loop

			    user.Settotal (CandT [0] [2]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("MacBook Pro: $999.99", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

		    } //closes Option1 if loop

		    if (Option1 == 2)
		    { //opens Option1 if loop

			//Ipads and Tablets output
			System.out.println (" ");
			System.out.println ("Enter the number of the product you want,");
			System.out.println (" ");
			System.out.println ("1.IPad           : $349.99");
			System.out.println ("2.IPad Mini      : $249.99");
			System.out.println ("3.Samsung Tablet : $149.99");
			System.out.println ("Enter 4 to go back to main menu/checkout");
			System.out.println (" ");
			System.out.print ("Choice: ");
			Option2 = TextIO.getlnInt (); //gets the users choice

			if (Option2 == 1)
			{ //opens Option2 if loop

			    user.Settotal (CandT [1] [0]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("IPad: $349.99 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

			if (Option2 == 2)
			{ //opens Option2 if loop

			    user.Settotal (CandT [1] [1]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("IPad Mini: $249.99", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

			if (Option2 == 3)
			{ //opens Option2 if loop

			    user.Settotal (CandT [1] [2]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("Samsung Tablet: $149.99 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

		    } //closes Option1 if loop

		    if (Option1 == 3)
		    { //opens Option1 if loop

			System.out.println (" ");
			System.out.println ("Enter the number of the product you want,");
			System.out.println (" ");
			System.out.println ("1.Asus 21-inch All-In-One PC    : $699.99");
			System.out.println ("2.HP Envy 22-inch All-In-One PC : $799.99");
			System.out.println ("3.21.5-inch IMac                : $1699.99");
			System.out.println ("Enter 4 to go back to main menu/checkout");
			System.out.println (" ");
			System.out.print ("Choice: ");
			Option2 = TextIO.getlnInt (); //gets user choice

			if (Option2 == 1)
			{ //opens Option2 if loop

			    user.Settotal (CandT [2] [0]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("Asus 21-inch All-In-One PC: $699.99 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

			if (Option2 == 2)
			{ //opens Option2 if loop

			    user.Settotal (CandT [2] [1]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("HP Envy 22-inch All-In-One PC: $799.99 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

			if (Option2 == 3)
			{ //opens Option2 if loop

			    user.Settotal (CandT [2] [2]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("21.5-inch IMac: $1699.99 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

		    } //closes Option1 if loop

		} //closes option if loop

		if (option == 2)
		{ //opens option if loop

		    //home theater output
		    System.out.println (" ");
		    System.out.println ("1.TVs");
		    System.out.println ("2.Speakers ");
		    System.out.println ("3.Blu-Ray Players");
		    System.out.println ("Enter 4 to go back to main menu/checkout");
		    System.out.println (" ");
		    System.out.print ("Choice: ");
		    Option1 = TextIO.getlnInt (); //gets users choice

		    if (Option1 == 1)
		    { //opens Option1 if loop

			//tvs output
			System.out.println (" ");
			System.out.println ("Enter the number of the product you want,");
			System.out.println (" ");
			System.out.println ("1.Samsung Smart TV : $299.99");
			System.out.println ("2.Panasonic LD TV  : $199.99");
			System.out.println ("3.Sony 3D TV       : $499.99");
			System.out.println ("Enter 4 to go back to main menu/checkout");
			System.out.println (" ");
			System.out.print ("Choice: ");
			Option2 = TextIO.getlnInt (); //gets users choice

			if (Option2 == 1)
			{ //opens Option2 if loop

			    user.Settotal (TVandHT [0] [0]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("Samsung Smart TV: $299.99 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

			if (Option2 == 2)
			{ //opens Option2 if loop 

			    user.Settotal (TVandHT [0] [1]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("Panasonic LD TV: $199.99 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

			if (Option2 == 3)
			{ //opens Option2 if loop

			    user.Settotal (TVandHT [0] [2]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("Sony 3D TV: $499.99 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

		    } //closes Option1 if loop

		    if (Option1 == 2)
		    { //opens Option1 if loop

			//Speakers output
			System.out.println (" ");
			System.out.println ("Enter the number of the product you want,");
			System.out.println (" ");
			System.out.println ("1.Beats Audio Speakers   : $200.00");
			System.out.println ("2.Klipsch Centre Speaker : $399.99");
			System.out.println ("Enter 3 to go back to main menu/checkout");
			System.out.println (" ");
			System.out.print ("Choice: ");
			Option2 = TextIO.getlnInt (); //gets the users choice

			if (Option2 == 1)
			{ //opens Option2 if loop

			    user.Settotal (TVandHT [1] [0]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("Beats Audio Speakers: $200.00 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

			if (Option2 == 2)
			{ //opens Option2 if loop

			    user.Settotal (TVandHT [1] [1]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("Klipsch Centre Speaker: $399.99 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop
			
		    } //closes Option1 if loop

		    if (Option1 == 3)
		    { //opens Option1 if loop

			//blu-ray players output
			System.out.println (" ");
			System.out.println ("Enter the number of the product you want,");
			System.out.println (" ");
			System.out.println ("1.Sony 3D Blu-Ray Player     : $99.99");
			System.out.println ("2.LG Wi-Fi 3D Blu-Ray Player : $159.99");
			System.out.println ("Enter 3 to go back to main menu/checkout");
			System.out.println (" ");
			System.out.print ("Choice: ");
			Option2 = TextIO.getlnInt (); //gets the users choice

			if (Option2 == 1)
			{ //opens Option2 if loop

			    user.Settotal (TVandHT [2] [0]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("Sony 3D Blu-Ray Player: $99.99 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

			if (Option2 == 2)
			{ //opens Option2 if loop

			    user.Settotal (TVandHT [2] [1]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("LG Wi-Fi 3D Blu-Ray Player: $159.99 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

		    } //closes Option1 if loop

		} //closes option if loop

		if (option == 3)
		{ //opens option if loop

		    //Camra and camcorders output
		    System.out.println (" ");
		    System.out.println ("1.Compact Cameras");
		    System.out.println ("2.DSLR Cameras");
		    System.out.println ("3.Camcorders");
		    System.out.println ("Enter 4 to go back to main menu/checkout");
		    System.out.println (" ");
		    System.out.print ("Choice: ");
		    Option1 = TextIO.getlnInt (); //gets the users choice

		    if (Option1 == 1)
		    { //opens Option1 if loop

			//Compact cameras output
			System.out.println (" ");
			System.out.println ("Enter the number of the product you want,");
			System.out.println (" ");
			System.out.println ("1.Nikon Coolpix    : $99.99");
			System.out.println ("2.Canon Power Shot : $199.99");
			System.out.println ("3.Fuji Finepix     : $129.65");
			System.out.println ("Enter 4 to go back to main menu/checkout");
			System.out.println (" ");
			System.out.print ("Choice: ");
			Option2 = TextIO.getlnInt (); //gets the users choice

			if (Option2 == 1)
			{ //opens Option2 if loop

			    user.Settotal (CandC [0] [0]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("Nikon Coolpix: $99.99 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

			if (Option2 == 2)
			{ //opens Option2 if loop

			    user.Settotal (CandC [0] [1]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("Canon Power Shot: $199.99 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

			if (Option2 == 3)
			{ //opens Option2 if loop

			    user.Settotal (CandC [0] [2]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("Fuji Finepix: $129.65 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

		    } //closes Option1 if loop

		    if (Option1 == 2)
		    { //opens Option2 if loop

			//DSLR output
			System.out.println (" ");
			System.out.println ("Enter the number of the product you want,");
			System.out.println (" ");
			System.out.println ("1.Nikon DSLR Camera + 1 18-55mm lens : $789.99");
			System.out.println ("2.Canon DSLR Camera + 1 24-70mm lens : $899.99");
			System.out.println ("Enter 3 to go back to main menu/checkout");
			System.out.println (" ");
			System.out.print ("Choice: ");
			Option2 = TextIO.getlnInt (); //gets the users choice

			if (Option2 == 1)
			{ //opens Option2 if loop

			    user.Settotal (CandC [1] [0]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("Nikon DSLR Camera + 1 18-55mm lens: $789.99 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

			if (Option2 == 2)
			{ //opens Option2 if loop

			    user.Settotal (CandC [1] [1]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("Canon DSLR Camera + 1 24-70mm lens: $899.99 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

		    } //closes Option1 if loop

		    if (Option1 == 3)
		    { //opens Option1 if loop

			//Camcorders output
			System.out.println (" ");
			System.out.println ("Enter the number of the product you want,");
			System.out.println (" ");
			System.out.println ("1.GoPro Hero 3            : $249.99");
			System.out.println ("2.Sony Projector HandyCam : $149.99");
			System.out.println ("Enter 3 to go back to main menu/checkout");
			System.out.println (" ");
			System.out.print ("Choice: ");
			Option2 = TextIO.getlnInt (); //gets the users choice

			if (Option2 == 1)
			{ //opens Option2 if loop

			    user.Settotal (CandC [2] [0]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("GoPro Hero 3: $249.99 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

			if (Option2 == 2)
			{ //opens Option2 if loop

			    user.Settotal (CandC [2] [1]); //calls Settotal from Opingpong and sends the price
			    user.Cart ("Sony Projector HandyCam: $149.99 ", 0); //calls Cart from Opingpong and outputs the item

			} //closes Option2 if loop

		    } //closes Option1 if loop

		} //closes option

	    } //closes category

	} //closes while loop

    } //closes closes main
    
} //closes public class



