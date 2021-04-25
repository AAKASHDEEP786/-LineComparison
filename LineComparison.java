public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program!");

        int x1=4, x2=2, y1=3,y2=6 ;

        int xaxis=(x2-x1)*(x2-x1);
        int yaxis=(y2-y1)*(y2-y1);
        double len1 = Math.sqrt((xaxis) + (yaxis));
        System.out.println("Length of Line1 is: "+len1);
    }
}
