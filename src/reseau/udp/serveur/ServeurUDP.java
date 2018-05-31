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
			
			System.out.println("port ouvert : " + server.getLocalPort());
			
			// préparation tableau pour recevoir les données
			byte[] buf = new byte[1024];
			DatagramPacket packetRecu = new DatagramPacket(buf, 1024);
			
			System.out.println("Attente packet");

			// attente packet d'un client
			server.receive(packetRecu);
			
			// récupère adresse du client
			InetAddress adresseClient = packetRecu.getAddress();
			
			// récupère port du client
			int portClient = packetRecu.getPort();
			
			// affiche le contenu du packet reçu
			System.out.println("Packet reçu : " + new String(packetRecu.getData()));
			System.out.println("Provenant du port : " + portClient);

			// préparation packet de réponse
			byte[] buf1 = {'d', 'e', 'f'};			
			DatagramPacket packetEnvoye = new DatagramPacket(buf1, buf1.length, adresseClient, portClient);
			
			// envoi réponse
			server.send(packetEnvoye);
			
			System.out.println("Réponse envoyée : " + new String(buf1));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
