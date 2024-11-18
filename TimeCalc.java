public class TimeCalc {
    public static void main(String[] args) {

        String timeInput = args[0];
        int minutesToadd = Integer.parseInt(args[1]);

        int hours = Integer.parseInt(timeInput.substring(0, 2));
        int minutes = Integer.parseInt((timeInput.substring(3, 5)));

        int totlalminutes = (hours * 60) + minutes + minutesToadd;

        int newhours = (totlalminutes / 60) % 24; 
        int newminuts = totlalminutes % 60;

        System.out.printf("%02d:%02d\n", newhours, newminuts);

    }
}
