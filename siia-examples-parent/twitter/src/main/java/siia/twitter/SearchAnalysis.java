package siia.twitter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mark Fisher
 */
public class SearchAnalysis {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("siia/twitter/search-analysis.xml");
	}

}
