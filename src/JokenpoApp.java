import br.senai.sp.jandira.jokenpo.model.JokenpoJogo;

public class JokenpoApp {
    public static void main(String[] args) {
        System.out.println("INICIALIZANDO O JOGO...");
        System.out.println("---------------------------");
        System.out.println("***VAMOS JOGAR JOKENPÔ!***");
        System.out.println("---------------------------");
        JokenpoJogo starter = new JokenpoJogo();

        starter.capturarEscolhaDoJogador();
    }

}
