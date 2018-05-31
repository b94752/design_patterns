package reseau.udp.client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;

public class ClientUDP {

	public static void main(String[] args) {
		
		try {
			
			// ouvrir port quelconque
			DatagramSocket client = new DatagramSocket();
			
			System.out.println("port ouvert : " + client.getLocalPort());
			
			// pr�paration packet � envoyer
			byte[] buf1 = {'a', 'b', 'c'};			
			InetAddress adresseServeur = InetAddress.getByName("localhost");
			int portServer = 2222;
			DatagramPacket packetEnvoye = new DatagramPacket(buf1, buf1.length, adresseServeur, portServer);
						
			// envoi demande au serveur
			client.send(packetEnvoye);
			
			System.out.println("Donn�es envoy�es : " + new String(buf1));
			
			// pr�paration tableau pour recevoir la r�ponse
			byte[] buf = new byte[1024];
			DatagramPacket packetRecu = new DatagramPacket(buf, 1024);
			
			// attente packet du serveur
			client.receive(packetRecu);
			
			// affiche le contenu du packet re�u
			System.out.println("Packet re�u : " + new String(packetRecu.getData()));
			System.out.println("Provenant du port : " + packetRecu.getPort());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
