import javax.swing.JOptionPane;

public class VerificaERRO {

    public static void main(String[] args) {
        String cpf = JOptionPane.showInputDialog("Digite o CPF:");
        String erro = verificaErrosDigitacao(cpf);

        if (erro != null) {
            JOptionPane.showMessageDialog(null, erro, "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "CPF digitado corretamente.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static String verificaErrosDigitacao(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            return "Digite o CPF.";
        }
        if (!cpf.matches("\\d{11}")) {
            return "O CPF deve ter 11 dígitos e conter apenas números.";
        }
        if (cpf.matches("(\\d)\\1{10}")) {
            return "O CPF não pode ter todos os dígitos iguais.";
        }
        return null;
    }
}
