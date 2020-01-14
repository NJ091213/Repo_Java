package Classwork;

public class ReverseStringJan_9 {
    public static void main(String[] args) {

        String myString = "reverse";
        String reverse = "";
        char [] strArr = myString.toCharArray();


        for (int i = strArr.length-1; i >= 0; i-- ) {
            reverse = reverse + strArr[i];
        }
        System.out.println(reverse);
    }
}







//String myString ="reverse";
// Int string = myString.length();
//String reversed = ""
//charAt()
//reversed = reversed + myStringcharAt(Stringlen -1-0)-> e
//reversed = reversed + myStringcharAt(Stringlen -1-1)->es