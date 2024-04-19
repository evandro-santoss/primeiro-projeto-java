public class App {
    public static void main(String[] args) throws Exception {
        //declaração de uma variavel
        //variavel caracter
        char caractere = 'A';
        //variavel string (texto)
        String texto = "Ola Pessoal !";
        // varialvel tipo int (numero inteiro)
        int numero_inteiro = 1;
        // variavel float (numero fracinario)
        float numero_quebrado = 1.342f; //
        //variavel double(numeros fracinario com mais precisão)
        double numero_quebrado_02 = 1.342;
        //variavel boolean(booleano, verdadeiro ou falso)
        boolean valor_verdadeiro = true; // verdadeiro -> true
        boolean valor_falso = false; // falso -> false
 
        caractere = '1';
        texto = "Ola pessoal querido !";
        System.out.println(texto);
        System.out.print("texto sem quebra de linha ");
        System.out.println(" texto com quebra de linha");
        System.out.printf("texto %s"," formatavel ");
      
        // quebra a linha usando print o  \n
        System.out.println("vai quebrar a linha \neste texto  esta na linha de baixo");
        System.out.print("\"esse texto vai aparecer com recuo");
        System.out.print(" esse texto vai aparecer\r esse texto ");
        System.out.print("vai aparecer uma barra invertida\\ ");
        System.out.println("\"esse texto vai aparecer entre aspas\"");
        System.out.println("\'esse texto vai aparecer entre aspas\'");
 
 
    }
}
