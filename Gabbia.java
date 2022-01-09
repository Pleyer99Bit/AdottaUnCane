import java.util.*;
public class Gabbia extends Cane{
    public ArrayList <Cane> cane = new ArrayList<Cane>();
    public int numero, dimensione;
    public Gabbia() {
        super();
        numero = 0;
        dimensione = 0;
    }
    public Gabbia(String razza, String nome, String datadinascita, ArrayList cane, int numero, int dimensione) {
        super(razza, nome, datadinascita);
        this.numero = numero;
        this.cane = cane;
        this.dimensione = dimensione;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setDimensione(int dimensione) {
        this.dimensione = dimensione;
    }
    public void setCane(ArrayList cani) {
        this.cane = cani;
    }
    public int getNumero() {
        return this.numero;
    }
    public int getDimensione() {
        return this.dimensione;
    }
    public ArrayList getCane(){
        return this.cane;
    }
}
