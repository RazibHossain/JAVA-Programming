import java.io.*;
import java.net.Socket;

public class MyClient {
    public static void main(String args[]){
        try {
            Socket socket = new Socket("localhost",5000);
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String message1 = "";
            String message2 = "";

            while (!message1.equals("stop")){
                message1 = bufferedReader.readLine();

                dataOutputStream.writeUTF(message1);
                dataOutputStream.flush();

                message2 = dataInputStream.readUTF();
                System.out.println("Server: "+ message2);

            }


//          dataOutputStream.flush();
          dataOutputStream.close();
          socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
