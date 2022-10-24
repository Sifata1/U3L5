public class Lottery {
    private int lotteryNumber;

    public Lottery() {
        int x = (int) (Math.random() * 100);
        lotteryNumber = x;
    }

    public int determineWinnings(int userNumber) {
        int winnings;
        if (userNumber == lotteryNumber) {
            return 100;
        }
        if ()
    }
}
