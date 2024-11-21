package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel{

	private JLabel label_n1;
	private JLabel label_n2;
	private JTextField campo_n1;
	private JTextField campo_n2;
	private JLabel label_n3;
	private JLabel label_n4;
	private JTextField campo_n3;
	private JTextField campo_n4;
	private JLabel label_n5;
	private JLabel label_n6;
	private JTextField campo_n5;
	private JTextField campo_n6;
	private JLabel campo_n7;
	private JLabel labelImagen;
	private JLabel labelImagen1;
	private JLabel labelImagen2;
	private JLabel labelImagen3;
	
	private JLabel label_n11;
	private JLabel label_n22;
	private JTextField campo_n11;
	private JTextField campo_n22;
	private JLabel label_n33;
	private JLabel label_n44;
	private JTextField campo_n33;
	private JTextField campo_n44;
	private JLabel label_n55;
	private JLabel label_n66;
	private JTextField campo_n55;
	private JTextField campo_n66;
	
	private JLabel label_n112;
	private JLabel label_n222;
	private JTextField campo_n112;
	private JTextField campo_n222;
	private JLabel label_n332;
	private JLabel label_n442;
	private JTextField campo_n332;
	private JTextField campo_n442;
	private JLabel label_n552;
	private JLabel label_n662;
	private JTextField campo_n552;
	private JTextField campo_n662;
	
	private JLabel label_n1122;
	private JLabel label_n2222;
	private JTextField campo_n1122;
	private JTextField campo_n2222;
	private JLabel label_n3322;
	private JLabel label_n4422;
	private JTextField campo_n3322;
	private JTextField campo_n4422;
	private JLabel label_n5522;
	private JLabel label_n6622;
	private JTextField campo_n5522;
	private JTextField campo_n6622;
	
	
	public JButton botonAbastecer;
	public JButton botonVender;
	public JButton botonCambiar;
	
	private JButton botonAbastecer1;
	private JButton botonVender1;
	private JButton botonCambiar1;
	
	private JButton botonAbastecer2;
	private JButton botonVender2;
	private JButton botonCambiar2;
	
	private JButton botonAbastecer3;
	private JButton botonVender3;
	private JButton botonCambiar3;
	
	public PanelDatos() {
		JPanel panelAux_I = new JPanel();
		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		GridLayout or = new GridLayout(1,3);
		panelAux_I.setLayout(or);
		
		
		JPanel panelAux_A = new JPanel();
		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		GridLayout ar = new GridLayout(1,3);
		panelAux_A.setLayout(ar);
		
		
		JPanel panelAux_N = new JPanel();
		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		GridLayout nr = new GridLayout(1,3);
		panelAux_N.setLayout(nr);
	
		
		JPanel panelAux_P = new JPanel();
		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		GridLayout pr = new GridLayout(1,3);
		panelAux_P.setLayout(pr);
	
		JPanel panelImagen = new JPanel();
		FlowLayout nll = new FlowLayout();
		panelImagen.setLayout(nll);

		JPanel panelGeneral = new JPanel();
		GridLayout nl = new GridLayout(2,2);
		panelGeneral.setLayout(nl);
		//Panel Auxiliar para que los elementos se distribuyan como diseñamos
		JPanel panelAux_Naranja = new JPanel();
		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		ImageIcon image = new ImageIcon("./data/Lapiz.png");
		labelImagen = new JLabel(image);
		ImageIcon image1 = new ImageIcon("./data/Pila.png");
		labelImagen1 = new JLabel(image1);
		ImageIcon image2 = new ImageIcon("./data/Borrador.png");
		labelImagen2 = new JLabel(image2);
		ImageIcon image3 = new ImageIcon("./data/Pan.png");
		labelImagen3 = new JLabel(image3);
		
		GridLayout gl = new GridLayout(7,3);
		panelAux_Naranja.setLayout(gl);
		label_n1 = new JLabel("Tipo:");
		campo_n1 = new JTextField("Papeleria");
		label_n2 = new JLabel("Cantidad bodega: ");
		campo_n2 = new JTextField("18");
		label_n3 = new JLabel("Valor unitario: ");
		campo_n3 = new JTextField("550.0 $");
		label_n4 = new JLabel("Cantidad vendida: ");
		campo_n4 = new JTextField("0");
		label_n5 = new JLabel("Cantidad minima: ");
		campo_n5 = new JTextField("5");
		campo_n6 = new JTextField();
		campo_n7 = new JLabel();
		campo_n1.setEditable(false);
		campo_n2.setEditable(false);
		campo_n3.setEditable(false);
		campo_n4.setEditable(false);
		campo_n5.setEditable(false);
		campo_n6.setEditable(false);
		
		label_n11 = new JLabel("Tipo:");
		campo_n11 = new JTextField("Farmacia");
		label_n22 = new JLabel("Cantidad bodega: ");
		campo_n22 = new JTextField("25");
		label_n33 = new JLabel("Valor unitario: ");
		campo_n33 = new JTextField("109.5 $");
		label_n44 = new JLabel("Cantidad vendida: ");
		campo_n44 = new JTextField("0");
		label_n55 = new JLabel("Cantidad minima: ");
		campo_n55 = new JTextField("8");
		campo_n66 = new JTextField();

		campo_n11.setEditable(false);
		campo_n22.setEditable(false);
		campo_n33.setEditable(false);
		campo_n44.setEditable(false);
		campo_n55.setEditable(false);
		campo_n66.setEditable(false);
		
		label_n112 = new JLabel("Tipo:");
		campo_n112 = new JTextField("Papeleria");
		label_n222 = new JLabel("Cantidad bodega: ");
		campo_n222 = new JTextField("30");
		label_n332 = new JLabel("Valor  unitario: ");
		campo_n332 = new JTextField("207.3 $");
		label_n442 = new JLabel("Cantidad vendida: ");
		campo_n442 = new JTextField("0");
		label_n552 = new JLabel("Cantidad minima: ");
		campo_n552 = new JTextField("10");
		campo_n662 = new JTextField();

		campo_n112.setEditable(false);
		campo_n222.setEditable(false);
		campo_n332.setEditable(false);
		campo_n442.setEditable(false);
		campo_n552.setEditable(false);
		campo_n662.setEditable(false);
		
		label_n1122 = new JLabel("Tipo:");
		campo_n1122 = new JTextField("Supermercado");
		label_n2222 = new JLabel("Cantidad bodega: ");
		campo_n2222 = new JTextField("15");
		label_n3322 = new JLabel("Valor unitario: ");
		campo_n3322 = new JTextField("150.0 $");
		label_n4422 = new JLabel("Cantidad vendida: ");
		campo_n4422 = new JTextField("0");
		label_n5522 = new JLabel("Cantidad minima: ");
		campo_n5522 = new JTextField("20");
		campo_n6622 = new JTextField();

		campo_n1122.setEditable(false);
		campo_n2222.setEditable(false);
		campo_n3322.setEditable(false);
		campo_n4422.setEditable(false);
		campo_n5522.setEditable(false);
		campo_n6622.setEditable(false);
		
		
		panelAux_Naranja.add(label_n1);
		panelAux_Naranja.add(campo_n1);
		panelAux_Naranja.add(label_n2);
		panelAux_Naranja.add(campo_n2);
		panelAux_Naranja.add(label_n3);
		panelAux_Naranja.add(campo_n3);
		panelAux_Naranja.add(label_n4);
		panelAux_Naranja.add(campo_n4);
		panelAux_Naranja.add(label_n5);
		panelAux_Naranja.add(campo_n5);
		
		
		
		botonAbastecer = new JButton("Abastecer");
		botonVender = new JButton("Vender");
		botonCambiar = new JButton("Cambiar");
		
		botonAbastecer1 = new JButton("Abastecer");
		botonVender1 = new JButton("Vender");
		botonCambiar1 = new JButton("Cambiar");
		
		botonAbastecer2 = new JButton("Abastecer");
		botonVender2 = new JButton("Vender");
		botonCambiar2 = new JButton("Cambiar");
		
		botonAbastecer3 = new JButton("Abastecer");
		botonVender3 = new JButton("Vender");
		botonCambiar3 = new JButton("Cambiar");
		//panelAux_Naranja.add(botonSumar);


		//Panel Auxiliar para que los elementos se distribuyan como diseñamos
		JPanel panelAux_Verde = new JPanel();
		
		

		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		FlowLayout ul = new FlowLayout();
		panelAux_Verde.setLayout(ul);
		
		
		JPanel panelAux = new JPanel();
		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		GridLayout rl = new GridLayout(7, 3);
		panelAux.setLayout(rl);
	
		JPanel panelAuxR = new JPanel();
		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		GridLayout wl = new GridLayout(7, 3);
		panelAuxR.setLayout(wl);
		
		
		JPanel panelAuxI = new JPanel();
		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		GridLayout tl = new GridLayout(7, 3);
		panelAuxI.setLayout(tl);
		
		
		JPanel panelFinal = new JPanel();
		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		GridLayout al = new GridLayout(1,2);
		panelFinal.setLayout(al);
		panelFinal.add(labelImagen, BorderLayout.WEST);
		panelFinal.add(panelAux_Naranja, BorderLayout.CENTER );
		
		JPanel panelFinal2 = new JPanel();
		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		BorderLayout fl = new BorderLayout();
		panelFinal2.setLayout(fl);
		panelFinal2.setBorder(new TitledBorder("Lapiz"));
		panelFinal2.add(panelFinal, BorderLayout.CENTER);
		
		JPanel panelFinal3 = new JPanel();
		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		GridLayout ale = new GridLayout(1,2);
		panelFinal3.setLayout(ale);
		panelFinal3.add(labelImagen1, BorderLayout.WEST);
		panelFinal3.add(panelAuxR, BorderLayout.CENTER );
		
		JPanel panelFinal4 = new JPanel();
		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		BorderLayout fll = new BorderLayout();
		panelFinal4.setLayout(fll);
		panelFinal4.setBorder(new TitledBorder("Aspirina"));
		panelFinal4.add(panelFinal3, BorderLayout.CENTER);
		
		JPanel panelFinal5 = new JPanel();
		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		GridLayout alee = new GridLayout(1,2);
		panelFinal5.setLayout(alee);
		panelFinal5.add(labelImagen2, BorderLayout.WEST);
		panelFinal5.add(panelAux, BorderLayout.CENTER );
		
		JPanel panelFinal6 = new JPanel();
		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		BorderLayout flll = new BorderLayout();
		panelFinal6.setLayout(flll);
		panelFinal6.setBorder(new TitledBorder("Borrador"));
		panelFinal6.add(panelFinal5, BorderLayout.CENTER);
	
		JPanel panelFinal7 = new JPanel();
		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		GridLayout ali = new GridLayout(1,2);
		panelFinal7.setLayout(ali);
		panelFinal7.add(labelImagen3, BorderLayout.WEST);
		panelFinal7.add(panelAuxI, BorderLayout.CENTER );
		
		JPanel panelFinal8 = new JPanel();
		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		BorderLayout fi = new BorderLayout();
		panelFinal8.setLayout(fi);
		panelFinal8.setBorder(new TitledBorder("Pan"));
		panelFinal8.add(panelFinal7, BorderLayout.CENTER);
	
		
		
		panelAux.add(label_n11);
		panelAux.add(campo_n11);
		panelAux.add(label_n22);
		panelAux.add(campo_n22);
		panelAux.add(label_n33);
		panelAux.add(campo_n33);
		panelAux.add(label_n44);
		panelAux.add(campo_n44);
		panelAux.add(label_n55);
		panelAux.add(campo_n55);
		
		
		panelAuxR.add(label_n112);
		panelAuxR.add(campo_n112);
		panelAuxR.add(label_n222);
		panelAuxR.add(campo_n222);
		panelAuxR.add(label_n332);
		panelAuxR.add(campo_n332);
		panelAuxR.add(label_n442);
		panelAuxR.add(campo_n442);
		panelAuxR.add(label_n552);
		panelAuxR.add(campo_n552);
		
	
		
		panelAuxI.add(label_n1122);
		panelAuxI.add(campo_n1122);
		panelAuxI.add(label_n2222);
		panelAuxI.add(campo_n2222);
		panelAuxI.add(label_n3322);
		panelAuxI.add(campo_n3322);
		panelAuxI.add(label_n4422);
		panelAuxI.add(campo_n4422);
		panelAuxI.add(label_n5522);
		panelAuxI.add(campo_n5522);
		

		
		panelAux_I.add(botonAbastecer, BorderLayout.SOUTH);
		panelAux_I.add(botonVender, BorderLayout.SOUTH);
		panelAux_I.add(botonCambiar, BorderLayout.SOUTH);
		
		panelAux_P.add(botonAbastecer1, BorderLayout.SOUTH);
		panelAux_P.add(botonVender1, BorderLayout.SOUTH);
		panelAux_P.add(botonCambiar1, BorderLayout.SOUTH);
		
		panelAux_N.add(botonAbastecer2, BorderLayout.SOUTH);
		panelAux_N.add(botonVender2, BorderLayout.SOUTH);
		panelAux_N.add(botonCambiar2, BorderLayout.SOUTH);
		
		panelAux_A.add(botonAbastecer3, BorderLayout.SOUTH);
		panelAux_A.add(botonVender3, BorderLayout.SOUTH);
		panelAux_A.add(botonCambiar3, BorderLayout.SOUTH);
		
		panelFinal2.add(panelAux_I, BorderLayout.SOUTH);
		//panelAuxR.add(panelAux_N, BorderLayout.SOUTH);
		panelFinal4.add(panelAux_N, BorderLayout.SOUTH);
		//panelAux.add(panelAux_P, BorderLayout.SOUTH);
		panelFinal6.add(panelAux_P, BorderLayout.SOUTH);
		//panelAuxI.add(panelAux_A, BorderLayout.SOUTH);
		panelFinal8.add(panelAux_A, BorderLayout.SOUTH);
		
		setLayout(new BorderLayout());
		//Layout del Panel Datos, para agregar los dos páneles auxiliares que se definieron más arriba
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		panelGeneral.add(panelFinal2);
		panelGeneral.add(panelFinal4);
		panelGeneral.add(panelFinal6);
		panelGeneral.add(panelFinal8);
		add(panelGeneral);
		
		//add(panelAux_Verde, BorderLayout.EAST);
	
		
	}
}