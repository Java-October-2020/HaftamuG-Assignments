
class Calculator implements java.io.Serializable {
    private double operandOne;
    private String operation;
    private double operandTwo;

    public Calculator(){

    }
    
    public Calculator(double operandOne, String operation, double operandTwo) {
        this.operandOne = operandOne;
        this.operation = operation;
        this.operandTwo = operandTwo;
    }

    public double performOperation(){
        if (operation == "+"){
           double res1 =  (operandOne + operandTwo);
           return res1;
        }else if (operation == "-"){
          double res = (operandOne - operandTwo);
          return res;
        }else{
            return 0.0;
        }
      

    }

    public double getResult() {
      
        return performOperation();
    }


    public double getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getOperandTwo() {
        return operandTwo;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

  
}