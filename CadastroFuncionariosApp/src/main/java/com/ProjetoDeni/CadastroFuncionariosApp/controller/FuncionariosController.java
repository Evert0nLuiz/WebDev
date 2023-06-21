package com.ProjetoDeni.CadastroFuncionariosApp.controller;

import com.ProjetoDeni.CadastroFuncionariosApp.domain.Funcionarios;
import com.ProjetoDeni.CadastroFuncionariosApp.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

@RestController
@Log4j2
@AllArgsConstructor
@RequestMapping("funcionarios")
public class FuncionariosController {
        private final DateUtil dateUtil;
        @GetMapping(path = "listaDeFuncionarios")

        public List<Funcionarios> list(){
            log.info(dateUtil.formatLocalDateTimeToDatabaseTime(LocalDateTime.now()));
            return List.of(new Funcionarios("Everton"));
        }


}
