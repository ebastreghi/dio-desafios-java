package desafio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class FilaBanco {

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
