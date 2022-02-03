package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public abstract class Toy extends CartItem {
	public Toy() {
		if(new Random().nextBoolean()) {
			this.item = "toy1.jpeg";
		}
		else {
			this.item = "toy2.jpeg";
		}
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
