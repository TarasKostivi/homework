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
                    || month.getTitle().equalsIgnoreCase(monthString)){
                return month;
            }
        }
        return null;
    }

    public static void Season(String monthString){
        Month months = fromString(monthString);
        System.out.println(months.getSeason());
    }

    public static void Days(String monthString){
        for (Month month : values()) {
            if (month.name().equalsIgnoreCase(monthString) || month.getTitle().equalsIgnoreCase(monthString)){
                for (Month month1 : values()) {
                    if (month.getDays() == month.getDays()){
                        System.out.println(month1);
                    }
                }
            }
        }
    }

    public static void plusDay(String monthString) {
        for (Month month : values()) {
            if (month.name().equalsIgnoreCase(monthString) || month.getTitle().equalsIgnoreCase(monthString)){
                for (Month month1 : values()) {
                    if (month.getDays() < month.getDays()){
                        System.out.println(month1);
                    }
                }
            }
        }
    }

    public static void minusDay(String monthString) {
        for (Month month : values()) {
            if (month.name().equalsIgnoreCase(monthString) || month.getTitle().equalsIgnoreCase(monthString)){
                for (Month month1 : values()) {
                    if (month.getDays() > month.getDays()){
                        System.out.println(month1);
                    }
                }
            }
        }
    }

    public static void pairDay(String monthString) {
        if (fromString(monthString).getDays()%2==0){
            System.out.println("");
            System.out.println("Pair Days");
        }else {
            System.out.println();
            System.out.println("Nopair Days");
        }
    }

    public static void pairMonth(){
        for (Month month : values()) {
            if (month.getDays()%2==0){
                System.out.println(month.name());
            }
        }
    }

    public static void noPairMonth(){
        for (Month month : values()) {
            if (month.getDays()%2!=0){
                System.out.println(month.name());
            }
        }
    }

    public static void nextSeason(String monthString){
        int a = fromString(monthString).getSeason().ordinal();
        Season[] seasons = Season.values();
        System.out.println(seasons[a+1]);
    }

    public static void prevSeason(String monthString){
        int a = fromString(monthString).getSeason().ordinal();
        Season[] seasons = Season.values();
        System.out.println(seasons[a-1]);
    }

    public static void allMethod(String monthString){
        Month.fromString(monthString);
        System.out.println("\n");
        System.out.println("Місяці з такою ж порою року.");
        Month.Season(monthString);
        System.out.println("\n");
        System.out.println("Місяці які мають таку саму кількість днів.");
        Month.Days(monthString);
        System.out.println("\n");
        System.out.println("Місяці які мають меншу кількість днів..");
        Month.minusDay(monthString);
        System.out.println("\n");
        System.out.println("Місяці які мають більшу кількість днів..");
        Month.plusDay(monthString);
        System.out.println("\n");
        System.out.println("Наступна пора року");
        Month.pairDay(monthString);
        System.out.println("\n");
        System.out.println("Pair day");
        Month.nextSeason(monthString);
        System.out.println("\n");
        System.out.println("Попередня пора року");
        Month.prevSeason(monthString);
        System.out.println("\n");
        System.out.println("Парна кількість днів");
        Month.pairMonth();
        System.out.println("\n");
        System.out.println("Непарна кількість днів");
        Month.noPairMonth();
    }
}
