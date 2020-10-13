package functions.special;

import java.util.List;

public class B {
    public static void echo(){
        System.out.println("echo");
    }
    public static Integer Layer2_RENAME(Integer i){
        i = i + 1;
        return i;
    }
    public static Integer Layer2_2(List<Integer> a){
        boolean notNull = a.size() > -1;
        if(notNull){
            return a.size();
        }
        else{
            return 0;
        }
    }
}
