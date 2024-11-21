public class TimeCalc {
    public static void main(String[] args) {

        // קריאת ערכים מהקלט
        String timeInput = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        // חילוץ השעות והדקות מהקלט
        int hours = Integer.parseInt(timeInput.substring(0, 2));
        int minutes = Integer.parseInt(timeInput.substring(3, 5));

        // חישוב כל הדקות הכלולות
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;

        // חישוב השעות החדשות והדקות החדשות
        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;

        // הצגת התוצאה בפורמט "hh:mm"
        System.out.printf("%02d:%02d\n", newHours, newMinutes);
    }
}
