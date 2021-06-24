package grammar.semantic;

public class FourUnitCode {

    String operator;
    Object arg1;
    Object arg2;
    String result;

    public FourUnitCode(String operator, Object arg1, Object arg2, String result) {
        this.operator = operator;
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.result = result;
    }

    @Override
    public String toString() {
        return "(" +
                "operator='" + operator + '\'' +
                ", arg1=" + arg1 +
                ", arg2=" + arg2 +
                ", result='" + result + '\'' +
                ')';
    }
}
