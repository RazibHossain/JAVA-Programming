import java.io.*;
import java.net.*;
public class MyServer {
    public static void main(String[] args){
        try {

            ServerSocket serverSocket = new ServerSocket(5000);
            Socket socket = serverSocket.accept();

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String message1 = "";
            String message2 = "";
            while (!message1.equals("stop")){
                message1 = dataInputStream.readUTF();
                System.out.println("Client: "+ message1);
                message2 = bufferedReader.readLine();
                //data outputstream a server side console ja likha hoise ta read kore messgae2 te boshiye outputStream a write kora hoise
                dataOutputStream.writeUTF(message2);
                //output stream a value write korte force kore flush method
                dataOutputStream.flush();
            }
            dataInputStream.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}  