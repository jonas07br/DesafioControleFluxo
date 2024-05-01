import java.util.Scanner;
@SuppressWarnings("resource")

public class Contador {
    static void contar(int parametroum,int parametrodois) throws ParametrosInvalidosException{
        if(parametroum>parametrodois){
            throw new ParametrosInvalidosException();
        
        }
        else{
            int cont = parametrodois - parametroum;
            for(int x = 1;x<=cont;x++){
                System.out.println("Imprimindo o número "+x);
            }
            
        }
}
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro:");
        int parametroum = scan.nextInt();
        System.out.print("Digite o segundo parâmetro:");
        int parametrodois = scan.nextInt();
        try{
            contar(parametroum, parametrodois);
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
}
