
public class Main {
    public static void main(String[] args) {
        //Conversion implicita, donde no haya riesgo de pérdida de datos
        int numeroEntero = 42;
        double numeroDecimal = numeroEntero;
        System.out.println(numeroDecimal);

        //int a long
        long numeroLargo = numeroEntero; //Conversion implicito de int a long
        System.out.println(numeroLargo);

        //char a int
        char letra = '@';
        int codigoASCII = letra; //Conversion implicita
        System.out.println(codigoASCII);


        System.out.println("--------------------------------------------------------------------");
        //Conversion explicita (Casting), donde hay riesgo de pérdida de datos
        double numeroDecimal2 = 9.99;
        int numeroEntero2 = (int) numeroLargo;
        System.out.println(numeroEntero2);

        long numeroLargo2 = 1000000L;
        int numeroEntero3 = (int) numeroLargo2;
        System.out.println(numeroEntero3);

        String texto = "123";
        int numero = Integer.parseInt(texto); //Conversion de String a int utilizando un método
        System.out.println(numero);

        //Riesgos
        double valorDecimal = 123.456;
        int valorEntero = (int) valorDecimal; //Se pierde la parte decimal
        System.out.println(valorEntero);



    }
}