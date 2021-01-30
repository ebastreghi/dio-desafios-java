package dio;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidatorWithRequirements {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String password;

        while (scr.hasNextLine()) {
            password = scr.nextLine();

            Pattern pattern1 = Pattern.compile("[a-zA-Z0-9]+");
            Pattern pattern2 = Pattern.compile(".*[0-9].*");
            Pattern pattern3 = Pattern.compile(".*[a-z].*");
            Pattern pattern4 = Pattern.compile(".*[A-Z].*");

            if (pattern1.matcher(password).matches() && password.length() > 5 && password.length() < 33 &&
                    pattern2.matcher(password).matches() && pattern3.matcher(password).matches() && pattern4.matcher(password).matches()) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }
        scr.close();
    }

}


/**
 * Challenge
 * Pedro and Fernando are the developers in a stratup and will develop the new registration system, and asked for your help. Your task is to make the code that validates the passwords that are registered, for that you must pay attention to the following requirements:
 * <p>
 * The password must contain at least one uppercase letter, one lowercase letter and a number;
 * It cannot have any punctuation, accent or space characters;
 * In addition, the password can be 6 to 32 characters long.
 * Input
 * The entry contains several test cases and ends with the end of the file. Each line has an S string, corresponding to the password that is entered by the user at the time of registration.
 * <p>
 * Output
 * The output contains a line, which can be “Password valid.”, If the password has each item of the previously requested requirements, or “Password invalid.”, If one or more requirements are not met.
 * <p>
 * <p>
 * Input Example Output Example
 * Digital Innovation One
 * <p>
 * AbcdEfgh99
 * <p>
 * DigitalInnovationOne123
 * <p>
 * Digital Innovation One 123
 * <p>
 * Aass9
 * <p>
 * Aassd9
 * <p>
 * Invalid password.
 * <p>
 * Password valid.
 * <p>
 * Password valid.
 * <p>
 * Invalid password.
 * <p>
 * Invalid password.
 * <p>
 * Password valid.
 * <p>
 * Desafio
 * Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver o novo sistema de cadastro, e pediram a sua ajuda. Sua task é fazer o código que valide as senhas que são cadastradas, para isso você deve atentar aos requisitos a seguir:
 * <p>
 * A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e um número;
 * A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
 * Além disso, a senha pode ter de 6 a 32 caracteres.
 * Entrada
 * A entrada contém vários casos de teste e termina com final de arquivo. Cada linha tem uma string S, correspondente a senha que é inserida pelo usuário no momento do cadastro.
 * <p>
 * Saída
 * A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha cada item dos requisitos solicitados anteriormente, ou “Senha invalida.”, se um ou mais requisitos não forem atendidos.
 * <p>
 * <p>
 * Exemplo de Entrada	Exemplo de Saída
 * Digital Innovation One
 * <p>
 * AbcdEfgh99
 * <p>
 * DigitalInnovationOne123
 * <p>
 * Digital Innovation One 123
 * <p>
 * Aass9
 * <p>
 * Aassd9
 * <p>
 * Senha invalida.
 * <p>
 * Senha valida.
 * <p>
 * Senha valida.
 * <p>
 * Senha invalida.
 * <p>
 * Senha invalida.
 * <p>
 * Senha valida.
 * <p>
 * Desafio
 * Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver o novo sistema de cadastro, e pediram a sua ajuda. Sua task é fazer o código que valide as senhas que são cadastradas, para isso você deve atentar aos requisitos a seguir:
 * <p>
 * A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e um número;
 * A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
 * Além disso, a senha pode ter de 6 a 32 caracteres.
 * Entrada
 * A entrada contém vários casos de teste e termina com final de arquivo. Cada linha tem uma string S, correspondente a senha que é inserida pelo usuário no momento do cadastro.
 * <p>
 * Saída
 * A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha cada item dos requisitos solicitados anteriormente, ou “Senha invalida.”, se um ou mais requisitos não forem atendidos.
 * <p>
 * <p>
 * Exemplo de Entrada	Exemplo de Saída
 * Digital Innovation One
 * <p>
 * AbcdEfgh99
 * <p>
 * DigitalInnovationOne123
 * <p>
 * Digital Innovation One 123
 * <p>
 * Aass9
 * <p>
 * Aassd9
 * <p>
 * Senha invalida.
 * <p>
 * Senha valida.
 * <p>
 * Senha valida.
 * <p>
 * Senha invalida.
 * <p>
 * Senha invalida.
 * <p>
 * Senha valida.
 * <p>
 * Desafio
 * Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver o novo sistema de cadastro, e pediram a sua ajuda. Sua task é fazer o código que valide as senhas que são cadastradas, para isso você deve atentar aos requisitos a seguir:
 * <p>
 * A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e um número;
 * A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
 * Além disso, a senha pode ter de 6 a 32 caracteres.
 * Entrada
 * A entrada contém vários casos de teste e termina com final de arquivo. Cada linha tem uma string S, correspondente a senha que é inserida pelo usuário no momento do cadastro.
 * <p>
 * Saída
 * A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha cada item dos requisitos solicitados anteriormente, ou “Senha invalida.”, se um ou mais requisitos não forem atendidos.
 * <p>
 * <p>
 * Exemplo de Entrada	Exemplo de Saída
 * Digital Innovation One
 * <p>
 * AbcdEfgh99
 * <p>
 * DigitalInnovationOne123
 * <p>
 * Digital Innovation One 123
 * <p>
 * Aass9
 * <p>
 * Aassd9
 * <p>
 * Senha invalida.
 * <p>
 * Senha valida.
 * <p>
 * Senha valida.
 * <p>
 * Senha invalida.
 * <p>
 * Senha invalida.
 * <p>
 * Senha valida.
 */


/**
 * Desafio
 * Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver o novo sistema de cadastro, e pediram a sua ajuda. Sua task é fazer o código que valide as senhas que são cadastradas, para isso você deve atentar aos requisitos a seguir:
 *
 * A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e um número;
 * A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
 * Além disso, a senha pode ter de 6 a 32 caracteres.
 * Entrada
 * A entrada contém vários casos de teste e termina com final de arquivo. Cada linha tem uma string S, correspondente a senha que é inserida pelo usuário no momento do cadastro.
 *
 * Saída
 * A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha cada item dos requisitos solicitados anteriormente, ou “Senha invalida.”, se um ou mais requisitos não forem atendidos.
 *
 *
 * Exemplo de Entrada	Exemplo de Saída
 * Digital Innovation One
 *
 * AbcdEfgh99
 *
 * DigitalInnovationOne123
 *
 * Digital Innovation One 123
 *
 * Aass9
 *
 * Aassd9
 *
 * Senha invalida.
 *
 * Senha valida.
 *
 * Senha valida.
 *
 * Senha invalida.
 *
 * Senha invalida.
 *
 * Senha valida.
 */