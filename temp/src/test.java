
import javafx.util.converter.LocalDateTimeStringConverter;
import org.apache.commons.lang3.StringUtils;

import javax.swing.text.html.Option;
import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: Lidongyang
 * @Date: 2022/01/15/13:33
 * @Description:
 */
public class test {


//    public static void main(String[] args) {
//
////1.将数据收集进一个列表(Stream 转换为 List，允许重复值，有顺序)
////创建流
//        Stream<String> language = Stream.of("java", "python", "C++","php","java");
//        List<String> listResult = language.collect(Collectors.toList());
//        listResult.forEach(System.out :: println);
//
//    }


    public static void main(String[] args) {
//        List<Pserson> scItemList = Arrays.asList(new Pserson("1"), new Pserson("2"),new Pserson("6"), new Pserson("3"));
//        List<String> createIdList = scItemList.stream().map(Pserson::getName).collect(Collectors.toList());
//
//        for (int i = 0; i < createIdList.size(); i++) {
//            System.out.println(createIdList.get(i));
//        }


//        Son<String> stringSon = new Son<>();

//        stringSon.setEvery(Arrays.asList("string","12","3434"));



//        Son<Integer> integerSon = new Son<>();
//        integerSon.setEvery(Arrays.asList(2,33,5));
//
////        integerSon.getEvery().forEach(a-> test.add(a));
//
//        HashMap<String, String> map = new HashMap<>();
//        map.put("11","12");
//        map.put("13","14");
//        map.put("15","16");
//        map.put("17","18");
//        map.put("19","20");
//
//        map.forEach((k,v)-> System.out.println(k+"===="+v));
//
//
//        List<String> strings = Arrays.asList(new String("类型统一"), new String("类型统一"), new String("类型统一"));
//        strings.forEach(a -> System.out.println(a));


//        LocalDateTime localDateTime =  LocalDateTime.of(2011,12,23,12,20,00);

//        System.out.println(localDateTime);

//        LocalDateTime parse = LocalDateTime.parse("2022-11-20T12:12:00");
//        System.out.println(parse);
//
//        System.out.println(LocalDate.parse("2023-11-02"));

//        System.out.println("当前时间"+LocalDateTime.now());
//        System.out.println("当前月份"+LocalDateTime.now().getMonthValue());
//        System.out.println("当前几号"+LocalDateTime.now().getDayOfMonth());
//        System.out.println("当前星期几"+LocalDateTime.now().getDayOfWeek().getValue());
//        System.out.println("当前星期几"+LocalDateTime.now().getSecond());


//        List<Integer> integers = Arrays.asList(3, 444, 55, 4, 4, 3, 4, 4, 4, 4);
//
//
//        List<Integer> collect = integers.stream().distinct().sorted().collect(Collectors.toList());
//        collect.forEach(item -> System.out.println(item));




        //根据id升序降序

//        List<Person> people = Arrays.asList(new Person("张三", 11, 44),
//                new Person("张三", 12, 44),
//                new Person("张三", 15, 44),
//                new Person("张三", 14, 44));
//
//
//        people.forEach(i -> System.out.println(i.getAge()));
//
//        people.sort((a,b)-> b.getAge().compareTo(a.getAge()));
//
//        System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
//        people.forEach(i -> System.out.println(i.getAge()));
//
//
//        Integer a =9;
//        Integer b =90;
//        Integer c =9;
//
//
//        System.out.println("compareTo大于返回"+b.compareTo(a));
//        System.out.println("compareTo小于返回"+a.compareTo(b));
//        System.out.println("compareTo等于返回"+a.compareTo(c));


//        SimpleDateFormat dateFormat1 = new SimpleDateFormat("YYYY-MM-dd");
//        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
//
//
//
//        try {
//            Calendar instance = Calendar.getInstance();
//            instance.set(Calendar.YEAR,2021);
//            instance.set(Calendar.MONTH,11);
//            instance.set(Calendar.DATE,26);
//            System.out.println(dateFormat1.format(instance.getTime()));
//            System.out.println(dateFormat2.format(instance.getTime()));
//        }catch (Exception e){
//            System.out.println("日期格式化错误");
//        }


//        System.out.println(Integer.MAX_VALUE);



//        Optional optional = new Option();









        String a = "   ";
        String b = "kkk";
        System.out.println("当字符串为空的时候"+StringUtils.isBlank(a));
        System.out.println("当字符串不为空的时候"+StringUtils.isBlank(b));


    }


    public static void add(int num){
        System.out.println(num*100);
    }
}
