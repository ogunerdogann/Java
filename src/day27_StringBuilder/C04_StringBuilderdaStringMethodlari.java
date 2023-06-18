package day27_StringBuilder;

public class C04_StringBuilderdaStringMethodlari {
    public static void main(String[] args) {

        /*
            StringBuilder class'inda olmayip,
            String Class'inda olan method'lari kullamak istersek
            sb.toString() kullanarak StringBuilder'i önce String'e cevirir
            sonra istedigimiz String method'lari kullaniriz.

            Bu konuda DIKKAT etmemiz gereken husus
            String döndüren methodlar
            veya String class'indan kullanacagimiz methodlar
            kalici degisiklik yapmaz!!!
         */

        StringBuilder sb1 = new StringBuilder("Java Candir");
        StringBuilder sb2 = new StringBuilder("Java candir");

        sb1.substring(5);

        System.out.println(sb1); //Java Candir

        //sb1 = sb1.substring(5);  CTE

        System.out.println(sb1.compareTo(sb2)); //-32

        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString())); //true

        sb1.subSequence(3,6);

        System.out.println(sb1); //Java Candir degisiklik kalici olmuyor!!

    }
}
