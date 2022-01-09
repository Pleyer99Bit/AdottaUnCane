import java.util.*;
public class app{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Canile c = new Canile();
        String nomeca = in.nextLine();
        String razzaca = in.nextLine();
        String datadinascitaca = in.nextLine();
        Cane canedatogliere = new Cane(nomeca, razzaca, datadinascitaca);
        System.out.println(c.rimuoviCane(canedatogliere));

        System.out.println(c.stampaCani());

        String nomecanedatrovare = in.nextLine();
        c.ritornaGabbia(nomecanedatrovare);

        c.vediNumeroGabbia();
    }
}