
package PacoteEstacionamento;

import java.sql.*;
import java.util.*;

public class Teste {
    
    public static void main(String[] args) {
        Connection con = Conexao.abrirConexao();
        
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        
        cb.setPlaca("KKK1900");
        cb.setCor("Branco");
        cb.setDescricao("carro legal");
        
        /*cb.setPlaca("KKK1801");
        cb.setCor("Azul");
        cb.setDescricao("carro legal");
        
        cb.setPlaca("KKK1802");
        cb.setCor("verde");
        cb.setDescricao("carro legal");*/
        
        //System.out.println(cd.inserir(cb));
        System.out.println(cd.excluir(cb));
        //System.out.println(cd.alterar(cb));
    }
}
