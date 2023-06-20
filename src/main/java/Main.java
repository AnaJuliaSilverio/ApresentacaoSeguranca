import org.example.Cliente;
import org.example.ClienteController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClienteController clienteController = new ClienteController();
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        System.out.println("Digite sua senha:");
        String senha = sc.next();
        Cliente cliente = new Cliente(nome,senha);
        clienteController.cadastrarCliente(cliente);

        clienteController.mostrarSenha();

    }
}
