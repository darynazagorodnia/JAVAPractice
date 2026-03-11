package homeWork4;

public enum Operations {
    ADD ('+'), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/');

    private final char symbol;

    Operations (char symbol) {
        this.symbol = symbol;
    }
    public static Operations fromChar(char input){
        for (Operations op : Operations.values()){
            if (op.symbol == input){
                return op;
            }
        }
        throw new IllegalArgumentException("Unknown operator: " + input);
    }

}
