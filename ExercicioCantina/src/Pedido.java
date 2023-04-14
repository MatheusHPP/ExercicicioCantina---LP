import java.util.ArrayList;
import java.util.List;

public class Pedido {

    Cliente c;
    Massa m;
    List<Ingrediente> ListaIngredientes = new ArrayList<Ingrediente>();

    public double CalculaValor(){
        double valorInicial = m.valor; //pegando o valor inicial da massa para calculo. "valorInicial" é uma variavel auxiliar
        int qtdeIngredientesEscolhidos = ListaIngredientes.size();//pegando o tamanho da lista que corresponde a quantidade de ingredientes escolhidos
        double valorTotalIngredientes = qtdeIngredientesEscolhidos*2; //sabendo que cada ingrediente custa 2 reais
        double valorTotalPedido = valorInicial + valorTotalIngredientes;
        return valorTotalPedido;

    }

}
