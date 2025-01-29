public class MixMatch{
    public static void main(String[] args){
        char letter = 'A';
        System.out.println(letter + " > Every character on the ASCII table is represented by a number, and there are 128 characters in the table.");
        String word = "Banana";
        System.out.println(word + " > A string is an array of characters.");
        short num = 1;
        System.out.println(num + " > A short takes up two bytes of memory and can be used to save memory when using small integers.");
        int numb = 23;
        System.out.println(numb + " > An integer takes up 4 bytes of memory.");
        long number = 45678910;
        System.out.println(number + " > A long takes up to 8 bytes of memory and stores large integer values, ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.");
        float p = 3;
        System.out.println(p + " > A float stores numbers with decimal values. It can store numbers that have up to 7 decimal places.");
        double point = 2.30404050606;
        System.out.println(point + " > A double is larger than a float and can hold up to 16 decimal digits.");
        boolean isFalse = false;
        System.out.println(isFalse + " > When using comparison operators, the result of the comparison will return as a boolean.");

        //Practicing printing out several variables at once
        System.out.println(letter + ", " + word + ", " + num + ", " + numb + ", " + number + ", " + p + ", " + point + ", " + isFalse);


        
    }
}