package dao;

import java.util.ArrayList;

import entidad.Disponibilidad;

public interface DisponibilidadDao {
	public boolean Agregar(Disponibilidad disponibilidad);
	public ArrayList<Disponibilidad> ListarTodo();
	public Disponibilidad ObtenerObjeto(int id);
	public boolean Eliminar(int id);
	public boolean Modificar(Disponibilidad disponibilidad);
}
