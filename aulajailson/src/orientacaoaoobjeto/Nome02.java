package orientacaoaoobjeto;

import java.util.Scanner;

public class Nome02 {
    static void main() {
        Scanner sc = new Scanner(System.in);
       exibirNome("Gabriel", "São Paulo", 22 );
    }
  static void exibirNome(String nome , String cidade , int idade ){
      System.out.println("O nome completo do paciente é: " + nome + "Dos Santos");
      System.out.println("A cidade de nascimento é " + cidade);
      System.out.println("Minha idade é " + idade);

  }

}


