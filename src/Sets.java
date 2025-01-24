import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public Set<String> construirHashSet(){//no mantiene el orden de los elementos muy poco espacio de memoria
        Set<String>  miHashSet = new HashSet<>();

        miHashSet.add("Manzana");
        miHashSet.add("Pera");
        miHashSet.add("Melocoton");
        miHashSet.add("Melon");
        miHashSet.add("Pera");//Elemento repetido no se nanidira de nuevo


            return miHashSet;
        
    }
    public Set<String> construirLinkedHashSet(){
        Set<String> miLinkedHashtSet = new LinkedHashSet<>();
        miLinkedHashtSet.add("Manzada");
        miLinkedHashtSet.add("Pera");
        miLinkedHashtSet.add("Melocoton");
        miLinkedHashtSet.add("Melon");
        miLinkedHashtSet.add("Pera");//no entra elementos duplicados(importante)

    
            return miLinkedHashtSet;

    }
    public Set<String> construirTreeSet(){
        Set<String> miTreeSet = new TreeSet<>();
        miTreeSet.add("Manzada");
        miTreeSet.add("Pera");
        miTreeSet.add("Melocoton");
        miTreeSet.add("Melon");
        miTreeSet.add("Pera");//no entra elementos duplicados(importante)

    
            return miTreeSet;

    }
    public Set<String> construirTreeSetComparador() {
        // Crear un Comparator usando una clase anónima o una expresión lambda
        Comparator<String> comparadorPorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int resultado = Integer.compare(s1.length(), s2.length());
                if (resultado == 0) {
                    resultado = s1.compareTo(s2);
                }
                return resultado;
            }
        };
    
        Set<String> miTreeSetComparador = new TreeSet<>(comparadorPorLongitud);
        miTreeSetComparador.add("Melon");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Manzana");
        miTreeSetComparador.add("Fresa");
        miTreeSetComparador.add("Kiwi");
        miTreeSetComparador.add("Melocoton");
        miTreeSetComparador.add("Pera");//Elemento repetido, no se ananidira
        return miTreeSetComparador;
    }
    
}
