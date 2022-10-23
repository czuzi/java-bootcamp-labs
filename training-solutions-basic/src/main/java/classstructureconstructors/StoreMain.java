package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store bookStore = new Store("Book");
        System.out.println(bookStore.getProduct() + ": " + bookStore.getStock());
        bookStore.store(23);
        System.out.println(bookStore.getProduct() + ": " + bookStore.getStock());

        Store vinylStore = new Store("vinyl");
        System.out.println(vinylStore.getProduct() + ": " + vinylStore.getStock());
        vinylStore.dispatch(10);
        System.out.println(vinylStore.getProduct() + ": " + vinylStore.getStock());
    }
}
