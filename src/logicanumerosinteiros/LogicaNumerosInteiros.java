package logicanumerosinteiros;

/**
 *
 * @author Douglas
 */
public class LogicaNumerosInteiros {

    public static void main(String[] args) {
        int a = 10256;
        int b = 512;        
        String valorC = "";
        String valorCAntesAlteracao = "";
        String restoNumeroMaior = "";
        
        int contador = 0;
        
        boolean terminouDePercorrer = false;
        
        while(1 == 1)
        {
            contador++;
            
            if(contador <= Integer.toString(a).length())
                valorC += Integer.toString(a).charAt(contador -1);
            else
                terminouDePercorrer = true;
               
            
            if(contador <= Integer.toString(b).length())
                valorC += Integer.toString(b).charAt(contador -1);
            else
                terminouDePercorrer = true;
            
            if(terminouDePercorrer == true)
            {
                if(Integer.toString(a).length() != Integer.toString(b).length())
                {
                   if(Integer.toString(a).length() > Integer.toString(b).length()) 
                   {
                       //Encontra o restante
                       restoNumeroMaior = Integer.toString(a).substring(Integer.toString(b).length(), Integer.toString(a).length());
                       //Remove o primeiro pq já foi pego no i´nicio do while bloco: if(contador <= Integer.toString(a).length())
                       restoNumeroMaior = restoNumeroMaior.substring(1,restoNumeroMaior.length());
                        //Completa o valor com o Resto
                       valorC += restoNumeroMaior;
                       
                   }
                   else if(Integer.toString(b).length() > Integer.toString(a).length()) 
                   {
                       //Encontra o restante
                       restoNumeroMaior = Integer.toString(b).substring(Integer.toString(a).length(), Integer.toString(b).length());
                       //Remove o primeiro pq já foi pego no i´nicio do while bloco: if(contador <= Integer.toString(b).length())
                       restoNumeroMaior = restoNumeroMaior.substring(1,restoNumeroMaior.length());
                        //Completa o valor com o Resto
                       valorC += restoNumeroMaior;
                   }
                }
                                
                if(Integer.parseInt(valorC) > 1000000)
                {
                    valorCAntesAlteracao = valorC;
                    valorC = "-1";
                }
                
                break;
                   
                }
            }           
            
        
            System.out.print("Lógica Finalizada: " + valorCAntesAlteracao);
            System.out.println();
            System.out.print("Valor Modificado" + valorC);
            System.out.println();
            
        }
    }
    

