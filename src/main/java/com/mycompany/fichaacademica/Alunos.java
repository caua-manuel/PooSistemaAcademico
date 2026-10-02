/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fichaacademica;

/**
 *
 * @author cauam
 */
public class Alunos {

    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;

    public Alunos(String nome, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        }
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        }
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String obterSituacao() {
        if (calcularMedia() >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}

