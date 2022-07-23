public class AnimalComAsa extends Animal{
    private boolean voaBem;

    public AnimalComAsa(String nome, String especie, int quantidadeDePatas, String somCaracteristico, boolean voaBem){
        super(nome, especie, 2, somCaracteristico);
        this.voaBem = voaBem; 
    }
    public String getDescricaoLonga(){
        String resp;
        if(voaBem == true){
        resp = "sim";
        }else{
        resp = "nao";
        }
        return getDescricaoLonga() + " " + resp;
    }
}
