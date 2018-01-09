public class App
{
    public static void main( String[] args ) {

        float a=5.6f;
        double b=5.6;
        if(a==b) {
            System.out.println("a==b");
        } else {
            System.out.println("a!=b");
        }
        if(a>b) {
            System.out.println("a>b");
        } else {
            System.out.println("!a>b");
        }
        if(a<b) {
            System.out.println("a<b");
        } else {
            System.out.println("!a<b");
        }

        float c=5.6f;
        double d=5.7;
        if(c<d) {
            System.out.println("c<d");
        }else{
            System.out.println("!c<d");
        }

        float e=5.7f;
        double f=5.6;
        if(e>f) {
            System.out.println("e>f");
        } else {
            System.out.println("!e>f");
        }

        float g=5.6f;
        double h=5.7;
        if(g>h) {
            System.out.println("g>h");
        } else {
            System.out.println("!g>h");
        }
    }
}
