/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo03.modelo.dao.impl;

import ejemplo03.modelo.bean.Usuario;
import ejemplo03.modelo.conexion.conexion;
import ejemplo03.modelo.dao.usuarioDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author WIEXME
 */
public class usuarioDaoImpl implements usuarioDao{
     public Connection conecta(){
        return conexion.conectar();
    }

    @Override
    public String validarDato(String usuario, String password) {
        String id = null;
        String query = "select id from usuario where upper(usuario) = '"+usuario.toUpperCase()+"' and password = '"+password+"'";
        Statement st = null;
        ResultSet rs = null;
        try {
            st = conecta().createStatement();
            rs = st.executeQuery(query);
            if(rs.next()){
                id = rs.getString("id");
            }
            conecta().close();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conecta().close();
            } catch (Exception ex) {
            }
        }
        return id;
    }

    @Override
    public Usuario mostrarUsuario(String id) {
        Usuario usuario = null;
        String query = "select * from usuario where id = '"+id+"'";
        Statement st = null;
        ResultSet rs = null;
        try {
            st = conecta().createStatement();
            rs = st.executeQuery(query);
            if(rs.next()){
                usuario = new Usuario();
                usuario.setId(rs.getString("id"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setPassword(rs.getString("password"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setEdad(rs.getString("edad"));
                usuario.setEstado(rs.getString("estado"));
            }
            conecta().close();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conecta().close();
            } catch (Exception ex) {
            }
        }
        return usuario;
    }
    
}
