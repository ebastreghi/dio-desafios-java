package desafio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Desafio2 {
    public static void main(String[] args) throws IOException, Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        List<List<String>> listas = new ArrayList<>();
        System.out.println("Digite a n lista");
        int numListas = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        String produtos;
        if (numListas < 100) {
            while (listas.size() != numListas) {
                //digitar uma linha toda separada por espaço de 1 a 1000 itens (cada item pode ter até 20 caracteres)
                System.out.println("Digite os itens");
                produtos = br.readLine();
                List<String> listaAuxiliar = new ArrayList<>();
                var produtusAux= produtos.toLowerCase().split(" ");
                if(!(produtusAux.length > 1 && produtusAux.length <= 1000)) {
                    throw new Exception();
                }
                if(Arrays.stream(produtusAux).anyMatch(item -> item.length() < 1 || item.length() > 20)){
                    throw new Exception();
                }
                listaAuxiliar = Arrays.stream(produtusAux)
                        .filter(item -> item.length() > 1 && item.length() <= 20)
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList());
                listas.add(listaAuxiliar);
            }
        }
        listas.stream()
                .map(lista -> lista.stream().collect(Collectors.joining(" ")))
                .forEach(System.out::println);
    }

}
