import javax.swing.JFrame;

public class BouncingFiguresTester {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		JFrame frame= new JFrame();
		frame.setTitle("Mr Fresh Window");
		frame.setSize(600, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create a box to put all objects in
		BouncingBox box = new BouncingBox();

		// Add all the components to the box
		BouncingFigure square1 = new BouncingRectangle(0, 0, 10, 10, 325.0, 100);
		box.add(square1);
		BouncingFigure square2 = new BouncingRectangle(0, 500, 20, 20, 45.0, 50);
		box.add(square2);
		BouncingFigure square3 = new BouncingRectangle(200, 400, 25, 25, 120.0, 150);
		box.add(square3);
		BouncingFigure circle1 = new BouncingCircle(200, 400, 25, 25, 330.0, 150);
		box.add(circle1);
		BouncingFigure circle2 = new BouncingCircle(250, 50, 40, 40, 50.0, 100);
		box.add(circle2);
		BouncingFigure circle3 = new BouncingCircle(90, 300, 30, 30, 220.0, 200);
		box.add(circle3);

		frame.add(box);

		// Make the frame visible
		frame.setVisible(true);

		// Continuously update the frame since some components will change position
		while(true) {
			try{
				Thread.sleep(100); // Wait for 0.1 second = 100 milliseconds
			}
			catch(InterruptedException e){}

			frame.repaint();

		} // end while

	}//end main

}//end class
