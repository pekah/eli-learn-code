package com.eli.string;

/**
 * Created by elizhou on 2018/7/17.
 */
public class FormatStringTest {
    public static void main(String[] args) {
        String str = "Q401003000171\t学历提额\n" +
                "Q401003000170\t学历提额\n" +
                "Q405004700169\t乐金卡提额\n" +
                "Q404804400167\t邀请好友提额\n" +
                "Q104109500165\t乐黑卡提额\n" +
                "Q104109500164\t乐黑卡提额\n" +
                "Q102209500163\t临时提额\n" +
                "Q102209200162\t临时提额\n" +
                "Q104004400155\t全知识答题提额\n" +
                "Q206211100154\t中原大额提额\n" +
                "Q404713000149\t汽车贷提额\n" +
                "Q404602000148\t汽车贷提额\n" +
                "Q102004600147\t淘宝提额\n" +
                "Q104208200143\t乐黑卡额度失效\n" +
                "Q104210000142\t乐黑卡额度失效\n" +
                "Q504203300141\t信用卡申卡提额\n" +
                "Q401004500139\t企业邮箱认证提额\n" +
                "Q504003000138\t信用卡提额\n" +
                "Q504204400134\t信用卡申卡提额\n" +
                "Q102001000126\t\n" +
                "Q102003300125\t信用卡提额\n" +
                "Q504103300124\t乐还款提额\n" +
                "Q104004400119\t关注分期乐公众号提额\n" +
                "Q603003000094\t完善身份证照片提额\n" +
                "Q404413100087\t大额提额\n" +
                "Q404213000085\t车产大额提额\n" +
                "Q404213000084\t大额提额\n" +
                "Q404102000083\t大额提额\n" +
                "Q102004200078\t完善个人资料提额\n" +
                "Q102004200077\t完善联系人提额\n" +
                "Q310203100072\t公积金提额\n" +
                "Q310204100071\t储蓄卡提额\n" +
                "Q602003000064\t完善身份证照片提额\n" +
                "Q102003700062\t芝麻信用提额\n" +
                "Q102003700061\t验证信用卡账单提额\n" +
                "Q102003700060\t验证信用卡提额\n" +
                "Q102003000059\t完善身份证照片提额\n" +
                "Q102003700058\t完善工作信息提额\n" +
                "Q102003700057\t公积金提额\n" +
                "Q102003700056\t查询个人征信提额\n" +
                "Q401003000053\t车产提额\n" +
                "Q102401000049\t授权脉脉提额\n" +
                "Q401003000040\t公积金提额\n" +
                "Q104103000036\t乐黑卡提额\n" +
                "Q401003000033\t完善身份证照片提额\n" +
                "Q401003000028\t完善个人资料提额\n" +
                "Q401003000027\t验证信用卡提额\n" +
                "Q401003000026\t芝麻信用提额\n" +
                "Q401003000025\t公积金提额\n" +
                "Q310203300014\t验证信用卡提额\n" +
                "Q310203900013\t完善工作信息提额\n" +
                "Q310203200012\t芝麻信用提额\n" +
                "Q102209100007\t临时提额\n";
//        System.out.println(str);

//        System.out.println(str.replace("\n", "\""));;
        System.out.println(str.replace("\t", "\":\"").replace("\n", "\",\n").replace("Q", "\"Q"));
    }
}
