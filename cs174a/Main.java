package cs174a;                         // THE BASE PACKAGE FOR YOUR APP MUST BE THIS ONE.  But you may add subpackages.

// DO NOT REMOVE THIS IMPORT.
import cs174a.Testable.*;

/**
 * This is the class that launches your application.
 * DO NOT CHANGE ITS NAME.
 * DO NOT MOVE TO ANY OTHER (SUB)PACKAGE.
 * There's only one "main" method, it should be defined within this Main class, and its signature should not be changed.
 */
public class Main
{
	/**
	 * Program entry point.
	 * DO NOT CHANGE ITS NAME.
	 * DON'T CHANGE THE //!### TAGS EITHER.  If you delete them your program won't run our tests.
	 * No other function should be enclosed by the //!### tags.
	 */
	//!### COMENZAMOS
	public static void main( String[] args )
	{
		App app = new App();                        // We need the default constructor of your App implementation.  Make sure such
													// constructor exists.
		String r = app.initializeSystem();         // We'll always call this function before testing your system.
		
		//!!!!!!!!!!!!!
		//DANGEROUS!!!!
		//System.out.println(app.dropTables());
		//System.out.println(app.createTables());
		
		
		//System.out.println(app.setDate(2019,12,4));
		if( r.equals( "0" ) )
		{
			//app.exampleAccessToDB();                // Example on how to connect to the DB.
			//app.dropTables();
			//app.createTables();
			//r = app.createCheckingSavingsAccount( AccountType.SAVINGS, "43942", 1,289.0, "361721022", "Alfred Hitchcock", "6667 El Colegio #40");
			app.startSystemsInterface();
			//app.startATMInterface();
			//app.startBankTellerInterface();
			//app.setDate(2020,9,1);

			// Example tests.  We'll overwrite your Main.main() function with our final tests.
			r = app.listClosedAccounts();
			System.out.println( r );

			// Another example test.
			//r = app.createCheckingSavingsAccount( AccountType.SAVINGS, "334", 1234.56, "theTaxIasdfD", "Im YoungMing", "Known");
			//r = app.updateInterest(AccountType.SAVINGS,9.1);
			//app.createTransaction("334","",false,11111.3,"DEPOSIT");
			//app.createPocketAccount("pocket4","checking",29.9,"bbb");
			System.out.println( r );
		}
	}
	//!### FINALIZAMOS
}
