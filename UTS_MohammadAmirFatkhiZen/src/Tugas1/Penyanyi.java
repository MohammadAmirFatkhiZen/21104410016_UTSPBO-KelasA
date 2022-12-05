package Tugas1;

/**
 *
 * @author Amir
 */

public class Penyanyi extends Pop {

    public static void main(String[] args) {

        Pop pop = new Pop("Black Pink", "How You Like That");
        Dangdut dangdut = new Dangdut();

        pop.singer("Eclat Story");
        pop.song("Bentuk Cinta");
        pop.cetakLabel();

        String penyanyi = "Joko Chandra";
        penyanyi = dangdut.penyanyi;

        dangdut.song( "Kopi Dangdut");
        dangdut.cetakLabel();
    }
}
