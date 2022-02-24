public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("Shop 1");
        bs.loadData();


        BookShop bs1 = (BookShop) bs.clone();
        bs1.setShopName("Shop 2");


        bs.getBooks().remove(1);

        System.out.println(bs);
        System.out.println(bs1);
    }
}
