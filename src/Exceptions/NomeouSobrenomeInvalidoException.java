package Exceptions;

public class NomeouSobrenomeInvalidoException extends Exception {
        private static final String MENSAGEM_PADRAO = "Nome ou sobrenome inválido!";

        public NomeouSobrenomeInvalidoException() {
            super(MENSAGEM_PADRAO);
        }

        // Construtor que permite passar uma mensagem personalizada
        public NomeouSobrenomeInvalidoException(String mensagem) {
            super(mensagem);
        }
    }


