package br.edu.infnet.streaming.model.domain;

import br.edu.infnet.streaming.model.exceptions.CPFIsInvalidException;
import br.edu.infnet.streaming.model.exceptions.EmailIsInvalidException;
import br.edu.infnet.streaming.model.exceptions.NameIsInvalidException;

public class Client {
    private String name;
    private String email;
    private String cpf;

    public Client(String name, String email, String cpf) throws NameIsInvalidException, EmailIsInvalidException, CPFIsInvalidException {

        if (name == null) {
            throw new NameIsInvalidException("Nome fornecido inválido, por favor entre com um nome válido");
        }

        if (email == null) {
            throw new EmailIsInvalidException("Email fornecido para o usuário "+ name + " é inválido, por favor entre com um email válido.");
        }

        if (cpf == null) {
            throw new CPFIsInvalidException("CPF fornecido para o usuário "+ name + " é inválido, por favor entre com um CPF válido.");
        }

        this.name = name;
        this.email = email;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------------");
        sb.append(" - Nome: ");
        sb.append(name);
        sb.append(" - E-mail: ");
        sb.append(email);
        sb.append(" - CPF: ");
        sb.append(cpf);

        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }
}
