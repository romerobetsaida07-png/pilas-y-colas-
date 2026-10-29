package App;

public class MainCola {
    public static void main(String[] args) {
        Cola cola = new Cola();

        System.out.println("¿Está vacía? " + cola.estaVacia()); 

        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        System.out.print("Cola tras encolar 10, 20, 30: ");
        cola.imprimir();                                

        System.out.println("verFrente():  " + cola.verFrente());  
        System.out.println("desencolar(): " + cola.desencolar()); 
        System.out.print("Cola tras desencolar: ");
        cola.imprimir();                                

        System.out.println("Tamaño: " + cola.tamaño());        
        System.out.println("desencolar(): " + cola.desencolar());
        System.out.println("desencolar(): " + cola.desencolar()); 
        System.out.println("¿Está vacía? " + cola.estaVacia()); 
    }

    
}
