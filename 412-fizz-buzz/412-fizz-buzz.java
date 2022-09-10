class Solution {
    public List<String> fizzBuzz(int n) {
         List<String> l = new ArrayList<String>();    //Make the Arraylist 
		
        for(int i=1;i<=n;i++){        // Iterate Loop n times to store the value
            if(i%3==0 && i%5==0){     // Check for divisibility for 3 and 5
                l.add("FizzBuzz");    //  add the word "FizzBuzz" at index i
            }else if(i%3==0){       // Check for divisibility for 3
                l.add("Fizz");         //  add the word "Fizz" at index i
            }else if(i%5==0){    // Check for divisibility for 5
                l.add("Buzz");      //  add the word "Buzz" at index i
            }else{
                String s = Integer.toString(i);  // convert Integer to String to store Integer in List
                l.add(s);  // add Integer i at index i
            }
        }
        return l;
    }
}