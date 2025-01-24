import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        runHashSet();
        runLinkedHashSet();
        runTreeSet();
        runTreeSetComparate();
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
}
