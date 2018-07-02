package gentasoft.com.okcong;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import gentasoft.com.okkacong.Kacong;
import gentasoft.com.okkacong.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Kacong.build("https://google.com").get(this, new Response() {
            @Override
            public void response(String response, int statusCode) {
                Log.d("myresponse "+statusCode, "response: "+response);
            }
        });
    }
}
