package homeWork8.Season;

public enum Month {

    JANUARY(31, Season.WINTER, "Січень"),
    FEBRUARY(29, Season.WINTER, "Лютий"),
    MARCH(31, Season.SPRING, "Березень"),
    APRIL(30, Season.SPRING, "Квітень"),
    MAY(31, Season.SPRING, "Травень"),
    JUNE(30, Season.SUMMER, "Червень"),
    JULY(31, Season.SUMMER, "Липень"),
    AUGUST(31, Season.SUMMER, "Серпень"),
    SEPTEMBER(30, Season.FALL, "Вересень"),
    OCTOBER(31, Season.FALL, "Жовтень"),
    NOVEMBER(30, Season.FALL,"Листопад"),
    DECEMBER(31, Season.WINTER, "Грудень");

    private int days;
    private Season season;
    private String title;

    Month(int days, Season season, String title) {
        this.days = days;
        this.season = season;
        this.title = title;
    }

    public int getDays() {
        return days;
    }

    public Season getSeason() {
        return season;
    }

    public String getTitle() {
        return title;
    }

    public static Month fromString(String monthString){
        for (Month month : values()){
            if (month.name().equalsIgnoreCase(monthString)
                    || month.title.equalsIgnoreCase(monthString)){
                return month;
            }
        }
        return Month.NOVEMBER;
    }
}
