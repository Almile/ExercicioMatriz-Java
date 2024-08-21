import java.util.Scanner;

public class matrizEx02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String login, senha;
        boolean validar = false;
        
        // Matriz 6x2 para armazenar logins e senhas
        String[][] matriz = {
            {"Ana", "123"},
            {"Bruna", "456"},
            {"Carla", "789"},
            {"Danilo", "1011"},
            {"Elena", "1213"},
            {"Felipe", "1415"}
        };
        
        System.out.println("Digite o nome de usuário: ");
        login = scan.nextLine();

        System.out.println("Digite a senha: ");
        senha = scan.nextLine(); 
        

        for(int i = 0; i < 6; i++){
            if (matriz[i][0].equals(login) && matriz[i][1].equals(senha)) {
                validar = true;
            }            
        }

        if (validar) {
            System.out.println("Login e senha corretos. Acesso concedido.");
        } else {
            System.out.println("Login ou senha incorretos. Acesso negado.");
        }
        scan.close();

    }
    
}
