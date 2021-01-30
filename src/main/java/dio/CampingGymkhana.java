package dio;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Camping Gymkhana
 * Challenge
 * During the December holidays, several schools organize themselves and take their students to a holiday camp for a week. In these camps, students are divided into collective huts by gender and age, always with an adult who, in addition to sleeping with the group in the hut, is also responsible for creating and executing various activities, such as games, excursions, Night Gymkhana, etc. .
 *
 * On the first day a contest was held in which the activity consisted of grouping students in a circle (organized in a counterclockwise direction) from which they would be removed one by one until there was only one student left, who would be the winner.
 *
 * The moment each student enters the circle, he / she receives a small chip that contains a value from 1 to 500. After the circle is formed, the number is counted, starting with the student who is next to the first one who entered the circle, the number corresponding to the record the first holds. The student where the counted number falls, must be removed from the group, and the counting starts again according to the student record that has just been eliminated. To make it more interesting, when the value on the card is even, the counting is done clockwise and when the value on the card is odd, the counting is done counterclockwise.
 *
 * Develop a program so that at the next event, the person responsible for the game will know in advance which child will be the winner of each group, based on the information provided.
 *
 * Input
 * The entry contains several test cases. The first line of each test case contains an integer N (1 ≤ N ≤ 100), indicating the number of students who will be part of each circle. Then, the N lines of each test case will contain two pieces of information, the Name and the Value (1 ≤ Value ≤ 500) that appears on each student's file, separated by a space, in the order of entry in the formation of the initial circle.
 *
 * NOTE: The name of each student must not exceed 30 characters and contains only uppercase and lowercase letters, without accents, and the character "_". The end of the entry is indicated by the number zero.
 *
 * Output
 * For each test case, the message Winner (a): xxxxxx must be displayed, with a space after the ":" sign indicating the student in the group who won the game.
 *
 *
 * Input Example Output Example
 * 3
 * Fernanda 7
 * Fernando 9
 * Gustavo 11
 * 5
 * Mary 7
 * Peter 9
 * Joao_Vitor 5
 * Isabel 12
 * Laura 8
 * 3
 * Mary 4
 * Peter 3
 * John 2
 * 0
 *
 * Winner: Fernanda
 * Winner: Pedro
 * Winner: Pedro
 */

public class CampingGymkhana {

    private String nome;
    private int numero;

    public static void main(String[] args) throws IOException, Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //System.out.println("Digite a quantidade de alunos");
        int quantAlunos = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        List<CampingGymkhana> circulo = new ArrayList<>();
        var indiceAtual = 0;
        var indiceAlunoEliminado = 0;
        var valorAtualFicha = 0;

        while (quantAlunos > 0) {
            for (int i = 0; i < quantAlunos; i++) {
                //System.out.println("Digite o nome do aluno e um valor");
                var nomeNumeroAux = br.readLine().split(" ");
                    /*if(nomeNumeroAux[0].length() > 30){
                        throw new Exception();
                    }*/
                var gincanaModel = new CampingGymkhana();
                gincanaModel.nome = nomeNumeroAux[0];
                gincanaModel.numero = Integer.parseInt(nomeNumeroAux[1]);
                circulo.add(gincanaModel);
            }
            indiceAtual = 0;
            indiceAlunoEliminado = 0;
            valorAtualFicha = circulo.get(indiceAtual).numero;

            for (int i = 0; i < quantAlunos - 1; i++) {
                if (valorAtualFicha % 2 == 0) {
                    indiceAlunoEliminado = (circulo.size() - (valorAtualFicha % circulo.size()) + indiceAtual) % circulo.size();
                } else if (valorAtualFicha % 2 != 0) {
                    indiceAlunoEliminado = (valorAtualFicha % circulo.size() + indiceAtual) % circulo.size();
                }

                valorAtualFicha = circulo.get(indiceAlunoEliminado).numero;
                circulo.remove(indiceAlunoEliminado);

                indiceAtual = (valorAtualFicha % 2 == 0) ?
                        ((indiceAlunoEliminado <= circulo.size() - 1) ?
                                indiceAlunoEliminado : 0) :
                        ((indiceAlunoEliminado == 0) ?
                                (circulo.size() - 1) : (indiceAlunoEliminado - 1));
            }

            System.out.println("Vencedor(a): " + circulo.get(0).nome);
            circulo.clear();
            quantAlunos = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        }

    }

}

/**
 * Gincana de acampamento
 * Desafio
 * Nas férias de Dezembro, várias escolas se organizam e levam seus alunos para um acampamento de férias por uma semana. Nestes acampamentos os alunos são divididos em cabanas coletivos por gênero e idade, sempre com um adulto que, além de dormir com o grupo no cabana, também são responsáveis por criar e executar várias atividades, como por exemplo jogos, excursões, Gincanas Noturnas, etc.
 *
 * No primeiro dia foi realizada uma gincana em que a atividade constituia em agrupar os alunos em um círculo (organizado no sentido anti-horário) do qual seriam retiradas uma a uma até que sobrasse apenas um aluno, que seria o vencedor.
 *
 * No momento em que entra no círculo, cada aluno recebe uma pequena ficha que contém um valor de 1 a 500. Depois que o círculo é formado, conta-se, iniciando no aluno que está ao lado da primeira que entrou no círculo, o número correspondente à ficha que o primeiro detém. O aluno onde o número contado cair, deve ser retirado do grupo, e a contagem inicia novamente segundo a ficha do aluno que acabou de ser eliminado. Para ficar mais interessante, quando o valor que consta na ficha é par, a contagem é feita no sentido horário e quando o valor que consta na ficha é ímpar, a contagem é feita no sentido anti-horário.
 *
 * Desenvolva um programa para que no próximo evento o responsável pela brincadeira saiba previamente qual criança irá ser a vencedora de cada grupo, com base nas informações fornecidas.
 *
 * Entrada
 * A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém um inteiro N (1 ≤ N ≤ 100), indicando a quantidade de alunos que farão parte de cada círculo. Em seguida, as N linhas de cada caso de teste conterão duas informações, o Nome e o Valor (1 ≤ Valor ≤ 500) que consta na ficha de cada aluno, separados por um espaço, na ordem de entrada na formação do círculo inicial.
 *
 * OBS: O Nome de cada aluno não deverá ultrapassar 30 caracteres e contém apenas letras maiúsculas e minúsculas, sem acentos, e o caractere “_”. O final da entrada é indicado pelo número zero.
 *
 * Saída
 * Para cada caso de teste, deve-se apresentar a mensagem Vencedor(a): xxxxxx, com um espaço após o sinal ":" indicando qual é o aluno do grupo que venceu a brincadeira.
 *
 *
 * Exemplo de Entrada	Exemplo de Saída
 * 3
 * Fernanda 7
 * Fernando 9
 * Gustavo 11
 * 5
 * Maria 7
 * Pedro 9
 * Joao_Vitor 5
 * Isabel 12
 * Laura 8
 * 3
 * Maria 4
 * Pedro 3
 * Joao 2
 * 0
 *
 * Vencedor(a): Fernanda
 * Vencedor(a): Pedro
 * Vencedor(a): Pedro
 */
