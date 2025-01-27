import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //runHashSet();
        //runLinkedHashSet();
        //runTreeSet();
        //runTreeSetComparate();
        runEjercicio();
    }
    public static void runHashSet(){
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirHashSet();
        System.out.println("---- HashSet ----");
        System.out.println("Elemento de HashSet (no garantiza orden): ");
        for(String elemento : ejemploHashSet){
            System.out.println(elemento);
        }
    }
    public static void runLinkedHashSet(){
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirLinkedHashSet();
        System.out.println("---- LinkedHashSet ----");
        System.out.println("Elemento de HashSet (respeta orden de insercion): ");
        for(String elemento : ejemploHashSet){
            System.out.println(elemento);
        }
    }
    public static void runTreeSet(){
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirTreeSet();
        System.out.println("---- TreeSet ----");
        System.out.println("Elemento de HashSet (Orden alfabetico): ");
        for(String elemento : ejemploHashSet){
            System.out.println(elemento);
        }
    }
    public static void runTreeSetComparate(){
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirTreeSetComparador();
        System.out.println("---- TreeSetComparete ----");
        System.out.println("Elemento de HashSet (Por tamanio de palabra): ");
        for(String elemento : ejemploHashSet){
            System.out.println(elemento);
        }
    }
    private static void runEjercicio(){
       
        Contacto c1 = new Contacto("Pedro", "Lopez", "123456789");
        Contacto c2 = new Contacto("Pedro", "Lopez", "123456789");

        System.out.println("-----LISTA CONTACTOS----");
        System.out.println("Por apellidos y nombres si son iguales apellidos");
        System.out.println("C1" + c1 + "c2" + c2);


        System.out.println("Referencia de memoria");
        boolean comparacionReferencia = c1==c2;
        System.out.println(comparacionReferencia);
        System.out.println("c1:" + c1  + "== c2:"  +c2 + comparacionReferencia);

        System.out.println("Comparacion Equals");
        System.out.println(c1.equals(c2));
        boolean comparacionEqueals = c1.equals(c2);
        System.out.println("c1:" + c1  + "== c2:"  +c2 +"\nComparacion Equals: " +  comparacionEqueals);

        System.out.println("Comparacion HasCode");
        boolean comparacionHashCode = c1.hashCode() == c2.hashCode();
        System.out.println(comparacionHashCode);

        System.out.println("--------Lista Contactos-------");
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "1111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        //Este ultimo Pedro Lopez tiene un telefono diferente
        //pero equals lo consideraduplicado, no lo que "NO"  lo agrega
        for(Contacto elemento  : agenda ){
            System.out.println(elemento);
        }

    }
    
}
