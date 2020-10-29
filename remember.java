public class remember {
    public static void main(String[]args){

        //block to reverse string calls reverseString()
        String s = "theword";
        System.out.println(s);
        String cameback = reverseString(s);
        System.out.println("reversed word " + cameback);

        //block to reverse int regardless of positive or negative
        int n = -37;
        System.out.println(n);
        int numcameback = reverseInt(n);
        System.out.println("reversed int " + numcameback);

        //find lowest number in an array
        int[] arr = {17, 4, 1, 50, 60};
        int lowest_in_array = findLowest(arr);
        System.out.println("lowest number in array " + lowest_in_array);

        //add all digits of an int, different case on how they wanna handle it if its a negative number, is the first digit a negative then?
        int n2 = 8764;
        int added_all_digits = addAllDigits(n2);
        System.out.println("added digits  " + added_all_digits);

        //find primes
        int[] primearr = {0,1,2,3,4,5,6,7,8,9,10};
        int[] primes = findPrimes(primearr);

        for(int a = 0;a < primes.length;a++){
            if(primes[a] != 0){                         //filter out the empty spots of not primes (autofilled as 0s)
                System.out.println(primes[a] + " is prime");
            }
        }
        //factorial
        int n3 = 5;
        int result = findFactorial(n3);
        System.out.println("factorial of " + n3 + " is: " + result);

        //check if palindrome
        String word = "racecar";
        boolean ispal = findPalindrome(word);
        System.out.println(ispal);


        //find missing int in an array
        int[] numsarray = {1,2,4};
        int missing = findmissingnum(numsarray);
        System.out.println(missing);


        //reverse array
        int[] arrarray = {1,2,3,4,5};
        int[] revarray = reverseArray(arrarray);
        System.out.println("reversed array below:");
        for(int i=0;i<revarray.length;i++){
            System.out.println(revarray[i]);
        }




    }

    static String reverseString(String s){
        String ans = "";
        for(int i=0;i<s.length();i++){
            ans = ans + s.charAt(s.length()-i-1);
        }
        return ans;
    }

    static int reverseInt(int n){
        //cant convert to string to positive if its a negative just keep track of it for now
        int b = 0; //counter for if its a negative or not, it stays 0 if its a + number, becomes 1 if its a -
        if(n<0){
            System.out.println("its a negative number");
            n = n*-1;
            b = b+1;
        }

        String int_to_string = String.valueOf(n); //convert that positive to string
        String ans ="";

        for(int i=0;i<int_to_string.length();i++){  //reverse that positive string
            ans = ans + int_to_string.charAt(int_to_string.length()-i-1);
        }

        //convert string to int again
        int finalans = Integer.parseInt(ans);

        //the boolean value earlier on to turn the reversed int back to negative if it was negative
        if(b==1){
            finalans = finalans*-1;
        }
        return finalans;
    }

    static int findLowest(int[] arr){
        int lowest=0; //initialized as 0 but itll get replaced later with one of the values in the array

        for(int i=0;i<arr.length; i++){ //loop through array index
           for(int j=i+1;j<arr.length;j++){ //2 loops so you compare each number vs all the other ones each time

               if(arr[i]>arr[j]){       //if the current number 'arr[i] is greater than the next number 'arr[j]' make that the lowest
                   lowest = arr[j];
               }
           }
        }
        return lowest; //at the end of the loop the final result is the lowest number
    }

    static int addAllDigits(int n2){

        int sum = 0;
        while(n2 != 0){
            //if they gave a negative number, just make modifications so that the last number added in is a negative
            //this is where n2%10 is evaluated, in this instance a negative number turns each one negative ex. (-123 => -1, -2, -3)

            sum = sum + (n2%10); //add the remainder using modulo
            n2 = n2/10; //shave off n2s value
        }

        return sum;
    }

    static int[] findPrimes(int[] primearr){
        //loop through the given array, make a new array with only prime numbers of the given array
        int[] answer_array = new int[primearr.length]; //the array that will be filled should have the same max amount as the given array

        for(int i=0;i<primearr.length;i++){
            //check if nums are prime
            boolean is_prime = true;
            for(int j=2; j<i; j++){ //counter to divide by, if modulo is 0 in any that means its divisible by something/notprime
                if(i%j == 0){               //primes are divisible by 1, and u cant div by 0 so start with 2
                    is_prime = false;
                    break; //go to the next number in the array
                }
                if(is_prime = true){ //if the current number is prime add to new array
                    answer_array[i] = primearr[i];
                }
            }
        }

        return answer_array;
    }

    static int findFactorial(int n3){
        if(n3 < 0){     //just give back the number if its a negative
            return n3;
        }
        if(n3 == 1 || n3 == 0){ //fact of 0 and 1 is both 1
            return 1;
        }

        int ans=1;
        while(n3>0){ //while loop, so that u keep counting until the number is spent
            ans = ans * n3;
            n3--;
        }

        return ans;
    }

    static boolean findPalindrome(String word){
        boolean is_palindrome = true;
        //take the string word, take an empty string and put in the reversed string word in there
        //loop through reversed and check if that matches the regular

        String reversed_word = "";

        //empty string reversedword is now populated vvv
        for(int i =0; i < word.length(); i++){
            reversed_word = reversed_word + word.charAt(word.length()-i-1); //wordlength is the latest char and then decreased by i gets added to reversed word
        }
        System.out.println(reversed_word);

        //compare reversedword and original
        for(int i=0; i<word.length();i++){
            if(reversed_word.charAt(i) != word.charAt(i)){
                is_palindrome = false;
                return is_palindrome;
            }
        }
        return is_palindrome;
    }

    static int findmissingnum(int[] numsarray){
        int ans = 0;
        for(int i=0;i<numsarray.length;i++){
            if(i!=numsarray.length-1){
                int dif = numsarray[i+1] - numsarray[i];
                if(dif>1){
                    ans = numsarray[i]+1;
                }
            }
        }


        return ans;
    }

    static int[] reverseArray(int[] arrarray){
        int[] holder = new int[arrarray.length];
        for(int i=0;i<arrarray.length;i++){
            holder[i] = arrarray[arrarray.length-i-1];

        }

        return holder;
    }
}
