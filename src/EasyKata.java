import java.util.HashMap;
public class EasyKata {


        public static HashMap <String, String> getStatus(boolean isBusy) {
            HashMap<String, String> status;
            status = new HashMap<>();

            if (isBusy) {
                status.put("status", "busy");
            } else {
                status.put("status", "available");
            }

            return status;
        }

}
