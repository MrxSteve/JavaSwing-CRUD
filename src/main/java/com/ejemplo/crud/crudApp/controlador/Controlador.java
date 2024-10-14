
package com.ejemplo.crud.crudApp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.ejemplo.crud.crudApp.modelo.Persona;
import com.ejemplo.crud.crudApp.modelo.PersonaDAO;
import com.ejemplo.crud.crudApp.vista.Principal;

public class Controlador implements ActionListener {

    PersonaDAO dao = new PersonaDAO();
    Persona p = new Persona();

    Principal prin = new Principal();
    DefaultTableModel modelo = new DefaultTableModel();

    public Controlador(Principal prin) {
        this.prin = prin;
        this.prin.getBtnConsultar().addActionListener(this);
        this.prin.getBtnAgregar().addActionListener(this);
        this.prin.getBtnModificar().addActionListener(this);
        this.prin.getBtnEliminar().addActionListener(this);
        this.prin.getBtnAplicarFiltro().addActionListener(this);
    }

    public void Listar(JTable tabla){
        modelo = (DefaultTableModel)tabla.getModel();

        // Limpiar el modelo de la tabla
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        List<Persona> lista = (List<Persona>) dao.listar();
        Object[] object = new Object[4];

        for(int i = 0; i < lista.size(); i++){
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getCorreo();
            object[3] = lista.get(i).getTelefono();

            //agregamos al table los datos
            modelo.addRow(object);
        }
    }
    
	public void agregar() {
		String nombre = prin.getNombretf().getText();
		String correo = prin.getCorreotf().getText();
		String telefono = prin.getTelefonotf().getText();

		p.setNombre(nombre);
		p.setCorreo(correo);
		p.setTelefono(telefono);

		int r = dao.agregar(p);

		if (r == 1) {
			JOptionPane.showMessageDialog(null, "Persona agregada");
			prin.getNombretf().setText("");
	        prin.getCorreotf().setText("");
	        prin.getTelefonotf().setText("");
		} else {
			JOptionPane.showMessageDialog(null, "Error al agregar");
		}
	}
	
	public void modificar() {
		int id = Integer.parseInt(prin.getIdtf().getText());
		String nombre = prin.getNombretf().getText();
		String correo = prin.getCorreotf().getText();
		String telefono = prin.getTelefonotf().getText();

		p.setId(id);
		p.setNombre(nombre);
		p.setCorreo(correo);
		p.setTelefono(telefono);

		int r = dao.actualizar(p);

		if (r == 1) {
			JOptionPane.showMessageDialog(null, "Persona modificada");
			prin.getNombretf().setText("");
			prin.getCorreotf().setText("");
			prin.getTelefonotf().setText("");
		} else {
			JOptionPane.showMessageDialog(null, "Error al modificar");
		}
	}
	
	public void eliminar() {
		int id = Integer.parseInt(prin.getIdtf().getText());
		dao.eliminar(id);
		JOptionPane.showMessageDialog(null, "Persona eliminada");
		prin.getNombretf().setText("");
		prin.getCorreotf().setText("");
		prin.getTelefonotf().setText("");
	}
	

	public void filtrarPorNombre(JTable tabla) {
	    String nombre = prin.getNombretf().getText();
	    filtrar(tabla, nombre, "nombre");
	}
	
	public void filtrarPorTelefono(JTable tabla) {
	    String telefono = prin.getTelefonotf().getText();
	    filtrar(tabla, telefono, "telefono");
	}
	
	public void filtrarPorCorreo(JTable tabla) {
	    String correo = prin.getCorreotf().getText();
	    filtrar(tabla, correo, "correo");
	}
	
	public void filtrar(JTable tabla, String valor, String campo) {
	    modelo = (DefaultTableModel) tabla.getModel();
	
	    while (modelo.getRowCount() > 0) {
	        modelo.removeRow(0);
	    }
	
	    List<Persona> lista = (List<Persona>) dao.filtrar(valor, campo);
	    Object[] object = new Object[4];
	
	    for (int i = 0; i < lista.size(); i++) {
	        object[0] = lista.get(i).getId();
	        object[1] = lista.get(i).getNombre();
	        object[2] = lista.get(i).getCorreo();
	        object[3] = lista.get(i).getTelefono();
	
	        modelo.addRow(object);
	    }
	
	    if (lista.isEmpty()) {
	        JOptionPane.showMessageDialog(null, "No se encontraron resultados");
	    }
	}

	
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == prin.getBtnConsultar()) {
            Listar(prin.getTable());
        }
        
		if (e.getSource() == prin.getBtnAgregar()) {
			agregar();
		}
		
		if (e.getSource() == prin.getBtnModificar()) {
			modificar();
		}
		
		if (e.getSource() == prin.getBtnEliminar()) {
			eliminar();
        }
		

	    if (e.getSource() == prin.getBtnAplicarFiltro()) {
	        String filterOption = (String) prin.getBtnFiltrar().getSelectedItem();
	        switch (filterOption) {
	            case "Nombre":
	                filtrarPorNombre(prin.getTable());
	                break;
	            case "Teléfono":
	                filtrarPorTelefono(prin.getTable());
	                break;
	            case "Correo":
	                filtrarPorCorreo(prin.getTable());
	                break;
	        }
	    }
    }
    
}
