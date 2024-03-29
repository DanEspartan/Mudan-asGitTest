/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDAO;
   
import Model.Cliente;

    import java.util.ArrayList;

/**
 *
 * @author matheus.dcosta2
 */
public class ClienteDAO {
    
        public static boolean salvar(Cliente p)
    {
        //Simulo uma inserção no banco de dados (INSERT INTO...)
        return SimulaDB.getInstance().SalvarCliente(p);
    }
    
    public static boolean atualizar(Cliente p)
    {
        //Simulo um  UPDATE no banco de dados (UPDATE TabelaXYZ SET...)
        return SimulaDB.getInstance().AtualizarCliente(p);
    }
    
    public static boolean excluir(int pID)
    {
        //Simulo uma exclusão no banco de dados (DELETE FROM TabelaXYZ WHERE...)
        return SimulaDB.getInstance().ExcluirCliente(pID);
    }
    
    public static ArrayList<Cliente> getClientes()
    {
        return SimulaDB.getInstance().getClientes();
    }
    
    
    
}
