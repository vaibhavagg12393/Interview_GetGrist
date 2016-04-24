import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;

public class GetGrist {
	static String everything;

	public static void main(String[] args) throws IOException, JSONException {

		String location ="./sample1.json";
		BufferedReader br = new BufferedReader(new FileReader(location));
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    everything = sb.toString();
		} finally {
		    br.close();
		}
		JSONArray array = new JSONArray(everything);
		int rows = array.length() - 1;
		int columns = array.getJSONArray(0).length() - 1;
		int[][] data = new int[rows + 1][columns + 1];
		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= columns; j++) {
				data[i][j] = array.getJSONArray(i).getInt(j);
			}
		}
		int maximum = 0;
		String path = "";
		int[][] twoD = new int[rows + 1][columns + 1];
		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= columns; j++) {
				if (i == 0 && j == 0) {
					twoD[i][j] = data[i][j];
					maximum = twoD[i][j];
				} else if (i == 0) {
					twoD[i][j] = twoD[i][j - 1] + data[i][j];
					maximum = twoD[i][j];
				} else if (j == 0) {
					twoD[i][j] = twoD[i - 1][j] + data[i][j];
					maximum = twoD[i][j];
				} else {
					twoD[i][j] = Math.max(twoD[i][j - 1], twoD[i - 1][j]) + data[i][j];
					maximum = twoD[i][j];
				}
			}
		}
		while (rows > 0 || columns > 0) {
			if (rows == 0) {
				columns -= 1;
				path += "R";
			} else if (columns == 0) {
				rows -= 1;
				path += "D";
			} else if (twoD[rows - 1][columns] > twoD[rows][columns - 1]) {
				rows -= 1;
				path += "D";
			} else if (twoD[rows - 1][columns] <= twoD[rows][columns - 1]) {
				columns -= 1;
				path += "R";
			}
		}
		System.out.println(maximum);
		System.out.println(path);
	}
}
