[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=8145033&assignment_repo_type=AssignmentRepo)
## Exercício Zoológico - Herança

## Passo 1 - Modelar as classes

Suponha que queiramos criar um sistema que precise tratar as seguintes espécies de animais: lobo, gato, galinha e águia.

- Sabe-se que todas as espécies têm: nome, espécie e quantidade de patas e que cada espécie tem um som característico (ex: gato: “miau”, galinha: “cocorico”, etc.).
- Além disso, para os animais que têm pelo é necessário definir a cor do pelo e para os que voam deve-se definir se voam bem ou mal. 

O sistema deve possuir:

- Métodos para consulta de cada atributo de todos os animais.
- Método `getDescricao` que retorne uma string conforme os exemplos abaixo: 
  - `Fantasma é um lobo`.
  - `GatoDeBotas é um gato`.
- Método `getDescricaoLonga` que retorne uma string como a do exemplo abaixo: 
  - `GatoDeBotas é um gato que faz miau e tem pelo laranja`.

Primeiramente, você deve apenas **modelar as classes necessárias** para representar todos os animais utilizando o conceito de herança:

- Ou seja, você **deverá definir**, os nomes de cada classe, dos seus atributos e seus métodos.
- Para isso: **altere esse arquivo README** com a sua definição das classes (no trecho abaixo) e **faça um commit**.

Dicas:
- Avalie cuidadosamente os atributos a serem definidos, evitando replicação de código.
- Lembre-se que os animais devem ser criados com valores que façam sentido.
  - Por exemplo: não faz sentido criar uma galinha com três pernas, ou que faça "au au".
  - Portanto, avalie bem como os atributos devem ser inicializados.

Valide a sua modelagem com o professor antes de começar a implementação no próximo passo.

### Classes

**Classe Animal**

Atributos: 
  private String nome; 
  private String especie; 
  private int quantidadeDePatas;
  private String somCaracteristico;

Métodos: 
public animal(String nome, String especie, int quantidadeDePatas, String somCaracteristico){
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
  return SomCaracteristico;
}
public String getDescricao(){
  return getNome() + " é um " + getEspecie();
}
public String getDescricaoLonga(){
  return getNome() + " é um " + getEspecie() + " que faz " + getDescricao();
}

**Classe AnimalComPelo extends Animal**

Atributos: 
 private String corDoPelo;

Métodos:
  public AnimalComPelo(String nome, String especie, int quantidadeDePatas, String somCaracteristico, String corDoPelo){
    super(nome, especie, quantidadeDePatas, somCaracteristico);
    this.corDoPelo = corDoPelo; 
  }
  public String getDescricaoCurta(){
  return getDescricao();
  }
  public String getDescricaoAnimalComPeloLonga(){
  return getDescricaoLonga() + " " + corDoPelo;
  }


**Classe AnimalComAsa extends Animal**
Atributos: 
  private boolean voaBem;

Métodos:
  public AnimalComPelo(String nome, String especie, int quantidadeDePatas, String somCaracteristico, boolean voaBem){
    super(nome, especie, 2, somCaracteristico);
    this.voaBem = voaBem; 
  }
  public String getDescricaoCurta(){
  return getDescricao();
  }
  public String getDescricaoAnimalComAsaLonga(){
    if(voaBem == true){
      String resp = "sim";
    }else{
      String resp = "nao";
    }
    return getDescricaoLonga() + " " + resp;
  }

**Classe Lobo extends AnimalComPelo**
Métodos:
  public Lobo(String nome, String especie, int quantidadeDePatas, String somCaracteristicoAve, String corDoPelo){
    super(nome, "mamifero", 4, "auuu", "cinza");
  }
  public String getDescricaoCurtaLobo(){
  return getDescricaoCurta();
  }
  public void getDescricaoLoboLonga(){
  System.out.println(getDescricaoAnimalComPelo());
  }

**Classe Gato extends AnimalComPelo**
Métodos:
  public Gato(String nome, String especie, int quantidadeDePatas, String somCaracteristicoAve, String corDoPelo){
    super(nome, "mamifero", 4, "miau", "preto");
  }
  public String getDescricaoCurtaGato(){
  return getDescricaoCurta();
  }
  public void getDescricaoGatoLonga(){
  System.out.println(getDescricaoAnimalComPelo());
  }

**Classe Galinha extends AnimalComAsa**
Métodos:
  public AnimalComPelo(String nome, String especie, int quantidadeDePatas, String somCaracteristico, boolean voaBem){
    super(nome, "Ave", 2, "cocorico", false);
  }
  public String getDescricaoCurtaGalinha(){
  return getDescricaoCurta();
  }
  public void getDescricaoGalinhaLonga(){
  System.out.println(getDescricaoAnimalComAsa());
  }

**Classe Aguia extends AnimalComAsa**
Métodos:
  public AnimalComPelo(String nome, String especie, int quantidadeDePatas, String somCaracteristico, boolean voaBem){
    super(nome, "Ave", 2, "quiá", true);
  }
  public String getDescricaoCurtaAguia(){
  return getDescricaoCurta();
  }
  public void getDescricaoAguiaLonga(){
  System.out.println(getDescricaoAnimalComAsa());
  }

## Passo 2 - Implementar a Hierarquia de Herança

Neste passo você deve **implementar todas as classes que representam animais**, e que você definiu no passo anterior.

Dicas:
- Não crie todas as classes de uma vez. Comece criando apenas o necessário para ter objetos de uma única espécie.
- Em seguida, na classe que tem o método `main`, crie um objeto daquela espécie e chame alguns métodos diretamente no código para testar sua implementação.
- Depois de validar e garantir que está tudo certo com a primeira classe, aí sim crie as classes para as demais espécies.

Não se esqueça de fazer um commit ao terminar esse passo.

## Passo 3 - Criar a classe Zoologico

**Crie uma classe chamada `Zoologico`** que gerencie os objetos de cada espécie. 

A classe deverá ter:

- Uma lista para cada espécie de animal.
   - Obs.: mesmo que já conheça polimorfismo, por objetivos didáticos, é importante que crie as listas separadas neste exercício.
- Métodos para adicionar cada espécie de animal.
  - Os métodos devem receber os dados necessários e dentro deles é que os objetos serão criados.

- Método que recebe o nome de um animal e retorna sua descrição longa.
- Método que lista a descrição de todos os animais do zoológico.
- Método que lista a descrição longa de todos os animais do zoológico.

O código inicial de uma classe `InterfaceUsuario`, que implementa o menu de opções para o usuário do programa, já foi fornecido para você.
Você deverá **alterar a classe `InterfaceUsuario`** chame os métodos da sua classe Zoológico e obtenha dados do usuário (quando necessário).

Teste suas implementações!

Ao final, não se esqueça de fazer um commit e sincronizar suas alterações.
