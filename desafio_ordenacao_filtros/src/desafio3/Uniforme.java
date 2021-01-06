package desafio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Uniforme {
    private String nome;
    private String tamanho;
    private String cor;

    public static void main(String[] args) throws IOException, Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        List<Uniforme> lista = new ArrayList<>();
        System.out.println("Digite a n lista");
        int num = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());

        if (num >= 1 && num <= 60) {
            while (num > 0) {
                var uniformeModel = new Uniforme();
                System.out.println("Digite o nome");
                uniformeModel.setNome(br.readLine());
                System.out.println("Digite a cor e o tamanho");
                var corTamanhoAux = br.readLine().split(" ");
                uniformeModel.setCor(corTamanhoAux[0]);
                uniformeModel.setTamanho(corTamanhoAux[1]);
                lista.add(uniformeModel);
                num--;
            }
        }

        lista.sort(new Comparator<Uniforme>() {
            @Override
            public int compare(Uniforme u1, Uniforme u2) {
                if (u1.getCor().equals(u2.getCor())) {
                    if (u1.getTamanho().equals(u2.getTamanho())) {
                        return u1.getNome().compareTo(u2.getNome());
                    }
                    return u2.getTamanho().compareTo(u1.getTamanho());
                }
                return u1.getCor().compareTo(u2.getCor());
            }
        });

        //essa parte comentada da errado, nao ordena como no sql, precisei impplementar comparator
        /*Comparator<Uniforme> comparador = Comparator.comparing(Uniforme::getNome)
                                                    .thenComparing(Uniforme::getTamanho)
                                                    .thenComparing(Uniforme::getCor);
        lista = lista.stream().sorted(comparador).collect(Collectors.toList());*/
        lista.stream().forEach(uniforme -> System.out.println(uniforme.getCor() + " " + uniforme.getTamanho() + " " + uniforme.getNome()));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
