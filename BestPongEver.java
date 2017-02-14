
import java.util.Random;
public class BestPongEver{
	public static void main(String[] args){
		GameArena newGame = new GameArena(1000,400);
		Ball newBall = new Ball(500,200,20,"#75ED16");
		Rectangle newRectangle1 = new Rectangle (20, 200, 25, 100, "GREY");
		Rectangle newRectangle2 = new Rectangle (980, 200, 25, 100, "GREY");
		
		newGame.addRectangle(newRectangle1);
		newGame.addRectangle(newRectangle2);
		
		newGame.addBall(newBall);
		Random r = new Random();
		int low = -20;
		int high = 20;
		int xmove = 10;
		int ymove = 5;		
		while (true){
			newGame.pause();
			double x = newBall.getXPosition();
			if (x>= 990){
				xmove = xmove - (xmove * 2);
			}
			if (x<= 10){
				xmove = xmove + (xmove * -2);
			}
			newBall.setXPosition(x+xmove);
			
			double y = newBall.getYPosition();
			if (y>= 390){
				ymove = ymove - (ymove * 2);
			}
			if (y<= 10){
				ymove = ymove + (ymove * -2);
			}
			newBall.setYPosition(y+ymove);
		}
		
		
		

	}
}

