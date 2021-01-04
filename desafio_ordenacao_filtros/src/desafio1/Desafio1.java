package desafio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Desafio1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        List<Integer> lista = new ArrayList<>();
        int numLinhas = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        int leitura;
        if (numLinhas > 1 && numLinhas < 10000) {
            while (lista.size() != numLinhas) {
                st = new StringTokenizer(br.readLine());
                leitura = Integer.parseInt(st.nextToken());
                if (leitura > 0) {
                    lista.add(leitura);
                }
            }
            List<Integer> pares = new ArrayList<>();
            pares = lista.stream().filter(item -> item % 2 == 0).sorted().collect(Collectors.toList());
            List<Integer> impares = new ArrayList<>();
            impares = lista.stream().filter(item -> item % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            for (Integer item : pares
            ) {
                System.out.println(item);
            }
            for (Integer item : impares
            ) {
                System.out.println(item);
            }
        }

    }

}
