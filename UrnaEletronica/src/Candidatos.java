
import javax.swing.*;
import java.awt.*;
import javax.swing.Timer;
import java.util.Arrays; //biblioteca para manipulação de arrays

/**
 *
 *
 *
 * @author Yasmin
 */
public class Candidatos extends javax.swing.JFrame {

    volatile Boolean isRunning = true;
    Boolean depfed = true, depest = false, sen = false, gov = false, pres = false, pararthread = false;
    String pegavoto = "", partido = "", candidato = "";
    JTextField recebvet[];
    int i = 0, validar = 0;
    Timer timer;
    Thread thread;
    String[] infieisNomes = new String[5]; //vetor do partido infieis que recebe os nomes
    int [] infieis = new int[5]; //vetor do partido infieis que recebe os votos
    int ganhador = 0;
    int candidatoGanhador = 0;


    public void labelsiniciar() { //labels escondidas inicialmente

        if (depfed == true) {
            UrnaDesign.quintodig.setBorder(null);
            UrnaDesign.seuvotopara.setText("");
            UrnaDesign.cargo1.setOpaque(false);
            UrnaDesign.cargo1.setIcon(null);
            UrnaDesign.cargo2.setOpaque(false);
            UrnaDesign.cargo1.setIcon(null);
            UrnaDesign.cargo3.setOpaque(false);
            UrnaDesign.cargo3.setIcon(null);
            UrnaDesign.aperteatecla.setText("");
            UrnaDesign.confirmaprossegue.setText("");
            UrnaDesign.corrigereinicia.setText("");
            UrnaDesign.nomecandidato.setText("");
            UrnaDesign.nome.setText("");
            UrnaDesign.labelcargo2.setText("");
            UrnaDesign.labelcargo3.setText("");
            UrnaDesign.linha.setBorder(javax.swing.BorderFactory.createEmptyBorder());
            UrnaDesign.numero.setText("");
            UrnaDesign.partido.setText("");
            UrnaDesign.partidoescolhido.setText("");
            UrnaDesign.votolegendamini.setText("");
            UrnaDesign.votodelegenda.setText("");
        }
    }

