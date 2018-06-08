import java.util.Random;

public class Fizz {

    static int bonusWord = 0;

    // public static void main(String[] args)
    public static void playFizzBuzz() {
        String output = "";
        output = FizzBuzz(output);
        System.out.println(output);

    }
    public static String FizzBuzz (String output){
        Random rand = new Random();
        int randomStartPoint1 = rand.nextInt(101);
        int randomStartPoint2 = rand.nextInt(101);
        int startPoint = smallerNumber(randomStartPoint1, randomStartPoint2);
        int endPoint = biggerNumber(randomStartPoint1, randomStartPoint2);
        int startEndDifference = randomStartPoint2 - randomStartPoint1;
        if (startEndDifference < 10) {
            output += "This won't take long\n";
        }
        if (randomStartPoint1 == randomStartPoint2) {
            output += "Shazam\n";
        }
        for (int i = startPoint; i <= endPoint; i++) {

            if (i % 15 == 0) {
                output += "FizzBuzz";
            } else if (i % 7 == 0) {
                output += i + " - multiple of seven.";
            } else if (i % 5 == 0) {
                output += "Buzz";
            } else if (i % 3 == 0) {
                output += "Fizz";
            } else {
                output += i;
            }
            if (i > 10) {
                if (i % 2 == 0) {
                    output += " - " + rockPaper();
                }
            }

            output += "\n";
        }
        return output;
    }
    public static int biggerNumber ( int first, int second){
        int biggerNumber = 0;
        if (first > second) {
            biggerNumber = first;
        }
        if (second > first) {
            biggerNumber = second;
        }
        return biggerNumber;
    }

    public static int smallerNumber ( int first, int second){
        int smallerNumber = 0;
        if (first < second) {
            smallerNumber = first;
        }
        if (second < first) {
            smallerNumber = second;
        }
        return smallerNumber;
    }

    public static String rockPaper () {
        String lizardSpock[] = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};
        String output = "";
        switch (bonusWord) {
            case 0:
                output += lizardSpock[bonusWord];
                bonusWord++;
                break;
            case 1:
                output += lizardSpock[bonusWord];
                bonusWord++;
                break;
            case 2:
                output += lizardSpock[bonusWord];
                bonusWord++;
                break;
            case 3:
                output += lizardSpock[bonusWord];
                bonusWord++;
                break;
            case 4:
                output += lizardSpock[bonusWord];
                bonusWord++;
                break;
        }
        if (bonusWord > 4) {
            bonusWord = 0;
        }
        return output;



    }
}
