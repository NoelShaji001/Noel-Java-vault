
import java.util.Scanner;

interface Media {
	void play();
	void stop();
	default void pause() {System.out.println("Media Paused");}
	static void about() {System.out.println("This is a Media Interface");} 
	}
interface AdvMedia extends Media{
	void nextTrack();
	
}
 class musicplayer implements AdvMedia{
	public void play() {
		System.out.println("Playing......\"Into Your Arms\" by Witt Lowry (ft.Ava Max) ");
	}
	public void stop() {System.out.println("Stopping the music......");}
	public void nextTrack() {
		System.out.println("Please choose following songs to play....");
		System.out.println("\n1)Can You Hear The Music by Ludvig Gorransson\n2)Havana by Camila Cabello\n3)Believer by Imagine Dragons\n4)Cold by Maroon 5");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Playing......Cam You Hear The Music by Ludvig Gorransson\n");break;
			case 2:System.out.println
		}
		
			
				
			}
		}
 
public class MusicPlayer {

}
