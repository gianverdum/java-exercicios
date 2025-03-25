package aulas.classe;

public class Data {

    int day;
    int month;
    int year;

    Data () {

        this(1,1,1970);
    }

    Data (int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;
    }

    String getFormatedDate() {
        final String format = "%d/%d/%d";
        return String.format(format, day, month, year);
    }
}
