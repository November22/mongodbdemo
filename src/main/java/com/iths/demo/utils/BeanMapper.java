package com.iths.demo.utils;

import org.dozer.DozerBeanMapper;

/**
 * @author sen.huang
 * @date 2018/10/25.
 */
public class BeanMapper {
    /**
     * 持有Dozer单例, 避免重复创建DozerMapper消耗资源.
     */
    private static DozerBeanMapper dozer = new DozerBeanMapper();

    public static <T> T map(Object source,Class<T> destination){
        if(source == null){
            return null;
        }
        return dozer.map(source, destination);
    }
}
