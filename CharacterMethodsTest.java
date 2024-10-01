public class CharacterMethodsTest {
    public static void main(String[] args) {

        char testChar = 'A';


        System.out.println("isLetter('A'): " + Character.isLetter(testChar));


        System.out.println("isDigit('A'): " + Character.isDigit(testChar));


        System.out.println("isWhitespace('A'): " + Character.isWhitespace(testChar));


        System.out.println("toLowerCase('A'): " + Character.toLowerCase(testChar));


        char lowerChar = 'a';
        System.out.println("toUpperCase('a'): " + Character.toUpperCase(lowerChar));


        System.out.println("isUpperCase('A'): " + Character.isUpperCase(testChar));


        System.out.println("isLowerCase('A'): " + Character.isLowerCase(testChar));


        System.out.println("isAlphabetic('A'): " + Character.isAlphabetic(testChar));


        System.out.println("isDefined('A'): " + Character.isDefined(testChar));


        char digitChar = '9';
        System.out.println("getNumericValue('9'): " + Character.getNumericValue(digitChar));
    }
}