    public void labels2dig() {      //Labels que aparecem após 2 dígitos válidos do partido, durante a escolha do deputado federal 
        UrnaDesign.seuvotopara.setText("SEU VOTO PARA");
        UrnaDesign.linha.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 3));
        UrnaDesign.aperteatecla.setText("Aperte a tecla:");
        UrnaDesign.confirmaprossegue.setText("CONFIRMA para PROSSEGUIR");
        UrnaDesign.corrigereinicia.setText("CORRIGE para REINICIAR este voto");
        UrnaDesign.numero.setText("Número:");
        UrnaDesign.partido.setText("Partido:");
        UrnaDesign.votolegendamini.setText("(voto de legenda)");
    }

    public void digitar(JButton botao) {
        JTextField numero[] = new JTextField[]{
            UrnaDesign.primeirodig, UrnaDesign.segundodig, UrnaDesign.terceirodig, UrnaDesign.quartodig, UrnaDesign.quintodig
        };
        recebvet = numero;

        if (depfed == true) {
            if (numero[3].getText().equals("")) { //restringe o usuáriio a 4 digitos apenas
                do {
                    if (numero[i].getText().equals("")) { //enquanto o último digito estiver vazio, o usuário pode digitar
                        numero[i].setText(botao.getText());
                        pegavoto = pegavoto + botao.getText(); //adiciona todos os números digitados a uma única string
                        //System.out.println("numeros digitados: " + pegavoto);
                    }
                    i++;
                } while (UrnaDesign.primeirodig.getText().equals("") && UrnaDesign.segundodig.getText().equals("") && UrnaDesign.terceirodig.getText().equals("") && UrnaDesign.quartodig.getText().equals(""));
            }
            if (!"".equals(numero[1].getText())) { //separa o número do partido 
                partido = pegavoto.substring(0, 2);
                //System.out.println("partido: " + partido);
                checavoto();
            }
            if (!"".equals(numero[3].getText())) { //separa o número do candidato
                candidato = pegavoto.substring(2, 4);
                //System.out.println("candidato: " + candidato);
                checavoto();
            }
        }
    }

    public void checavoto() {

        if (depfed == true) {
            if (partido.equals("01")) {
                validar = 1; //se o partido for válido ( aparece: nome do partido)               
                System.out.println("partido valido: " + validar);
                UrnaDesign.partidoescolhido.setText("Partido dos Infiéis");
                if (validar == 1) { //se o partido for válido
                    switch (candidato) {
                        case "01" -> {
                            UrnaDesign.cargo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagens\\abner.jpg")));
                            UrnaDesign.nome.setText("Nome: ");
                            UrnaDesign.nomecandidato.setText("Abner Pinheiro");
                            UrnaDesign.votolegendamini.setText("");
                            //confiravoto_votodelegenda();
                            validar = 2; //se o partido for válido e o candidato for válido
                            System.out.println("partido valido e candidato valido: " + validar);
                            infieisNomes[0] = "Abner";
                            infieis[0]++; //a casa 0 vai incrementar 1 voto a cada "round"

                        }
                        case "02" -> {
                            UrnaDesign.cargo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagens\\arthur.jpg")));
                            UrnaDesign.nome.setText("Nome: ");
                            UrnaDesign.nomecandidato.setText("Arthur Aguiar");
                            UrnaDesign.votolegendamini.setText("");
                            //confiravoto_votodelegenda();
                            validar = 2; //se o partido for válido e o candidato for válido
                            System.out.println("partido valido e candidato valido: " + validar);
                            infieisNomes[1] = "Arthur";
                            infieis[1]++;//a casa 1 vai incrementar 1 voto a cada "round"
                        }
                        case "" -> {
                            System.out.println("nada acontece"); //se digitou só o partido válido e o candidato está vazio
                        }
                        default -> { //se nenhum dos casos acima forem verdadeiros
                            validar = 3; // se o partido for válido e o candidato for inválido (aparece: candidato inexistente / voto de legenda)
                            System.out.println("partido valido e candidato invalido: " + validar);
                        }
                    }
                }
            } else if (validar == 0) { //se o partido for inválido
                //confiravoto_votodelegenda(); //se o usuário só digitou o partido e o partido é inválido (aparece: número errado / voto nulo)
                System.out.println("digitou apenas o partido, partido invalido: " + validar);

                if (!"".equals(candidato)) { //se digitou os 2 últimos dígitos
                    validar = 4; //se o partido é inválido logo candidato também é inválido
                    System.out.println("partido invalido e candidato invalido: " + validar);
                }
            }
            confiravoto_votodelegenda_votonulo_numeroerrado_candidatoinexistente();
        }
    }

    public void confiravoto_votodelegenda_votonulo_numeroerrado_candidatoinexistente() {
        switch (validar) {
            case 0 -> { // número errado e voto nulo
                labelsiniciar();
                labels2dig();
                UrnaDesign.partido.setText("");
                UrnaDesign.nome.setText("NÚMERO ERRADO");
                UrnaDesign.nome.setSize(200, 20);
                UrnaDesign.nome.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                UrnaDesign.votodelegenda.setText("VOTO NULO");
                UrnaDesign.votodelegenda.setSize(300, 30);
                UrnaDesign.votodelegenda.setFont(new Font("Segoe UI", Font.PLAIN, 28));
                UrnaDesign.votodelegenda.setLocation(120, 310);
                UrnaDesign.votolegendamini.setText("");

                timer = new Timer(500, e -> {
                    if (UrnaDesign.votodelegenda.getForeground() == Color.BLACK) {
                        UrnaDesign.votodelegenda.setForeground(Color.GRAY);
                    } else {
                        UrnaDesign.votodelegenda.setForeground(Color.BLACK);
                    }
                });
                timer.setInitialDelay(0);
                timer.start(); //timer duplicando quando digita 5555, tem q consertar isso

            }
            case 1 -> { //nome do partido e informações extras
                labels2dig();
            }
            case 2 -> { //confira seu voto
                thread = new Thread() {
                    @Override
                    public void run() {
                        UrnaDesign.aperteatecla.setText("");
                        UrnaDesign.corrigereinicia.setText("");
                        UrnaDesign.votolegendamini.setText("");
                        UrnaDesign.confirmaprossegue.setText("CONFIRA O SEU VOTO");
                        UrnaDesign.confirmaprossegue.setFont(new Font("Segoe UI", Font.PLAIN, 24));
                        UrnaDesign.confirmaprossegue.setLocation(160, 380);
                        UrnaDesign.confirmaprossegue.setSize(300, 30);
                        UrnaDesign.nome.setFont(new Font("Segoe UI", Font.PLAIN, 14));

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                        }

                        UrnaDesign.confirmaprossegue.setFont(new Font("Segoe UI", Font.PLAIN, 12));
                        UrnaDesign.confirmaprossegue.setLocation(15, 380);
                        UrnaDesign.confirmaprossegue.setSize(300, 30);

                        labels2dig();
                        UrnaDesign.votolegendamini.setText("");
                    }
                };
                thread.start();
            }
            case 3 -> {

            }
            case 4 -> {

            }
        }

    }

    public void corrige(JButton corrige) {
        if (timer != null && timer.isRunning()) { //encerra o piscamento da JLabel
            //System.out.println("parou o timer");
            timer.stop();
        }
        if (thread != null && thread.isAlive()) { // Verifica se a thread está em execução
            this.isRunning = false; // Define a variável de controle como false para parar a thread
            try {
                thread.join(); // Aguarda a finalização da thread
                //System.out.println("parou a thread");
            } catch (InterruptedException e) {}
        }

        labelsiniciar();
        validar = 0;
        pegavoto = "";
        partido = "";
        candidato = "";
        if (this.recebvet != null) { //só permite apagar se houverem números digiitados-
            for (i = 0; i < recebvet.length; i++) {
                recebvet[i].setText("");
            }
            i = 0;
        }

    }

    /*public void mostraVotos(){
        Arrays.sort(infieis); //vai arrumar o vetor infieis em ordem crescente primeiro
        System.out.println("VOTAÇÃO PARTIDO INFIEIS: ");
        for(int i = infieis.length - 1; i >=0; i--){ //isso aqui vai printar em ordem decrescente os candidatos (o com a maior quantia de votos até o com menor)
            System.out.println(infieis[i]);
        }

    }*/

    public void mostraVotosInfieis(){
        for(int i = 0; i < infieis.length; i++) {
            for(int j = i + 1; j < infieis.length; j++) {
                if (infieis[i] < infieis[j]) {
                    //troca a quantia de votos
                    int infieisTemp = infieis[i];
                    infieis[i] = infieis[j];
                    infieis[j] = infieisTemp;
                    //troca os nomes dos candidatos correspondentes
                    String infieisNomesTemp = infieisNomes[i];
                    infieisNomes[i] = infieisNomes[j];
                    infieisNomes[j] = infieisNomesTemp;
                }
            }
        }

        //mostra a lista de candidatos em ordem decrescente de votos
        System.out.println("VOTAÇÃO PARTIDO INFIEIS: ");
        for (int i = 0; i < infieisNomes.length; i++) {
            if(infieis[i] > 0){
                System.out.println("O CANDIDATO " + infieisNomes[i] + "RECEBEU " + infieis[i] + "VOTOS");
            } else {
                System.out.println("O CANDIDATO " + infieisNomes[i] + "RECEBEU " + infieis[i] + "VOTO");
            }
        }

        //informa o candidato vencedor
        for (int i = 0; i < infieis.length; i++){
            if (infieis[i] > ganhador) {
                ganhador = infieis[i];
                candidatoGanhador = i;
            }
        }
        System.out.println("O CANDIDATO ELEITO FOI: " + infieisNomes[candidatoGanhador] + "COM " + infieis[candidatoGanhador]);
    }
    //wip
}
