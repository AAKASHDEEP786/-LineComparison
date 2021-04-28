public class LineComputation
{
    static boolean equals(double length1,double length2)
    {
        if(length1 == length2)
        {
            return true;
        }
            return false;
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to the Comparison Computation Program") ;
        int x1=4, x2=2,y1=3, y2=6 ;

        int xaxis=(x2-x1)*(x2-x1);
        int yaxis=(y2-y1)*(y2-y1);
        double LengthOfLine = Math.sqrt((xaxis) + (yaxis));
        System.out.println("Length of Line1 is:"+length1) ;
        System.out.println("calculating the length of second line") ;
        int x3=4, x4=2, y3=5, y4=3 ;

        int xaxis1=(x4-x3)*(x4-x3) ;
        int yaxis1=(y4-y3)*(y4-y3) ;
        double LengthOfSecondLine = Math.sqrt((xaxis1) + (yaxis1)) ;
        System.out.println("Length of second Line is:"+length2) ;

        boolean Equality = equals(length1,length2) ;
        if(Equality)
            System.out.println("both lines are equal") ;
        else
        {
            System.out.println("both lines are not equal") ;
        }
    }}
