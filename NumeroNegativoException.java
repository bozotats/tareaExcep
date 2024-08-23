public class NumeroNegativoException extends Exception{
    NumeroNegativoException() {
        super();
    }
    
    NumeroNegativoException(String msj) {
        super(msj);
    }

    NumeroNegativoException(String msj, Throwable causa) {
        super(msj,causa);
    }

}