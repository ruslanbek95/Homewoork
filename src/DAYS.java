public enum DAYS {
    MONDAY(",Понидельник куну англисстилин окуйбуз"),
    TUESDAY("Вторник  тема Математика "),
    WEDNESDAY("Среда: тема  Абстраксия "),
    THURSDAY("Четверг: тема Интерфейс "),
    FRIDAY("Пятница: тема Полиморфизм "),
    SATURDAY("Суббота:тема Практика "),
    SUNDAY("Воскресенье: тема выходной ");
    private String  Differences;

    DAYS(String differences) {
        System.out.println();
        Differences = differences;
    }

    @Override
    public String toString() {
        return "DAYS{" +
                "Differences='" + Differences + '\'' +
                '}';
    }
}

