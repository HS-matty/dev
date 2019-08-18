package Radmaster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NetClient {
    public NetClient() {
        super();
    }
    // http://localhost:8080/RESTfulExample/json/product/post
    //some stackoverflow..

    protected String QueryResultString = "test2";

    public void sendQueryTest() {
        this.QueryResultString = "test";

    }

    public String getQueryResult() {

        return this.QueryResultString;
    }


    public void sendQuery() {
        try {

            URL url = new URL("http://rest-server?test_query");
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");

            String input = "{\"qty\":100,\"name\":\"iPad 4\"}";

            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();

            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                throw new RuntimeException("Failed : HTTP error code : " +
                                           conn.getResponseCode());
            }

            BufferedReader br =
                new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }


}
