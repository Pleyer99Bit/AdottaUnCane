import java.util.*;
public class Canile extends Gabbia{
    public ArrayList<Gabbia> gabbie = new ArrayList<Gabbia>();
    public String nomecanile;
    public Canile(){
        nomecanile = "";
    }
    public Canile(String razza, String nome, String datadinascita, ArrayList cane, int numero, int dimensione, ArrayList gabbie, String nomecanile){
        super(razza, nome, datadinascita, cane, numero, dimensione);
        this.gabbie = gabbie;
        this.nomecanile = nomecanile;
    }
    public void setGabbie(ArrayList gabbie){
        this.gabbie = gabbie;
    }
    public void setNomeCanile(String nomecanile){
        this.nomecanile = nomecanile;
    }
    public String getNomeCanile(){
        return this.nomecanile;
    }
    public ArrayList getGabbie(){
        return this.gabbie;
    }
}
