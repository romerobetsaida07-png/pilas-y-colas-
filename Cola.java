package App;

public class Cola {

    private Nodo frente ;
    private Nodo fin ;

    public Cola() {
        this.frente = null;
        this.fin = null; 

    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void encolar(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (estaVacia()){
            frente = nuevo;
            fin = nuevo; 
            return ;
        }

        fin.siguiente = nuevo ;
        fin = nuevo ;

    }

    public int desencolar (){
        if (estaVacia()) throw new IllegalStateException("La cola esta vacia ");

        int valor = frente.dato;
        frente = frente.siguiente;

    
        if (frente == null )  {
            fin = null ;
        }

        return valor ;

    }

    public int verFrente() {
        if (estaVacia()) throw new IllegalStateException("La cola está vacía");
        return frente.dato;
    }

    public int tamaño() {
        int contador = 0;
        Nodo actual = frente;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }   
        return contador;
    }

    public void imprimir() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }
        Nodo actual = frente;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) System.out.print(" → ");
            actual = actual.siguiente;
        }
        System.out.println();
    }






    
}
