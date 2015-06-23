/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import ejemplo03.modelo.bean.Usuario;
import ejemplo03.modelo.dao.impl.usuarioDaoImpl;
import ejemplo03.modelo.dao.usuarioDao;

/**
 *
 * @author WIEXME
 */
public class main {
    public static void main(String[] args) {
        main m = new main();
        m.validar();
//        m.verUsuario();
    }
    
    public  void validar(){
    usuarioDao dao = new usuarioDaoImpl();
    String id = "";
    
    id = dao.validarDato("wiexme", "1234");
        System.out.println("ID: "+id);
    }
    
    public void verUsuario(){
    usuarioDao dao = new usuarioDaoImpl();
    Usuario usuario = new Usuario();
    usuario = dao.mostrarUsuario("1");
        System.out.println("id: "+usuario.getId()+" usuario: "+usuario.getUsuario()+" password: "+usuario.getPassword()+" nombre: "+usuario.getNombre()+" edad: "+usuario.getEdad()+" estado: "+usuario.getEstado());
    }
}
