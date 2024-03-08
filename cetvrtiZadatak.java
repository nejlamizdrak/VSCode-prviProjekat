public class cetvrtiZadatak {
 
    public static void main(String[] args) {
        if (args.length!=5) {
            System.out.println("Unesite 5 brojeva: ");
            return;
        }
        int suma=0;
        for (String arg:args) {
            int broj=Integer.parseInt(arg);
            suma+=broj;
        }
        System.out.println("Suma unesenih brojeva je: "+suma);
    }
}