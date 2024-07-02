import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        Curso curso, curso2;
        String nomeCurso;
        String turmaCurso;
        int qtdAlunos;
        float valorMensalidade;

        curso = new Curso();

        nomeCurso = JOptionPane.showInputDialog("Digite o nome do Curso");
        qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
        turmaCurso = JOptionPane.showInputDialog("Digite a turma");
        valorMensalidade = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da mensalidade"));
        curso2 = new Curso(nomeCurso,qtdAlunos,turmaCurso,valorMensalidade);

        curso.cadastraCurso();

        curso2.imrimeDados();
        curso.imrimeDados();

        JOptionPane.showMessageDialog(null,"Curso: "+curso.nome+
                "\nValor total de mensalidades recebidas: "+curso.calculaTotalMensalidades());

        JOptionPane.showMessageDialog(null,"Curso: " +curso2.nome+
                "\nValor total de mensalidades recebidas: "+curso2.calculaTotalMensalidades());

        JOptionPane.showMessageDialog(null, "O curso com mais alunos é:\n"+curso.maisAlunos(curso2));

    }
}