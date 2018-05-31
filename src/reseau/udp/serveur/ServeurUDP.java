package reseau.udp.serveur;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ServeurUDP {

	public static void main(String[] args) {
		try {
			
			// ouvrir port 2222
			DatagramSocket server = new DatagramSocket(2222);
			
			// pr�paration tableau pour recevoir les donn�es
			byte[] buf = new byte[1024];
			DatagramPacket packetRecu = new DatagramPacket(buf, 1024);
			
			// attente packet d'un client
			server.receive(packetRecu);
			
			// r�cup�re adresse du client
			InetAddress adresseClient = packetRecu.getAddress();
			
			// r�cup�re port du client
			int portClient = packetRecu.getPort();
			
			// affiche le contenu du packet re�u
			System.out.println(packetRecu);
			
			// pr�paration packet de r�ponse
			byte[] buf1 = {1, 2, 3};			
			DatagramPacket packetEnvoye = new DatagramPacket(buf1, buf1.length, adresseClient, portClient);
			
			// envoi r�ponse
			server.send(packetEnvoye);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
