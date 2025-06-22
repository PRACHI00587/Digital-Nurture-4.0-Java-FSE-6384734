package Week1_DataStructuresAndAlgorithms.Extra.Ex_03_SortingCustomerOrders.Code;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 4500.50),
            new Order(2, "Bob", 1200.00),
            new Order(3, "Charlie", 6700.75),
            new Order(4, "David", 3000.20)
        };

        System.out.println("🔁 Bubble Sort by totalPrice:");
        BubbleSort.sort(orders);
        for (Order o : orders) System.out.println(o);

        System.out.println("\n⚡ Quick Sort by totalPrice:");
        // Shuffle array again before re-sorting
        Order[] orders2 = {
            new Order(1, "Alice", 4500.50),
            new Order(2, "Bob", 1200.00),
            new Order(3, "Charlie", 6700.75),
            new Order(4, "David", 3000.20)
        };
        QuickSort.sort(orders2, 0, orders2.length - 1);
        for (Order o : orders2) System.out.println(o);
    }
}

