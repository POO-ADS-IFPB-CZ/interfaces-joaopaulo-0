public class Main {
    public static void main(String[] args) {
        Triatleta triatleta = new Triatleta("João Paulo", 22);

        System.out.println("Informações do Triatleta");
        triatleta.exibirInformacoes();

        System.out.println("\nAtividades");
        triatleta.pedalar();
        triatleta.nadar();
        triatleta.correr();
        triatleta.competir();
    }
}