package core.basesyntax;

public class Main {
    private static LocalDate localDate = new LocalDate();
    private static Main main = new Main();

    public static void main(String[] args) {
        localDate.setAprilDate();
        localDate.getAprilDate();
        System.out.println(localDate.toString());
        String text = String.valueOf(localDate.hours);
        System.out.println(text);
        System.out.println(localDate.setAprilDate2());
    }
}
