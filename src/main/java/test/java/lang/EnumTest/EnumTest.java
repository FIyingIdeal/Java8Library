package test.java.lang.EnumTest;

import org.junit.Test;

/**
 * Created by Administrator on 2017/5/31.
 */
public class EnumTest {

    /**
     * valueOf(Class<T extends Enum<T>> your_enum, String name)方法是用来从指定的Enum your_enum中获取value值与name一致的enum实例
     */
    @Test
    public void valueOf() {
        System.out.println(Enum.valueOf(WeekEnum.class, "Monday").getCn_name());
    }
}