package execicio1;

import java.util.ArrayList;
import java.util.Collection;

public class Log {

	private Collection<String> textos;

		public Collection<String> getTextos() {
		return textos;
	}
	public void setTextos(Collection<String> textos) {
		this.textos = textos;
	}
	
	public static void main(String[] args) {
		
		Log log = new Log();
		log.setTextos(new ArrayList<String>());
		
		log.getTextos().add("Log1");
		log.getTextos().add("Log2");
		log.getTextos().add("Log3");
		
		/*Collection<String> textos = new ArrayList<String>();
		textos.add("log1");
		textos.add("log2");
		textos.add("log3");
	
		Log log = new Log();
		log.setTextos(textos);*/
	}
	
	
}
