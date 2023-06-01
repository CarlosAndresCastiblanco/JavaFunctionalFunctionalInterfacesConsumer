/**
 * 
 */
package co.com.java;

import java.util.function.Consumer;
import java.util.List;
import java.util.ArrayList;

/**
 * @author carlos.castiblanco
 *
 */
public class MainJavaFunctionalFunctionalInterfacesConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Consumer<Integer> diplay = d -> System.out.println(d);

		Consumer<Integer> display = System.out::println;
		
		diplay.accept(10);
		
		display.accept(10000000);
		
        Consumer<List<Integer> > modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };
		
		
        Consumer<List<Integer>> st = list -> list.stream().forEach(a -> System.out.print(a + " "));
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
 
        // Implement modify using accept()
        modify.accept(list);
 
        // Implement dispList using accept()
        st.accept(list);
	}

}
