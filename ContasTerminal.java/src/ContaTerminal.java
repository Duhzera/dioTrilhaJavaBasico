import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        int numero;
        String agencia, nomeCliente, resposta;
        resposta = "s";
        Double saldo;
        System.out.println("Deseja criar uma conta em nossa agência?");
        resposta = s.next();

        while(resposta.equals("s")){
        System.out.println("Que bom que deseja criar uma conta! Vamos lá");
        System.out.println("Para continuar informe uma agência: ");
        agencia = s.next();
        System.out.println("Agora informe o número que deseja dar á sua conta(Somente Números): ");
        numero = s.nextInt();
        s.nextLine();
        System.out.println("Digite seu nome: ");
        nomeCliente = s.nextLine();
        System.out.println("Informe o valor que vai ser depositado: ");
        saldo = s.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");
        s.next();
        System.out.println("Deseja criar outra conta? (S) ou (N)");
        resposta = s.next();
        }   
        
        
    }
}
