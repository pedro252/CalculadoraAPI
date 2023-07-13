package br.com.erudio.converter;

public class NumberConverter {
    public static Double converteToDouble(String strNumber){
        if (strNumber == null) return 0D;

        //para aceitar tanto ponto quanto virgula = Dolar 10.25 ou Reais 10,25
        String number = strNumber.replaceAll(",",".");

        if(isNumeric(number)) return Double.parseDouble(number); // se for verdadeira, vai retornar um double - String para Double

        return null;

    }
    public static boolean isNumeric(String strNumber){
        if (strNumber == null) return false;
        String number = strNumber.replaceAll(",",".");
        return number.matches("[+-]?[0-9]*\\.?[0-9]+");
        //verificar se e positivo ou negativo, de 0 a 9, e numeros fracionarios
    }
}
