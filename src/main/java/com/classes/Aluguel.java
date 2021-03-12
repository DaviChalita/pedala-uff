package com.classes;

import java.util.Date;

public class Aluguel {
    public Aluguel() {
    }

    public Aluguel(Integer idAluguel, Date dthrAlguel, Date dthrDevolucao, Bicicleta bicicleta, Usuario usuario) {
        this.idAluguel = idAluguel;
        this.dthrAlguel = dthrAlguel;
        this.dthrDevolucao = dthrDevolucao;
        this.bicicleta = bicicleta;
        this.usuario = usuario;
    }

    public Integer getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(Integer idAluguel) {
        this.idAluguel = idAluguel;
    }

    public Date getDthrAlguel() {
        return dthrAlguel;
    }

    public void setDthrAlguel(Date dthrAlguel) {
        this.dthrAlguel = dthrAlguel;
    }

    public Date getDthrDevolucao() {
        return dthrDevolucao;
    }

    public void setDthrDevolucao(Date dthrDevolucao) {
        this.dthrDevolucao = dthrDevolucao;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    private Integer idAluguel;
    private Date dthrAlguel;
    private Date dthrDevolucao;
    private Bicicleta bicicleta;
    private Usuario usuario;


    public static boolean scanQrCodeBike(String qrCode) {
        //todo: não lembro oq esse cara deveria fazer
        return false;
    }

    public static boolean scanQrCodeVaga(String qrCode) {
        //todo: não lembro oq esse cara deveria fazer
        return false;
    }

}
