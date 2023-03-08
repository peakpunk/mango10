public class bouquet implements Runnable{
    public void run(){
        // constructor
        Turtle bill = new Turtle();
        bill.width(5);
        bill.speed(0.15);
        bill.penColor("white");

        Turtle buu = new Turtle(0,0);
        buu.width(5);
        buu.speed(0.15);
        buu.penColor("white");
    

        // method    
                bill.setPosition(0,0);
                buu.setPosition(0,0);
                for(int i=0;i<180;i++){
                    bill.left(1);
                    bill.forward(1);
                }
                for(int i=0;i<180;i++){
                    buu.right(1);
                    buu.forward(1);
                }
                bill.forward(213);
                buu.right(45);
                buu.forward(300);

            }
        }