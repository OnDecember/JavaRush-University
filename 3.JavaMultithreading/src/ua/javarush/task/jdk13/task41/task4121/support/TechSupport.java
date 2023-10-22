package ua.javarush.task.jdk13.task41.task4121.support;

public abstract class TechSupport {

    private TechSupport nextLevel;

    abstract public void solve(String problem);

    protected void passAlongTheChain(String problem) {
        if (nextLevel != null) {
            nextLevel.solve(problem);
        }
    }

    public TechSupport setNextLevel(TechSupport nextLevel) {
        this.nextLevel = nextLevel;
        return nextLevel;
    }
}
