package gentasoft.com.okkacong;

import android.app.Activity;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Kacong {
    private static OkHttpClient client = new OkHttpClient();
    private static Kacong kacong = new Kacong();
    private static String MY_URL = "";


    public static Kacong build(String URL) {
        MY_URL = URL;
        return kacong;
    }

    public void get(final Activity activity, Request request, final Response myresponse) {
        client
                .newCall(request)
                .enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, final IOException e) {
                        activity.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                myresponse.response(e.getMessage(), 500);
                            }
                        });
                    }

                    @Override
                    public void onResponse(Call call, final okhttp3.Response response) throws IOException {
                        final String res = response.body().string();
                        activity.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                myresponse.response(res, response.code());
                            }
                        });
                    }
                });
    }

    public void get(final Activity activity, final Response myresponse) {
        Request request = new Request.Builder().url(MY_URL).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, final IOException e) {
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        myresponse.response(e.getMessage(), 500);
                    }
                });
            }

            @Override
            public void onResponse(Call call, final okhttp3.Response response) throws IOException {
                final String myres = response.body().string();
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        myresponse.response(myres, response.code());
                    }
                });
            }
        });
    }

    public void post(final Activity activity, RequestBody body, final Response myresponse) {
        Request request = new Request.Builder().url(MY_URL).post(body).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, final IOException e) {
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        myresponse.response(e.getMessage(), 500);
                    }
                });
            }

            @Override
            public void onResponse(Call call, final okhttp3.Response response) throws IOException {
                final String myres = response.body().string();
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        myresponse.response(myres, response.code());
                    }
                });
            }
        });
    }

    public void post(final Activity activity, Request request, final Response myresponse) {
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, final IOException e) {
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        myresponse.response(e.getMessage(), 500);
                    }
                });
            }

            @Override
            public void onResponse(Call call, final okhttp3.Response response) throws IOException {
                final String myres = response.body().string();
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        myresponse.response(myres, response.code());
                    }
                });
            }
        });
    }
}
