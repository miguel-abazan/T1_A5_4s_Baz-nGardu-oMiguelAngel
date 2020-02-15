import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

class CalculadoraWdws extends JFrame{
	JMenuBar menuBar;
	JMenu menuInicio, menuHistorial;
	JMenuItem menuItemCalcSencilla, menuItemCalcCientifica, menuItemCalcProgramador;
	
	JInternalFrame IF_CalcSencilla, IF_CalcCientifica, IF_CalcProgramador;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnmas,btnmm,btnQ,btnC,
	        btnmenos,btnpor,btndiv,btnciento,btnCE,btnPun,btnigual,btnRaiz,btnPo,btnBo;
	JTextField panTalla;
	
	
	public CalculadoraWdws() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("    Calculadora    ");
		setSize(250, 543);
		setLocationRelativeTo(null);
		setVisible(true);
		
		menuBar = new JMenuBar();
		menuInicio = new JMenu("Calculadoras");
		menuItemCalcCientifica = new JMenuItem("Científica");
		menuItemCalcCientifica.setMnemonic(KeyEvent.VK_C);
		menuItemCalcCientifica.setAccelerator(
				KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
				//menuItemCalcSencilla.setIcon(new Image());
		menuItemCalcCientifica.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						IF_CalcCientifica.setVisible(true);
					}
				});
		
			menuInicio.add(menuItemCalcCientifica);
			
			
			menuItemCalcProgramador = new JMenuItem("Programador");
			menuItemCalcProgramador.setMnemonic(KeyEvent.VK_P);
			menuItemCalcProgramador.setAccelerator(
					KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
					//menuItemCalcSencilla.setIcon(new Image());
			menuItemCalcProgramador.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							IF_CalcProgramador.setVisible(true);
						}
					});
					
			menuInicio.add(menuItemCalcProgramador);
		menuBar.add(menuInicio);
		
		menuHistorial = new JMenu("Historial");
		menuBar.add(menuHistorial, BorderLayout.EAST);
	setJMenuBar(menuBar);
	
	JDesktopPane desktopPane = new JDesktopPane();
	
	
	//Cientifica
	IF_CalcCientifica = new JInternalFrame();
	IF_CalcCientifica.getContentPane().setLayout(null);
	IF_CalcCientifica.setDefaultCloseOperation(HIDE_ON_CLOSE);
	IF_CalcCientifica.setTitle("Calculadora Científica");
	IF_CalcCientifica.setSize(300, 400);
		
	IF_CalcCientifica.setMaximizable(true);
	IF_CalcCientifica.setIconifiable(true);
	IF_CalcCientifica.setClosable(true);
	IF_CalcCientifica.setResizable(true);

		
	
		JPanel panelCalculadora = new JPanel();
			panelCalculadora.add(new JLabel("Calculadora Programador"));
			JTextField cajaMantisa = new JTextField(10);
			panelCalculadora.add(cajaMantisa);
			panelCalculadora.setBounds(1,0, 10, 10);
			IF_CalcCientifica.add(panelCalculadora);
		
	desktopPane.add(IF_CalcCientifica);
	
	add(desktopPane, BorderLayout.CENTER); 
	///Cientifica
	
	//Programador
	IF_CalcProgramador = new JInternalFrame();
	IF_CalcProgramador.getContentPane().setLayout(null);
	IF_CalcProgramador.setDefaultCloseOperation(HIDE_ON_CLOSE);
	IF_CalcProgramador.setTitle("Calculadora Programador");
	IF_CalcProgramador.setSize(300, 400);
		
	IF_CalcProgramador.setMaximizable(true);
	IF_CalcProgramador.setIconifiable(true);
	IF_CalcProgramador.setClosable(true);
	IF_CalcProgramador.setResizable(true);

		
	
		JPanel panelCalculadora1 = new JPanel();
			panelCalculadora1.add(new JLabel("Calculadora SENCILLA"));
			JTextField cajaMantisa1 = new JTextField(10);
			panelCalculadora.add(cajaMantisa1);
			panelCalculadora.setBounds(1,0, 100, 100);
			IF_CalcProgramador.add(panelCalculadora1);
		
	desktopPane.add(IF_CalcProgramador);
	
	add(desktopPane, BorderLayout.CENTER); 
	
	//barra 0
	btnmm= new JButton("+/-") ;
	btnmm.setBackground(Color.WHITE);
	btnmm.setBounds(10, 405, 50, 50);
	add(btnmm);
	
	btn0= new JButton("0");
	btn0.setBackground(Color.WHITE);
	btn0.setBounds(65, 405, 50, 50);
	add(btn0);
	
	btnigual= new JButton("=");
	btnigual.setBackground(Color.WHITE);
	btnigual.setBounds(120, 405, 50, 50);
	add(btnigual);
	
	btnPun= new JButton(".");
	btnPun.setBackground(Color.WHITE);
	btnPun.setBounds(175, 405, 50, 50);
	add(btnPun);
	
	
	//Barra1
	btn1= new JButton("1");
	btn1.setBackground(Color.WHITE);
	btn1.setBounds(10, 350, 50, 50);
	add(btn1);
	
	btn2= new JButton("2");
	btn2.setBackground(Color.WHITE);
	btn2.setBounds(65, 350, 50, 50);
	add(btn2);
	
	btn3= new JButton("3");
	btn3.setBackground(Color.WHITE);
	btn3.setBounds(120, 350, 50, 50);
	add(btn3);
	
	btnmas= new JButton("+");
	btnmas.setBackground(Color.WHITE);
	btnmas.setBounds(175, 350, 50, 50);
	add(btnmas);
	
	//Barra 2
	btn4= new JButton("4");
	btn4.setBackground(Color.WHITE);
	btn4.setBounds(10, 295, 50, 50);
	add(btn4);
	btn5= new JButton("5");
	btn5.setBackground(Color.WHITE);
	btn5.setBounds(65, 295, 50, 50);
	add(btn5);
	btn6= new JButton("6");
	btn6.setBackground(Color.WHITE);
	btn6.setBounds(120, 295, 50, 50);
	add(btn6);
	btnmenos= new JButton("-");
	btnmenos.setBackground(Color.WHITE);
	btnmenos.setBounds(175, 295, 50, 50);
	add(btnmenos);
	
	//Barra 3 
	btn7= new JButton("7");
	btn7.setBackground(Color.WHITE);
	btn7.setBounds(10, 240, 50, 50);
	add(btn7);
	btn8= new JButton("8");
	btn8.setBackground(Color.WHITE);
	btn8.setBounds(65, 240, 50, 50);
	add(btn8);
	btn9= new JButton("9");
	btn9.setBackground(Color.WHITE);
	btn9.setBounds(120, 240, 50, 50);
	add(btn9);
	
	btnpor= new JButton("X");
	btnpor.setBackground(Color.WHITE);
	btnpor.setBounds(175, 240, 50, 50);
	add(btnpor);
	
	//Barra 4
	btndiv= new JButton("/");
	btndiv.setBackground(Color.WHITE);
	btndiv.setBounds(175, 185, 50, 50);
	add(btndiv);
	
	btnPo= new JButton("^") ;
	btnPo.setBackground(Color.WHITE);
	btnPo.setBounds(65, 185, 50, 50);
	add(btnPo);
	btnRaiz= new JButton("r");
	btnRaiz.setBackground(Color.WHITE);
	btnRaiz.setBounds(120, 185, 50, 50);
	add(btnRaiz);
	btnQ= new JButton("1/x") ;
	btnQ.setBackground(Color.WHITE);
	btnQ.setBounds(6, 185, 55, 50);
	add(btnQ);
	//Barra5
	btnciento= new JButton("%");
	btnciento.setBackground(Color.WHITE);
	btnciento.setBounds(10, 130, 50, 50);
	add(btnciento);
	
	
	btnBo= new JButton("<--") ;
	btnBo.setBackground(Color.WHITE);
	btnBo.setBounds(175, 130, 50, 50);
	add(btnBo);
	
	btnCE= new JButton("CE");
	btnCE.setBackground(Color.WHITE);
	btnCE.setBounds(65, 130, 50, 50);
	add(btnCE);
	
	btnC= new JButton("C");
	btnC.setBackground(Color.WHITE);
	btnC.setBounds(120, 130, 50, 50);
	add(btnC);
	
	
	
	panTalla = new JTextField("0",175);
	panTalla.setBounds(10, 50, 215, 20);
	add(panTalla);

	}
	
	
	
}
public class Prueba {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new CalculadoraWdws();
			}
		});
		// TODO Auto-generated method stub

	}

}
