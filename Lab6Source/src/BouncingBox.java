import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

public class BouncingBox extends JComponent {

	private ArrayList<BouncingFigure> figures = new ArrayList<BouncingFigure>();

	public void add(BouncingFigure f) {
		figures.add(f);
	}

	public void paintComponent(Graphics g) {
		for (BouncingFigure f : figures) {
			f.draw(g); f.move();
			if (f.rightBorderCollision(600) == true) {
				if (f.getTrajectory() < 90) {
					f.setTrajectory(f.getTrajectory()-90);
				}
				else {
					f.setTrajectory(f.getTrajectory()-90);
				}
				System.out.println(f.getTrajectory());
			}
			if (f.leftBorderCollision() == true) {
				if (f.getTrajectory() < 180) {
					f.setTrajectory(f.getTrajectory()-90);
				}
				else {
					f.setTrajectory(f.getTrajectory()+90);
				}
			}
			if (f.upperBorderCollision() == true) {
				if (f.getTrajectory() < 90) {
					f.setTrajectory(f.getTrajectory()+270);
				}
				else {
					f.setTrajectory(f.getTrajectory()+90);
				}
				System.out.println(f.getTrajectory());
			}
			if (f.lowerBorderCollision(600) == true) {
				if (f.getTrajectory() < 270) {
					f.setTrajectory(f.getTrajectory()-90);
				}
				else {
					f.setTrajectory(f.getTrajectory()+90);
				}
				System.out.println(f.getTrajectory());
			}
			
			// Add code here for Lab Q5
			//
		}
	}
}
