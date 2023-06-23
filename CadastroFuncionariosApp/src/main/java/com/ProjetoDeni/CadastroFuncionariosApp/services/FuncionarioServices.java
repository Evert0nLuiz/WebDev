package com.ProjetoDeni.CadastroFuncionariosApp.services;

import com.ProjetoDeni.CadastroFuncionariosApp.domain.Funcionarios;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServices {
    public List<Funcionarios> listaDeFuncionarios()
    {
        return  List.of(new Funcionarios("Everton",4), new Funcionarios("Davi",5));
    }

}
