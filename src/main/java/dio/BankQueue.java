package dio;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Challenge
 * The bank you work at always has trouble organizing customer service queues.
 *
 * After a meeting with management, it was decided that customers upon arrival at the agency will receive a numeric password on their cell phone via SMS and that the order of the queue will be given not by the order of arrival, but by the number received via SMS. The order of attendance will be decreasing: those who received a larger number must be attended first.
 *
 * Then, given the order of arrival of customers, reorder the queue according to the number received via SMS, and tell how many customers did not need to change places in this reordering.
 *
 * Input
 * The first line contains an integer N, indicating the number of test cases to follow.
 *
 * Each test case starts with an integer M (1 ≤ M ≤ 1000), indicating the number of customers. Then there will be M distinct integers Pi (1 ≤ Pi ≤ 1000), where the i-th integer indicates the number received via sms from the i-th customer.
 *
 * The integers above are given in order of arrival, that is, the first integer concerns the first customer to arrive in the queue, the second integer concerns the second customer, and so on.
 *
 * Output
 * For each test case, print a line, containing an integer, indicating the number of customers who did not need to change places even after the queue was reordered.
 *
 *
 * Input Example Output Example
 * 3
 * 3
 * 100 80 90
 * 4
 * 100 120 30 50
 * 4
 * 100 90 30 25
 *
 * 1
 * 0
 * 4
 */

public class BankQueue {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<Integer> filaChegada = new ArrayList<>();
        List<Integer> filaOrdenada = new ArrayList<>();

        //System.out.println("Digite o número de casos de teste");
        int numCasosTeste = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        for (int i = 0; i < numCasosTeste; i++) {
            //System.out.println("Digite a quantidade de pessas na fila");
            int quantClientes = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
            String[] senhas = br.readLine().split(" ");
            for (int j = 0; j < quantClientes; j++) {
                filaChegada.add(Integer.parseInt(senhas[j]));
            }
            filaOrdenada.addAll(filaChegada);
            filaOrdenada.sort(Collections.reverseOrder());
            int quantIguais = 0;
            for (int j = 0; j < quantClientes; j++) {
                if (filaChegada.get(j) == filaOrdenada.get(j)) {
                    quantIguais++;
                }
            }
            System.out.println(quantIguais);
            filaChegada.clear();
            filaOrdenada.clear();
        }
    }

}


/**
 * Desafio
 * O banco que você trabalha sempre tem problemas para organizar as filas de atendimento dos clientes.
 *
 * Após uma reunião com a gerência ficou decidido que os clientes ao chegar na agência receberão uma senha numérica em seu aparelho de celular via sms e que a ordem da fila será dada não pela ordem de chegada, mas sim pelo número recebido via sms. A ordem de atendimento será decrescente: aqueles que receberam número maior deverão ser atendidos primeiro.
 *
 * Então, dada a ordem de chegada dos clientes reordene a fila de acordo com o número recebido via sms, e diga quantos clientes não precisaram trocar de lugar nessa reordenação.
 *
 * Entrada
 * A primeira linha contém um inteiro N, indicando o número de casos de teste a seguir.
 *
 * Cada caso de teste inicia com um inteiro M (1 ≤ M ≤ 1000), indicando o número de clientes. Em seguida haverá M inteiros distintos Pi (1 ≤ Pi ≤ 1000), onde o i-ésimo inteiro indica o número recebido via sms do i-ésimo cliente.
 *
 * Os inteiros acima são dados em ordem de chegada, ou seja, o primeiro inteiro diz respeito ao primeiro cliente a chegar na fila, o segundo inteiro diz respeito ao segundo cliente, e assim sucessivamente.
 *
 * Saída
 * Para cada caso de teste imprima uma linha, contendo um inteiro, indicando o número de clientes que não precisaram trocar de lugar mesmo após a fila ser reordenada.
 *
 *
 * Exemplo de Entrada	Exemplo de Saída
 * 3
 * 3
 * 100 80 90
 * 4
 * 100 120 30 50
 * 4
 * 100 90 30 25
 *
 * 1
 * 0
 * 4
 */