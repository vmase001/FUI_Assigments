import java.util.*;

public class TreasureHunting {
  	static int prevX, prevY, nowX, nowY, trueX, trueY;
  	static final int CLOSE = 3;
  	static final int FAR = 6;
  	
  	/**
     * initial message
     */
  	public static void openingMessage()
    {
    	System.out.print(
          	"#######################################################\n"
		  +	"# A treasure has been hidden at a location in a 10x10 #\n"
		  +	"# grid. Guess where it is. You have 10 chances.       #\n"
          + "#######################################################\n"
        );
    }
    /**
     * checking the distance

