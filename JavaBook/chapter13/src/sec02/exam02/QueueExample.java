package sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "Gildong, Hong"));
		messageQueue.offer(new Message("sendSocialMedia", "Yushin, Kim"));
		messageQueue.offer(new Message("sendKakaotalk", "Anonymous"));
		
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			
			switch (message.command) {
				case "sendMail" :
					System.out.println("Send a mail to " + message.to);
					break;
				
				case "sendSocialMedia" :
					System.out.println("Send social media to " + message.to);
					break;
					
				case "sendKakaotalk" :
					System.out.println("Send kakaotalk to " + message.to);
					break;
			}
		}
	}
}
