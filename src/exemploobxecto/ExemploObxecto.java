
package exemploobxecto;

/**
 *
 * @author dfernandezguerreiro
 */
public class ExemploObxecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Semaforo unSemaforo=new Semaforo(); //instancio un obxeto tipo semaforo
        unSemaforo.darCor("verde");
        String resposta=unSemaforo.dimeCor();
        System.out.println(resposta);
        Semaforo outroSemaforo=new Semaforo();
        outroSemaforo.darCor("amarelo");
        String resposta2=outroSemaforo.dimeCor();
        System.out.println(resposta2);
        //También se puede poner así: (simplificado)
        System.out.println(outroSemaforo.dimeCor());
    }
    
}
