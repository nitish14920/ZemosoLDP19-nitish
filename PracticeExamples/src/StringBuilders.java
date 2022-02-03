public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Nitish");

        sb.append(" is awesome");
        System.out.println(sb);

        sb.insert(7,"Kumar ");
        System.out.println(sb);

        sb.replace(16,23,"Amazing");
        System.out.println(sb);

        sb.delete(6,12);
        System.out.println(sb);
    }
}
