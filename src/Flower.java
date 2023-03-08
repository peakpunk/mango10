public class Flower implements Runnable{

    // private final Turtle b = new Turtle();
    // private final String color;

    // public Flower(){
    //     this("white");
    // }
    // public Flower(String color){
    //     this(color,0,0);
    // }
    // public Flower(){

    // }
    
    public void run(){
        // constructor
        Turtle bob = new Turtle();
        bob.width(5);
        bob.speed(0.15);
        bob.penColor("red");

        Turtle big = new Turtle(0,0);
        big.width(5);
        big.speed(0.15);
        big.penColor("red");
    

        // method
                // Flower1
                bob.left(45);
                big.right(45);
                bob.forward(113);
                big.forward(113);
                for(int i=0;i<180;i++){
                    bob.right(1);
                    bob.forward(1);
                }
                for(int i=0;i<180;i++){
                    big.left(1);
                    big.forward(1);
                }
                bob.setPosition(0,0);
                big.setPosition(0,0);

                bob.left(47);
                bob.forward(113);
                big.right(47);
                big.forward(113);
                for(int i=0;i<180;i++){
                    bob.right(1);
                    bob.forward(1);
                }
                for(int i=0;i<180;i++){
                    big.left(1);
                    big.forward(1);
                }

                bob.setPosition(0,0);
                big.setPosition(0,0);
                // flower2
                bob.left(320);
                big.right(90);
                bob.forward(113);
                big.forward(113);
                for(int i=0;i<180;i++){
                    big.left(1);
                    big.forward(1);
                }
                for(int i=0;i<180;i++){
                    bob.left(1);
                    bob.forward(1);
                }
            }
        }
