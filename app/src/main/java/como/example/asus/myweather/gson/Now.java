package como.example.asus.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asus on 2017/9/17.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
