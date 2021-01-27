package jrubio.ex1;

public class Node {

    private Object datos;
    private Node siguiente;

    public Node() {
        datos = null;
        siguiente = null;
    }

    public Node(Object o, Node n) {
        setDatos(o);
        setSiguiente(n);
    }

    public void setDatos(Object o) {
        datos = o;
    }

    public void setSiguiente(Node n) {
        siguiente = n;
    }

    public Object getDatos() {
        return datos;
    }

    public Node getNext() {
        return siguiente;
    }
}
