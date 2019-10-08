package collections;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    /**
     * Main difference between HashMap and LinkedHashMap is LinkedHashMap maintains insertion order of keys, order in which keys are inserted in to LinkedHashMap.
     * Permformance of HashMap and LinkedHashMap are similear also
     * LinkedHashMap actually extends HashMap and implements Map interface
     *
     * @param args
     */
    public static void main(String[] args) {
        Map<String, Object> person = new LinkedHashMap<>();
        Map<String, Object> filter = new LinkedHashMap<>();
        Map<String, Object> noTilde = new LinkedHashMap<>();
        person.put("~name", "Temirlan");
        person.put("~lastName", "Kochkorov");
        person.put("~age", 26);
        person.put("~address", "2116 Chilmark Ln");
        person.put("~zipCode", 60193);
        person.put("~state", "IL");
        person.put("~country", "United States");
        person.put("car", "Toyota Camry");
        try {
            person.forEach((k, v) -> {
                if (k.startsWith("~")) {
                    filter.put(k, v);
                } else {
                    noTilde.put(k, v);
                }
            });

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(filter.size());
        System.out.println(noTilde.size());
        String serviceName = "name=%s&lastName=%s&age=%s&address=%s&zipCode=%s&state=%s&country=%s";


        for (Map.Entry<String, Object> map : person.entrySet()) {
            System.out.println(map.getKey() + " is : " + map.getValue());
        }
    }
}
