package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.DTO.Medico;
import com.classes.Conexao.Conexao;

public class MedicoDAO {

    final String NOMEDATABELA = "medico";
    
    public boolean inserir(Medico medico) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (nome, cpf, telefone, crm) VALUES (?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, medico.getNome());
            ps.setString(2, medico.getCpf());
            ps.setString(3, medico.getTelefone());
            ps.setInt(4, medico.getCrm());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Medico medico) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET nome = ?, cpf = ?, telefone = ?, crm = ? WHERE codigomedico = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, medico.getNome());
            ps.setString(2, medico.getCpf());
            ps.setString(3, medico.getTelefone());
            ps.setInt(4, medico.getCrm());
            ps.setInt(5, medico.getCodigo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    
    public boolean excluir(Medico medico) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE (nome, cpf, telefone, crm) = (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, medico.getNome());
            ps.setString(2, medico.getCpf());
            ps.setString(3, medico.getTelefone());
            ps.setInt(4, medico.getCrm());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
  
    public Medico procurarPorCodigo(Medico medico) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codmedico = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, medico.getCodigo());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Medico obj = new Medico();
            	obj.setCodigo(rs.getInt(1));
    			obj.setNome(rs.getString(2));
    			obj.setCpf(rs.getString(3));
    			obj.setTelefone(rs.getString(3));
                obj.setCrm(rs.getInt(4));
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
    
    public boolean existe(Medico medico) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + "  WHERE (nome, cpf, telefone, crm) = (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, medico.getNome());
            ps.setString(2, medico.getCpf());
            ps.setString(3, medico.getTelefone());
            ps.setInt(4, medico.getCrm());
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
    public List<Medico> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Medico> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }    
    public List<Medico> montarLista(ResultSet rs) {
        List<Medico> listObj = new ArrayList<Medico>();
        try {
            while (rs.next()) {
            	Medico obj = new Medico();
    			obj.setNome(rs.getString(1));
    			obj.setCpf(rs.getString(2));
                obj.setTelefone(rs.getString(3));
                obj.setCrm(rs.getInt(4));
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