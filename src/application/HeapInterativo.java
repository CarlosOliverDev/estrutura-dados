package application;

import java.util.Arrays;
import java.util.Scanner;

public class HeapInterativo {

    static int[] heap = new int[16];
    static int tamanho = 0;
    static boolean maxHeap;
    static final Scanner sc = new Scanner(System.in);

    // ---------- regra do heap ----------

    // true se o valor "a" deve ficar ACIMA (como pai) do valor "b"
    static boolean temPrioridade(int a, int b) {
        return maxHeap ? a > b : a < b;
    }

    static void trocar(int i, int j) {
        int t = heap[i];
        heap[i] = heap[j];
        heap[j] = t;
    }

    // ---------- operações do heap ----------

    // Desce o nó i até o lugar certo (assume que as subárvores já são heaps)
    static void heapify(int i) {
        int primeiro = i;
        int esq = 2 * i + 1;
        int dir = 2 * i + 2;
        if (esq < tamanho && temPrioridade(heap[esq], heap[primeiro])) primeiro = esq;
        if (dir < tamanho && temPrioridade(heap[dir], heap[primeiro])) primeiro = dir;
        if (primeiro != i) {
            trocar(i, primeiro);
            heapify(primeiro);
        }
    }

    // Transforma o array inteiro em heap: heapify do último pai até a raiz
    static void buildHeap() {
        for (int i = tamanho / 2 - 1; i >= 0; i--) {
            heapify(i);
        }
    }

    // Sobe o nó i enquanto ele tiver mais prioridade que o pai
    static void subir(int i) {
        while (i > 0) {
            int pai = (i - 1) / 2;
            if (!temPrioridade(heap[i], heap[pai])) break;
            trocar(i, pai);
            i = pai;
        }
    }

    // Coloca o valor no fim do array e sobe até o lugar certo
    static void insert(int valor) {
        if (tamanho == heap.length) heap = Arrays.copyOf(heap, heap.length * 2);
        heap[tamanho] = valor;
        tamanho++;
        subir(tamanho - 1);
    }

    // Remove o elemento do índice i: o último ocupa o lugar e é reajustado
    static int remover(int i) {
        int removido = heap[i];
        heap[i] = heap[tamanho - 1];
        tamanho--;
        if (i < tamanho) {
            subir(i);
            heapify(i);
        }
        return removido;
    }

    // Troca o valor do índice i pelo novo valor e reajusta o heap
    static void alterarChave(int i, int novoValor) {
        heap[i] = novoValor;
        subir(i);
        heapify(i);
    }

    // ---------- impressão ----------

    static boolean ehHeapValido() {
        for (int i = 1; i < tamanho; i++) {
            if (temPrioridade(heap[i], heap[(i - 1) / 2])) return false;
        }
        return true;
    }

    static void imprimir() {
        StringBuilder sb = new StringBuilder("Array: [");
        for (int i = 0; i < tamanho; i++) {
            if (i > 0) sb.append(", ");
            sb.append(heap[i]);
        }
        sb.append("]");
        System.out.println(sb);
        System.out.println("Heap válido: " + (ehHeapValido() ? "sim" : "não"));
    }

    // ---------- leitura de dados ----------

    static void escolherTipo() {
        while (true) {
            System.out.println("Escolha o tipo de heap:");
            System.out.println("1 - Max-heap");
            System.out.println("2 - Min-heap");
            System.out.print("Opção: ");
            String linha = sc.nextLine().trim();
            if (linha.equals("1")) { maxHeap = true; return; }
            if (linha.equals("2")) { maxHeap = false; return; }
            System.out.println("Opção inválida.\n");
        }
    }

    static void lerNumeros() {
        System.out.println("\nDigite números inteiros (ENTER vazio para terminar).");
        System.out.println("Pode enviar um por linha ou vários separados por espaço.");
        while (true) {
            System.out.print("> ");
            String linha = sc.nextLine().trim();
            if (linha.isEmpty()) break;
            for (String parte : linha.split("\\s+")) {
                try {
                    if (tamanho == heap.length) heap = Arrays.copyOf(heap, heap.length * 2);
                    heap[tamanho] = Integer.parseInt(parte);
                    tamanho++;
                } catch (NumberFormatException e) {
                    System.out.println("Ignorado (não é inteiro): " + parte);
                }
            }
        }
    }

    static Integer lerInteiro(String mensagem) {
        System.out.print(mensagem);
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido.");
            return null;
        }
    }

    static Integer lerIndice() {
        Integer i = lerInteiro("Índice (0 a " + (tamanho - 1) + "): ");
        if (i == null) return null;
        if (i < 0 || i >= tamanho) {
            System.out.println("Índice fora do intervalo.");
            return null;
        }
        return i;
    }

    // ---------- menu ----------

    static void menu() {
        while (true) {
            System.out.println("\n--- Menu (" + (maxHeap ? "max-heap" : "min-heap") + ") ---");
            System.out.println("1 - heapify em um índice");
            System.out.println("2 - buildHeap");
            System.out.println("3 - insert (valor)");
            System.out.println("4 - remover (índice)");
            System.out.println("5 - increaseKey (índice e novo valor)");
            System.out.println("6 - decreaseKey (índice e novo valor)");
            System.out.println("0 - sair");
            System.out.print("Opção: ");
            String opcao = sc.nextLine().trim();

            switch (opcao) {
                case "0":
                    System.out.println("Encerrado.");
                    return;
                case "1": {
                    if (tamanho == 0) { System.out.println("Array vazio."); break; }
                    Integer i = lerIndice();
                    if (i == null) break;
                    heapify(i);
                    imprimir();
                    break;
                }
                case "2":
                    buildHeap();
                    imprimir();
                    break;
                case "3": {
                    Integer v = lerInteiro("Valor a inserir: ");
                    if (v == null) break;
                    insert(v);
                    imprimir();
                    break;
                }
                case "4": {
                    if (tamanho == 0) { System.out.println("Array vazio."); break; }
                    Integer i = lerIndice();
                    if (i == null) break;
                    int removido = remover(i);
                    System.out.println("Removido: " + removido);
                    imprimir();
                    break;
                }
                case "5":
                case "6": {
                    if (tamanho == 0) { System.out.println("Array vazio."); break; }
                    boolean aumentar = opcao.equals("5");
                    Integer i = lerIndice();
                    if (i == null) break;
                    Integer v = lerInteiro("Novo valor (atual = " + heap[i] + "): ");
                    if (v == null) break;
                    if (aumentar && v < heap[i]) {
                        System.out.println("increaseKey exige novo valor >= valor atual.");
                        break;
                    }
                    if (!aumentar && v > heap[i]) {
                        System.out.println("decreaseKey exige novo valor <= valor atual.");
                        break;
                    }
                    alterarChave(i, v);
                    imprimir();
                    break;
                }
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void main(String[] args) {
        escolherTipo();
        lerNumeros();
        System.out.println("\nArray na ordem enviada:");
        imprimir();
        menu();
    }
}