package org.example;

import org.springframework.security.crypto.bcrypt.BCrypt;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    List<Cliente> clientes = new ArrayList<Cliente>();

    public void adicionarCliente(Cliente cliente){
        criptografarSenha(cliente);
        clientes.add(cliente);
    }
    public void criptografarSenha(Cliente cliente){
        String hashSenha = BCrypt.hashpw(cliente.getSenha(), BCrypt.gensalt());
        cliente.setSenha(hashSenha);
    }
    public String mostraSenha(){
        return clientes.get(0).getSenha();
    }
}
