package com.ejemplo.crud.crudApp.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import com.ejemplo.crud.crudApp.controlador.Controlador;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idtf;
	private JTextField nombretf;
	private JTextField correotf;
	private JTextField telefonotf;
	private JButton btnAgregar;
	private JButton btnModificar;
	private JButton btnConsultar;
	private JButton btnEliminar;
	private JTable table;
	private JComboBox btnFiltrar;
	private JButton btnAplicarFiltro;
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getIdtf() {
		return idtf;
	}

	public JTextField getNombretf() {
		return nombretf;
	}

	public JTextField getCorreotf() {
		return correotf;
	}

	public JTextField getTelefonotf() {
		return telefonotf;
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public JButton getBtnConsultar() {
		return btnConsultar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JTable getTable() {
		return table;
	}
	
	public JComboBox getBtnFiltrar() {
		return btnFiltrar;
	}
	
	public JButton getBtnAplicarFiltro() {
        return btnAplicarFiltro;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Principal prin = new Principal();
        Controlador c = new Controlador(prin);
        prin.setVisible(true);
        prin.setLocationRelativeTo(prin);
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nombreTxt = new JLabel("CRUD USUARIOS");
		nombreTxt.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 22));
		nombreTxt.setBounds(181, 11, 294, 109);
		contentPane.add(nombreTxt);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo usuario: ");
		lblNewLabel_1.setBounds(36, 99, 110, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre: ");
		lblNewLabel_2.setBounds(36, 172, 89, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Correo: ");
		lblNewLabel_3.setBounds(36, 231, 89, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Telefono:");
		lblNewLabel_4.setBounds(36, 294, 89, 14);
		contentPane.add(lblNewLabel_4);
		
		idtf = new JTextField();
		idtf.setBounds(168, 112, 220, 20);
		contentPane.add(idtf);
		idtf.setColumns(10);
		
		nombretf = new JTextField();
		nombretf.setBounds(168, 169, 220, 20);
		contentPane.add(nombretf);
		nombretf.setColumns(10);
		
		correotf = new JTextField();
		correotf.setBounds(168, 228, 220, 20);
		contentPane.add(correotf);
		correotf.setColumns(10);
		
		telefonotf = new JTextField();
		telefonotf.setBounds(168, 291, 220, 20);
		contentPane.add(telefonotf);
		telefonotf.setColumns(10);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAgregar.setBounds(449, 97, 89, 23);
		contentPane.add(btnAgregar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setBounds(449, 134, 89, 23);
		contentPane.add(btnModificar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsultar.setBounds(449, 172, 89, 23);
		contentPane.add(btnConsultar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setBounds(449, 211, 89, 23);
		contentPane.add(btnEliminar);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
		    new Object[][] {},
		    new String[] {"ID", "Nombre", "Correo", "Teléfono"}
		));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 348, 549, 200);
		contentPane.add(scrollPane);
		
		btnFiltrar = new JComboBox();
		btnFiltrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFiltrar.setModel(new DefaultComboBoxModel(new String[] {"Nombre", "Correo", "Telefono"}));
		btnFiltrar.setBounds(449, 270, 89, 22);
		contentPane.add(btnFiltrar);
		
		JLabel lblNewLabel = new JLabel("Buscar por: ");
		lblNewLabel.setBounds(449, 245, 110, 14);
		contentPane.add(lblNewLabel);
		
		btnAplicarFiltro = new JButton("Buscar");
		btnAplicarFiltro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAplicarFiltro.setBounds(449, 303, 89, 23);
		contentPane.add(btnAplicarFiltro);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Principal.class.getResource("/com/ejemplo/crud/crudApp/vista/empleados-img.jpeg")));
		lblNewLabel_5.setBounds(46, 1, 487, 325);
		contentPane.add(lblNewLabel_5);

	}
}
