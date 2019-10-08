package common.utils;

import java.util.HashMap;
import java.util.Map;

public class TopicMetadata {

    private Map<String, String> headers = new HashMap<>();
    private String serviceName;
    private String defaultBodyPath;


    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDefaultBodyPath() {
        return defaultBodyPath;
    }

    public void setDefaultBodyPath(String defaultBodyPath) {
        this.defaultBodyPath = defaultBodyPath;
    }


}
