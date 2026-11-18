public class Despesa{
    public int valor;
    public String decricao;
    public String categoria;

    public Despesa(int valor, String decricao, String categoria) {
        this.valor = valor;
        this.decricao = decricao;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Despesa{" +
                "valor=" + valor +
                ", decricao='" + decricao + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
