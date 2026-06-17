public enum Coin {

    Penny(1),
    Nickle(5),
    Dime(10),
    Quater(25);

    private final int value;

    Coin(int value){
        this.value=value;
    }

    public int getValue(){
        return this.value;
    }

}
