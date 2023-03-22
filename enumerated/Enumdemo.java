package enumerated;

public class Enumdemo {
 static enum Games {CRICKET, FOOTBALL, CHESS, BASKETBALL, TENNIS, BADMINTON};
    public static void main(String args[])
    {
        Games G1=Games.CHESS;
        Games G2=Games.TENNIS;
        System.out.println("First game is"+G1.name());
        System.out.println("Second game is"+G2.name());
        System.out.println("First game ordinal is"+G1.ordinal());
        System.out.println("second game ordina is"+G2.ordinal());
        System.out.println("G1.equals(G2) returns"+G1.equals(G2));
        System.out.println("G1.toString() returns"+G1.toString());
        System.out.println("G1.compareTo(G2) returns"+G1.compareTo(G2));

    }
}
