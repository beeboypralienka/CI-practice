/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medrecapps.Interfaces;

import java.sql.SQLException;
import java.util.List;
import medrecapps.Entity.Spesialis;

/**
 *
 * @author fachrulpbm
 */
public interface SpesialisInterface {
    
    // Standar CRUD
    public void insertSpesialis(Spesialis s)throws SQLException;
    public void updateSpesialis(Spesialis s, String idSpesialis)throws SQLException;
    public void deleteSpesialis(String idSpesialis)throws SQLException;
    public List getAllSpesialis()throws SQLException;

    // Method untuk mengisi dan mengambil data di JComboBox
    public String[] getAllNmSpesialis(int row)throws SQLException;
    public String getIDSpesialis(String nama)throws SQLException;

    // Method untuk memilih data JComboBox dari tabel
    public String getNmSpesialis(String id)throws SQLException;

    // Method untuk mencari spesalis via JTextField
    public List getAllSpesialisById(String idSpesialis)throws SQLException;
    public List getAllSpesialisByNm(String nmSpesialis)throws SQLException;
    
}
