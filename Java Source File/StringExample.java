import java.lang.String;

class StringExample{
	public static void main(String args[]){
		String value = "	Batch15 is toxic	";
		String value1 = "BATCH15 IS TOXIC";
		String value2 = "kgm@fs@batch15@thursday";

		//String methods

		//contains() method check whether the given value is available in the given variable along with caseSensitive.
		System.out.println("contains(): " + value.contains("toxic"));  //true

		//concat() method is used to add two different string and present it as single string.
		System.out.println("concat(): " + value.concat(" by birth"));  //Batch15 is toxic by birth

		//equals() method checks whether the variable in the given string is equal or not, it is case sensitive and a space concerned.
		System.out.println("equals(): "+ value.equals("Batch15 is toxic"));  //true

		//equalsIgnoreCase() method ignores the case sensitive and checks the value with the variable and also space concerned.
		System.out.println("equalsIgnoreCase(): " + value.equalsIgnoreCase("BATCH15 IS TOXIC"));  //true

		//toUpperCase() method changes all the characters to capital letters.
		System.out.println("toUpperCase(): " + value.toUpperCase());  //BATCH15 IS TOXIC

		//toLowerCase() method changes all the characters to small letters.
		System.out.println("toLowerCase(): " + value.toLowerCase());  // batch15 is toxic

		//length() method returns the length of the variable along with spaces.
		System.out.println("length(): " + value.length());  //16

		//charAt() method returns the char that has been available in the specified index value.
		System.out.println("charAt(): " + value.charAt(4));  //h

		//compareTo() method returns the lexicographic positive value if it contains any terms that has been available in the variable.
		System.out.println("compareTo(): " + value.compareTo(value1));  //32

		//compareToIgnoreCase() method returns the lexicographic zero value if the variable are same.
		System.out.println("compareToIgnoreCase(): " + value.compareToIgnoreCase(value1));  //0

		//compareTo() method returns negative value if both the variable are different.
		System.out.println("compareTo(): " + value.compareTo("hello"));  //-38

		//indexOf() method returns the index value of the specified character.
		System.out.println("indexOf(): " + value.indexOf('s'));  //9
		
		//isEmpty() method checks whether the given variable is empty or not.
		System.out.println("isEmpty(): " + value.isEmpty());  //false

		//replace() method used to replace the specified word with the specified value. 
		System.out.println("replace(): " + value.replace("toxic","vedappu"));  //Batch15 is vedappu

		//substring() method is used to get string that has been mentioned from start index to end index.
		System.out.println("substring(): " + value.substring(3,11));  // ch15 is

		//trim() method is used to remove the spaces from the start and end.
		System.out.println("trim(): " + value.trim());  //Batch15 is toxic

		//lastIndexOf() method returns the indexOf last occurence of the given character.
		System.out.println("lastIndexOf(): " + value.lastIndexOf('i'));	//15

		//hashCode() method returs the key from the hash table which holds your variable as value.
		System.out.println("hashCode(): " + value.hashCode());	//-613719139

		//format() method changes the given data in the specified format.
		System.out.println("format(): " + value.format("%x",5));	//5

		//join() method is used to set a delimiter and join the parameterized values.
		System.out.println("join(): " + value.join("-","chandru","barath","praveen"));	//chandru-barath-praveen

		//replaceAll() method 
		System.out.println("replaceAll(): " + value.replaceAll("i","y"));		// Batch15 ys toxyc
		
		//split() method
		String[] arr1 = value2.split("@",4);
		for(String a1:arr1){
			System.out.println("pattern1 " + a1);
		}

	}
}