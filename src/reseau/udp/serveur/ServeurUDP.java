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
			
			// préparation tableau pour recevoir les données
			byte[] buf = new byte[1024];
			DatagramPacket packetRecu = new DatagramPacket(buf, 1024);
			
			// attente packet d'un client
			server.receive(packetRecu);
			
			// récupère adresse du client
			InetAddress adresseClient = packetRecu.getAddress();
			
			// récupère port du client
			int portClient = packetRecu.getPort();
			
			// affiche le contenu du packet reçu
			System.out.println(packetRecu);
			
			// préparation packet de réponse
			byte[] buf1 = {1, 2, 3};			
			DatagramPacket packetEnvoye = new DatagramPacket(buf1, buf1.length, adresseClient, portClient);
			
			// envoi réponse
			server.send(packetEnvoye);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
