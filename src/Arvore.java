
/**
 *
 * @author vitoria.csilva15
 */
public class Arvore {

    private Arvore esq;
    private int info;
    private Arvore dir;

    public Arvore(Arvore esquerda, int informacao, Arvore direita) {
        this.esq = esquerda;
        this.info = informacao;
        this.dir = direita;

    }

    static boolean isEmpty(Arvore a) {
        if (a == null) {
            return (true);
        } else {
            return (false);
        }

    }

    static void percussoPreOrdem(Arvore a) {
        if (!isEmpty(a)) {
            System.out.println(" " + a.info);
            percussoPreOrdem(a.esq);
            percussoPreOrdem(a.dir);

        }

    }

    static void percussoEmOrdem(Arvore a) {
        if (!isEmpty(a)) {
            percussoEmOrdem(a.esq);
            System.out.println(" " + a.info);
            percussoEmOrdem(a.dir);
        }
    }

    static void percussoPosOrdem(Arvore a) {
        if (!isEmpty(a)) {
            percussoEmOrdem(a.esq);
            percussoEmOrdem(a.dir);
            System.out.println(" " + a.info);

        }
    }

    public Arvore getEsq() {
        return esq;
    }

    public void setEsq(Arvore esq) {
        this.esq = esq;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Arvore getDir() {
        return dir;
    }

    public void setDir(Arvore dir) {
        this.dir = dir;
    }

}
