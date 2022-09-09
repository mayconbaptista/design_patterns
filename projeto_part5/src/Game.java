import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel {

	private static final long serialVersionUID = 1L;
	private Inimigo inimigo1;
	private Inimigo inimigo2;
	private Inimigo inimigo3;
    private Avatar avatar;

    
    public Game() {
        KeyListener listener = new MyKeyListener();
        addKeyListener(listener);
        setFocusable(true); //So that the JPanel object receives the keyboard notifications it is necessary to include the instruction setFocusable(true), which allows KeyboardExample to receive the focus.
    }       
    
    public class MyKeyListener implements KeyListener {
        public void keyTyped(KeyEvent e) {}

        public void keyPressed(KeyEvent e) {
            //System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));

            if (e.getKeyCode() == KeyEvent.VK_LEFT)
            	avatar.setCord_x(avatar.getCord_x() - 10);
               
            if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            	avatar.setCord_x(avatar.getCord_x() + 10);
               
            if (e.getKeyCode() == KeyEvent.VK_UP)
            	avatar.setCord_y(avatar.getCord_y() - 10);
            
            if (e.getKeyCode() == KeyEvent.VK_DOWN)
               avatar.setCord_y(avatar.getCord_y() + 10);    
               
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            	avatar.atacando();
            }
               
        }

        public void keyReleased(KeyEvent e) {
            //System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
        }
}    
    
    public void paint(Graphics g) {
        super.paint(g); //The call to "super.paint(g)", cleans the screen 

        Graphics2D g2d = (Graphics2D) g;
        //The instruction; "g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)" makes the borders of the figures smoother

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.BLUE);
        g2d.fillOval(avatar.getCord_x(), avatar.getCord_y(), 30, 30);

        g2d.setColor(Color.GREEN);        
        g2d.fillOval(inimigo1.getCord_x(), inimigo1.getCord_y(), 20, 20);
        
        g2d.setColor(Color.BLACK);
        g2d.fillOval(inimigo2.getCord_x(), inimigo2.getCord_y(), 20, 20);
        
        g2d.setColor(Color.MAGENTA);
        g2d.fillOval(inimigo3.getCord_x(), inimigo3.getCord_y(), 20, 20);
    }

	public void jogar(Game game) throws InterruptedException {
	        
	        JFrame frame = new JFrame("Mortal Kombat");
	        frame.add(game);
	        frame.setSize(700, 700);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
	        
	       this.avatar = new Avatar (50, 50);
	       this.inimigo1 = new Inimigo (100,100);
	       this.inimigo2 = new Inimigo (150, 150);
	       this.inimigo3 = new Inimigo (200, 200);
	        
	       avatar.registraObservador(inimigo1);
	       avatar.registraObservador(inimigo2);
	       avatar.registraObservador(inimigo3);
	       
	        while (true) {
	            avatar.show();           
	            game.repaint();
	            Thread.sleep(60);
	      }
	}
	
	public void play (Game game) throws InterruptedException {
        int x = 1024;
        int y = 768;
        JFrame frame = new JFrame("Mortal Kombat");
        
        ImageIcon background = new ImageIcon("../src/campo.jpg");

        JLabel label = new JLabel();
        
        label.setBounds(0, 0, x, y);
        label.setIcon(background);

        game.setLayout(null);
        game.add(label);
        
        frame.add(game);
        frame.setSize(700, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        
       this.avatar = new Avatar (50, 50);
       this.inimigo1 = new Inimigo (100,100);
       this.inimigo2 = new Inimigo (150, 150);
       this.inimigo3 = new Inimigo (200, 200);
        
       avatar.registraObservador(inimigo1);
       avatar.registraObservador(inimigo2);
       avatar.registraObservador(inimigo3);
       
        while (true) {
            avatar.show();           
            game.repaint();
            Thread.sleep(60);
      }
    }
}

