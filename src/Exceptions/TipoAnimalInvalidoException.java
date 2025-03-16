package Exceptions;

public class TipoAnimalInvalidoException extends Exception {
        private static final String MENSAGEM_PADRAO = "Opção inválida";

        public TipoAnimalInvalidoException() {
            super(MENSAGEM_PADRAO);
        }

        // Construtor que permite passar uma mensagem personalizada
        public TipoAnimalInvalidoException(String mensagem) {
            super(mensagem);
        }
    }


