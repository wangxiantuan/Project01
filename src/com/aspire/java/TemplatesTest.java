package com.aspire.java;

import com.aspire.bean.Customer;

import java.util.ArrayList;

/**
 * @author wangxiantuan
 * @create 2019/2/24 - 20:25
 *
 * 1.IDEA中代碼模板所在位置：setting - Editor - Live Templates / Postfix Completion
 * 2.常用模板
 */
public class TemplatesTest {
    //模板6：prsf:可生成 private static final
    private static final Customer CUST = new Customer();
    //变形:psf
    public static final int NUM = 1;
    //变形：psfi
    public static final int NUM1 = 2;
    //变形：psfs
    public static final String STR = "哈啊";

    //模板1：psvm
    public static void main(String[] args) {
        //模板2：sout
        System.out.println("hello");
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");

        int num1 = 11;
        System.out.println("num1 = " + num1);
        int num2 = 22;
        System.out.println("num2 = " + num2);

        System.out.println(num2);

        //模板3：fori
        String[] arr = new String[]{"tom","Jerry","hanMEimei","lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //变形4：list.for
        ArrayList list =  new ArrayList();
        list.add("132");
        list.add("344");
        for (Object o : list) {
            
        }
        //变形：list.foi
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }
    public void method(){
        ArrayList list =  new ArrayList();
        list.add("132");
        list.add("344");

        //模板5：ifn
        if (list == null) {
            
        }
        //变形：inn
        if (list != null) {
            
        }
        //变形：xxx.nn / xxx.null
        if (list == null) {

        }
        if (list != null) {

        }
    }

}





