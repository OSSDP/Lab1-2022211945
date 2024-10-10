import java.util.ArrayList;
import java.util.Collections;

public class Demo01 {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "王二蛋", "赵永辉", "赵国栋", "王树龙", "赵戈登");

        //可以用collections中的随机排序，获取唯一的位置
        Collections.shuffle(list);
        System.out.println(list.get(0));

    }


}
