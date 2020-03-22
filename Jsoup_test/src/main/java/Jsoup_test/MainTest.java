package Jsoup_test;
import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;




public class MainTest {
	ArrayList<SampleData> datas= new ArrayList<SampleData>();
	public static void main(String[] args) throws IOException {
		String    url     = "https://finance.naver.com/sise/theme.nhn?&page=1";
		MainTest mainTest = new MainTest();

		Document  doc 	  = Jsoup.connect(url).get();
		Elements  parents = mainTest.getFilteredTags(doc);
		
		for(Element ele : parents) {
			mainTest.datas.add(new SampleData(ele.select(".col_type1").text(),
			                                  ele.select(".number.col_type2").text(),
			                                  ele.select(".number.col_type3").text() ) );
		}
		mainTest.datas.forEach(data->System.out.println(data.rate));
	}
	public Elements getFilteredTags(Document doc) {
		Elements parents	   = doc.select("tr");
		Elements filteredParen = new Elements();
		for(Element ele:parents) {
			if(!ele.select(".number.col_type2").isEmpty()) {
				filteredParen.add(ele);
			}
		}
		return filteredParen;
	}
}
