import java.util.*;

public class Demo04 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> listHashMap = new HashMap<>();
        ArrayList<String> cities01 = new ArrayList<>();
        ArrayList<String> cities02 = new ArrayList<>();
        ArrayList<String> cities03 = new ArrayList<>();
        Collections.addAll(cities01, "南京", "无锡", "苏州", "盐城");
        Collections.addAll(cities02, "泰安", "济南", "威海", "日照");
        Collections.addAll(cities03, "杭州", "宁波", "温州", "舟山");
        listHashMap.put("江苏省", cities01);
        listHashMap.put("山东省", cities02);
        listHashMap.put("浙江省", cities03);
        for (Map.Entry<String, ArrayList<String>> entry : listHashMap.entrySet()) {
            String province = entry.getKey();
            ArrayList<String> cityList = entry.getValue();
            StringJoiner sj = new StringJoiner(",", "", "");
            for (String city : cityList) {
                sj.add(city);
            }
            System.out.println(province + ": " + sj.toString());
        }


    }
}
//B2的修改
