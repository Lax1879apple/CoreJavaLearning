
public class myNumbers {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		int myFirstNumber = 40;
		int mySecondNumber = myFirstNumber * 2 + 50;
		int myThirdNumber = 100;
		
		int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
		System.out.println(myTotal);
		
		
		byte myByteNumber = (byte) 245;
		int myIntegerNumber = 330;
		float myFloatValue = 4879f;
		short myShortNumber = 2249;
		long myLongNumber = 50000 + 10 * (myByteNumber + myIntegerNumber + myShortNumber);
		
		System.out.println(myLongNumber);
		
		
		double myPondValue = 200d;
		 double myConvertedKgValue = (myPondValue * 0.45359237d);
		 
		 System.out.println("Converted KG value is: " + myConvertedKgValue + " Kg");
		 // char is width of 16 ( 2 bytes)
		 char myChar = '\u00AE';
		 System.out.println("Unicode Character is: " + myChar);
		 
		 
		 boolean myBoolean = false;
		 boolean isFemale = true;
		 System.out.println("The person sex is female: " + isFemale);

	}

}
