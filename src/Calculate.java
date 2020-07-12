public class Calculate {
    private int numA;
    private int numB;
    private boolean resetFlag;

    public Calculate(boolean resetFlag){
        this.resetFlag = resetFlag;
    }

    public Calculate(int numA, int numB, boolean resetFlag){
        this.numA = numA;
        this.numB = numB;
        this.resetFlag = resetFlag;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public boolean isResetFlag() {
        return resetFlag;
    }

    public void setResetFlag(boolean resetFlag) {
        this.resetFlag = resetFlag;
    }
}
