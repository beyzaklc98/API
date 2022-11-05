package utils;
import org.codehaus.jackson.map.ObjectMapper;
import java.io.IOException;
public class ObjectMapperUtils {
    //new ObjectMapper().readValue(jsonInString, HashMap.class)
    private static ObjectMapper mapper;
    static {
        mapper = new ObjectMapper();
    }
    public static <T> T convertJsonToJava(String json, Class<T> cls){
        T javaresult =null;
        try {
            javaresult= mapper.readValue(json,cls);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return javaresult;
    }
}