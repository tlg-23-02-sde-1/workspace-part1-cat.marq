package edu.snooze;

/*
 * Test class focused on validation testing.
 * We will do BVT (Boundary Value Testing) for snooze Interval:
 * range: 1-20 (inclusive)
 * Need to check on the boundaries
 * 0,1 and 20,21
 */
class AlarmClockValidationTest {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();
        clock.setSnoozeInterval(1);  // should "stick" i.e., the AlarmClock has a value of 1
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(20);  // should "stick" i.e., the AlarmClock has a value of 20
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(0);  // should have error message
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(21);  // should have error message
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());
    }
}