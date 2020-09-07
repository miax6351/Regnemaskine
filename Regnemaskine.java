import java.util.Scanner;

public class Regnemaskine {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int o = Integer.parseInt(s.nextLine());

        System.out.println(plus(n,o));
        s.close();

        //sout + Enter = System.out.println();




    }

static int plus(int n, int o) {
        return n + o;
}


}



