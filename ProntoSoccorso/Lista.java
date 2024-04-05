package L_Lista;

public class Lista<T> {

    NodoGen<T> root;

    public Lista() {
        this.root = null;
    }

    public void addTail(T v) {
        addTail(new NodoGen)
    }

    public void addTail(T v) {
        add
    }

    public void addTail( Nodo<T> n) {
        if (root==null) {
            root n;
        } else {
            Nodo<T> tmp = root;
            while (tmp.getSuccessivo()!=null) tmp=tmp.getSuccessivo();
            tmp.setSuccessivo( n );
        }
    }

    public String toString() {
        String s = "La lista contiene i seguenti elementi:\n";
        Nodo<T> tmp = root;
        while(tmp!= null){
            s += p + "\n";
            p = p.getSuccessivo();
        }
        s += "*** The END OF THE LIST ***\n";
        return s;
    }
    
}