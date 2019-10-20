public class Sec_And_Min {
    /*
     REGEX %02d!!
     -------->>>>>>>>>>>> "%02d h :%02d m :%02d s" <<<<<<<<----------------
     */
    private static String INVALID_VALUE_MESSAGE = "--->>>\tInvalid arguments\t<<<---\n";
    private static String TIME_CONTEXT_SETTINGS = "%02d h :%02d m :%02d s";

    private static int remainingMinutes;
    private static int remainingSeconds;
    private static String duration;


    static int hourCALC_FROM_MIN(int minutes) {
        int hour = minutes / 60;
        return hour;
    }

    static int hourCALC_FROM_SEC(int seconds) {
        int hour = seconds / 3600;
        return hour;
    }

    static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hour = hourCALC_FROM_MIN(minutes);

            remainingMinutes = minutes % 60;
            duration = String.format(TIME_CONTEXT_SETTINGS, hour, remainingMinutes, seconds);
            return "Duration equals -->>>\t" + duration + "\n";
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }

    static String getDurationString(int sec) {
        if (sec >= 0) {
            int hour = hourCALC_FROM_SEC(sec);
            remainingMinutes = (sec % 3600) / 60;
            remainingSeconds = (sec % 3600) % 60;
            duration = String.format(TIME_CONTEXT_SETTINGS, hour, remainingMinutes, remainingSeconds);
            return "Duration equals -->>>\t" + duration + "\n";
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }

    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 65));
        System.out.println(getDurationString(3670));
    }
}
