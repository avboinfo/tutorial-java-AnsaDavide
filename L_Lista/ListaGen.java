package L_Lista;

public class ListaGen {

    NodoGen<T> root;

    public ListaGen() {
        this.root = null;
    }

    public void addTail(T v) {
        addTail(new NodoGen)
    }

    public void addTail(T v) {
        add
    }

    public void addTail( NodoGen<T> n) {
        if (root==null) {
            root n;
        } else {
            NodoGen<T> tmp = root;
            while (tmp.getSuccessivo()!=null) tmp=tmp.getSuccessivo();
            tmp.setSuccessivo( n );
        }
    }

    public String toString() {
        String s = "La lista contiene i seguenti elementi:\n";
        NodoGen<T> tmp = root;
        while(tmp!= null){
            s += p + "\n";
            p = p.getSuccessivo();
        }
        s += "*** The END OF THE LIST ***\n";
        return s
    }
    
}
