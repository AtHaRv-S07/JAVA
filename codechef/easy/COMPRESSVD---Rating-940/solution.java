import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader and StringTokenizer provide fast I/O to prevent TLE
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) return;

        int t = Integer.parseInt(line.trim()); // Number of test cases

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim()); // Number of frames

            st = new StringTokenizer(br.readLine());

            // Read the first frame
            int prev = Integer.parseInt(st.nextToken());
            int finalFrameCount = 1;

            // Process remaining frames on the fly in O(1) space
            for (int i = 1; i < n; i++) {
                int current = Integer.parseInt(st.nextToken());
                if (current != prev) {
                    finalFrameCount++;
                    prev = current; // Update tracking pointer
                }
            }

            System.out.println(finalFrameCount);
        }
    }
}