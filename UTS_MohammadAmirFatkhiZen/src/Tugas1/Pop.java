package Tugas1;

/**
 *
 * @author ZEN
 */
public class Pop {

    public String penyanyi = "Raisa";
    public String lagu = "Kali Kedua";

    Pop(){
    
    }

    Pop(String penyanyi, String lagu) {
        this.penyanyi = penyanyi;
        this.lagu = lagu;
        System.out.println(this.penyanyi + " <=> " + this.lagu);
    }
    
    public void singer(String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    protected void song (String lagu) {
        this.lagu = lagu;
    }
    
    public void cetakLabel(){
        System.out.println(this.penyanyi + " <=> " + this.lagu);
    }
    
}
