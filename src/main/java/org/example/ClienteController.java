package org.example;

public class ClienteController {
    ClienteRepository clienteRepository = new ClienteRepository();

    public void cadastrarCliente(Cliente cliente){
        System.out.println("Senha Sem Hash: "+cliente.getSenha());
        clienteRepository.adicionarCliente(cliente);
        System.out.println("Senha Com Hash: "+clienteRepository.mostraSenha());
    }

    public void login(String senha){
        if (clienteRepository.login(senha)) System.out.println("Bem vindo");
        else System.out.println("Senha incorreta");
    }

}
