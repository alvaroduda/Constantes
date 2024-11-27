//tutorial de criação de constantes.
//requisitos de uma constante: usar o static, usar o final e usar snake case

import java.util.Scanner;

public class Login {
    //se coloca um atributo ou um método como static quando se quer manipular ele em outra classe
    //chamando-o diretamente pelo nome da classe (ex: Login.validarsenha()), sem precisar instancia-lo.
    final static void validarSenha(){
        //quando queremos uma constante (variável que não se pode alterar o valor dado) usamos o final na declaração
        //também colocamos o nome da variável em snake case (TUDO EM CAIXA ALTA).
        final int TAMANHO_MINIMO_DA_SENHA = 7;
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite sua senha:");
        final String SENHA = scan.nextLine();
        if (SENHA.length() >= TAMANHO_MINIMO_DA_SENHA){
            System.out.println("Senha válida!");
        }
        else {
            System.out.println("Senha inválida!");
        }
        scan.close();
    }

}
