import static java.lang.Math.max;

public class StepTracker {
    private int steps;
    private int days;
    private int activeDays;
    private int activeSteps;
    public StepTracker(int steps){
        days = 0;
        activeDays = 0;
        activeSteps = steps;
        steps = 0;


    }
    public void addDailySteps(int steps){
        this.steps += steps;
        days++;
        if(steps >= activeSteps) {
            activeDays++;
        }
    }
    public int activeDays(){
        return activeDays;
    }
    public double averageSteps(){
        return steps/max(days, 1);
    }
    public int getStepsForActiveDay(){
        return activeSteps;
    }
    public int getTotalSteps(){
        return steps;
    }
    public int getDays(){
        return days;
    }
    public int getActiveDays(){
        return activeDays;
    }
}
