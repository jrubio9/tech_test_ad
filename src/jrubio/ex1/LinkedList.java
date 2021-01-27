package jrubio.ex1;

public class LinkedList {
    // Només necessitem la referència al primer node.
    protected Node first;

    // El constructor posa el primer noda a null.
    public LinkedList() {
        first = null;
    }

    public void insert(Object o) {
        Node tmp = new Node(o, null);

        tmp.setSiguiente(first); // No hi ha problema si és null
        first = tmp;
    }

    public void buscarMedioPunteros()
    {
        Node slow_ptr = first;
        Node fast_ptr = first;
        if (first != null)
        {
            while (fast_ptr != null && fast_ptr.getNext() != null)
            {
                fast_ptr = fast_ptr.getNext().getNext();
                slow_ptr = slow_ptr.getNext();
            }
            System.out.println("El valor de l'element del mig és [" +
                    slow_ptr.getDatos() + "] \n");
        }
    }

    public int buscarMedio(){
        return getSize()/2;
    }

    public int getSize(){
        int i = 0;
        if (!isEmpty()) {
            Node tmp = first;
            // Iterem fins al final
            while (tmp != null) {
                i += 1;
                tmp = tmp.getNext();
            }
        }
        return i;
    }

    public void print(int n) {
        // Si la llista és buida no fem res.
        if (!isEmpty()) {
            Node tmp = first;

            // Iterem fins el node i o s'acaba la llista.
            for (int i = 0; i < n; i++) {
                tmp = tmp.getNext();
                if (tmp == null)
                    return; // El node indicat per paràmetre no existeix.
            }
            System.out.println(tmp.getDatos());
        }
    }

    public boolean isEmpty() {
        if (first == null)
            return true;
        else
            return false;
    }
}
