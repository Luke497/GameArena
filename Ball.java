/**
 * Balls
 * Models a simple solid sphere.
 * This class represents a Ball object. When combined with the GameArena class,
 * instances of the Ball class can be displayed on the screen.
 */
public class Ball
{
	// The following instance variables define the
	// information needed to represent a Ball
	// Feel free to more instance variables if you think it will
	// support your work...

	private double xPosition;			// The X coordinate of this Ball
	private double yPosition;			// The Y coordinate of this Ball
	private double size;				// The diameter of this Ball
	private String colour = "WHITE";	// The colour of this Ball
  private double xVelocity;
  private double yVelocity;

<<<<<<< HEAD
=======

>>>>>>> 049903236fdeabe7e192f1487b0f38cb1eb502f4
										// Permissable colours are 8 bit hexadecimal
                                        // RGB values in the format #RRGGBB. e.g.
                                        //
                                        // Pure red is FF0000
                                        // Pure red is 00FF00
                                        // Pure red is 0000FF

/**
 * Obtains the current speed of ths Ball.
 *@return the speed of this Ball within the GameArena
 */
<<<<<<< HEAD
 public double getSpeed()
 {
	 return speed;
 }
=======
>>>>>>> 049903236fdeabe7e192f1487b0f38cb1eb502f4

	/**
	 * Obtains the current position of this Ball.
	 * @return the X coordinate of this Ball within the GameArena.
	 */
	public double getXPosition()
	{
		return xPosition;
	}

	/**
	 * Obtains the current position of this Ball.
	 * @return the Y coordinate of this Ball within the GameArena.
	 */
	public double getYPosition()
	{
		return yPosition;
	}

	/**
	 * Moves the current position of this Ball to the given co-ordinates
	 * @param x the new x co-ordinate of this Ball
	 */
	public void setXPosition(double x)
	{
		this.xPosition = x;
	}

	/**
	 * Moves the current position of this Ball to the given co-ordinates
	 * @param y the new y co-ordinate of this Ball
	 */
	public void setYPosition(double y)
	{
		this.yPosition = y;
	}

	/**
	 * Obtains the size of this Ball.
	 * @return the diameter of this Ball,in pixels.
	 */
	public double getSize()
	{
		return size;
	}

	/**
	 * Obtains the colour of this Ball.
	 * @return a textual description of the colour of this Ball.
	 */
	public String getColour()
	{
		return colour;
	}


	public Ball(double x, double y, double diameter, String col)
	{
		xPosition = x;
		yPosition = y;

		size = diameter;
		colour = col;
	}
}
