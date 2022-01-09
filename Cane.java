public class Cane {
    public String Razza, Nome, Datadinascita;
    public Cane(){
        Razza = "";
        Nome = "";
        Datadinascita = "";
    }
    public Cane(String Razza, String Nome, String Datadinascita) {
        this.Razza = Razza;
        this.Nome = Nome;
        this.Datadinascita = Datadinascita;
    }
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public void setDatadinascita(String Datadinascita){
        this.Datadinascita = Datadinascita;
    }
    public void setRazza(String Razza){
        this.Razza = Razza;
    }
    public String getRazza(){
        return this.Razza;
    }
    public String getDatadinascita(){
        return this.Datadinascita;
    }
    public String getNome() {
        return this.Nome;
    }
}