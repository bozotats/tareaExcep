public class CaracterEn { 
    public static char get(String inText, int inNum) throws Exception{
        char result = ' ';
      
            if ((inNum>0) && (inNum<inText.length())) {
                result = inText.charAt(inNum);
            } else {
                throw new Exception("Input invalido, no se pudo realizar la operacion.");
            }
       
        return result;
    }
}