package dao;

import java.util.ArrayList;

import entidad.Habitacion;

public interface HabitacionDao {
	public boolean Agregar(Habitacion habitacion);
	public ArrayList<Habitacion> ListarTodo();
	public Habitacion ObtenerObjeto(int id);
	public boolean Eliminar(int id);
	public boolean Modificar(Habitacion habitacion);
}
