package uri1023.drought;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Locale;

public class App 
{
    public static void main( String[] args )
    {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        ArrayList<NoCasa> casas = new ArrayList<NoCasa>();
    
        int testes=1, c, num=0, tp=0, tc=0, out=0, deu, pessoa, csm, csmp = 0;
        double aux, cmedio;

        while(testes >= 1){
            testes = input.nextInt();
            if(testes >= 1){
                for(c=0, tp=0, tc=0; c<testes;c++){
                    
                    pessoa = input.nextInt();
                    tp += pessoa;
                    csm = input.nextInt();
                    tc += csm;
                    cmedio = (double) csm / pessoa;
                    NoCasa casa = new NoCasa(pessoa, csm, cmedio);
                    casas.add(casa);
                }
                Collections.sort(casas);
                num++;
                if(num > 1)
                    System.out.println("\n");
                System.out.print(String.format("Cidade# %d:\n", num));
                for(c=0;c<testes;c++){
                    NoCasa h = casas.get(c);
                    out = h.getPessoas();
                    deu = 0;
                    while(c + 1 < testes && deu == 0){
                        if(casas.get(c).getConsumoMedio() == casas.get(c+1).getConsumoMedio()){
                            out += casas.get(c+1).getPessoas();
                            c++;
                        }else{
                            deu = 1;
                        }
                    }
                    csmp = (int) casas.get(c).getConsumoMedio();
                    System.out.print(String.format("%d-%d", out, csmp));
                    if(c + 1 < testes)
                        System.out.print(" ");
                }
                System.out.println();
                aux = ((double)tc / tp)*100;
                out = (int) aux;
                aux = out / 100.0;
                System.out.println(String.format("Consumo medio: %.2f m3\n", aux));
                casas.removeAll(casas);
            }
        }
    }
}
