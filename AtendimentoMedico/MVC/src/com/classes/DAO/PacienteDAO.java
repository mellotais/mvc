package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.DTO.Paciente;
import com.classes.Conexao.Conexao;

public class PacienteDAO {


    final String NOMEDATABELA = "paciente";
    
    public boolean inserir(Paciente paciente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (nome, cpf, telefone, cod_paciente ) VALUES ( ?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, paciente.getNome());
            ps.setString(2, paciente.getCpf());
            ps.setString(3, paciente.getTelefone());
            ps.setInt(4, paciente.getCod_paciente());
            
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Paciente paciente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET nome = ?, cpf = ?, telefone = ?, cod_paciente = ?  WHERE codpaciente = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, paciente.getNome());
            ps.setString(2, paciente.getCpf());
            ps.setString(3, paciente.getTelefone());
            ps.setInt(4, paciente.getCod_paciente());
            ps.setInt(5, paciente.getCodigo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    
    public boolean excluir(Paciente paciente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE (nome, cpf, telefone, cod_paciente ) = ( ?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, paciente.getNome());
            ps.setString(2, paciente.getCpf());
            ps.setString(3, paciente.getTelefone());
            ps.setInt(4, paciente.getCod_paciente());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
  
    public Paciente procurarPorCodigo(Paciente paciente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codpaciente = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, paciente.getCodigo());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Paciente obj = new Paciente();
            	obj.setCodigo(rs.getInt(1));
    			obj.setNome(rs.getString(2));
    			obj.setCpf(rs.getString(3));
                obj.setTelefone(rs.getString(4));
                obj.setCod_paciente(rs.getInt(5));
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
    
    
    public boolean existe(Paciente paciente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + "  WHERE (nome, cpf, telefone, cod_paciente ) = ( ?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, paciente.getNome());
            ps.setString(2, paciente.getCpf());
            ps.setString(3, paciente.getTelefone());
            ps.setInt(4, paciente.getCod_paciente());
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
    public List<Paciente> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Paciente> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }   
    public List<Paciente> montarLista(ResultSet rs) {
        List<Paciente> listObj = new ArrayList<Paciente>();
        try {
            while (rs.next()) {
            	Paciente obj = new Paciente();
            	obj.setCodigo(rs.getInt(1));
    			obj.setNome(rs.getString(2));
    			obj.setCpf(rs.getString(3));
                obj.setTelefone(rs.getString(4));
                obj.setCod_paciente(rs.getInt(5));
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