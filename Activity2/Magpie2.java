/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		String response = "";
		String statement1 = statement.trim();
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		}
		else if (statement1.length() == 0){
			System.out.println("Please say something!");
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";

		}
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0) {
			System.out.println("Tell me more about your pet");
		}
		else if (statement.indexOf("Mr. ") >= 0) {
			System.out.println("He sounds like a good teacher");
		}
		else if (statement.indexOf("Mrs. ") >= 0
				|| statement.indexOf("Ms. ") >= 0) {
			System.out.println("She sounds like a good teacher");
		}
		else if (statement.indexOf("Mx. ") >= 0
				|| statement.indexOf("Dr. ") >= 0) {
			System.out.println("They sound like a good teacher");
		}
		else if (statement.indexOf("Shut up") >= 0) {
			System.out.println(":(");
		}
		else if (statement.indexOf("sing") >= 0) {
			System.out.println("Ring around the Rosie, \n A pocket full of posies. \n Ashes! Ashes! \n We all fall down!");
		}
		else if (statement.indexOf("goodbye") >= 0 || statement.indexOf("bye") >= 0) {
			System.out.println("I'm lonely. Please don't leave me.");
		}
		else {
			response = getRandomResponse();
		}

		return response;
	}
	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "We should talk more often";
		}
		else if (whichResponse == 5)
		{
			response = "What's your number?";
		}
		else if (whichResponse == 6)
		{
			response = "Who? What? When? Where? Why?";
		}

		return response;
	}

}
