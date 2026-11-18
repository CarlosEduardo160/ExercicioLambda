import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Despesa> despesas = new ArrayList<>(List.of(
                new Despesa(50, "Despesa 1", "Barbeiro"),
                new Despesa(150, "Despesa 2", "Mercado"),
                new Despesa(350, "Despesa 3", "GTA 6"),
                new Despesa(242, "Despesa 4", "Mercado")
        ));

        List<Despesa> filtrarValor = filtrarDespesas(despesas, d -> d.valor > 100);
        List<Despesa> filtrarCategoria = filtrarDespesas(despesas, d -> d.categoria.equals("Mercado"));
        List<Despesa> filtrarValorECategoria = filtrarDespesas(despesas, d -> (d.valor < 200) && (d.categoria.equals("Mercado")));
        System.out.println(filtrarValor);
        System.out.println(filtrarCategoria);
        System.out.println(filtrarValorECategoria);
    }

    static List<Despesa> filtrarDespesas(List<Despesa> despesas, FiltraDespesa filtraDespesa){
        List<Despesa> despesasFiltradas = new ArrayList<>();

        for (Despesa despesa : despesas){
            if (filtraDespesa.funcaoFiltrarDespesas(despesa)){
                despesasFiltradas.add(despesa);
            }
        }
        return despesasFiltradas;
    }
}