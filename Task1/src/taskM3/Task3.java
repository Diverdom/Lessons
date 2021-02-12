package taskM3;

public class Task3 {

    public static void main(String[] args) {


        int time = 4523534;
        int minutes = time / 60;
        int remainSeconds = time % 60;
        int hours = minutes / 60;
        int remainMinutes = minutes % 60;
        int days = hours / 24;
        int remainHours = hours % 24;
        int weeks = days / 7;
        int remainDays = days % 7;



        System.out.println(minutes + " minutes " + remainSeconds + " seconds");
        System.out.println(hours + " hours " + remainMinutes+" minutes " + remainSeconds + " seconds");
        System.out.println(days + " days " + remainHours + " hours " + remainMinutes+" minutes "
                + remainSeconds + " seconds");
        System.out.println(weeks + " weeks " + remainDays + " days " + remainHours + " hours "
                + remainMinutes+" minutes " + remainSeconds + " seconds");

        //it's magic YourBunnyWrote!
    }}
