public class App {
    public static void main(String[] args) throws Exception {

        // Questão Técnica 1 //

        int numFib = 10; //Numéro de entrada;
        int anteFib = 0;
        int mainFib = 0;

        while(mainFib < numFib){
            
            if(mainFib == 0){
               System.out.print(mainFib + ",");
               anteFib = 0;
               mainFib = 1;
            }
            else{
                int temp = anteFib;
                anteFib = mainFib;
                mainFib = temp + mainFib;
                if(mainFib < numFib)
                    System.out.print(mainFib + ",");
                else
                    System.out.println(mainFib);
            }

        }

        if(mainFib == numFib){
            System.out.println(numFib + " pertence à sequência de Fibonacci");
        }
        else{
            System.out.println(numFib + " não pertence à sequência de Fibonacci");
        }

        // Questão Técnica 2 //

        String txt = "Alice viu a Amanda no trabalho"; //String escolhida
        int qntdA = 0;
        txt = txt.toLowerCase();

        for(int i = 0;i < txt.length();i++){
            if(txt.charAt(i) == 'a'){
                qntdA++;
            }
        }

        System.out.println("Existem " + qntdA + " letras 'a' na frase escolhida");

        // Questão Técnica 3 //

        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        while(K < INDICE){
            K = K + 1;
            SOMA = SOMA + K; 
        }

        System.out.println(SOMA);

    }
}
