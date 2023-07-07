package ua.javarush.task.jdk13.task40.task4002;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class UdpClient {

    private final DatagramSocket socket;
    private final InetAddress serverAddress;
    private final int serverPort;

    public UdpClient(int port) throws IOException {
        socket = new DatagramSocket(port);
        serverAddress = InetAddress.getByName("localhost");
        serverPort = 4445;
    }

    public String sendReceive(String message) throws IOException {
        byte[] buff = message.getBytes(StandardCharsets.UTF_8);
        DatagramPacket packet = new DatagramPacket(buff, buff.length, serverAddress, serverPort);
        socket.send(packet);

        byte[] buffReceive = new byte[1024];
        DatagramPacket packetReceived = new DatagramPacket(buffReceive, buffReceive.length);
        socket.receive(packetReceived);
        return new String(packetReceived.getData(), 0, packetReceived.getLength());
    }

    public void close() {
        socket.close();
    }
}
