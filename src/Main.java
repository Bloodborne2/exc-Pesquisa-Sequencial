public class Main {
    public static void main(String[] args) {
        String[] nomes = {"JAIR", "VALDIR", "CARLOS", "JORGE", "BIA", "ANA", "ZÉLIA", "MANOEL", "CARLA"};

        System.out.println("Vetor original:");
        imprimirVetor(nomes);

        // Ordenação por seleção
        String[] selecao = nomes.clone();
        ordenarSelecao(selecao);
        System.out.println("\nOrdenação por Seleção:");
        imprimirVetor(selecao);

        // Ordenação por inserção
        String[] insercao = nomes.clone();
        ordenarInsercao(insercao);
        System.out.println("\nOrdenação por Inserção:");
        imprimirVetor(insercao);

        // Ordenação por troca (Bubble Sort)
        String[] troca = nomes.clone();
        ordenarTroca(troca);
        System.out.println("\nOrdenação por Troca (Bubble Sort):");
        imprimirVetor(troca);

        // Busca Sequencial
        System.out.println("\n🔎 Busca Sequencial por 'JORGE':");
        int passosSequencial = buscaSequencial(selecao, "JORGE");
        System.out.println("Passos na busca sequencial: " + passosSequencial);

        // Busca Binária
        System.out.println("\n🔎 Busca Binária por 'JORGE':");
        int passosBinaria = buscaBinaria(selecao, "JORGE");
        System.out.println("Passos na busca binária: " + passosBinaria);
    }

    // Método para imprimir o vetor
    public static void imprimirVetor(String[] vetor) {
        for (String nome : vetor) {
            System.out.print(nome + " ");
        }
        System.out.println();
    }

    // Ordenação por Seleção
    public static void ordenarSelecao(String[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j].compareTo(vetor[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Troca os elementos
            String temp = vetor[i];
            vetor[i] = vetor[minIndex];
            vetor[minIndex] = temp;
        }
    }

    // Ordenação por Inserção
    public static void ordenarInsercao(String[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            String chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j].compareTo(chave) > 0) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    // Ordenação por Troca (Bubble Sort)
    public static void ordenarTroca(String[] vetor) {
        int n = vetor.length;
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (vetor[i].compareTo(vetor[i + 1]) > 0) {
                    // Troca os elementos
                    String temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
    }

    // Busca Sequencial
    public static int buscaSequencial(String[] vetor, String chave) {
        int passos = 0;
        for (int i = 0; i < vetor.length; i++) {
            passos++;
            if (vetor[i].equals(chave)) {
                System.out.println("Encontrado na posição " + i);
                return passos;
            }
        }
        System.out.println("Nome não encontrado.");
        return passos;
    }

    // Busca Binária
    public static int buscaBinaria(String[] vetor, String chave) {
        int inicio = 0, fim = vetor.length - 1, passos = 0;
        while (inicio <= fim) {
            passos++;
            int meio = (inicio + fim) / 2;
            if (vetor[meio].equals(chave)) {
                System.out.println("Encontrado na posição " + meio);
                return passos;
            }
            if (vetor[meio].compareTo(chave) < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        System.out.println("Nome não encontrado.");
        return passos;
    }
}
