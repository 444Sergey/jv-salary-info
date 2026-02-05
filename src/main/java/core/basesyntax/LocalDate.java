package core.basesyntax;

import java.util.Arrays;

public class LocalDate {
    private final String dateForm = "1.04.2019";
    private final String dateTo = "30.04.2019";

    private String[] aprilDate = new String [6];
    int index = 0;
    public int hours = 0;
    public int rate = 0;
    int sum = hours * rate;


    public String []setAprilDate () {
        String[] data = new String []{
                "26.04.2019 John 4 50",
                "05.04.2019 Andrew 3 200",
                "10.04.2019 John 7 100",
                "22.04.2019 Kate 9 100",
                "25.06.2019 John 11 50",
                "26.04.2019 Andrew 3 150",
                "13.02.2019 John 7 100",
                "26.04.2019 Kate 9 100"
        };

        for (int i = 0; i < data.length; i++) {
            String dataApril = data[i].split(" ")[0];
            hours += Integer.parseInt(data[i].split(" ")[2]);
            rate = Integer.parseInt(data[i].split(" ")[3]);
            String month = dataApril.substring(3,5);
            if (month.equals("04")) {
                aprilDate[index] = data[i];
                index++;
            }
        }
        return Arrays.copyOf(aprilDate, index);
    }

    public String setAprilDate2 () {
        String[] data = new String []{
                "26.04.2019 John 4 50",
                "05.04.2019 Andrew 3 200",
                "10.04.2019 John 7 100",
                "22.04.2019 Kate 9 100",
                "25.06.2019 John 11 50",
                "26.04.2019 Andrew 3 150",
                "13.02.2019 John 7 100",
                "26.04.2019 Kate 9 100"
        };

        StringBuilder result = new StringBuilder();
        int ch = 0;
        int hours2 = 0;
        int rate2 = 0;
        int sum2 = 0;
        for (int i = 0; i < data.length; i++) {
            String[] parts = data[i].split(" ");
            String date = parts[0];
            String person = parts[1];
            String month = date.substring(3, 5);
            hours2 = Integer.parseInt(parts[2]);
            rate2 = Integer.parseInt(parts[3]);
            sum2 = hours2 * rate2;
            if (month.equals("04") && person.equals("John")) {
                result.append("Report for period "
                        + dateForm + " - " + dateTo
                        + " \n"
                        + date.substring(0, 10)
                        + " \n"
                        + person
                        +  " - "
                        + sum2
                        + " \n");
                ch++;
            }
        }
        return result.toString();

    }


    public void getAprilDate () {
        System.out.println(Arrays.toString(aprilDate));
    }

    public String toString() {
        return "Report for period " + dateForm + " - " + dateTo + " \n"
                + "John - 900\n"
                + "Andrew - 1050\n"
                +  "Kate - 1800";
    }
}