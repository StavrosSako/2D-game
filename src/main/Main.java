package  src.main; 

import javax.swing.JFrame; 


public class Main {
    public static void main(String[] args) {
        JFrame window= new JFrame(); 
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the window when you press the X button
        window.setResizable(false);
        window.setTitle("2D Andeventure"); 

        GamePanel gamePanel = new GamePanel(); 
        window.add(gamePanel); 
        window.pack(); //causes this window to fit the prefered size and layouts  of its (GamePanel) 


        window.setLocationRelativeTo(null); 
        window.setVisible(true); 

        gamePanel.startGameThread();

    }
    
}