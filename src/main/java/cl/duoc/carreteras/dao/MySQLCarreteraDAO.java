package cl.duoc.carreteras.dao;

import cl.duoc.carreteras.conexion.ConexionBD;
import cl.duoc.carreteras.model.Carretera;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLCarreteraDAO implements CarreteraDAO{
    @Override
    public List<Carretera> obtenerTodos() throws PersistenciaException {

        return List.of();
    }

    @Override
    public void insertar(Carretera carretera) throws PersistenciaException {

    }

    @Override
    public void actualizar(Carretera carretera) throws PersistenciaException {

    }

    @Override
    public void eliminar(int id) throws PersistenciaException {

    }
}
