/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo03.modelo.dao;

import ejemplo03.modelo.bean.Usuario;

/**
 *
 * @author WIEXME
 */
public interface usuarioDao {
    public String validarDato(String usuario, String password);
    public Usuario mostrarUsuario(String id);
}
