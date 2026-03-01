package services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FuncionarioGerenciamentoTest {

    @Test
    void deveCriarInstanciaDoGerenciamento() {
        FuncionarioGerenciamento gerenciamento = new FuncionarioGerenciamento();
        assertNotNull(gerenciamento);
    }
}