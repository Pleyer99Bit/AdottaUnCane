public class Cane{
    public String razza, nome, datadinascita;
    public Cane(){
        razza = "";
        nome = "";
        datadinascita = "";
    }
    public Cane(String razza, String nome, String datadinascita) {
        this.razza = razza;
        this.nome = nome;
        this.datadinascita = datadinascita;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDatadinascita(String datadinascita){
        this.datadinascita = datadinascita;
    }
    public void setRazza(String razza){
        this.razza = razza;
    }
    public String getRazza(){
        return this.razza;
    }
    public String getDatadinascita(){
        return this.datadinascita;
    }
    public String getNome() {
        return this.nome;
    }
}