package core.basesyntax;

public class SalaryInfo {
    private final String[] names = new String[]{"John", "Andrew", "Kate"};

    private final String[] data = new String[]{
            "26.04.2019 John 4 50",
            "05.04.2019 Andrew 3 200",
            "10.04.2019 John 7 100",
            "22.04.2019 Kate 9 100",
            "25.06.2019 John 11 50",
            "26.04.2019 Andrew 3 150",
            "13.02.2019 John 7 100",
            "26.04.2019 Kate 9 100"
    };

    private final String dateForm = "1.04.2019";
    private final String dateTo = "30.04.2019";

    private final int hours = 0;
    private final int rate = 0;
    private final int sumSalary = hours * rate;


    public String getSalaryInfo(String[] names, String[] data, String dateFrom, String dateTo) {
        int index = 0;

        return null;
    }
}
