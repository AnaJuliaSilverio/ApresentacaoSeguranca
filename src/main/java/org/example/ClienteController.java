package org.example;

public class ClienteController {
    ClienteRepository clienteRepository = new ClienteRepository();

    public void cadastrarCliente(Cliente cliente){
        clienteRepository.adicionarCliente(cliente);
    }
    public void mostrarSenha(){
        System.out.println(clienteRepository.mostraSenha());
    }
}
