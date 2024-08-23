public class SimpleCalculator {
    private double firstNumber, secondNumber;

    public double getAdditionResult(){
        return this.firstNumber+this.secondNumber;
    }

    public double getSubtractionResult(){
        return this.firstNumber-this.secondNumber;
    }

    public double getMultiplicationResult(){
        return this.secondNumber*this.firstNumber;
    }

    public double getDivisionResult(){
        if(this.secondNumber==0){
            return 0;
        }
        return this.firstNumber/this.secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
