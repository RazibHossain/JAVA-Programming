--------------------------------Java Networking----------------------------------------
Socket Programming

A socket is an endpoint between two way communications.
Java Socket programming is used for communication between the applications running on 
different JRE.

Socket and ServerSocket classes are used for connection-oriented socket programming
DatagramSocket and DatagramPacket classes are used for connection-less socket programming.

The Socket class is used to communicate client and server.

The ServerSocket class is used at server-side. The accept() method of ServerSocket class 
blocks the console until the client is connected. After the successful connection of client, 
it returns the instance of Socket 
at server-side.

