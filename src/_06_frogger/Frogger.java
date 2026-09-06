package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int frogX = 400;
    int frogY = 500;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	background(0, 0, 255);
    	fill(0, 255, 0);
    	ellipse(400, 500, 100, 100);
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
  
    public void keyPressed()	{
        if(key == CODED){
            if(keyCode == UP)
            {
                //Frog Y position goes up
            }
            else if(keyCode == DOWN)
            {
                //Frog Y position goes down 
            }
            else if(keyCode == RIGHT)
            {
                //Frog X position goes right
            }
            else if(keyCode == LEFT)
            {
                //Frog X position goes left
            }
        }
    
    }
}
