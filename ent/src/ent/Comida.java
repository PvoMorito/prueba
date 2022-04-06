package ent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Color;

public class Comida extends JFrame {

	private JPanel contentPane;
	private JTextField Peso;
	private JTextField Edad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comida frame = new Comida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Comida() {
		setBackground(Color.BLACK);
		setTitle("Validación dieta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 858, 534);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Validar = new JButton("Validar");
		Validar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Validar.setBounds(362, 462, 105, 27);
		contentPane.add(Validar);
		
		JLabel lblSeleccioneSuPeso = new JLabel("Seleccione su peso");
		lblSeleccioneSuPeso.setBounds(12, 22, 148, 17);
		contentPane.add(lblSeleccioneSuPeso);
		
		Peso= new JTextField();
		Peso.setBounds(133, 20, 54, 21);
		contentPane.add(Peso);
		Peso.setColumns(10);

		
		JLabel lblKg = new JLabel("Kg");
		lblKg.setBounds(191, 22, 60, 17);
		contentPane.add(lblKg);
		
		JLabel lblSeleccioneSuEdad = new JLabel("Seleccione su edad");
		lblSeleccioneSuEdad.setBounds(263, 22, 122, 17);
		contentPane.add(lblSeleccioneSuEdad);
		
		Edad = new JTextField();
		Edad.setBounds(389, 20, 54, 21);
		contentPane.add(Edad);
		Edad.setColumns(10);
		
		JLabel lblAos = new JLabel("años");
		lblAos.setBounds(449, 22, 60, 17);
		contentPane.add(lblAos);
		
		JLabel lblSeleccioneSuSexo = new JLabel("Seleccione su sexo");
		lblSeleccioneSuSexo.setBounds(521, 24, 122, 17);
		contentPane.add(lblSeleccioneSuSexo);
		
		JComboBox Sexo = new JComboBox();
		Sexo.setBounds(644, 17, 105, 27);
		contentPane.add(Sexo);
		Sexo.addItem("Hombre");
		Sexo.addItem("Mujer");
		
		JLabel lblSeleccioneSuMtodo = new JLabel("Seleccione su método de medida");
		lblSeleccioneSuMtodo.setBounds(12, 63, 211, 17);
		contentPane.add(lblSeleccioneSuMtodo);
		
		JComboBox Medida = new JComboBox();
		Medida.setBounds(12, 94, 137, 27);
		contentPane.add(Medida);
		Medida.addItem("Gramos");
		Medida.addItem("Porciones");
		
		JLabel lblCantidadCalorias = new JLabel("Calorias:");
		lblCantidadCalorias.setBounds(12, 133, 60, 17);
		contentPane.add(lblCantidadCalorias);
		
		JLabel CantidadCalorias = new JLabel("0");
		CantidadCalorias.setBounds(84, 133, 60, 17);
		contentPane.add(CantidadCalorias);
		
		JLabel lblGrasas = new JLabel("Grasas:");
		lblGrasas.setBounds(12, 162, 60, 17);
		contentPane.add(lblGrasas);
		
		JLabel CantidadGrasas = new JLabel("0");
		CantidadGrasas.setBounds(84, 162, 60, 17);
		contentPane.add(CantidadGrasas);
		
		JLabel lblGrasasSaturadas = new JLabel("Saturadas:");
		lblGrasasSaturadas.setBounds(12, 191, 71, 17);
		contentPane.add(lblGrasasSaturadas);
		
		JLabel CantidadSaturadas = new JLabel("0");
		CantidadSaturadas.setBounds(84, 191, 60, 17);
		contentPane.add(CantidadSaturadas);
		
		JLabel lblSal = new JLabel("Sal:");
		lblSal.setBounds(12, 220, 60, 17);
		contentPane.add(lblSal);
		
		JLabel CantidadSal = new JLabel("0");
		CantidadSal.setBounds(84, 220, 60, 17);
		contentPane.add(CantidadSal);
		
		JLabel lblProtenas = new JLabel("Proteínas:");
		lblProtenas.setBounds(12, 249, 60, 17);
		contentPane.add(lblProtenas);
		
		JLabel CantidadProteinas = new JLabel("0");
		CantidadProteinas.setBounds(84, 249, 60, 17);
		contentPane.add(CantidadProteinas);
		
		JLabel lblHidratos = new JLabel("Hidratos:");
		lblHidratos.setBounds(12, 278, 60, 17);
		contentPane.add(lblHidratos);
		
		JLabel CantidadHidratos = new JLabel("0");
		CantidadHidratos.setBounds(84, 278, 60, 17);
		contentPane.add(CantidadHidratos);
		
		JLabel lblAzcar = new JLabel("Azúcar:");
		lblAzcar.setBounds(12, 307, 60, 17);
		contentPane.add(lblAzcar);
		
		JLabel CantidadAzucar = new JLabel("0");
		CantidadAzucar.setBounds(84, 307, 60, 17);
		contentPane.add(CantidadAzucar);
		
		
	}
}
