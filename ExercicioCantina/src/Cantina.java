import javax.swing.*;

public class Cantina {

    public static void main(String[] args) {

        //apos identificar a nossa entidade forte Pedido, iniciamos criando uma instancia de Pedido, mas entendendo que Pedido possui itens dentro dele que precisarão ser tambem preenchidos
        Pedido p = new Pedido();
        //cliente já é um item de Pedido que precisamos instanciar
        Cliente c = new Cliente();
        String nome = JOptionPane.showInputDialog("Informe o nome do cliente");
        c.nome = nome;
        p.c = c;
        //Massa será o próximo objeto a ser preenchido
        Massa m = new Massa();
        String tipoMassa = JOptionPane.showInputDialog("Informe o nome da massa");
        m.tipo = tipoMassa;
        double valorMassa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da massa"));
        p.m = m;

        int opcao = 0;
        Ingrediente ingrediente = new Ingrediente();

        while (opcao != 5){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ingrediente desejado:\n1-Bacon" + "\n2-Mussarela\n3-Tomate\n4-Queijo\n5-Sair"));

        if( opcao == 1){
            ingrediente.nome = "Bacon";
            p.ListaIngredientes.add(ingrediente);

        }

        }




    }
}
