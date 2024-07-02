import javax.swing.JOptionPane;
public class Curso {

        //atributos
        String nome;
        int quantidadeAlunos;
        String turma;
        float mensalidade;

        //construtores
        Curso(){

        }
        Curso(String n, int q, String t, float m){
            nome = n;
            quantidadeAlunos = q;
            turma = t;
            mensalidade = m;
        }

        //metodos
        public void cadastraCurso(){
            nome = JOptionPane.showInputDialog("Digite o nome do Curso");
            quantidadeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
            turma = JOptionPane.showInputDialog("Digite a turma");
            mensalidade = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da mensalidade"));
        }
        public void imrimeDados(){
            JOptionPane.showMessageDialog(null, "Curso: "+nome+
                    "\nAlunos: "+quantidadeAlunos+
                    "\nTurma: "+turma+
                    "\nMensalidade: "+mensalidade);
        }
        public float calculaTotalMensalidades(){
            float valor;
            valor = mensalidade * quantidadeAlunos;
            return valor;
        }
        public String maisAlunos(Curso c){
            Curso a = new Curso();
            String texto;
            a.quantidadeAlunos = this.quantidadeAlunos;
            a.nome = this.nome;
            if(a.quantidadeAlunos > c.quantidadeAlunos){
                texto = "O curso "+a.nome+" com "+a.quantidadeAlunos+
                        " alunos, tem a maior quantidade de alunos";
            }else{
                texto = "O curso "+c.nome+" com "+c.quantidadeAlunos+
                        " alunos, tem a maior quantidade de alunos";
            }
            return texto;
        }


    }
