public abstract class Violao implements Prototype, Cloneable{
    protected String tipo;
    protected String cordas;
    protected String corpo;
    protected String indicacao;
    protected String timbre;
    protected boolean eletrico;
    protected double precoMedio;

    @Override
    public Prototype clone() {
        try {
            return (Violao) super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Erro ao clonar violão: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("\n=== DETALHES DO VIOLÃO ===");
        System.out.println("Tipo: " + tipo);
        System.out.println("Cordas: " + cordas);
        System.out.println("Corpo: " + corpo);
        System.out.println("Indicação: " + indicacao);
        System.out.println("Timbre: " + timbre);
        System.out.println("Elétrico: " + (eletrico ? "Sim" : "Não"));
        System.out.printf("Preço Médio: R$ %.2f%n", precoMedio);
        System.out.println("=========================");
    }
}