public class Cadenas{
//Atributos

//Metodos
public static void main(String[] args) {
    //"    B u r i e d   T  r e  a  s  u  r  e     C  h  e  s  t  !    "
    //"0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25"

    String pirateMessage = "  Buried Treasure Chest! ";
    //charAt(int index)

    System.out.print(pirateMessage.charAt(9));
    System.out.print(pirateMessage.charAt(10));
    System.out.print(pirateMessage.charAt(11));
    System.out.print(pirateMessage.charAt(13));

    //indexOf(int ch)
    System.out.println("---------.indexOf()--------");
    System.out.println(pirateMessage.indexOf("i"));
    System.out.println(pirateMessage.indexOf("e"));
    System.out.println(pirateMessage.indexOf("sure"));

    //length()
    System.out.println(pirateMessage.length());
    }
}