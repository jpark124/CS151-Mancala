import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame extends JFrame
{
	public MyFrame()
	{
		this.setLayout(new BorderLayout());
		this.add(new MyBoard(), BorderLayout.CENTER);
		this.setSize(500, 300);
		
		JButton newGame = new JButton("New Game");
		JButton undo = new JButton("Undo");
		JButton endTurn = new JButton("End Turn");
		JPanel panel = new JPanel(new GridLayout(1, 3));
		
		newGame.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				//create a new game
				
			}
		});
		
		undo.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				//undo the move
				
			}
		});
		
		endTurn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				//end turn here
			}
		});
		
		panel.add(newGame);
		panel.add(undo);
		panel.add(endTurn);
		
		this.add(panel, BorderLayout.NORTH);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}