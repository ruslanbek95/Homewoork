import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
        DAYS days = DAYS.valueOf(scanner.nextLine().toUpperCase());
 switch (days) {
     case MONDAY -> System.out.println(DAYS.MONDAY);
     case TUESDAY -> System.out.println(DAYS.TUESDAY);
     case WEDNESDAY -> System.out.println(DAYS.WEDNESDAY);
     case THURSDAY -> System.out.println(DAYS.THURSDAY);
     case FRIDAY -> System.out.println(DAYS.FRIDAY);
     case SATURDAY -> System.out.println(DAYS.SATURDAY);
     case SUNDAY -> System.out.println(DAYS.SUNDAY);
 }
 }catch (IllegalArgumentException e){
            System.out.println(" мындай кун жок ");
        }

        }
    }

