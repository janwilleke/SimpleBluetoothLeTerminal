package de.kai_morich.simple_bluetooth_le_terminal;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;

public class WebSockServer extends WebSocketServer {

public WebSockServer(int port) {
    super(new InetSocketAddress("127.0.0.1", port));
}
public void report(String s){

}
@Override
public void onStart(){
    report("start");
}
@Override
public void onClose(WebSocket arg0, int arg1, String arg2, boolean arg3) {
    // TODO Auto-generated method stub
}

@Override
public void onError(WebSocket arg0, Exception arg1) {
    // TODO Auto-generated method stub
    report(arg1.getStackTrace().toString());

}

@Override
public void onMessage(WebSocket arg0, String arg1) {
    // TODO Auto-generated method stub
    report(arg1);
}

@Override
public void onOpen(WebSocket arg0, ClientHandshake arg1) {
    // TODO Auto-generated method stub

    report("new connection to " + arg0.getRemoteSocketAddress());
}
}
