package com.ProjetoDeni.CadastroFuncionariosApp.services;

import com.ProjetoDeni.CadastroFuncionariosApp.domain.Funcionarios;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServices {
    private List<Funcionarios> listaDeTodosOsFuncionarios  = List.of(new Funcionarios("Everton",4), new Funcionarios("Davi",5));
    public List<Funcionarios> listaDeFuncionarios()
    {
        return  listaDeTodosOsFuncionarios;
    }

    public FuncionarioServices encontraPorId(long id)
    {
        return listaDeTodosOsFuncionarios.stream()
                .filter(listaDeTodosOsFuncionarios -> listaDeTodosOsFuncionarios.getId().equals(id))
                .findFirst()
                .
    }

}
