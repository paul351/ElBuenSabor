/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ElBuenSabor.Entity;

/**
 *
 * @author Diego
 */
public class Usuario {
    private int id_usuario;
    private String nickname;
    private String password;
    private int rol;

    public Usuario(int id_usuario, String nickname, String password, int rol) {
        this.id_usuario = id_usuario;
        this.nickname = nickname;
        this.password = password;
        this.rol = rol;
    }

    public Usuario(String nickname, String password, int rol) {
        this.nickname = nickname;
        this.password = password;
        this.rol = rol;
    }

    public Usuario() {
    }
    
    

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", nickname=" + nickname + ", password=" + password + ", rol=" + rol + '}';
    }
    
        
}
