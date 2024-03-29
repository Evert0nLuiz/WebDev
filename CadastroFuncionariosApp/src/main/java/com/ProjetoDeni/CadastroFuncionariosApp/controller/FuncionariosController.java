package com.ProjetoDeni.CadastroFuncionariosApp.controller;

import com.ProjetoDeni.CadastroFuncionariosApp.domain.Funcionarios;
import com.ProjetoDeni.CadastroFuncionariosApp.services.FuncionarioServices;
import com.ProjetoDeni.CadastroFuncionariosApp.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;


@RestController
@Log4j2
@AllArgsConstructor
@RequestMapping("funcionarios")
public class FuncionariosController {
        private final DateUtil dateUtil;
        private final FuncionarioServices funcionarioServices;
        @GetMapping
        public ResponseEntity<List<Funcionarios>> list(){
            log.info(dateUtil.formatLocalDateTimeToDatabaseTime(LocalDateTime.now()));
            return ResponseEntity.ok(funcionarioServices.listaDeFuncionarios()) ;
        }

        @GetMapping(path = "/{id}")
        public ResponseEntity<List<Funcionarios>> encontrarPorId()
        {
            return ResponseEntity.ok(funcionarioServices.listaDeFuncionarios());
        }


}
