class ThisKeywordCorrect {

    int x;

    // getter of x
    public int getX() {
        return x;
    }

    // Constructor with a parameter
    ThisKeywordCorrect(int x) {
        this.x = x;
    }

    // Call the constructor
    public static void main(String[] args) {
        cwh obj1 = new cwh(65);
        System.out.println(obj1.getX());

    }
}
