package homework6;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import javafx.application.Application;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class hw6 extends Application {
	public static TreeMap<String, Integer> countWords = new TreeMap<String, Integer>();

	public static void main(String[] args) {
		System.out.print("Enter PDF file location: ");
		Scanner in = new Scanner(System.in);
		String origin = in.nextLine();
		ArrayList<String> words = new ArrayList<String>();

	
		File input = new File(origin);
		try {
			PDDocument pdFile = PDDocument.load(input);
			PDFTextStripper strip = new PDFTextStripper();
			strip.setEndPage(10);
			String textInFile = strip.getText(pdFile).replaceAll("[^a-zA-Z0-9\\s+]", "").trim().toLowerCase();
			textInFile = textInFile.replaceAll("[\\n\\s]", " ");
			System.out.println(textInFile);
			if (pdFile != null) {
				pdFile.close();
			}
			for (String word : textInFile.split(" ")) {
				if (word != null && !word.isEmpty() && word != " ") {
					words.add(word);
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).isEmpty()) {
				words.remove(i);
			}
		}

		for (int i = 0; i < words.size(); i++) {
			int counter = 0;
			for (int j = 0; j < words.size(); j++) {
				
				if (words.get(i).equalsIgnoreCase(words.get(j))) {
					counter++;
				}
			}
			countWords.put(words.get(i), counter);
		}
		for (Map.Entry<String, Integer> entry : entriesSortedByValues(countWords)) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " count " + value);
		}
		
		launch(args);

	}

	public static <A, B extends Comparable<? super B>> SortedSet<Map.Entry<A, B>> entriesSortedByValues(Map<A, B> map) {
		SortedSet<Map.Entry<A, B>> sortedEntries = new TreeSet<Map.Entry<A, B>>(new Comparator<Map.Entry<A, B>>() {
			@Override
			public int compare(Map.Entry<A, B> e1, Map.Entry<A, B> e2) {
				int res = e1.getValue().compareTo(e2.getValue());
				return res != 0 ? -res : 1;
			}
		});
		sortedEntries.addAll(map.entrySet());
		return sortedEntries;
	}
	

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("PDF BarChart");
		final CategoryAxis xAxis = new CategoryAxis();
		final NumberAxis yAxis = new NumberAxis();
		final BarChart<String, Number> bc = new BarChart<String, Number>(xAxis, yAxis);
		bc.setTitle("Top Ten Words - Bar Graph");
		xAxis.setLabel("Words");
		yAxis.setLabel("Occurence");
		XYChart.Series series1 = new XYChart.Series();
		int i = 0;
		for(Entry<String, Integer> entry : entriesSortedByValues(countWords)) {
			if(i > 9) {break;}
			series1.getData().add(new XYChart.Data(entry.getKey(), entry.getValue()));
			i++;
		}
		Scene scene = new Scene(bc,800,600);
		bc.getData().add(series1);
		stage.setScene(scene);
		stage.show();

	}

}
