
import java.util.Scanner;



/**
 *
 * @author vitoria.csilva15
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Criando as ÁRVORES das folhas para cima
        Arvore a1 = new Arvore(null, 5, null);
        Arvore a2 = new Arvore(null, 25, null);
        Arvore a3 = new Arvore(null, 70, null);
        Arvore a4 = new Arvore(a1, 10, a2);
        Arvore a5 = new Arvore(a3, 90, null);
        Arvore a6 = new Arvore(null, 60, a5);
        Arvore raiz = new Arvore(a4, 50, a6); // mostra a raiz
        
        System.out.println("ÁRVORE EM PRÉ- ORDEM: ");
        Arvore.percussoPreOrdem(raiz);
        System.out.println("ÁRVORE EM ORDEM: ");
        Arvore.percussoEmOrdem(raiz);
        System.out.println("ÁRVORE EM PÓS-ORDEM:");
        Arvore.percussoPosOrdem(raiz);
        System.out.println();
        System.exit(0);
    }
}
