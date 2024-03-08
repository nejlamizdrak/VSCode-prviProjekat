public class prviZadatak {
 
    public static void main(String[] args) {
        int n=100;
        System.out.println("Brojevi između 1 i "+n+" koji su djeljivi sa sumom cifara:");
        for (int i=1;i<=n;i++) {
            if (jeDjeljivSaSumomCifara(i)) {
                System.out.print(i+" ");
            }
        }
    }
    private static boolean jeDjeljivSaSumomCifara(int broj) {
        int sumaCifara=0;
        int tempBroj=broj;
        while (tempBroj!=0) {
            sumaCifara+=tempBroj%10;
            tempBroj/=10;
        }
        return sumaCifara!=0 && broj%sumaCifara==0;
    }
}
