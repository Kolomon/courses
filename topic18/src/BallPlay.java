import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

class BallPlay extends JFrame implements MouseListener {

    JPanel panel = new JPanel();
    int i;

    public BallPlay() {
        this.addMouseListener(this);

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        setLocationByPlatform(true);

        setBounds(0, 0, screenWidth, screenHeight);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        panel.setBounds(0, 0, screenWidth, screenHeight);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);
    }


    public static void main(String args[]){
        BallPlay frame = new BallPlay();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);
    }

    public void mouseClicked(MouseEvent event) {  // еще не реализовал появление шарика в указанном месте.
        if(event.getClickCount() == 1) {

            new BallThread(panel).start();
            i++;
            repaint();
        }
    }
    public void mousePressed(MouseEvent e) {
    }
    public void mouseReleased(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {
    }
}


class BallThread extends Thread{
    JPanel panel;
    private int posX, posY;
    private final int BALL_SIZE = new Random(System.currentTimeMillis()).nextInt(51 - 1) + 1;
    private double angle;
    private int SPEED = new Random(System.currentTimeMillis()).nextInt(21 - 1) + 1;
    private Color color;


    BallThread(JPanel p){
        this.panel = p;

        posX = (int)((panel.getWidth() - BALL_SIZE)* Math.random());
        posY = (int)((panel.getHeight() - BALL_SIZE)* Math.random());
        angle = Math.random();
        Random random = new Random();
        color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
    }

    public void run(){
        while(true){
            posX += (int)(SPEED * Math.cos(angle));
            posY += (int)(SPEED * Math.sin(angle));

            if(posX >= panel.getWidth() - BALL_SIZE)
                angle = angle + Math.PI - 2 * angle;
            else if(posX <= 0)
                angle = Math.PI - angle;
            if(posY >= panel.getHeight() - BALL_SIZE)
                angle = -angle;
            else if(posY <= 0)
                angle = -angle;
            paint(panel.getGraphics());
        }
    }

    public void paint(Graphics g){

        g.setColor(color);
        g.fillArc(posX, posY, BALL_SIZE, BALL_SIZE, 0, 360);
        g.setColor(Color.WHITE);
        g.drawArc(posX + 1, posY + 1, BALL_SIZE, BALL_SIZE, 120, 30);
        try{
            sleep(50);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        g.setColor(panel.getBackground());
        g.fillArc(posX, posY, BALL_SIZE, BALL_SIZE, 0, 360);
    }
}
