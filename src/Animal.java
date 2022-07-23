public class Animal {
    private String nome; 
    private String especie; 
    private int quantidadeDePatas;
    private String somCaracteristico;

    public Animal(String nome, String especie, int quantidadeDePatas, String somCaracteristico){
        this.nome = nome;
        this.especie = especie;
        this.quantidadeDePatas = quantidadeDePatas;
        this.somCaracteristico = somCaracteristico;
    }
    public String getNome(){
    return nome;
    }
    public String getEspecie(){
    return especie;
    }
    public String getSomCaracteristico(){
    return somCaracteristico;
    }
    public String getDescricao(){
    return getNome() + " é um " + getEspecie();
    }
    public String getDescricaoLonga(){
    return getNome() + " é um " + getEspecie() + " que faz " + getDescricao();
    }
}
