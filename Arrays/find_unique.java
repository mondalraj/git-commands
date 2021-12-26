import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class find_unique {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }

        String[] strNums;
        strNums = br.readLine().split("\\s");

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            int[] input = takeInput();
            findUnique(input);
            System.out.println();

            t -= 1;
        }
    }

    public static void findUnique(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] != -1) {
                for (int j = i + 1; j < input.length; j++) {
                    if (input[i] == input[j]) {
                        input[i] = -1;
                        input[j] = -1;
                        break;
                    }
                    if (j == input.length - 1) {
                        System.out.println(input[i]);
                    }
                }
            }

        }
    }
}