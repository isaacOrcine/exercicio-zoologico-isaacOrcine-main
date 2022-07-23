public class App {
    public static void main(String[] args) throws Exception {
        InterfaceUsuario iu = new InterfaceUsuario();
        iu.executar();
        Gato cat = new Gato("natinha");
        System.out.println(cat.getDescricaoLonga());
    }
}
