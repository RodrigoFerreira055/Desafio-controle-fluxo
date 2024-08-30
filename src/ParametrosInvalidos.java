public class ParametrosInvalidos extends Exception{
    public ParametrosInvalidos() {
        super("Os parâmetros fornecidos são inválidos.");
    }

    public ParametrosInvalidos(String mensagem) {
        super(mensagem);
    }

    public static void main(String[] args) {
        
    }
}
