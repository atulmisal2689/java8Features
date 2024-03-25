package com.jbk.staticDefaultMethods;

public class Tester 
{

	public static void main(String[] args) 
	{
		Developer adnroidDeveloper = new AdnroidDeveloper();
		adnroidDeveloper.develope();  //Andrioid Developer
		adnroidDeveloper.init();     //In Adnroid Developer init method
		Developer.destroy();        //I am Developer Destroy
		//AdnroidDeveloper.destroy(); (Giving Compile Time error)
		//adnroidDeveloper.destroy(); (Giving Compile Time error)
		
		System.out.println();

		Developer webDeveloper = new WebDeveloper();
		webDeveloper.develope();   //Web Developer
		webDeveloper.init();      //I am Developer Init
		WebDeveloper.destroy();   //I am WebDeveloper Destroy
		//webDeveloper.destroy();  (Giving Compile Time error)
		System.out.println();

		Developer iosDeveloper = new IosDeveloper();
		iosDeveloper.develope();  //Ios Developer
		iosDeveloper.init();    // I am Developer Init 
		//iosDeveloper.destroy();  (Giving Compile Time error)
		//IosDeveloper.destroy(); (Giving Compile Time error)
		//iosDeveloper.destroy(); (Giving Compile Time error)
		System.out.println();

	}

}
