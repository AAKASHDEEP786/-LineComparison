public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program!");

        int x1=4, x2=2, y1=3,y2=6 ;

        int xaxis=(x2-x1)*(x2-x1);
        int yaxis=(y2-y1)*(y2-y1);
        double len1 = Math.sqrt((xaxis) + (yaxis));
        System.out.println("Length of Line1 is: "+len1);

        System.out.println("calculating the length of second line");

        int x3=4, x4=2, y3=5, y4=3 ;

        int xaxis1=(x4-x3)*(x4-x3);
        int yaxis1=(y4-y3)*(y4-y3);
        double len2 = Math.sqrt((xaxis1) + (yaxis1));
        System.out.println("Length of Line2 is: "+len2);

        Double line1 = Double.valueOf(len1);
        Double line2 = Double.valueOf(len2);
        int comparison = line1.compareTo(line2);
        if (comparison== 0)
        {
            System.out.println("both line are eqaul");
        }
        else if (comparison > 0) {
            System.out.println("line1 is greater than line2");
        }
        else
            System.out.println("line1 is less than line2");

    }
}
