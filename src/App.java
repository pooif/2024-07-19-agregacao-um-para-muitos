import java.util.*;

class App {
  public static void main(String[] args) {
    // como eu represento o "muitos"
    String[] nomes = new String[3];
    nomes[0] = "Marcio";
    nomes[1] = "Erick";
    nomes[2] = "Rodrigo";
    int[] idades = { 47, 24, 21 };
    String[] nomes2 = new String[4];
    // for (int i = 0; i < nomes.length; i++) {
    // nomes2[i] = nomes[i];
    // }
    System.arraycopy(nomes, 0, nomes2, 0, 3);
    System.out.println(Arrays.toString(nomes2));

    // Se não se usa um array, o que usamos?
    // Existem Estruturas de Dados, as básicas:
    // LISTA, CONJUNTO, MAPA (DICIONÁRIO)
    // Parte das collections (coleções) 20%
    // List (abstrato) ArrayList (concreto)
    // Set (abstrato) HashSet (concreto)
    // Map (abstrato) HashMap (concreto)
    // Diamond Operator, chevron
    List<String> lista = new ArrayList<>();
    System.out.println(lista.isEmpty()); // true
    lista.add("Gunter");
    lista.add("Jaime");
    lista.add("Gunter");
    System.out.println(lista.isEmpty()); // false
    System.out.println(lista.size());
    // lista.add(5);
    System.out.println(lista);
    // Nas listas:
    // - a ordem é preservada
    // - podem haver duplicatas
    lista.add(1, "Gabriel"); // adiciona
    lista.set(0, "Marcio"); // substitui (edita)
    if (lista.contains("Gunter")) {
      System.out.println("Já contém um Gunter");
    } else {
      lista.add("Gunter");
    }
    lista.remove(1); // remove Gabriel
    lista.clear();

    // foreach
    for (var s : lista) {
      System.out.println(s); // "s" é cada nome
    }

    // Conjunto, não garante ordem, não tem índice,
    // não tem duplicatas.
    Set<Integer> conjunto = new HashSet<>();
    conjunto.add(47);
    conjunto.add(24);
    conjunto.add(21);
    System.out.println(conjunto);
    System.out.println(conjunto.isEmpty());
    System.out.println(conjunto.size()); // 3
    conjunto.add(24); // não vai adicionar
    System.out.println(conjunto.size()); // 3

    for (var idade : conjunto) {
      System.out.println(idade);
    }

    // Mapa, Map, Dicionário, ChaveValor, KeyValue
    // Map<TipoChave,TipoValor>
    Map<String, String> mapa = new HashMap<>();
    System.out.println(mapa);
    System.out.println(mapa.isEmpty()); // true
    System.out.println(mapa.get("Bruno")); // null

    mapa.put("Bruno", "Análise e Desenvolvimento");

    System.out.println(mapa.get("Bruno"));
    System.out.println(mapa);

    mapa.put("Erick", "Engenharia Mecânica");

    System.out.println(mapa);

    System.out.println(mapa.get("Erick"));

    // for (int i = 0; i < lista.size(); i++) {
    // String s = lista.get(i);
    // System.out.println(s);
    // }

    // Mapa de Inteiro => Lista
    Map<Integer, List<String>> map2 = new HashMap<>();
    map2.put(24, new ArrayList<>());
    map2.put(21, new ArrayList<>());

    map2.get(24).add("Erick");
    map2.get(24).add("Gunter");

    System.out.println(map2.get(24)); // [Erick, Gunter]
    System.out.println(map2.get(24).get(0)); // Erick
  }
}