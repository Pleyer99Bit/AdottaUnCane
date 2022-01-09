import java.util.*;
public class Gabbia extends Cane{
    public ArrayList <Cane> cane = new ArrayList<Cane>();
    public int Numero, Dimensione;
    public Gabbia() {
        super();
        Numero = 0;
        Dimensione = 0;
    }
    public Gabbia(String Razza, String Nome, String Datadinascita, ArrayList cane, int Numero, int Dimensione) {
        super(Razza);
        this.Numero = Numero;
        this.cane = cane;
        this.Numero = Numero;
    }
}
