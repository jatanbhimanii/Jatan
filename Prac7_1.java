public class Prac7_1 {
    public static void main(String[] args) {
        // Create an Integer array
        Integer[] intArray = {2, new Integer(4), new Integer(3), new Integer(7)}; // Autoboxing is done

        //int k=intArray[1];     unboxing
        Double[] doubleArray = {new Double(3.4),
                new Double(1.3),
                new Double(-22.1),
                new Double(99.78), 6.7};
        Character[] charArray = {new Character('a'), new Character('A'), new Character('b'), new Character('B'), 'd'};
        Float[] floatArray = {new Float(1.2f), new Float(3.4f), new Float(5.7f), new Float(-3.6f)};
        String[] stringArray = {"have a ", "good ", "Day!!", "Aakash", "Anjana"};

        // Sort the arrays
        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);
        sort(floatArray);
        // Display the sorted arrays
        System.out.print("Sorted Integer objects: ");
        printList(intArray);
        System.out.print("Sorted Double objects: ");
        printList(doubleArray);
        System.out.print("Sorted Character objects: ");
        printList(charArray);
        System.out.print("Sorted String objects: ");
        printList(stringArray);
        System.out.print("Sorted Float objects: ");
        printList(floatArray);
    }

    public static <M extends Comparable<M>> void sort(M[] list) {
        M currentMin;
        int currentMinIndex;
        for (int i = 0; i < list.length - 1; i++) {
// Find the minimum in the list[i+1..list.length-2]
            currentMin = list[i];
            currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}