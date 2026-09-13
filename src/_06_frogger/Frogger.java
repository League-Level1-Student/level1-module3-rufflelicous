package _06_frogger;

import processing.core.PApplet;
// this is a change
public class Frogger extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int frogX = 400;
	int frogY = 500;

	class Car {
		int x, y, speed, size;

		Car(int x, int y, int speed, int size) {
			this.x = x;
			this.y = y;
			this.speed = speed;
			this.size = size;
		}

		void display() {

			fill(255, 0, 0);
			rect(x, y, 50, size);
		}

		void leftmove() {
			x -= speed;
			if (x <= -65) {
				x = 900;
			}
		}

		int getX() {
			return x;
		}

		int getY() {
			return y;
		}

		int getSize() {
			return size;
		}
	}

	boolean intersects(Car car) {
		if ((frogY > car.getY() && frogY < car.getY() + 50)
				&& (frogX > car.getX() && frogX < car.getX() + car.getSize())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	Car one = new Car(750, 20, 4, 60);
	Car two = new Car(750, 100, 6, 60);
	Car three = new Car(750, 180, 5, 60);
	Car four = new Car(400, 20, 4, 60);
	Car five = new Car(600, 100, 6, 60);
	Car six = new Car(300, 100, 6, 60);

	@Override
	public void setup() {

	}

	@Override
	public void draw() {
		background(0, 0, 255);
		fill(0, 255, 0);
		ellipse(frogX, frogY, 50, 50);
		one.display();
		one.leftmove();
		two.display();
		two.leftmove();
		three.display();
		three.leftmove();
		four.display();
		four.leftmove();
		five.display();
		five.leftmove();
		six.display();
		six.leftmove();
		if(intersects(one)) {
			System.exit(0);
		}
		else if(intersects(two)) {
			System.exit(0);
		}
		else if(intersects(three)) {
			System.exit(0);
		}
		else if(intersects(four)) {
			System.exit(0);
		}
		else if(intersects(five)) {
			System.exit(0);
		}
		else if(intersects(six)) {
			System.exit(0);
		}
	}
	// 

	static public void main(String[] args) {
		PApplet.main(Frogger.class.getName());
	}

	public void keyPressed() {
		if (key == CODED) {
			if (keyCode == UP) {
				frogY -= 40;
			} else if (keyCode == DOWN) {
				frogY += 40;
			} else if (keyCode == RIGHT) {
				frogX += 40;
			} else if (keyCode == LEFT) {
				frogX -= 40;
			}
		}

	}
}
