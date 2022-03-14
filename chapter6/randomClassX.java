import java.util.Random;

class randomClassX {

    public static void main(String[] args) {

        Random randomGenerator;
        // constructor
        randomGenerator = new Random();
        int index = randomGenerator.nextInt();

        System.out.println(index);

    }

}