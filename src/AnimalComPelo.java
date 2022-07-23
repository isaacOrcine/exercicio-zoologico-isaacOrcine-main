public class AnimalComPelo extends Animal{
    private String corDoPelo;

    public AnimalComPelo(String nome, String especie, int quantidadeDePatas, String somCaracteristico, String corDoPelo){
        super(nome, especie, quantidadeDePatas, somCaracteristico);
        this.corDoPelo = corDoPelo; 
    }
    public String getDescricaoLonga(){
    return getDescricaoLonga() + " " + corDoPelo;
    }
}
