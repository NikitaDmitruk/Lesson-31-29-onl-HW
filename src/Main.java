
public class Main {
    public static void main(String[] args) {
        MatrixCollection matrixCollection = new MatrixCollection();
        matrixCollection.add(1, 0, 0);
        matrixCollection.add(1, 0, 1);
        matrixCollection.add(1, 1, 0);
        matrixCollection.add(1, 1, 1);
        matrixCollection.add(1, 2, 0);
        matrixCollection.add(1, 2, 1);
        int counter = 0;
        for (int i : matrixCollection) {
            System.out.print(i + " ");
            counter++;
            if (counter == 5) {
                System.out.println();
                counter = 0;
            }
        }
        for (int i : matrixCollection) {
            System.out.println(i);
        }
        System.out.println("All is ok!");
    }
}