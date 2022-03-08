public class CalculatorAge {
    // Save the data in number age
    
    private int x;
    
    public int getAge () 
    {
        return x;
    }
    public void writeAge (int numberAge)
    {
        x = numberAge;
    }
    public void CalculatePersonAge ()
    {
    if ( x > 18 ) {
        System.out.print("the person is older than 18 years old" + ""+ x + "age");
        
    
    } else {
        System.out.print("the person is not older enough 'underage'");
        
    }
      
}
}
