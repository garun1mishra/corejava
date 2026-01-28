package newupdate.garun;

public class Overloading1 {
    public void sum(double d1, double d2){
        System.out.println("Primitive") ;
    }

    public void sum(Double d1, Double d2){
        System.out.println("Wrapper"); ;
    }

    public static void main (String[] args) {
        Overloading1 ol=new Overloading1() ;
        ol.sum(8.7,null);
    }
}
