package io.github.rodrigofps.vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prd")
public class MinhaConfiguracao {

    @Bean(name = "applicationName")
    public String minhaAplicacao(){
        return "aplicacao-vendas-rodrigofps";
    }

    @Bean
    public CommandLineRunner executar() {
        return args ->
                System.out.println("Rodando configuração de PRD na aplicação");
    }
}
