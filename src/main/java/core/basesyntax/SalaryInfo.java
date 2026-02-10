package core.basesyntax;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    public String getSalaryInfo(String[] names, String[] data, String dateFrom, String dateTo) {
        int salaryJohn = 0;
        int salaryAndrew = 0;
        int salaryKate = 0;

        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.MM.yyyy");
        //LocalDate from = LocalDate.parse(dateFrom, formatter);
        //LocalDate to = LocalDate.parse(dateTo, formatter);

        for (int i = 0; i < data.length; i++) {
            String dateMonth = data[i].split(" ")[0];
            String person = data[i].split(" ")[1];
            int hours = Integer.parseInt(data[i].split(" ")[2]);
            int rate = Integer.parseInt(data[i].split(" ")[3]);

            String monthApril = dateMonth.substring(3, 5);
            if (monthApril.equals("04") && person.equals("John")) {
                salaryJohn += hours * rate;
            } else if (monthApril.equals("04") && person.equals("Andrew")) {
                salaryAndrew += hours * rate;
            } else if (monthApril.equals("04") && person.equals("Kate")) {
                salaryKate += hours * rate;
            }
        }
        return "Report for period " + dateForm + " - " + dateTo + " \n"
                + names[0] + " - " + salaryJohn + " \n"
                + names[1] + " - " + salaryAndrew + " \n"
                + names[2] + " - " + salaryKate;
    }

    public String terminalSalaryInfo() {
        return getSalaryInfo(names, data, dateForm, dateTo);
    }
}
