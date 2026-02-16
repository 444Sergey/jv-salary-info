package core.basesyntax;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalaryInfo {

    public String getSalaryInfo(String[] names, String[] data, String dateFrom, String dateTo) {
        int salaryJohn = 0;
        int salaryAndrew = 0;
        int salaryKate = 0;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.MM.yyyy");
        LocalDate from = LocalDate.parse(dateFrom, formatter);
        LocalDate to = LocalDate.parse(dateTo, formatter);

        for (int i = 0; i < data.length; i++) {
            String[] parts = data[i].split(" ");
            String dateMonth = parts[0];
            String person = parts[1];
            int hours = Integer.parseInt(parts[2]);
            int rate = Integer.parseInt(parts[3]);

            LocalDate localDateMonth = LocalDate.parse(dateMonth, formatter);

            if (!localDateMonth.isBefore(from) && !localDateMonth.isAfter(to)) {
                int earned = hours * rate;
                if (person.equals("John")) {
                    salaryJohn += earned;
                } else if (person.equals("Andrew")) {
                    salaryAndrew += earned;
                } else if (person.equals("Kate")) {
                    salaryKate += earned;
                }
            }
        }

        return "Report for period " + dateFrom + " - " + dateTo + System.lineSeparator()
                + names[0] + " - " + salaryJohn + System.lineSeparator()
                + names[1] + " - " + salaryAndrew + System.lineSeparator()
                + names[2] + " - " + salaryKate;
    }
}
