package gentasoft.com.okkacong;

public interface Response {
    int SUCCESS = 200;//wen success request
    int FAILED = 401;//when request not complete
    int ERROR = 500;//when connection error or server not response
    int EMPTY_URL = 404;//when URL missing

    void response(String response,int statusCode);
}
