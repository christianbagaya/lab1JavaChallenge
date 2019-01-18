
public class Lab1 {

	//Question A
	public static int length_checker(String input){ //Checks the length of a string
        int strLength = input.length();
        return strLength;
    }
	
	//Question B
	//Reverse a string but keeps the order of words.
	public static String reverse(String initial) {
		String reversed = ""; //The reversed string that will be returned
		String singleWord = ""; //The string that will contain each single word in the string 
		int initialIndex =0;   //Will keep track of where a word starts in a string
		
		//The loop that iterate through the string to inverse it.
		for(int i = 0; i<initial.length(); i++) {
			String singleReversed = "";
			
			// makes sure one word is versed at a time
			if(initial.charAt(i)==' ' || i==initial.length()-1){
				if(i==initial.length()-1) {
					singleWord = initial.substring(initialIndex, i+1);
				}
				else{
					singleWord = initial.substring(initialIndex, i);
					
				}	
					//Reverse every single character in the word/substring
					for(int a =singleWord.length()-1; a>=0; a--) {
						singleReversed = singleReversed + singleWord.charAt(a);
					}
					
					//Concatenates the reversed word
					reversed = reversed +" " + singleReversed;
					
					initialIndex = i+1;			
			}
		}
		return reversed;	
	}

	//Question C
    public static void areaCircum(int radius){
        double area = Math.PI * Math.pow(radius,2);
        double circumference = 2 * Math.PI * radius;
        System.out.print("Area: ");
        System.out.printf("%.2f",area);
        System.out.print("\nCircumference: ");
        System.out.printf("%.1f", circumference);
    }

    public static void main(String[] args) {
        
    	areaCircum(5);
        
        System.out.println(length_checker("chicken"));
        System.out.println(reverse("My name is Christian"));
 
    }

}
