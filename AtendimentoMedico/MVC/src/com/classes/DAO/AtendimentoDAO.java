package com.classes.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.Conexao.Conexao;
import com.classes.DTO.Atendimento;


public class AtendimentoDAO {
	
	final String NOMEDATABELA = "atendimento";
		
    public boolean inserir(Atendimento atendimento) {
        try {
        	Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (dia,codpaciente,codigomedico) VALUES (?,?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) atendimento.getDia());
            ps.setInt(2, atendimento.getcodigoPaciente());
            ps.setInt(3, atendimento.getcodigoMedico());
            ps.executeUpdate();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
      
    public boolean alterar(Atendimento atendimento) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET  dia = ?, codigomedico = ?, codpaciente = ? WHERE codatendimento = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) atendimento.getDia());
            ps.setInt(2, atendimento.getcodigoPaciente());
            ps.setInt(3, atendimento.getcodigoMedico());
            ps.setInt(4, atendimento.getcodigoAtendimento());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    
  
    public boolean excluir(Atendimento atendimento) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codatendimento = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, atendimento.getcodigoAtendimento());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    
    public Atendimento procurarPorCodigo(Atendimento atendimento) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codatendimento = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, atendimento.getcodigoAtendimento());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Atendimento obj = new Atendimento();
            	obj.setcodigoAtendimento(rs.getInt(1));
                ps.setDate(2, (Date) atendimento.getDia());
                ps.setInt(3, atendimento.getcodigoPaciente());
                ps.setInt(4, atendimento.getcodigoMedico());
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean existe(Atendimento atendimento) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE (codigomedico,codpaciente) = (?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, atendimento.getcodigoMedico());
            ps.setInt(2, atendimento.getcodigoPaciente());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ps.close();
                rs.close();
                conn.close();
                return true;
            }
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return false;
        }
        return false;
    }
    public List<Atendimento> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Atendimento> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }   
    public List<Atendimento> montarLista(ResultSet rs) {
        List<Atendimento> listObj = new ArrayList<Atendimento>();
        try {
            while (rs.next()) {
            	Atendimento obj = new Atendimento();
            	obj.setDia(rs.getDate(2));
                obj.setcodigoAtendimento(rs.getInt(1));
           	 	obj.setcodigoPaciente(rs.getInt(3));
    			obj.setcodigoMedico(rs.getInt(4));
                listObj.add(obj);
            }
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
  
}
    
  
 
    
