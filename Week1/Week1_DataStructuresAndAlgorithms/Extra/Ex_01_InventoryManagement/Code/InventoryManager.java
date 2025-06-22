package Week1_DataStructuresAndAlgorithms.Extra.Ex_01_InventoryManagement.Code;

import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    // Add a product
    public void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("✅ Product added: " + product.productName);
    }

    // Update a product
    public void updateProduct(int productId, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product p = inventory.get(productId);
            p.quantity = quantity;
            p.price = price;
            System.out.println("✏️ Product updated: " + p.productName);
        } else {
            System.out.println("❌ Product ID not found.");
        }
    }

    // Delete a product
    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            Product removed = inventory.remove(productId);
            System.out.println("🗑️ Product deleted: " + removed.productName);
        } else {
            System.out.println("❌ Product ID not found.");
        }
    }

    // View inventory
    public void viewInventory() {
        System.out.println("\n📦 Inventory List:");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}

