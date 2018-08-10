package com.eli.base;

import com.fenqile.vip.util.common.math.UnitConvertUtil;
import com.google.common.base.Function;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

import java.util.*;

/**
 * Created by elizhou on 2018/7/13.
 */
public class MyTest {

    public static void main(String[] args) {

        MyTest test = new MyTest();

        test.getData(new ArrayList<WaterBean>(), false, 0, 20);
    }


    /**
     *
     * isOver：查询的是limit 20，实际返回的条数少于20条，说明数据已经读完。 默认值false
     *
     *
     *
     */
    public List<WaterBean> getData(List<WaterBean> data, boolean isOver, int offset, int limit) {
        // 对data进行group by
        List<WaterBean> afterGroupBy = afterGroupBy(data);

        // 数据已读完，不再递归
        if(isOver) {
            return afterGroupBy;
        }

        // group by 后的数据已经超过10条，并且最后一条数据不是账单还款或者账单关闭，不再递归
        if(afterGroupBy.size() >= 10  && !isBill(afterGroupBy.get(afterGroupBy.size() - 1))) {
            return afterGroupBy;
        }

        List<WaterBean> dataFromDB = getFromDB(offset, limit);

        // 查询的是limit 20，实际返回的条数少于20条，说明数据已经读完
        isOver = dataFromDB.size() < limit;

        // 将数据合并在一起
        data.addAll(dataFromDB);

        // 递归处理
        return getData(data, isOver, offset + data.size(), limit);
    }


    private List<WaterBean> getFromDB(int offset, int limit) {
        WaterBean waterBean = new WaterBean();
        return Arrays.asList(waterBean);
    }

    private List<WaterBean> afterGroupBy(List<WaterBean> data) {
        // 非账单类的流水，设置一个唯一的聚合id
        for (int i = 0; i < data.size(); i++) {
            WaterBean waterBean = data.get(i);

            if(!isBill(waterBean)) {
                waterBean.setSummaryId(i + "");
            }
        }

        // 按summaryId分组
        Multimap<String, WaterBean> grouped = Multimaps.index(data,
                new Function<WaterBean, String>() {
                    public String apply(WaterBean item) {
                        return item.getSummaryId();
                    }
        });

        // 分组后对变化的金额进行聚合
        Iterator<String> keyIterator = grouped.asMap().keySet().iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Collection<WaterBean> dataRows = grouped.get(key);

            ArrayList<WaterBean> list = (ArrayList<WaterBean>)dataRows;

            Long totalChangeCreditFen = 0L;

            for (WaterBean waterBean : dataRows) {
                totalChangeCreditFen += UnitConvertUtil.yuanToFen(waterBean.getChangeCredit()).longValue();

                System.out.println(String.format("  %s: %d : %s", waterBean.getSummaryId(), waterBean.getChangeType(), waterBean.getTradeId()));
            }


        }





        WaterBean waterBean = new WaterBean();
        return Arrays.asList(waterBean);
    }

    private boolean isBill(WaterBean waterBean) {
        List<Integer> billList = Arrays.asList(256, 512);
        return billList.contains(waterBean.getChangeType());
    }
}
