import java.util.ArrayList;

import org.testng.annotations.Test;

public class Streams {
	//@Test
	public void regular()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Anusha");
		names.add("Ashritha");
		names.add("Supriya");
		names.add("Amani");
		names.add("Priya");
		names.add("Brindha");
		names.add("Brindha1");
		int count=0;
		for(int i=0;i<names.size();i++) {
		String actual=names.get(i);
		if(actual.startsWith("A")) {
			count++;
		}
		System.out.println(count);
		}}
		@Test
		public void streamFilter()
		{
			ArrayList<String> names=new ArrayList<String>();
			names.add("Anusha");
			names.add("Ashritha");
			names.add("Supriya");
			names.add("Amani");
			names.add("Priya");
		Long c=	names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		}
		
		
	}




