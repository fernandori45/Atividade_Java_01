import javax.swing.JOptionPane;

public class UsaMain {
    public static void main(String[] args) {
        Celular cel = new Celular();
        Cliente cli = new Cliente();
        Medicamento med = new Medicamento();

        cel.marca = JOptionPane.showInputDialog("Informe a marca do celular");
        cel.modelo = JOptionPane.showInputDialog("Informe o modelo");
        cel.preco = Float.parseFloat(JOptionPane.showInputDialog("Informe o Preço"));
        cel.ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));

        JOptionPane.showMessageDialog(null,"Marca = " + cel.marca + "\nModelo = " + cel.modelo + "\nPreço = " + cel.preco + "\nAno = " + cel.ano);

        cli.nome = JOptionPane.showInputDialog("Entre com o nome do cliente");
        cli.idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade"));
        cli.profissao = JOptionPane.showInputDialog("Entre com a profissão");
        cli.escolaridade = JOptionPane.showInputDialog("Entre com o nivel de escolaridade");

        JOptionPane.showMessageDialog(null, "Nome = " + cli.nome + "\nIdade = " + cli.idade + "\nProfissão = " + cli.profissao + "\nEscolaridade = " + cli.escolaridade);

        med.nome = JOptionPane.showInputDialog("Entre com o nome do medicamento");
        med.validade = (JOptionPane.showInputDialog("Entre com a validade"));
        med.motivo = JOptionPane.showInputDialog("Informe o motivo do Uso");

        JOptionPane.showMessageDialog(null, "Nome = " + med.nome + "\nValidade = " + med.validade + "\nMotivo = " + med.motivo);
    }
}
