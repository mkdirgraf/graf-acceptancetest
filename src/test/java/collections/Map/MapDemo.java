package collections.Map;

import org.apache.commons.collections.map.LinkedMap;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Object> data = new LinkedMap();
        data.put("name", "Temirlan");
        data.put("lastName", "Kochkorov");
        data.put("age", 26);
        data.put("height", 6.0);
        data.put("citizen", "Global");
        data.put("motherLand", "Charbak");
        data.put("nationality", "mix");


        for (Map.Entry<String, Object> datas : data.entrySet()) {
            System.out.println(datas.getKey() + " is " + datas.getValue());
        }

        Set<Object> str = new LinkedHashSet<>();
        for (Map.Entry<String, Object> strss : data.entrySet()) {
            str.add(strss.getValue());
        }
        str.forEach(e-> System.out.println(e+" "));

        Object[] obj=data.values().toArray();
        String serviceName="firstName=%s&lastName=%s&age=%s&height=%s&citizen=%s&motherland=%s&nationality=%s";
        System.out.println(String.format(serviceName,obj));

        System.out.println(data.values());
        System.out.println(data.keySet());
    }
}
