package com.eli.base;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GroupByMultimap {
	public static void main(String[] args) {
		Object[] o1 = new Object[] { 1, "Greg", "Dev" };
		Object[] o2 = new Object[] { 2, "Leo", "Support" };
		Object[] o3 = new Object[] { 3, "Roman", "Dev" };
		Object[] o4 = new Object[] { 4, "Jobby", "Support" };
 
		List<Object[]> rows = Lists.newArrayList(o1, o2, o3, o4);
		Multimap<String, Object[]> grouped = Multimaps.index(rows,
				new Function<Object[], String>() {
					public String apply(Object[] item) {
						System.out.println("item[2]" + item[2]);
						return (String) item[2];
					}
				});
 
		Iterator<String> keyIterator = grouped.asMap().keySet().iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			System.out.println("key = " + key);
			Collection<Object[]> dataRows = grouped.get(key);
			for (Object[] o : dataRows) {
				System.out.println(String.format("  %d : %s", o[0], o[1]));
			}
		}
	}
}