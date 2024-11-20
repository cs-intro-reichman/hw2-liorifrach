// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String args[]) {
        // קריאה מהקלט (N - הגבוה ביותר, mode - מצב)
        int N = Integer.parseInt(args[0]);
        String mode = args[1];

        // אם המצב הוא verbose, הדפס את כל הרצפים
        for (int i = 1; i <= N; i++) {
            if (mode.equals("v")) {
                printVerbose(i);  // הדפסת הרצף המפורט במצב verbose
            }
        }

        // אם המצב הוא concise, הדפס סיכום בסוף
        if (mode.equals("c")) {
            printConciseSummary(N);  // הדפסת סיכום תמציתי
        }

        // הדפס את הסיכום בסוף במצב verbose
        if (mode.equals("v")) {
            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        }
    }

    // הדפסת הסיכום התמציתי
    public static void printConciseSummary(int N) {
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }

    public static void printVerbose(int seed) {
        int steps = 0;  // מתחילים מ-0 כי אנחנו מתחילים מהמספר עצמו
        int current = seed;
        StringBuilder sequence = new StringBuilder();

        // יצירת רצף קולטץ
        while (current != 1) {
            sequence.append(current).append(" ");
            if (current % 2 == 0) {
                current /= 2;  // אם המספר זוגי, נחלק ב-2
            } else {
                current = 3 * current + 1;  // אם אי זוגי, נכפול ב-3 ונוסיף 1
            }
            steps++;  // הגדלת מונה הצעדים
        }

        // הוספת את הצעד האחרון (1) לרצף
        sequence.append("1 ");
        // הדפסת הרצף עם מספר הצעדים
        System.out.println(sequence.toString().trim() + " (" + (steps + 1) + ")");
    }
}
