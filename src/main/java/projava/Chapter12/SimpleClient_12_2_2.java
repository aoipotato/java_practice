package projava.Chapter12;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleClient_12_2_2 {
    public static void main(String[] args) throws IOException {
        try (var soc = new Socket("localhost", 1700);
             OutputStream is = soc.getOutputStream()) {
            is.write(234);
        } catch (ConnectException e) {
            System.out.println("サーバーが起動していません");
        }
    }
}

