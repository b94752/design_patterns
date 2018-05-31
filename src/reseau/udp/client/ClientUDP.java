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
			
			// préparation packet à envoyer
			byte[] buf1 = {'a', 'b', 'c'};			
			InetAddress adresseServeur = InetAddress.getByName("localhost");
			int portServer = 2222;
			DatagramPacket packetEnvoye = new DatagramPacket(buf1, buf1.length, adresseServeur, portServer);
						
			// envoi demande au serveur
			client.send(packetEnvoye);
			
			System.out.println("Données envoyées : " + new String(buf1));
			
			// préparation tableau pour recevoir la réponse
			byte[] buf = new byte[1024];
			DatagramPacket packetRecu = new DatagramPacket(buf, 1024);
			
			// attente packet du serveur
			client.receive(packetRecu);
			
			// affiche le contenu du packet reçu
			System.out.println("Packet reçu : " + new String(packetRecu.getData()));
			System.out.println("Provenant du port : " + packetRecu.getPort());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
