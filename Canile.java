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
    public String rimuoviCane(Cane canedatogliere){
        for (int i = gabbie.size(); i>=0; i--){
            Gabbia n = gabbie.get(i);
            ArrayList ca = n.getCane();
            for(int k = 0; k<ca.size(); k++){
                Cane ko = (Cane)ca.get(k);
                if(ko.equals(canedatogliere)==true){
                    ca.remove(k);
                    super.setCane(ca);
                    break;
                }
            }
        }
        return "\nCane rimosso!\n";
    }
    public String stampaCani(){
        for (int i = 0; i < gabbie.size(); i++) {
            ArrayList cani = gabbie.get(i).getCane();
            for(int k = 0; k < cani.size(); k++){
                System.out.println(cani);
            }
        }
        return "\n\nCani Scritti!\n";
    }
    public void ritornaGabbia(String nomecane){
        for(int i = 0; i<gabbie.size(); i++){
            ArrayList n = gabbie.get(i).getCane();
            for(int k = 0; k < n.size(); k++){
                if(n.get(k).equals(nomecane)){
                    System.out.println(n);
                }
            }
        }
    }
    public void vediNumeroGabbia(){
        for(int i = 0; i<gabbie.size();i++){
            System.out.println(gabbie.get(i).getNumero());
        }
    }
    
}