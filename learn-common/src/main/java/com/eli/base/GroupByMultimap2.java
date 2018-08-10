package com.eli.base;

import com.annimon.stream.Collectors;
import com.annimon.stream.Stream;
import com.annimon.stream.function.Consumer;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

import java.util.*;

public class GroupByMultimap2 {
	public static void main(String[] args) {
		Object[] o1 = new Object[] { 1, "Greg", "Dev" };
		Object[] o2 = new Object[] { 2, "Leo", "Support" };
		Object[] o3 = new Object[] { 3, "Roman", "Dev" };
		Object[] o4 = new Object[] { 4, "Jobby", "Support" };

		WaterBean w1 = new WaterBean();
		w1.setSummaryId("1");
		w1.setChangeType(3);
		w1.setTradeId("O1");

		WaterBean w2 = new WaterBean();
		w2.setSummaryId("2");
		w2.setChangeType(4);
		w2.setTradeId("O2");

		WaterBean w3 = new WaterBean();
		w3.setSummaryId("1");
		w3.setChangeType(6);
		w3.setTradeId("O3");

		WaterBean w4 = new WaterBean();
		w4.setSummaryId("2");
		w4.setChangeType(1);
		w4.setTradeId("O4");
 
		List<WaterBean> rows = Lists.newArrayList(w1, w2, w3, w4);

		Multimap<String, WaterBean> grouped = Multimaps.index(rows,
				new Function<WaterBean, String>() {
					public String apply(WaterBean item) {
						return item.getSummaryId();
					}
				});
 
		Iterator<String> keyIterator = grouped.asMap().keySet().iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			System.out.println("key = " + key);
			Collection<WaterBean> dataRows = grouped.get(key);

			List<WaterBean> list = (List<WaterBean>)dataRows;

			for (WaterBean waterBean : dataRows) {
				System.out.println(String.format("  %s: %d : %s", waterBean.getSummaryId(), waterBean.getChangeType(), waterBean.getTradeId()));
			}
		}

		Map<String, List<WaterBean>> result2 = Stream.of(rows).collect(Collectors.groupingBy(new com.annimon.stream.function.Function<WaterBean, String>() {
			public String apply(WaterBean waterBean) {
				return waterBean.getSummaryId();
			}
		}));

		result2.entrySet().iterator();

		for (String key : result2.keySet()) {
			System.out.println("my key " + key);
			for (WaterBean waterBean : result2.get(key)) {
				System.out.println(String.format("my waterBean  %s: %d : %s", waterBean.getSummaryId(), waterBean.getChangeType(), waterBean.getTradeId()));
			}
		}



	}
}