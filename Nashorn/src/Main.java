import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws Exception {

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval(new FileReader("D:\\GitLab-Razib\\Nashorn\\src\\script.js"));

        Invocable invocable = (Invocable) engine;
        Integer [] arr = new Integer[]{1,2};
        Integer [] arr2 = new Integer[]{10,20};
        Object[] params = {arr,arr2};
        Object result = invocable.invokeFunction("function2", params);
        System.out.println(result);
    }

}
