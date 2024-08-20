import java.util.ArrayList;

public class StepTracker {
    int minimumSteps = 0;
    int steps = 0;
    int activeSteps = 0;
    int activeDays = 0;
    int days = 0;
    public StepTracker(int min) {
        minimumSteps = min;
    }
    public void addDailySteps(int addSteps) {
        steps = steps + addSteps;
        if (addSteps >= minimumSteps) {
            activeDays = activeDays + 1;
            activeSteps = activeSteps + addSteps;
        }
        days++;
    }
    public int activeDays() {
        return activeDays;
    }
    public double averageSteps() {
        if (steps == 0) {return 0.0;}
        return (double) steps / days;
    }
    public int getDays() {
        return days;
    }
    public int getStepsForActiveDay() {
        return minimumSteps;
    }
    public int getTotalSteps() {
        return steps;
    }
    public int getActiveDays() {
        return activeDays;
    }
}
