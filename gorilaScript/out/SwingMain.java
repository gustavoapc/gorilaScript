package out;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class SwingMain {
    public static void main(String[] args) {
        while (true) {  // Loop para permitir a repetição
            // Cria campos de texto
            JTextField valorInicialField = new JTextField();
            JTextField taxaJurosField = new JTextField();
            JTextField anosField = new JTextField();
            JTextField aporteMensalField = new JTextField();

            // Cria paineis para os campos de entrada
            JPanel panel = new JPanel(new GridLayout(0, 1, 5, 5));
            panel.add(new JLabel("Digite o valor inicial:"));
            panel.add(valorInicialField);
            panel.add(new JLabel("Digite a taxa de juros (em %):"));
            panel.add(taxaJurosField);
            panel.add(new JLabel("Digite o número de anos:"));
            panel.add(anosField);
            panel.add(new JLabel("Digite o valor do aporte mensal:"));
            panel.add(aporteMensalField);

            // Define o tamanho dos campos de texto
            Dimension fieldSize = new Dimension(200, 30);
            valorInicialField.setPreferredSize(fieldSize);
            taxaJurosField.setPreferredSize(fieldSize);
            anosField.setPreferredSize(fieldSize);
            aporteMensalField.setPreferredSize(fieldSize);

            // Exibe a caixa de diálogo para entrada de dados
            int result = JOptionPane.showConfirmDialog(null, panel, "Simulador de Investimentos", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            // Se o usuário clicar em "OK"
            if (result == JOptionPane.OK_OPTION) {
                try {
                    float valorInicial = Float.parseFloat(valorInicialField.getText());
                    float taxaJuros = Float.parseFloat(taxaJurosField.getText());
                    int anos = Integer.parseInt(anosField.getText());

                    // Verifica se o campo de aporte mensal está vazio
                    float aporteMensal = 0;
                    if (!aporteMensalField.getText().isEmpty()) {
                        aporteMensal = Float.parseFloat(aporteMensalField.getText());
                    }

                    // Calcula o valor final usando a classe GeneratedCode
                    float valorFinal = GeneratedCode.calcularInvestimento(valorInicial, taxaJuros, anos, aporteMensal);

                    // Formata o resultado com duas casas decimais
                    DecimalFormat df = new DecimalFormat("#.00");
                    String valorFinalFormatado = df.format(valorFinal);

                    // Exibe o resultado em uma caixa de diálogo
                    JOptionPane.showMessageDialog(null, "O valor final do investimento é: " + valorFinalFormatado, "Simulador de Investimentos", JOptionPane.INFORMATION_MESSAGE);
                    break; // Sai do loop se o cálculo foi bem-sucedido
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira valores válidos.\nPara valores decimais, utilize '.'\nEx: 10.50", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // Se o usuário clicar em "Cancelar", sai do loop
                break;
            }
        }
    }
}
